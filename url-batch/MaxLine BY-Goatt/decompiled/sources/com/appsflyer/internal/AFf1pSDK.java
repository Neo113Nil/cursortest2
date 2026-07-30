package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1jSDK;
import com.appsflyer.internal.AFf1pSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AFf1pSDK extends AFf1oSDK {
    private final ExecutorService valueOf;
    public final Map<String, Object> values;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFf1pSDK$1, reason: invalid class name */
    public class AnonymousClass1 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass1(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i) {
            AFf1pSDK.AFKeystoreWrapper(AFf1pSDK.this, installReferrerClient, context, i);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.afDebugLog("Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFf1pSDK.this.valueOf;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.h
                @Override // java.lang.Runnable
                public final void run() {
                    AFf1pSDK.AnonymousClass1.this.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i);
                }
            });
        }
    }

    public AFf1pSDK(Runnable runnable, ExecutorService executorService) {
        super("store", "google", runnable);
        this.values = new HashMap();
        this.valueOf = executorService;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (!AFf1oSDK.AFKeystoreWrapper()) {
            return false;
        }
        try {
            if (AFa1cSDK.AFInAppEventType(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    public static /* synthetic */ void AFKeystoreWrapper(AFf1pSDK aFf1pSDK, InstallReferrerClient installReferrerClient, Context context, int i) {
        aFf1pSDK.values.put("code", String.valueOf(i));
        aFf1pSDK.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, "com.android.vending")));
        aFf1pSDK.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, "com.android.vending"));
        if (i == -1) {
            AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
            aFf1pSDK.AFKeystoreWrapper.put("response", "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            aFf1pSDK.AFKeystoreWrapper.put("response", "OK");
            try {
                AFLogger.afDebugLog("InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        aFf1pSDK.values.put("val", installReferrer2);
                        aFf1pSDK.AFKeystoreWrapper.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    aFf1pSDK.values.put("clk", Long.toString(referrerClickTimestampSeconds));
                    aFf1pSDK.AFKeystoreWrapper.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    aFf1pSDK.values.put("install", Long.toString(installBeginTimestampSeconds));
                    aFf1pSDK.AFKeystoreWrapper.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        aFf1pSDK.values.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger.afErrorLogForExcManagerOnly("some method not exist", e2);
                    }
                    if (!hashMap.isEmpty()) {
                        aFf1pSDK.AFKeystoreWrapper.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                    aFf1pSDK.values.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                AFLogger.afWarnLog(sb.toString());
                aFf1pSDK.values.put("err", th.getMessage());
                AFLogger.afErrorLogForExcManagerOnly("Failed to get install referrer", th);
            }
        } else if (i == 1) {
            aFf1pSDK.AFKeystoreWrapper.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.afWarnLog("InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
            aFf1pSDK.AFKeystoreWrapper.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i != 3) {
            AFLogger.afWarnLog("responseCode not found.");
        } else {
            AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
            aFf1pSDK.AFKeystoreWrapper.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.afDebugLog("Install Referrer collected locally");
        aFf1pSDK.AFInAppEventType();
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(Context context) {
        if (AFInAppEventParameterName(context)) {
            this.AFLogger = System.currentTimeMillis();
            this.afRDLog = AFf1jSDK.AFa1vSDK.STARTED;
            addObserver(new AFf1jSDK.AnonymousClass5());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass1(build, context));
            } catch (Throwable th) {
                AFLogger.afErrorLog("referrerClient -> startConnection", th);
            }
        }
    }
}
