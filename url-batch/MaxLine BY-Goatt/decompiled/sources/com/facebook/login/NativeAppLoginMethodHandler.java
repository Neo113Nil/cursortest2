package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import defpackage.b4;
import defpackage.fr0;
import defpackage.s50;
import defpackage.zv;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    private final AccessTokenSource tokenSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    private final void completeLogin(LoginClient.Result result) {
        if (result != null) {
            getLoginClient().completeAndValidate(result);
        } else {
            getLoginClient().tryNextHandler();
        }
    }

    private final boolean isCallable(Intent intent) {
        FacebookSdk.getApplicationContext().getPackageManager().queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST).getClass();
        return !r1.isEmpty();
    }

    private final void processSuccessResponse(LoginClient.Request request, Bundle bundle) {
        if (!bundle.containsKey("code") || Utility.isNullOrEmpty(bundle.getString("code"))) {
            handleResultOk(request, bundle);
        } else {
            FacebookSdk.getExecutor().execute(new s50(this, request, bundle, 6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processSuccessResponse$lambda$0(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        nativeAppLoginMethodHandler.getClass();
        request.getClass();
        bundle.getClass();
        try {
            nativeAppLoginMethodHandler.handleResultOk(request, nativeAppLoginMethodHandler.processCodeExchange(request, bundle));
        } catch (FacebookServiceException e) {
            FacebookRequestError requestError = e.getRequestError();
            nativeAppLoginMethodHandler.handleResultError(request, requestError.getErrorType(), requestError.getErrorMessage(), String.valueOf(requestError.getErrorCode()));
        } catch (FacebookException e2) {
            nativeAppLoginMethodHandler.handleResultError(request, null, e2.getMessage(), null);
        }
    }

    public String getError(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("error")) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString("error_type");
        }
        return null;
    }

    public String getErrorMessage(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("error_message")) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
        }
        return null;
    }

    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    public void handleResultCancel(LoginClient.Request request, Intent intent) {
        Object obj;
        intent.getClass();
        Bundle extras = intent.getExtras();
        String error = getError(extras);
        String obj2 = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
        if (Intrinsics.b(ServerProtocol.getErrorConnectionFailure(), obj2)) {
            completeLogin(LoginClient.Result.Companion.createErrorResult(request, error, getErrorMessage(extras), obj2));
        } else {
            completeLogin(LoginClient.Result.Companion.createCancelResult(request, error));
        }
    }

    public void handleResultError(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            completeLogin(null);
        } else if (zv.q(ServerProtocol.getErrorsProxyAuthDisabled(), str)) {
            completeLogin(null);
        } else if (zv.q(ServerProtocol.getErrorsUserCanceled(), str)) {
            completeLogin(LoginClient.Result.Companion.createCancelResult(request, null));
        } else {
            completeLogin(LoginClient.Result.Companion.createErrorResult(request, str, str2, str3));
        }
    }

    public void handleResultOk(LoginClient.Request request, Bundle bundle) {
        request.getClass();
        bundle.getClass();
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.Companion;
            completeLogin(LoginClient.Result.Companion.createCompositeTokenResult(request, companion.createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId()), companion.createAuthenticationTokenFromWebBundle(bundle, request.getNonce())));
        } catch (FacebookException e) {
            completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, request, null, e.getMessage(), null, 8, null));
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean onActivityResult(int i, int i2, Intent intent) {
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (intent == null) {
            completeLogin(LoginClient.Result.Companion.createCancelResult(pendingRequest, "Operation canceled"));
        } else if (i2 == 0) {
            handleResultCancel(pendingRequest, intent);
        } else if (i2 != -1) {
            completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, pendingRequest, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, pendingRequest, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String error = getError(extras);
            Object obj = extras.get("error_code");
            String obj2 = obj != null ? obj.toString() : null;
            String errorMessage = getErrorMessage(extras);
            String string = extras.getString("e2e");
            if (!Utility.isNullOrEmpty(string)) {
                logWebLoginCompleted(string);
            }
            if (error == null && obj2 == null && errorMessage == null && pendingRequest != null) {
                processSuccessResponse(pendingRequest, extras);
            } else {
                handleResultError(pendingRequest, error, errorMessage, obj2);
            }
        }
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public abstract int tryAuthorize(LoginClient.Request request);

    public boolean tryIntent(Intent intent, int i) {
        b4 launcher;
        if (intent == null || !isCallable(intent)) {
            return false;
        }
        fr0 fragment = getLoginClient().getFragment();
        Unit unit = null;
        LoginFragment loginFragment = fragment instanceof LoginFragment ? (LoginFragment) fragment : null;
        if (loginFragment != null && (launcher = loginFragment.getLauncher()) != null) {
            launcher.b(intent);
            unit = Unit.a;
        }
        return unit != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }
}
