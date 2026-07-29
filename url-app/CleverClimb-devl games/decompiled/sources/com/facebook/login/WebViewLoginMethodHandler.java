package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.ad;
import com.facebook.j;
import com.facebook.login.LoginClient;

/* loaded from: classes.dex */
class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new Parcelable.Creator() { // from class: com.facebook.login.WebViewLoginMethodHandler.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    };
    private String e2e;
    private ad loginDialog;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    String getNameForLogging() {
        return "web_view";
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean needsInternetPermission() {
        return true;
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    com.facebook.c getTokenSource() {
        return com.facebook.c.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    void cancel() {
        if (this.loginDialog != null) {
            this.loginDialog.cancel();
            this.loginDialog = null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean tryAuthorize(final LoginClient.Request request) {
        Bundle parameters = getParameters(request);
        ad.c cVar = new ad.c() { // from class: com.facebook.login.WebViewLoginMethodHandler.1
            @Override // com.facebook.internal.ad.c
            public void a(Bundle bundle, j jVar) {
                WebViewLoginMethodHandler.this.onWebDialogComplete(request, bundle, jVar);
            }
        };
        this.e2e = LoginClient.getE2E();
        addLoggingExtra("e2e", this.e2e);
        FragmentActivity activity = this.loginClient.getActivity();
        this.loginDialog = new a(activity, request.getApplicationId(), parameters).a(this.e2e).a(request.isRerequest()).a(cVar).a();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.a(this.loginDialog);
        facebookDialogFragment.show(activity.getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }

    void onWebDialogComplete(LoginClient.Request request, Bundle bundle, j jVar) {
        super.onComplete(request, bundle, jVar);
    }

    static class a extends ad.a {

        /* renamed from: a, reason: collision with root package name */
        private String f6252a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f6253b;

        public a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        public a a(String str) {
            this.f6252a = str;
            return this;
        }

        public a a(boolean z) {
            this.f6253b = z;
            return this;
        }

        @Override // com.facebook.internal.ad.a
        public ad a() {
            Bundle e = e();
            e.putString("redirect_uri", "fbconnect://success");
            e.putString("client_id", b());
            e.putString("e2e", this.f6252a);
            e.putString("response_type", "token,signed_request");
            e.putString("return_scopes", "true");
            e.putString("auth_type", "rerequest");
            return new ad(c(), "oauth", e, d(), f());
        }
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.e2e = parcel.readString();
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e2e);
    }
}
