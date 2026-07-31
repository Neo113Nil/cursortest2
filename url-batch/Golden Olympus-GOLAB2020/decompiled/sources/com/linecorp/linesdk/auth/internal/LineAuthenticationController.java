package com.linecorp.linesdk.auth.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.Scope;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.BrowserAuthenticationApi;
import com.linecorp.linesdk.auth.internal.LineAuthenticationStatus;
import com.linecorp.linesdk.internal.AccessTokenCache;
import com.linecorp.linesdk.internal.InternalAccessToken;
import com.linecorp.linesdk.internal.IssueAccessTokenResult;
import com.linecorp.linesdk.internal.OpenIdDiscoveryDocument;
import com.linecorp.linesdk.internal.nwclient.IdTokenValidator;
import com.linecorp.linesdk.internal.nwclient.LineAuthenticationApiClient;
import com.linecorp.linesdk.internal.nwclient.TalkApiClient;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import java.util.List;

/* loaded from: classes2.dex */
class LineAuthenticationController {
    private static final long CANCEL_DELAY_MILLIS = 1000;
    private static final int REQUEST_CODE = 3;
    private static Intent intentResultFromLineAPP;

    @NonNull
    private final AccessTokenCache accessTokenCache;

    @NonNull
    private final LineAuthenticationActivity activity;

    @NonNull
    private final LineAuthenticationApiClient authApiClient;

    @NonNull
    private final LineAuthenticationStatus authenticationStatus;

    @NonNull
    private final BrowserAuthenticationApi browserAuthenticationApi;

    @NonNull
    private final LineAuthenticationConfig config;

    @NonNull
    private final LineAuthenticationParams params;

    @NonNull
    private final TalkApiClient talkApiClient;

    private class AccessTokenRequestTask extends AsyncTask<BrowserAuthenticationApi.Result, Void, LineLoginResult> {
        private AccessTokenRequestTask() {
        }

        private void validateIdToken(LineIdToken lineIdToken, String str) {
            LineApiResponse<OpenIdDiscoveryDocument> openIdDiscoveryDocument = LineAuthenticationController.this.authApiClient.getOpenIdDiscoveryDocument();
            if (openIdDiscoveryDocument.isSuccess()) {
                new IdTokenValidator.Builder().idToken(lineIdToken).expectedIssuer(openIdDiscoveryDocument.getResponseData().getIssuer()).expectedUserId(str).expectedChannelId(LineAuthenticationController.this.config.getChannelId()).expectedNonce(LineAuthenticationController.this.authenticationStatus.getOpenIdNonce()).build().validate();
                return;
            }
            throw new RuntimeException("Failed to get OpenId Discovery Document.  Response Code: " + openIdDiscoveryDocument.getResponseCode() + " Error Data: " + openIdDiscoveryDocument.getErrorData());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public LineLoginResult doInBackground(BrowserAuthenticationApi.Result... resultArr) {
            LineProfile lineProfile;
            String str;
            BrowserAuthenticationApi.Result result = resultArr[0];
            String requestToken = result.getRequestToken();
            PKCECode pKCECode = LineAuthenticationController.this.authenticationStatus.getPKCECode();
            String sentRedirectUri = LineAuthenticationController.this.authenticationStatus.getSentRedirectUri();
            if (TextUtils.isEmpty(requestToken) || pKCECode == null || TextUtils.isEmpty(sentRedirectUri)) {
                return LineLoginResult.internalError("Requested data is missing.");
            }
            LineApiResponse<IssueAccessTokenResult> issueAccessToken = LineAuthenticationController.this.authApiClient.issueAccessToken(LineAuthenticationController.this.config.getChannelId(), requestToken, pKCECode, sentRedirectUri);
            if (!issueAccessToken.isSuccess()) {
                return LineLoginResult.error(issueAccessToken);
            }
            IssueAccessTokenResult responseData = issueAccessToken.getResponseData();
            InternalAccessToken accessToken = responseData.getAccessToken();
            List<Scope> scopes = responseData.getScopes();
            if (scopes.contains(Scope.PROFILE)) {
                LineApiResponse<LineProfile> profile = LineAuthenticationController.this.talkApiClient.getProfile(accessToken);
                if (!profile.isSuccess()) {
                    return LineLoginResult.error(profile);
                }
                lineProfile = profile.getResponseData();
                str = lineProfile.getUserId();
            } else {
                lineProfile = null;
                str = null;
            }
            LineAuthenticationController.this.accessTokenCache.saveAccessToken(accessToken);
            LineIdToken idToken = responseData.getIdToken();
            if (idToken != null) {
                try {
                    validateIdToken(idToken, str);
                } catch (Exception e4) {
                    return LineLoginResult.internalError(e4.getMessage());
                }
            }
            return new LineLoginResult.Builder().nonce(LineAuthenticationController.this.authenticationStatus.getOpenIdNonce()).lineProfile(lineProfile).lineIdToken(idToken).friendshipStatusChanged(result.getFriendshipStatusChanged()).lineCredential(new LineCredential(new LineAccessToken(accessToken.getAccessToken(), accessToken.getExpiresInMillis(), accessToken.getIssuedClientTimeMillis()), scopes)).build();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(@NonNull LineLoginResult lineLoginResult) {
            LineAuthenticationController.this.authenticationStatus.authenticationIntentHandled();
            LineAuthenticationController.this.activity.onAuthenticationFinished(lineLoginResult);
        }
    }

    private class CancelAuthenticationTask implements Runnable {
        private CancelAuthenticationTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LineAuthenticationController.this.authenticationStatus.getStatus() == LineAuthenticationStatus.Status.INTENT_RECEIVED || LineAuthenticationController.this.activity.isFinishing()) {
                return;
            }
            if (LineAuthenticationController.intentResultFromLineAPP == null) {
                LineAuthenticationController.this.activity.onAuthenticationFinished(LineLoginResult.canceledError());
            } else {
                LineAuthenticationController.this.handleIntentFromLineApp(LineAuthenticationController.intentResultFromLineAPP);
                Intent unused = LineAuthenticationController.intentResultFromLineAPP = null;
            }
        }
    }

    LineAuthenticationController(@NonNull LineAuthenticationActivity lineAuthenticationActivity, @NonNull LineAuthenticationConfig lineAuthenticationConfig, @NonNull LineAuthenticationStatus lineAuthenticationStatus, @NonNull LineAuthenticationParams lineAuthenticationParams) {
        this(lineAuthenticationActivity, lineAuthenticationConfig, new LineAuthenticationApiClient(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.getOpenidDiscoveryDocumentUrl(), lineAuthenticationConfig.getApiBaseUrl()), new TalkApiClient(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.getApiBaseUrl()), new BrowserAuthenticationApi(lineAuthenticationStatus), new AccessTokenCache(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.getChannelId()), lineAuthenticationStatus, lineAuthenticationParams);
    }

    public static void setIntent(Intent intent) {
        intentResultFromLineAPP = intent;
    }

    PKCECode createPKCECode() {
        return PKCECode.newCode();
    }

    void handleCancel() {
        new Handler(Looper.getMainLooper()).postDelayed(new CancelAuthenticationTask(), CANCEL_DELAY_MILLIS);
    }

    void handleIntentFromLineApp(@NonNull Intent intent) {
        this.authenticationStatus.authenticationIntentReceived();
        BrowserAuthenticationApi.Result authenticationResultFrom = this.browserAuthenticationApi.getAuthenticationResultFrom(intent);
        if (authenticationResultFrom.isSuccess()) {
            new AccessTokenRequestTask().execute(authenticationResultFrom);
        } else {
            this.authenticationStatus.authenticationIntentHandled();
            this.activity.onAuthenticationFinished(authenticationResultFrom.isAuthenticationAgentError() ? LineLoginResult.authenticationAgentError(authenticationResultFrom.getLineApiError()) : LineLoginResult.internalError(authenticationResultFrom.getLineApiError()));
        }
    }

    void onActivityResult(int i4, int i5, Intent intent) {
        if (i4 != 3 || this.authenticationStatus.getStatus() == LineAuthenticationStatus.Status.INTENT_RECEIVED) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new CancelAuthenticationTask(), CANCEL_DELAY_MILLIS);
    }

    void startLineAuthentication() {
        this.authenticationStatus.authenticationStarted();
        PKCECode createPKCECode = createPKCECode();
        this.authenticationStatus.setPKCECode(createPKCECode);
        try {
            BrowserAuthenticationApi.Request request = this.browserAuthenticationApi.getRequest(this.activity, this.config, createPKCECode, this.params);
            if (request.isLineAppAuthentication()) {
                this.activity.startActivity(request.getIntent(), request.getStartActivityOptions());
            } else {
                this.activity.startActivityForResult(request.getIntent(), 3, request.getStartActivityOptions());
            }
            this.authenticationStatus.setSentRedirectUri(request.getRedirectUri());
        } catch (ActivityNotFoundException e4) {
            this.authenticationStatus.authenticationIntentHandled();
            this.activity.onAuthenticationFinished(LineLoginResult.internalError(new LineApiError(e4, LineApiError.ErrorCode.LOGIN_ACTIVITY_NOT_FOUND)));
        }
    }

    LineAuthenticationController(@NonNull LineAuthenticationActivity lineAuthenticationActivity, @NonNull LineAuthenticationConfig lineAuthenticationConfig, @NonNull LineAuthenticationApiClient lineAuthenticationApiClient, @NonNull TalkApiClient talkApiClient, @NonNull BrowserAuthenticationApi browserAuthenticationApi, @NonNull AccessTokenCache accessTokenCache, @NonNull LineAuthenticationStatus lineAuthenticationStatus, @NonNull LineAuthenticationParams lineAuthenticationParams) {
        this.activity = lineAuthenticationActivity;
        this.config = lineAuthenticationConfig;
        this.authApiClient = lineAuthenticationApiClient;
        this.talkApiClient = talkApiClient;
        this.browserAuthenticationApi = browserAuthenticationApi;
        this.accessTokenCache = accessTokenCache;
        this.authenticationStatus = lineAuthenticationStatus;
        this.params = lineAuthenticationParams;
    }
}
