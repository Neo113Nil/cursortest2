package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import defpackage.at3;
import defpackage.by1;
import defpackage.dm0;
import defpackage.ds3;
import defpackage.ic2;
import defpackage.jt2;
import defpackage.mi2;
import defpackage.of3;
import defpackage.th;
import defpackage.vs3;
import defpackage.yq;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
class GmsRpc {
    static final String CMD_RST = "RST";
    static final String CMD_RST_FULL = "RST_FULL";
    static final String CMD_SYNC = "SYNC";
    static final String ERROR_INSTANCE_ID_RESET = "INSTANCE_ID_RESET";
    static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final String ERROR_INTERNAL_SERVER_ERROR_ALT = "InternalServerError";
    static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final String EXTRA_DELETE = "delete";
    private static final String EXTRA_ERROR = "error";
    private static final String EXTRA_IID_OPERATION = "iid-operation";
    private static final String EXTRA_REGISTRATION_ID = "registration_id";
    private static final String EXTRA_SCOPE = "scope";
    private static final String EXTRA_SENDER = "sender";
    private static final String EXTRA_SUBTYPE = "subtype";
    private static final String EXTRA_TOPIC = "gcm.topic";
    private static final String EXTRA_UNREGISTERED = "unregistered";
    static final String FIREBASE_IID_HEARTBEAT_TAG = "fire-iid";
    private static final String PARAM_APP_VER_CODE = "app_ver";
    private static final String PARAM_APP_VER_NAME = "app_ver_name";
    private static final String PARAM_CLIENT_VER = "cliv";
    private static final String PARAM_FIREBASE_APP_NAME_HASH = "firebase-app-name-hash";
    private static final String PARAM_FIS_AUTH_TOKEN = "Goog-Firebase-Installations-Auth";
    private static final String PARAM_GMP_APP_ID = "gmp_app_id";
    private static final String PARAM_GMS_VER = "gmsv";
    private static final String PARAM_HEARTBEAT_CODE = "Firebase-Client-Log-Type";
    private static final String PARAM_INSTANCE_ID = "appid";
    private static final String PARAM_OS_VER = "osv";
    private static final String PARAM_USER_AGENT = "Firebase-Client";
    private static final String SCOPE_ALL = "*";
    static final String TAG = "FirebaseMessaging";
    static final String TOO_MANY_SUBSCRIBERS = "TOO_MANY_SUBSCRIBERS";
    private static final String TOPIC_PREFIX = "/topics/";
    private final FirebaseApp app;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Provider<HeartBeatInfo> heartbeatInfo;
    private final Metadata metadata;
    private final ic2 rpc;
    private final Provider<UserAgentPublisher> userAgentPublisher;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new ic2(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    private static String base64UrlSafe(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private jt2 extractResponseWhenComplete(jt2 jt2Var) {
        return jt2Var.f(new th(1), new c(1, this));
    }

    private String getHashedFirebaseAppName() {
        try {
            return base64UrlSafe(MessageDigest.getInstance("SHA-1").digest(this.app.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String handleResponse(Bundle bundle) {
        if (bundle == null) {
            dm0.j(ERROR_SERVICE_NOT_AVAILABLE);
            return null;
        }
        String string = bundle.getString(EXTRA_REGISTRATION_ID);
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString(EXTRA_UNREGISTERED);
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if (CMD_RST.equals(string3)) {
            dm0.j(ERROR_INSTANCE_ID_RESET);
            return null;
        }
        if (string3 != null) {
            dm0.j(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        dm0.j(ERROR_SERVICE_NOT_AVAILABLE);
        return null;
    }

    public static boolean isErrorMessageForRetryableError(String str) {
        return ERROR_SERVICE_NOT_AVAILABLE.equals(str) || ERROR_INTERNAL_SERVER_ERROR.equals(str) || ERROR_INTERNAL_SERVER_ERROR_ALT.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$extractResponseWhenComplete$0(jt2 jt2Var) {
        return handleResponse((Bundle) jt2Var.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setDefaultAttributesToBundle(String str, String str2, Bundle bundle) {
        HeartBeatInfo heartBeatInfo;
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString("scope", str2);
        bundle.putString(EXTRA_SENDER, str);
        bundle.putString(EXTRA_SUBTYPE, str);
        bundle.putString(PARAM_GMP_APP_ID, this.app.getOptions().getApplicationId());
        bundle.putString(PARAM_GMS_VER, Integer.toString(this.metadata.getGmsVersionCode()));
        bundle.putString(PARAM_OS_VER, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(PARAM_APP_VER_CODE, this.metadata.getAppVersionCode());
        bundle.putString(PARAM_APP_VER_NAME, this.metadata.getAppVersionName());
        bundle.putString(PARAM_FIREBASE_APP_NAME_HASH, getHashedFirebaseAppName());
        try {
            String token = ((InstallationTokenResult) mi2.d(this.firebaseInstallations.getToken(false))).getToken();
            if (TextUtils.isEmpty(token)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString(PARAM_FIS_AUTH_TOKEN, token);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) mi2.d(this.firebaseInstallations.getId()));
            bundle.putString(PARAM_CLIENT_VER, "fcm-25.0.1");
            heartBeatInfo = this.heartbeatInfo.get();
            UserAgentPublisher userAgentPublisher = this.userAgentPublisher.get();
            if (heartBeatInfo == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) mi2.d(this.firebaseInstallations.getId()));
            bundle.putString(PARAM_CLIENT_VER, "fcm-25.0.1");
            heartBeatInfo = this.heartbeatInfo.get();
            UserAgentPublisher userAgentPublisher2 = this.userAgentPublisher.get();
            if (heartBeatInfo == null) {
            }
        }
        bundle.putString("appid", (String) mi2.d(this.firebaseInstallations.getId()));
        bundle.putString(PARAM_CLIENT_VER, "fcm-25.0.1");
        heartBeatInfo = this.heartbeatInfo.get();
        UserAgentPublisher userAgentPublisher22 = this.userAgentPublisher.get();
        if (heartBeatInfo == null || userAgentPublisher22 == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode(FIREBASE_IID_HEARTBEAT_TAG)) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString(PARAM_HEARTBEAT_CODE, Integer.toString(heartBeatCode.getCode()));
        bundle.putString(PARAM_USER_AGENT, userAgentPublisher22.getUserAgent());
    }

    private jt2 startRpc(String str, String str2, Bundle bundle) {
        int i;
        try {
            setDefaultAttributesToBundle(str, str2, bundle);
            ic2 ic2Var = this.rpc;
            of3 of3Var = of3.o;
            yq yqVar = ic2Var.c;
            if (yqVar.u() < 12000000) {
                return yqVar.v() != 0 ? ic2Var.a(bundle).g(of3Var, new at3(ic2Var, bundle)) : mi2.i(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            vs3 j = vs3.j(ic2Var.b);
            synchronized (j) {
                i = j.a;
                j.a = i + 1;
            }
            return j.k(new ds3(i, 1, bundle, 1)).f(of3Var, by1.I);
        } catch (InterruptedException | ExecutionException e) {
            return mi2.i(e);
        }
    }

    public jt2 deleteToken() {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_DELETE, AppEventsConstants.EVENT_PARAM_VALUE_YES);
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), SCOPE_ALL, bundle));
    }

    public jt2 getProxyNotificationData() {
        int i;
        ic2 ic2Var = this.rpc;
        if (ic2Var.c.u() < 241100000) {
            return mi2.i(new IOException(ERROR_SERVICE_NOT_AVAILABLE));
        }
        vs3 j = vs3.j(ic2Var.b);
        Bundle bundle = Bundle.EMPTY;
        synchronized (j) {
            i = j.a;
            j.a = i + 1;
        }
        return j.k(new ds3(i, 5, bundle, 1)).f(of3.o, by1.J);
    }

    public jt2 getToken() {
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), SCOPE_ALL, new Bundle()));
    }

    public jt2 setRetainProxiedNotifications(boolean z) {
        int i;
        ic2 ic2Var = this.rpc;
        if (ic2Var.c.u() < 241100000) {
            return mi2.i(new IOException(ERROR_SERVICE_NOT_AVAILABLE));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        vs3 j = vs3.j(ic2Var.b);
        synchronized (j) {
            i = j.a;
            j.a = i + 1;
        }
        return j.k(new ds3(i, 4, bundle, 0));
    }

    public jt2 subscribeToTopic(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_TOPIC, TOPIC_PREFIX + str2);
        return extractResponseWhenComplete(startRpc(str, TOPIC_PREFIX + str2, bundle));
    }

    public jt2 unsubscribeFromTopic(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_TOPIC, TOPIC_PREFIX + str2);
        bundle.putString(EXTRA_DELETE, AppEventsConstants.EVENT_PARAM_VALUE_YES);
        return extractResponseWhenComplete(startRpc(str, TOPIC_PREFIX + str2, bundle));
    }

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, ic2 ic2Var, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = ic2Var;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }
}
