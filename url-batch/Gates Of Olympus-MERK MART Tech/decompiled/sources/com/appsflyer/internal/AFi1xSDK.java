package com.appsflyer.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1pSDK;
import com.appsflyer.internal.AFi1xSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class AFi1xSDK extends AFi1zSDK {
    public final Map<String, Object> AFKeystoreWrapper;
    private final ExecutorService valueOf;

    public AFi1xSDK(Runnable runnable, ExecutorService executorService, AFd1pSDK aFd1pSDK) {
        super("store", "google", aFd1pSDK, runnable);
        this.AFKeystoreWrapper = new HashMap();
        this.valueOf = executorService;
    }

    private boolean values(Context context) {
        if (!AFInAppEventParameterName()) {
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFb1rSDK.values(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1jSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1jSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.INSTANCE.v(AFg1jSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1jSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat(String.valueOf("com.android.installreferrer.api.InstallReferrerClient")), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final void AFInAppEventType(Context context) {
        if (values(context)) {
            this.AFLogger = System.currentTimeMillis();
            this.registerClient = AFi1pSDK.AFa1tSDK.STARTED;
            addObserver(new AFi1pSDK.AnonymousClass2());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFg1jSDK.REFERRER, "Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass2(build, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1jSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFi1xSDK$2, reason: invalid class name */
    final class AnonymousClass2 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        AnonymousClass2(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* renamed from: lambda$onInstallReferrerSetupFinished$0$com-appsflyer-internal-AFi1xSDK$2, reason: not valid java name */
        /* synthetic */ void m9255x29947a1b(InstallReferrerClient installReferrerClient, Context context, int i) {
            AFi1xSDK.this.AFInAppEventType(installReferrerClient, context, i);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1xSDK.this.valueOf;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.AFi1xSDK$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1xSDK.AnonymousClass2.this.m9255x29947a1b(installReferrerClient, context, i);
                }
            });
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1jSDK.REFERRER, "Install Referrer service disconnected");
        }
    }

    protected final void AFInAppEventType(InstallReferrerClient installReferrerClient, Context context, int i) {
        this.AFKeystoreWrapper.put("code", String.valueOf(i));
        this.values.put("api_ver", Long.valueOf(AFb1rSDK.AFKeystoreWrapper(context, "com.android.vending")));
        this.values.put("api_ver_name", AFb1rSDK.AFInAppEventType(context, "com.android.vending"));
        if (i == -1) {
            AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.values.put("response", "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            this.values.put("response", "OK");
            try {
                AFLogger.INSTANCE.d(AFg1jSDK.REFERRER, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.AFKeystoreWrapper.put("val", installReferrer2);
                        this.values.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.AFKeystoreWrapper.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.values.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.AFKeystoreWrapper.put("install", Long.toString(installBeginTimestampSeconds));
                    this.values.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.AFKeystoreWrapper.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger.INSTANCE.e(AFg1jSDK.REFERRER, "some method not exist", e2, false, false);
                    }
                    if (!hashMap.isEmpty()) {
                        this.values.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "ReferrerClient: InstallReferrer is not ready");
                    this.AFKeystoreWrapper.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, new StringBuilder("Failed to get install referrer: ").append(th.getMessage()).toString());
                this.AFKeystoreWrapper.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
                AFLogger.INSTANCE.e(AFg1jSDK.REFERRER, "Failed to get install referrer", th, false, false);
            }
        } else if (i == 1) {
            this.values.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.values.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i == 3) {
            AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.values.put("response", "DEVELOPER_ERROR");
        } else {
            AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "responseCode not found.");
        }
        AFLogger.INSTANCE.d(AFg1jSDK.REFERRER, "Install Referrer collected locally");
        AFKeystoreWrapper();
    }
}
