package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import defpackage.kr0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {
    public static final Companion Companion = new Companion(null);
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private String e2e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
    }

    private final String loadCookieToken() {
        Context activity = getLoginClient().getActivity();
        if (activity == null) {
            activity = FacebookSdk.getApplicationContext();
        }
        return activity.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).getString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, com.google.firebase.encoders.json.BuildConfig.FLAVOR);
    }

    private final void saveCookieToken(String str) {
        Context activity = getLoginClient().getActivity();
        if (activity == null) {
            activity = FacebookSdk.getApplicationContext();
        }
        activity.getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).edit().putString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, str).apply();
    }

    public Bundle addExtraParameters(Bundle bundle, LoginClient.Request request) {
        bundle.getClass();
        request.getClass();
        String redirectURI = request.getRedirectURI();
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, (redirectURI == null || redirectURI.length() == 0) ? getRedirectUrl() : request.getRedirectURI());
        if (request.isInstagramLogin()) {
            bundle.putString("app_id", request.getApplicationId());
        } else {
            bundle.putString("client_id", request.getApplicationId());
        }
        bundle.putString("e2e", LoginClient.Companion.getE2E());
        if (request.isInstagramLogin()) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES);
        } else {
            if (request.getPermissions().contains(LoginConfiguration.OPENID)) {
                bundle.putString("nonce", request.getNonce());
            }
            bundle.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, ServerProtocol.DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST);
        }
        bundle.putString(ServerProtocol.DIALOG_PARAM_CODE_CHALLENGE, request.getCodeChallenge());
        CodeChallengeMethod codeChallengeMethod = request.getCodeChallengeMethod();
        bundle.putString(ServerProtocol.DIALOG_PARAM_CODE_CHALLENGE_METHOD, codeChallengeMethod != null ? codeChallengeMethod.name() : null);
        bundle.putString(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        bundle.putString(ServerProtocol.DIALOG_PARAM_AUTH_TYPE, request.getAuthType());
        bundle.putString("login_behavior", request.getLoginBehavior().name());
        bundle.putString(ServerProtocol.DIALOG_PARAM_SDK_VERSION, "android-" + FacebookSdk.getSdkVersion());
        if (getSSODevice() != null) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_SSO_DEVICE, getSSODevice());
        }
        boolean z = FacebookSdk.hasCustomTabsPrefetching;
        String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        bundle.putString(ServerProtocol.DIALOG_PARAM_CUSTOM_TABS_PREFETCHING, z ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        if (request.isFamilyLogin()) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_FX_APP, request.getLoginTargetApp().toString());
        }
        if (request.shouldSkipAccountDeduplication()) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        if (request.getForceConfirmation()) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_FORCE_CONFIRMATION, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        String androidSsoContext = request.getAndroidSsoContext();
        if (androidSsoContext != null && androidSsoContext.length() != 0) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_ANDROID_SSO_CONTEXT, request.getAndroidSsoContext());
        }
        if (request.getMessengerPageId() != null) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_MESSENGER_PAGE_ID, request.getMessengerPageId());
            if (request.getResetMessengerState()) {
                str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
            }
            bundle.putString(ServerProtocol.DIALOG_PARAM_RESET_MESSENGER_STATE, str);
        }
        return bundle;
    }

    public Bundle getParameters(LoginClient.Request request) {
        request.getClass();
        Bundle bundle = new Bundle();
        if (!Utility.isNullOrEmpty(request.getPermissions())) {
            String join = TextUtils.join(",", request.getPermissions());
            bundle.putString("scope", join);
            addLoggingExtra("scope", join);
        }
        DefaultAudience defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        bundle.putString("default_audience", defaultAudience.getNativeProtocolAudience());
        bundle.putString(ServerProtocol.DIALOG_PARAM_STATE, getClientState(request.getAuthId()));
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        String token = currentAccessToken != null ? currentAccessToken.getToken() : null;
        String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        if (token == null || !token.equals(loadCookieToken())) {
            kr0 activity = getLoginClient().getActivity();
            if (activity != null) {
                Utility.clearFacebookCookies(activity);
            }
            addLoggingExtra("access_token", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        } else {
            bundle.putString("access_token", token);
            addLoggingExtra("access_token", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        bundle.putString(ServerProtocol.DIALOG_PARAM_CBT, String.valueOf(System.currentTimeMillis()));
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        }
        bundle.putString(ServerProtocol.DIALOG_PARAM_IES, str);
        return bundle;
    }

    public String getSSODevice() {
        return null;
    }

    public abstract AccessTokenSource getTokenSource();

    public void onComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        String str;
        LoginClient.Result createErrorResult;
        String str2;
        request.getClass();
        LoginClient loginClient = getLoginClient();
        this.e2e = null;
        String redirectURI = request.getRedirectURI();
        if (redirectURI != null && redirectURI.length() != 0 && !Intrinsics.b(request.getRedirectURI(), getRedirectUrl())) {
            if (facebookException instanceof FacebookOperationCanceledException) {
                loginClient.completeAndValidate(LoginClient.Result.Companion.createCancelResult(loginClient.getPendingRequest(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE));
                return;
            }
            if (facebookException != null) {
                this.e2e = null;
                String message = facebookException.getMessage();
                if (facebookException instanceof FacebookServiceException) {
                    FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                    str2 = String.valueOf(requestError.getErrorCode());
                    message = requestError.toString();
                } else {
                    str2 = null;
                }
                loginClient.completeAndValidate(LoginClient.Result.Companion.createErrorResult(loginClient.getPendingRequest(), null, message, str2));
                return;
            }
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.e2e = bundle.getString("e2e");
            }
            try {
                LoginMethodHandler.Companion companion = LoginMethodHandler.Companion;
                AccessToken createAccessTokenFromWebBundle = companion.createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId());
                createErrorResult = LoginClient.Result.Companion.createCompositeTokenResult(loginClient.getPendingRequest(), createAccessTokenFromWebBundle, companion.createAuthenticationTokenFromWebBundle(bundle, request.getNonce()));
                if (loginClient.getActivity() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClient.getActivity()).sync();
                    } catch (Exception unused) {
                    }
                    if (createAccessTokenFromWebBundle != null) {
                        saveCookieToken(createAccessTokenFromWebBundle.getToken());
                    }
                }
            } catch (FacebookException e) {
                createErrorResult = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, loginClient.getPendingRequest(), null, e.getMessage(), null, 8, null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            createErrorResult = LoginClient.Result.Companion.createCancelResult(loginClient.getPendingRequest(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE);
        } else {
            this.e2e = null;
            String message2 = facebookException != null ? facebookException.getMessage() : null;
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError2 = ((FacebookServiceException) facebookException).getRequestError();
                str = String.valueOf(requestError2.getErrorCode());
                message2 = requestError2.toString();
            } else {
                str = null;
            }
            createErrorResult = LoginClient.Result.Companion.createErrorResult(loginClient.getPendingRequest(), null, message2, str);
        }
        if (!Utility.isNullOrEmpty(this.e2e)) {
            logWebLoginCompleted(this.e2e);
        }
        loginClient.completeAndValidate(createErrorResult);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
        parcel.getClass();
    }
}
