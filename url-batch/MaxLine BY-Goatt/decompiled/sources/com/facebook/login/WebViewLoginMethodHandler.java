package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.WebDialog;
import com.facebook.login.LoginClient;
import defpackage.kr0;
import defpackage.tp2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    private static final String OAUTH_DIALOG = "oauth";
    private String e2e;
    private WebDialog loginDialog;
    private final String nameForLogging;
    private final AccessTokenSource tokenSource;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new Parcelable.Creator<WebViewLoginMethodHandler>() { // from class: com.facebook.login.WebViewLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new WebViewLoginMethodHandler(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    };

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
        this.e2e = parcel.readString();
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void cancel() {
        WebDialog webDialog = this.loginDialog;
        if (webDialog != null) {
            if (webDialog != null) {
                webDialog.cancel();
            }
            this.loginDialog = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getE2e() {
        return this.e2e;
    }

    public final WebDialog getLoginDialog() {
        return this.loginDialog;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean needsInternetPermission() {
        return true;
    }

    public final void onWebDialogComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        request.getClass();
        super.onComplete(request, bundle, facebookException);
    }

    public final void setE2e(String str) {
        this.e2e = str;
    }

    public final void setLoginDialog(WebDialog webDialog) {
        this.loginDialog = webDialog;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(final LoginClient.Request request) {
        request.getClass();
        Bundle addExtraParameters = addExtraParameters(getParameters(request), request);
        WebDialog.OnCompleteListener onCompleteListener = new WebDialog.OnCompleteListener() { // from class: com.facebook.login.WebViewLoginMethodHandler$tryAuthorize$listener$1
            @Override // com.facebook.internal.WebDialog.OnCompleteListener
            public void onComplete(Bundle bundle, FacebookException facebookException) {
                WebViewLoginMethodHandler.this.onWebDialogComplete(request, bundle, facebookException);
            }
        };
        String e2e = LoginClient.Companion.getE2E();
        this.e2e = e2e;
        addLoggingExtra("e2e", e2e);
        kr0 activity = getLoginClient().getActivity();
        if (activity == null) {
            return 0;
        }
        boolean isChromeOS = Utility.isChromeOS(activity);
        AuthDialogBuilder authDialogBuilder = new AuthDialogBuilder(this, activity, request.getApplicationId(), addExtraParameters, request);
        String str = this.e2e;
        str.getClass();
        this.loginDialog = authDialogBuilder.setE2E(str).setIsChromeOS(isChromeOS).setAuthType(request.getAuthType()).setLoginBehavior(request.getLoginBehavior()).setLoginTargetApp(request.getLoginTargetApp()).setFamilyLogin(request.isFamilyLogin()).setShouldSkipDedupe(request.shouldSkipAccountDeduplication()).setOnCompleteListener(onCompleteListener).build();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.setInnerDialog(this.loginDialog);
        facebookDialogFragment.show(activity.getSupportFragmentManager(), FacebookDialogFragment.TAG);
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e2e);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CustomRedirectWebDialog extends WebDialog {
        public static final Companion Companion = new Companion(null);
        private final String customRedirectUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomRedirectWebDialog(Context context, String str, String str2) {
            super(context, str);
            context.getClass();
            str.getClass();
            str2.getClass();
            this.customRedirectUri = str2;
            setExpectedRedirectUrl(str2);
        }

        @Override // com.facebook.internal.WebDialog
        public Bundle parseResponseUri(String str) {
            if (str == null || this.customRedirectUri.length() <= 0 || !tp2.o(str, this.customRedirectUri, false)) {
                return super.parseResponseUri(str);
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                getContext().startActivity(intent);
                dismiss();
            } catch (Exception e) {
                sendErrorToListener(new FacebookDialogException("Failed to launch custom redirect: " + e.getMessage(), -1, str));
            }
            return new Bundle();
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {

            /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LoginTargetApp.values().length];
                    try {
                        iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final WebDialog create(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, WebDialog.OnCompleteListener onCompleteListener, String str2) {
                Uri buildUri;
                context.getClass();
                loginTargetApp.getClass();
                str2.getClass();
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = new Bundle(bundle);
                bundle2.putString("display", "touch");
                bundle2.putString("client_id", FacebookSdk.getApplicationId());
                bundle2.putString(ServerProtocol.DIALOG_PARAM_SDK_VERSION, "android-" + FacebookSdk.getSdkVersion());
                if (WhenMappings.$EnumSwitchMapping$0[loginTargetApp.ordinal()] == 1) {
                    buildUri = Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle2);
                } else {
                    buildUri = Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + str, bundle2);
                }
                WebDialog.Companion companion = WebDialog.Companion;
                WebDialog.initDefaultTheme(context);
                String uri = buildUri.toString();
                uri.getClass();
                CustomRedirectWebDialog customRedirectWebDialog = new CustomRedirectWebDialog(context, uri, str2);
                customRedirectWebDialog.setOnCompleteListener(onCompleteListener);
                return customRedirectWebDialog;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class AuthDialogBuilder extends WebDialog.Builder {
        public String authType;
        public String e2e;
        private boolean isFamilyLogin;
        private LoginBehavior loginBehavior;
        private LoginClient.Request originalRequest;
        private String redirect_uri;
        private boolean shouldSkipDedupe;
        private LoginTargetApp targetApp;
        final /* synthetic */ WebViewLoginMethodHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthDialogBuilder(WebViewLoginMethodHandler webViewLoginMethodHandler, Context context, String str, Bundle bundle, LoginClient.Request request) {
            super(context, str, "oauth", bundle);
            context.getClass();
            str.getClass();
            bundle.getClass();
            request.getClass();
            this.this$0 = webViewLoginMethodHandler;
            this.redirect_uri = ServerProtocol.DIALOG_REDIRECT_URI;
            this.loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
            this.targetApp = LoginTargetApp.FACEBOOK;
            this.originalRequest = request;
        }

        @Override // com.facebook.internal.WebDialog.Builder
        public WebDialog build() {
            Bundle parameters = getParameters();
            parameters.getClass();
            String redirectURI = this.originalRequest.getRedirectURI();
            boolean z = redirectURI == null || redirectURI.length() == 0;
            if (!parameters.containsKey(ServerProtocol.DIALOG_PARAM_REDIRECT_URI)) {
                parameters.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, this.redirect_uri);
            }
            parameters.putString("client_id", getApplicationId());
            parameters.putString("e2e", getE2e());
            parameters.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, this.targetApp == LoginTargetApp.INSTAGRAM ? ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES : ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST);
            parameters.putString(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            parameters.putString(ServerProtocol.DIALOG_PARAM_AUTH_TYPE, getAuthType());
            parameters.putString("login_behavior", this.loginBehavior.name());
            if (this.isFamilyLogin) {
                parameters.putString(ServerProtocol.DIALOG_PARAM_FX_APP, this.targetApp.toString());
            }
            if (this.shouldSkipDedupe) {
                parameters.putString(ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            }
            if (z) {
                WebDialog.Companion companion = WebDialog.Companion;
                Context context = getContext();
                context.getClass();
                return companion.newInstance(context, "oauth", parameters, getTheme(), this.targetApp, getListener());
            }
            CustomRedirectWebDialog.Companion companion2 = CustomRedirectWebDialog.Companion;
            Context context2 = getContext();
            context2.getClass();
            int theme = getTheme();
            LoginTargetApp loginTargetApp = this.targetApp;
            WebDialog.OnCompleteListener listener = getListener();
            String redirectURI2 = this.originalRequest.getRedirectURI();
            redirectURI2.getClass();
            return companion2.create(context2, "oauth", parameters, theme, loginTargetApp, listener, redirectURI2);
        }

        public final String getAuthType() {
            String str = this.authType;
            if (str != null) {
                return str;
            }
            Intrinsics.f("authType");
            throw null;
        }

        public final String getE2e() {
            String str = this.e2e;
            if (str != null) {
                return str;
            }
            Intrinsics.f("e2e");
            throw null;
        }

        public final AuthDialogBuilder setAuthType(String str) {
            str.getClass();
            m6setAuthType(str);
            return this;
        }

        public final AuthDialogBuilder setE2E(String str) {
            str.getClass();
            setE2e(str);
            return this;
        }

        public final void setE2e(String str) {
            str.getClass();
            this.e2e = str;
        }

        public final AuthDialogBuilder setFamilyLogin(boolean z) {
            this.isFamilyLogin = z;
            return this;
        }

        public final AuthDialogBuilder setIsChromeOS(boolean z) {
            this.redirect_uri = z ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : ServerProtocol.DIALOG_REDIRECT_URI;
            return this;
        }

        public final AuthDialogBuilder setLoginBehavior(LoginBehavior loginBehavior) {
            loginBehavior.getClass();
            this.loginBehavior = loginBehavior;
            return this;
        }

        public final AuthDialogBuilder setLoginTargetApp(LoginTargetApp loginTargetApp) {
            loginTargetApp.getClass();
            this.targetApp = loginTargetApp;
            return this;
        }

        public final AuthDialogBuilder setShouldSkipDedupe(boolean z) {
            this.shouldSkipDedupe = z;
            return this;
        }

        /* renamed from: setAuthType, reason: collision with other method in class */
        public final void m6setAuthType(String str) {
            str.getClass();
            this.authType = str;
        }

        public final AuthDialogBuilder setIsRerequest(boolean z) {
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
    }
}
