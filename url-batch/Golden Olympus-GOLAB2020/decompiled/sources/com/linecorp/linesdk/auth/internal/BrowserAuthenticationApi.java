package com.linecorp.linesdk.auth.internal;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.b;
import androidx.core.content.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.b9;
import com.linecorp.linesdk.BuildConfig;
import com.linecorp.linesdk.Constants;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.Scope;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.internal.pkce.CodeChallengeMethod;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import com.linecorp.linesdk.utils.StringUtils;
import com.linecorp.linesdk.utils.UriUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class BrowserAuthenticationApi {
    private static final int LENGTH_OAUTH_STATE = 16;
    private static final int LENGTH_OPENID_NONCE = 16;

    @NonNull
    private final LineAuthenticationStatus authenticationStatus;

    static class AuthenticationIntentHolder {

        @NonNull
        private final Intent intent;
        private final boolean isLineAppAuthentication;
        private final Bundle startActivityOptions;

        AuthenticationIntentHolder(@NonNull Intent intent, Bundle bundle, boolean z4) {
            this.intent = intent;
            this.startActivityOptions = bundle;
            this.isLineAppAuthentication = z4;
        }

        @NonNull
        public Intent getIntent() {
            return this.intent;
        }

        public Bundle getStartActivityOptions() {
            return this.startActivityOptions;
        }

        public boolean isLineAppAuthentication() {
            return this.isLineAppAuthentication;
        }
    }

    static class Request {

        @NonNull
        private final Intent intent;
        private final boolean isLineAppAuthentication;

        @NonNull
        private final String redirectUri;
        private final Bundle startActivityOptions;

        Request(@NonNull Intent intent, Bundle bundle, @NonNull String str, boolean z4) {
            this.intent = intent;
            this.startActivityOptions = bundle;
            this.redirectUri = str;
            this.isLineAppAuthentication = z4;
        }

        @NonNull
        Intent getIntent() {
            return this.intent;
        }

        @NonNull
        String getRedirectUri() {
            return this.redirectUri;
        }

        Bundle getStartActivityOptions() {
            return this.startActivityOptions;
        }

        boolean isLineAppAuthentication() {
            return this.isLineAppAuthentication;
        }
    }

    static class Result {
        private final Boolean friendshipStatusChanged;
        private final String internalErrorMessage;
        private final String requestToken;
        private final String serverErrorCode;
        private final String serverErrorDescription;

        private Result(String str, Boolean bool, String str2, String str3, String str4) {
            this.requestToken = str;
            this.friendshipStatusChanged = bool;
            this.serverErrorCode = str2;
            this.serverErrorDescription = str3;
            this.internalErrorMessage = str4;
        }

        private void checkRequestToken() {
            if (TextUtils.isEmpty(this.requestToken)) {
                throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
            }
        }

        @NonNull
        static Result createAsAuthenticationAgentError(@NonNull String str, @NonNull String str2) {
            return new Result(null, null, str, str2, null);
        }

        @NonNull
        static Result createAsInternalError(@NonNull String str) {
            return new Result(null, null, null, null, str);
        }

        @NonNull
        static Result createAsSuccess(@NonNull String str, Boolean bool) {
            return new Result(str, bool, null, null, null);
        }

        Boolean getFriendshipStatusChanged() {
            checkRequestToken();
            return this.friendshipStatusChanged;
        }

        @NonNull
        LineApiError getLineApiError() {
            if (!isAuthenticationAgentError()) {
                return new LineApiError(this.internalErrorMessage);
            }
            try {
                return new LineApiError(new JSONObject().putOpt("error", this.serverErrorCode).putOpt("error_description", this.serverErrorDescription).toString());
            } catch (JSONException e4) {
                return new LineApiError(e4);
            }
        }

        @NonNull
        String getRequestToken() {
            checkRequestToken();
            return this.requestToken;
        }

        boolean isAuthenticationAgentError() {
            return TextUtils.isEmpty(this.internalErrorMessage) && !isSuccess();
        }

        boolean isSuccess() {
            return !TextUtils.isEmpty(this.requestToken);
        }
    }

    BrowserAuthenticationApi(@NonNull LineAuthenticationStatus lineAuthenticationStatus) {
        this.authenticationStatus = lineAuthenticationStatus;
    }

    @NonNull
    private static List<Intent> convertToIntents(@NonNull Uri uri, @NonNull Collection<ResolveInfo> collection, Bundle bundle) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ResolveInfo resolveInfo : collection) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            arrayList.add(intent);
        }
        return arrayList;
    }

    @NonNull
    Uri createLoginUrl(@NonNull LineAuthenticationConfig lineAuthenticationConfig, @NonNull PKCECode pKCECode, @NonNull LineAuthenticationParams lineAuthenticationParams, @NonNull String str, String str2, @NonNull String str3) {
        Map<String, String> buildParams = UriUtils.buildParams("response_type", "code", "client_id", lineAuthenticationConfig.getChannelId(), b9.h.f15456P, str, "code_challenge", pKCECode.getChallenge(), "code_challenge_method", CodeChallengeMethod.S256.getValue(), "redirect_uri", str3, HiAnalyticsConstant.BI_KEY_SDK_VER, BuildConfig.VERSION_NAME, "scope", Scope.join(lineAuthenticationParams.getScopes()));
        if (!TextUtils.isEmpty(str2)) {
            buildParams.put("nonce", str2);
        }
        if (lineAuthenticationParams.getBotPrompt() != null) {
            buildParams.put("bot_prompt", lineAuthenticationParams.getBotPrompt().name().toLowerCase());
        }
        Map<String, String> buildParams2 = UriUtils.buildParams("returnUri", UriUtils.appendQueryParams("/oauth2/v2.1/authorize/consent", buildParams).toString(), "loginChannelId", lineAuthenticationConfig.getChannelId());
        if (lineAuthenticationParams.getUILocale() != null) {
            buildParams2.put("ui_locales", lineAuthenticationParams.getUILocale().toString());
        }
        return UriUtils.appendQueryParams(lineAuthenticationConfig.getWebLoginPageUrl(), buildParams2);
    }

    @NonNull
    String createRedirectUri(@NonNull Context context) {
        return "intent://result#Intent;package=" + context.getPackageName() + ";scheme=lineauth;end";
    }

    @NonNull
    AuthenticationIntentHolder getAuthenticationIntentHolder(@NonNull Context context, @NonNull Uri uri, boolean z4) {
        Intent data;
        Bundle bundle;
        if (isChromeCustomTabSupported()) {
            b a4 = new b.d().e(a.d(context, R.color.white)).a();
            data = a4.f11000a.setData(uri);
            bundle = a4.f11001b;
        } else {
            data = new Intent("android.intent.action.VIEW").setData(uri);
            bundle = null;
        }
        LineAppVersion lineAppVersion = LineAppVersion.getLineAppVersion(context);
        if (!z4 && lineAppVersion != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setPackage(Constants.LINE_APP_PACKAGE_NAME);
            if (resolveActivity(context, intent) != null) {
                return new AuthenticationIntentHolder(intent, bundle, true);
            }
        }
        List<Intent> convertToIntents = convertToIntents(uri, context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://")), 0), data.getExtras());
        int size = convertToIntents.size();
        if (size == 0) {
            throw new ActivityNotFoundException("Activity for LINE log-in is not found. uri=" + uri);
        }
        if (size == 1) {
            return new AuthenticationIntentHolder(convertToIntents.get(0), bundle, false);
        }
        Intent createChooser = Intent.createChooser(convertToIntents.remove(0), null);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) convertToIntents.toArray(new Parcelable[convertToIntents.size()]));
        return new AuthenticationIntentHolder(createChooser, bundle, false);
    }

    @NonNull
    Result getAuthenticationResultFrom(@NonNull Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return Result.createAsInternalError("Illegal redirection from external application.");
        }
        String oAuthState = this.authenticationStatus.getOAuthState();
        String queryParameter = data.getQueryParameter(b9.h.f15456P);
        if (oAuthState == null || !oAuthState.equals(queryParameter)) {
            return Result.createAsInternalError("Illegal parameter value of 'state'.");
        }
        String queryParameter2 = data.getQueryParameter("code");
        String queryParameter3 = data.getQueryParameter("friendship_status_changed");
        return !TextUtils.isEmpty(queryParameter2) ? Result.createAsSuccess(queryParameter2, !TextUtils.isEmpty(queryParameter3) ? Boolean.valueOf(Boolean.parseBoolean(queryParameter3)) : null) : Result.createAsAuthenticationAgentError(data.getQueryParameter("error"), data.getQueryParameter("error_description"));
    }

    @NonNull
    Request getRequest(@NonNull Context context, @NonNull LineAuthenticationConfig lineAuthenticationConfig, @NonNull PKCECode pKCECode, @NonNull LineAuthenticationParams lineAuthenticationParams) {
        String createRandomAlphaNumeric = StringUtils.createRandomAlphaNumeric(16);
        this.authenticationStatus.setOAuthState(createRandomAlphaNumeric);
        String nonce = lineAuthenticationParams.getScopes().contains(Scope.OPENID_CONNECT) ? !TextUtils.isEmpty(lineAuthenticationParams.getNonce()) ? lineAuthenticationParams.getNonce() : StringUtils.createRandomAlphaNumeric(16) : null;
        this.authenticationStatus.setOpenIdNonce(nonce);
        String createRedirectUri = createRedirectUri(context);
        AuthenticationIntentHolder authenticationIntentHolder = getAuthenticationIntentHolder(context, createLoginUrl(lineAuthenticationConfig, pKCECode, lineAuthenticationParams, createRandomAlphaNumeric, nonce, createRedirectUri), lineAuthenticationConfig.isLineAppAuthenticationDisabled());
        return new Request(authenticationIntentHolder.getIntent(), authenticationIntentHolder.getStartActivityOptions(), createRedirectUri, authenticationIntentHolder.isLineAppAuthentication);
    }

    boolean isChromeCustomTabSupported() {
        return true;
    }

    ComponentName resolveActivity(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager());
    }
}
