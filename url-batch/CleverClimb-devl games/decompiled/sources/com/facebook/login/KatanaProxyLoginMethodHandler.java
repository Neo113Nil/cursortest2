package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.ab;
import com.facebook.internal.w;
import com.facebook.internal.z;
import com.facebook.j;
import com.facebook.login.LoginClient;

/* loaded from: classes.dex */
class KatanaProxyLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new Parcelable.Creator() { // from class: com.facebook.login.KatanaProxyLoginMethodHandler.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    String getNameForLogging() {
        return "katana_proxy_auth";
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean tryAuthorize(LoginClient.Request request) {
        String e2e = LoginClient.getE2E();
        Intent a2 = w.a(this.loginClient.getActivity(), request.getApplicationId(), request.getPermissions(), e2e, request.isRerequest(), request.hasPublishPermission(), request.getDefaultAudience(), getClientState(request.getAuthId()));
        addLoggingExtra("e2e", e2e);
        return tryIntent(a2, LoginClient.getLoginRequestCode());
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean onActivityResult(int i, int i2, Intent intent) {
        LoginClient.Result handleResultOk;
        LoginClient.Request pendingRequest = this.loginClient.getPendingRequest();
        if (intent == null) {
            handleResultOk = LoginClient.Result.createCancelResult(pendingRequest, "Operation canceled");
        } else if (i2 == 0) {
            handleResultOk = handleResultCancel(pendingRequest, intent);
        } else if (i2 != -1) {
            handleResultOk = LoginClient.Result.createErrorResult(pendingRequest, "Unexpected resultCode from authorization.", null);
        } else {
            handleResultOk = handleResultOk(pendingRequest, intent);
        }
        if (handleResultOk != null) {
            this.loginClient.completeAndValidate(handleResultOk);
            return true;
        }
        this.loginClient.tryNextHandler();
        return true;
    }

    private LoginClient.Result handleResultOk(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String error = getError(extras);
        String string = extras.getString("error_code");
        String errorMessage = getErrorMessage(extras);
        String string2 = extras.getString("e2e");
        if (!ab.a(string2)) {
            logWebLoginCompleted(string2);
        }
        if (error == null && string == null && errorMessage == null) {
            try {
                return LoginClient.Result.createTokenResult(request, createAccessTokenFromWebBundle(request.getPermissions(), extras, com.facebook.c.FACEBOOK_APPLICATION_WEB, request.getApplicationId()));
            } catch (j e) {
                return LoginClient.Result.createErrorResult(request, null, e.getMessage());
            }
        }
        if (z.f6212a.contains(error)) {
            return null;
        }
        if (z.f6213b.contains(error)) {
            return LoginClient.Result.createCancelResult(request, null);
        }
        return LoginClient.Result.createErrorResult(request, error, errorMessage, string);
    }

    private LoginClient.Result handleResultCancel(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String error = getError(extras);
        String string = extras.getString("error_code");
        if ("CONNECTION_FAILURE".equals(string)) {
            return LoginClient.Result.createErrorResult(request, error, getErrorMessage(extras), string);
        }
        return LoginClient.Result.createCancelResult(request, error);
    }

    private String getError(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    private String getErrorMessage(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    protected boolean tryIntent(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.loginClient.getFragment().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
