package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.internal.ab;
import com.facebook.j;
import com.facebook.k;
import com.facebook.l;
import com.facebook.login.LoginClient;
import com.facebook.n;
import java.util.Locale;

/* loaded from: classes.dex */
abstract class WebLoginMethodHandler extends LoginMethodHandler {
    private String e2e;

    abstract com.facebook.c getTokenSource();

    private static final String getRedirectUri() {
        return "fb" + l.i() + "://authorize";
    }

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    protected Bundle getParameters(LoginClient.Request request) {
        Bundle bundle = new Bundle();
        if (!ab.a(request.getPermissions())) {
            String join = TextUtils.join(",", request.getPermissions());
            bundle.putString("scope", join);
            addLoggingExtra("scope", join);
        }
        bundle.putString("default_audience", request.getDefaultAudience().a());
        bundle.putString("state", getClientState(request.getAuthId()));
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        String token = currentAccessToken != null ? currentAccessToken.getToken() : null;
        if (token != null && token.equals(loadCookieToken())) {
            bundle.putString("access_token", token);
            addLoggingExtra("access_token", "1");
        } else {
            ab.b(this.loginClient.getActivity());
            addLoggingExtra("access_token", "0");
        }
        return bundle;
    }

    protected Bundle addExtraParameters(Bundle bundle, LoginClient.Request request) {
        bundle.putString("redirect_uri", getRedirectUri());
        bundle.putString("client_id", request.getApplicationId());
        LoginClient loginClient = this.loginClient;
        bundle.putString("e2e", LoginClient.getE2E());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", "rerequest");
        return bundle;
    }

    protected void onComplete(LoginClient.Request request, Bundle bundle, j jVar) {
        String str;
        LoginClient.Result createErrorResult;
        this.e2e = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.e2e = bundle.getString("e2e");
            }
            try {
                AccessToken createAccessTokenFromWebBundle = createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId());
                createErrorResult = LoginClient.Result.createTokenResult(this.loginClient.getPendingRequest(), createAccessTokenFromWebBundle);
                CookieSyncManager.createInstance(this.loginClient.getActivity()).sync();
                saveCookieToken(createAccessTokenFromWebBundle.getToken());
            } catch (j e) {
                createErrorResult = LoginClient.Result.createErrorResult(this.loginClient.getPendingRequest(), null, e.getMessage());
            }
        } else if (jVar instanceof k) {
            createErrorResult = LoginClient.Result.createCancelResult(this.loginClient.getPendingRequest(), "User canceled log in.");
        } else {
            this.e2e = null;
            String message = jVar.getMessage();
            if (jVar instanceof n) {
                FacebookRequestError a2 = ((n) jVar).a();
                str = String.format(Locale.ROOT, "%d", Integer.valueOf(a2.getErrorCode()));
                message = a2.toString();
            } else {
                str = null;
            }
            createErrorResult = LoginClient.Result.createErrorResult(this.loginClient.getPendingRequest(), null, message, str);
        }
        if (!ab.a(this.e2e)) {
            logWebLoginCompleted(this.e2e);
        }
        this.loginClient.completeAndValidate(createErrorResult);
    }

    private String loadCookieToken() {
        return this.loginClient.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    private void saveCookieToken(String str) {
        this.loginClient.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }
}
