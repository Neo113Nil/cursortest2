package com.facebook.login;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.FBLoginSSONoAppDialog;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import defpackage.ah0;
import defpackage.b4;
import defpackage.k4;
import defpackage.kr0;
import defpackage.q40;
import defpackage.t3;
import defpackage.x3;
import defpackage.xx;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FBLoginSSOLauncher {
    public static final Companion Companion = new Companion(null);
    private static final String SSO_DISMISSED_EXTRA = "sso_dismissed";
    private static final String TAG = "FBLoginSSOLauncher";
    private static String pendingSsoContext;
    private final xx activity;
    private InternalAppEventsLogger appEventsLogger;
    private final FacebookCallback<LoginResult> callback;
    private final b4 launcher;
    private String pendingNonce;
    private Collection<String> pendingPermissions;
    private LoginClient.Request pendingRequest;
    private final boolean showWithoutFBApp;

    public FBLoginSSOLauncher(xx xxVar, FacebookCallback<LoginResult> facebookCallback, boolean z) {
        xxVar.getClass();
        this.activity = xxVar;
        this.callback = facebookCallback;
        this.showWithoutFBApp = z;
        this.pendingPermissions = ah0.m;
        b4 registerForActivityResult = xxVar.registerForActivityResult(new x3(3), new k4(5, this));
        registerForActivityResult.getClass();
        this.launcher = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FBLoginSSOLauncher fBLoginSSOLauncher, t3 t3Var) {
        fBLoginSSOLauncher.getClass();
        fBLoginSSOLauncher.handleActivityResult(t3Var.m, t3Var.n);
    }

    public static final String getPendingSsoContext() {
        return Companion.getPendingSsoContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r16.getBooleanExtra(com.facebook.login.FBLoginSSOLauncher.SSO_DISMISSED_EXTRA, false) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void handleActivityResult(int i, Intent intent) {
        boolean z;
        LoginClient.Request request = this.pendingRequest;
        String str = this.pendingNonce;
        if (intent != null) {
            z = true;
        }
        z = false;
        Utility.logd(TAG, "handleActivityResult: resultCode=" + i + ", sso_dismissed=" + z);
        if (z) {
            Utility.logd(TAG, "SSO popup dismissed by user (not a login cancellation)");
            logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_DISMISSED, request != null ? request.getAuthId() : null, null, LoginClient.Result.Code.CANCEL.getLoggingValue(), 4, null);
            FacebookCallback<LoginResult> facebookCallback = this.callback;
            if (facebookCallback != null) {
                facebookCallback.onCancel();
            }
            this.pendingNonce = null;
            this.pendingRequest = null;
            return;
        }
        Intent intent2 = new Intent();
        if (i != -1 || intent == null) {
            Utility.logd(TAG, "Login cancelled (not SSO dismiss — OAuth dialog was shown)");
            LoginClient.Result createCancelResult = LoginClient.Result.Companion.createCancelResult(request, "Operation canceled");
            markFromSso(createCancelResult);
            intent2.putExtra(LoginFragment.RESULT_KEY, createCancelResult);
            LoginManager.Companion.getInstance().onActivityResult(0, intent2, this.callback);
        } else {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("error");
                if (string == null) {
                    string = extras.getString("error_type");
                }
                Object obj = extras.get("error_code");
                String obj2 = obj != null ? obj.toString() : null;
                String string2 = extras.getString("error_message");
                if (string2 == null) {
                    string2 = extras.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
                }
                if (string == null && obj2 == null && string2 == null) {
                    try {
                        LoginMethodHandler.Companion companion = LoginMethodHandler.Companion;
                        LoginClient.Result createCompositeTokenResult = LoginClient.Result.Companion.createCompositeTokenResult(request, companion.createAccessTokenFromWebBundle(request != null ? request.getPermissions() : null, extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, FacebookSdk.getApplicationId()), companion.createAuthenticationTokenFromWebBundle(extras, str));
                        markFromSso(createCompositeTokenResult);
                        intent2.putExtra(LoginFragment.RESULT_KEY, createCompositeTokenResult);
                        LoginManager.Companion.getInstance().onActivityResult(-1, intent2, this.callback);
                    } catch (Exception e) {
                        LoginClient.Result createErrorResult$default = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, request, null, e.getMessage(), null, 8, null);
                        markFromSso(createErrorResult$default);
                        intent2.putExtra(LoginFragment.RESULT_KEY, createErrorResult$default);
                        LoginManager.Companion.getInstance().onActivityResult(-1, intent2, this.callback);
                    }
                } else {
                    LoginClient.Result createErrorResult = LoginClient.Result.Companion.createErrorResult(request, string, string2, obj2);
                    markFromSso(createErrorResult);
                    intent2.putExtra(LoginFragment.RESULT_KEY, createErrorResult);
                    LoginManager.Companion.getInstance().onActivityResult(-1, intent2, this.callback);
                }
            } else {
                LoginClient.Result createErrorResult$default2 = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, request, null, "Unexpected null extras from SSO activity.", null, 8, null);
                markFromSso(createErrorResult$default2);
                intent2.putExtra(LoginFragment.RESULT_KEY, createErrorResult$default2);
                LoginManager.Companion.getInstance().onActivityResult(-1, intent2, this.callback);
            }
        }
        this.pendingNonce = null;
        this.pendingRequest = null;
    }

    private final boolean isFb4aInstalled() {
        try {
            this.activity.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean launch$default(FBLoginSSOLauncher fBLoginSSOLauncher, Collection collection, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = ah0.m;
        }
        return fBLoginSSOLauncher.launch(collection);
    }

    private final void logSsoEvent(String str, String str2, JSONObject jSONObject, String str3) {
        String str4;
        String jSONObject2;
        Bundle bundle = new Bundle();
        bundle.putLong(LoginLogger.EVENT_PARAM_TIMESTAMP, System.currentTimeMillis());
        String str5 = com.google.firebase.encoders.json.BuildConfig.FLAVOR;
        bundle.putString(LoginLogger.EVENT_PARAM_AUTH_LOGGER_ID, str2 == null ? com.google.firebase.encoders.json.BuildConfig.FLAVOR : str2);
        bundle.putString(LoginLogger.EVENT_PARAM_LOGIN_RESULT, str3 == null ? com.google.firebase.encoders.json.BuildConfig.FLAVOR : str3);
        bundle.putString(LoginLogger.EVENT_PARAM_METHOD, com.google.firebase.encoders.json.BuildConfig.FLAVOR);
        bundle.putString(LoginLogger.EVENT_PARAM_ERROR_CODE, com.google.firebase.encoders.json.BuildConfig.FLAVOR);
        bundle.putString(LoginLogger.EVENT_PARAM_ERROR_MESSAGE, com.google.firebase.encoders.json.BuildConfig.FLAVOR);
        if (jSONObject == null || (str4 = jSONObject.toString()) == null) {
            str4 = com.google.firebase.encoders.json.BuildConfig.FLAVOR;
        }
        bundle.putString(LoginLogger.EVENT_PARAM_EXTRAS, str4);
        bundle.putString(LoginLogger.EVENT_PARAM_CHALLENGE, com.google.firebase.encoders.json.BuildConfig.FLAVOR);
        StringBuilder sb = new StringBuilder("Event: ");
        sb.append(str);
        sb.append(" | auth_logger_id=");
        if (str2 == null) {
            str2 = com.google.firebase.encoders.json.BuildConfig.FLAVOR;
        }
        sb.append(str2);
        sb.append(" | result=");
        if (str3 == null) {
            str3 = com.google.firebase.encoders.json.BuildConfig.FLAVOR;
        }
        sb.append(str3);
        sb.append(" | extras=");
        if (jSONObject != null && (jSONObject2 = jSONObject.toString()) != null) {
            str5 = jSONObject2;
        }
        sb.append(str5);
        Utility.logd(TAG, sb.toString());
        InternalAppEventsLogger appEventsLogger$facebook_common_release = getAppEventsLogger$facebook_common_release();
        if (appEventsLogger$facebook_common_release != null) {
            appEventsLogger$facebook_common_release.logEventImplicitly(str, bundle);
        }
    }

    public static /* synthetic */ void logSsoEvent$default(FBLoginSSOLauncher fBLoginSSOLauncher, String str, String str2, JSONObject jSONObject, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        fBLoginSSOLauncher.logSsoEvent(str, str2, jSONObject, str3);
    }

    private final void markFromSso(LoginClient.Result result) {
        Map<String, String> map = result.loggingExtras;
        Map<String, String> linkedHashMap = map != null ? new LinkedHashMap<>(map) : new HashMap<>();
        linkedHashMap.put(LoginLogger.EVENT_EXTRAS_FROM_SSO, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        result.loggingExtras = linkedHashMap;
    }

    public final InternalAppEventsLogger getAppEventsLogger$facebook_common_release() {
        if (this.appEventsLogger == null) {
            this.appEventsLogger = new InternalAppEventsLogger(this.activity, FacebookSdk.getApplicationId());
        }
        return this.appEventsLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean launch(Collection<String> collection) {
        collection.getClass();
        this.pendingPermissions = collection;
        if (AccessToken.Companion.getCurrentAccessToken() == null) {
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            Utility.logd(TAG, "auth_logger_id: ".concat(uuid));
            Collection<String> collection2 = collection;
            logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_LAUNCH_ATTEMPTED, uuid, new JSONObject().put("permissions", TextUtils.join(",", collection2)), null, 8, null);
            if (!FeatureManager.isEnabled(FeatureManager.Feature.LoginSSO)) {
                pendingSsoContext = "non_sso_login_sso_not_shown";
                logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_NOT_SHOWN, uuid, new JSONObject().put("reason", "gk_disabled"), null, 8, null);
                return false;
            }
            LoginConfiguration loginConfiguration = new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0);
            LoginManager companion = LoginManager.Companion.getInstance();
            LoginClient.Request request = new LoginClient.Request(companion.getLoginBehavior(), loginConfiguration.getPermissions(), companion.getDefaultAudience(), companion.getAuthType(), FacebookSdk.getApplicationId(), uuid, companion.getLoginTargetApp(), loginConfiguration.getNonce(), null, null, null, FacebookSdk.getRedirectURI(), FacebookSdk.getIntentUriPackageTarget(), 1792, null);
            request.setFamilyLogin(companion.isFamilyLogin());
            request.setShouldSkipAccountDeduplication(companion.getShouldSkipAccountDeduplication());
            this.pendingNonce = loginConfiguration.getNonce();
            this.pendingRequest = request;
            for (Intent intent : NativeProtocol.createFBLoginSSOIntents(this.activity, FacebookSdk.getApplicationId(), loginConfiguration.getPermissions(), LoginClient.Companion.getE2E(), false, false, companion.getDefaultAudience(), q40.m("{\"0_auth_logger_id\":\"", uuid, "\"}"), companion.getAuthType(), false, null, false, companion.isFamilyLogin(), companion.getShouldSkipAccountDeduplication(), loginConfiguration.getNonce(), null, null, FacebookSdk.getRedirectURI(), FacebookSdk.getIntentUriPackageTarget())) {
                if (this.activity.getPackageManager().resolveActivity(intent, 0) != null) {
                    pendingSsoContext = "non_sso_login_sso_shown";
                    logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_DELEGATED_TO_FB4A, request.getAuthId(), null, null, 12, null);
                    this.launcher.b(intent);
                    return true;
                }
            }
            String str = isFb4aInstalled() ? "fb4a_outdated" : "fb4a_not_installed";
            if (!this.showWithoutFBApp) {
                logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_NOT_SHOWN, request.getAuthId(), new JSONObject().put("reason", str), null, 8, null);
                pendingSsoContext = "non_sso_login_sso_not_shown";
                return false;
            }
            xx xxVar = this.activity;
            kr0 kr0Var = xxVar instanceof kr0 ? (kr0) xxVar : null;
            if (kr0Var != null) {
                FBLoginSSONoAppDialog newInstance$default = FBLoginSSONoAppDialog.Companion.newInstance$default(FBLoginSSONoAppDialog.Companion, false, 1, null);
                newInstance$default.setOnContinueListener(new FBLoginSSOLauncher$launch$1(this, request, str));
                newInstance$default.setOnDismissListener(new FBLoginSSOLauncher$launch$2(this, request));
                newInstance$default.show(kr0Var.getSupportFragmentManager(), FBLoginSSONoAppDialog.TAG);
                logSsoEvent$default(this, LoginLogger.EVENT_NAME_SSO_SHOWN, request.getAuthId(), new JSONObject().put("reason", str).put("permissions", TextUtils.join(",", collection2)), null, 8, null);
                return true;
            }
        }
        return false;
    }

    public final void setAppEventsLogger$facebook_common_release(InternalAppEventsLogger internalAppEventsLogger) {
        this.appEventsLogger = internalAppEventsLogger;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getPendingSsoContext() {
            return FBLoginSSOLauncher.pendingSsoContext;
        }

        public final void setPendingSsoContext$facebook_common_release(String str) {
            FBLoginSSOLauncher.pendingSsoContext = str;
        }

        private Companion() {
        }

        public static /* synthetic */ void getPendingSsoContext$annotations() {
        }
    }

    public static /* synthetic */ void getAppEventsLogger$facebook_common_release$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBLoginSSOLauncher(xx xxVar, FacebookCallback<LoginResult> facebookCallback) {
        this(xxVar, facebookCallback, false, 4, null);
        xxVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBLoginSSOLauncher(xx xxVar) {
        this(xxVar, null, false, 6, null);
        xxVar.getClass();
    }

    public /* synthetic */ FBLoginSSOLauncher(xx xxVar, FacebookCallback facebookCallback, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xxVar, (i & 2) != 0 ? null : facebookCallback, (i & 4) != 0 ? true : z);
    }

    public final boolean launch() {
        return launch$default(this, null, 1, null);
    }
}
