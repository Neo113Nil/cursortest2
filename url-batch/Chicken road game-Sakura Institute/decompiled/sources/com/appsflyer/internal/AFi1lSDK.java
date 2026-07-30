package com.appsflyer.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.AFi1lSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class AFi1lSDK extends AFi1rSDK {
    private final ExecutorService AFInAppEventType;
    public final Map<String, Object> valueOf;

    public AFi1lSDK(Runnable runnable, ExecutorService executorService, AFd1sSDK aFd1sSDK) {
        super("store", "google", aFd1sSDK, runnable);
        this.valueOf = new HashMap();
        this.AFInAppEventType = executorService;
    }

    private boolean valueOf(Context context) {
        if (!valueOf()) {
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFb1uSDK.AFInAppEventParameterName(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.INSTANCE.v(AFg1aSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1aSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(Context context) {
        if (valueOf(context)) {
            this.e = System.currentTimeMillis();
            this.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
            addObserver(new AFi1hSDK.AnonymousClass1());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass2(build, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1aSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFi1lSDK$2, reason: invalid class name */
    final class AnonymousClass2 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        AnonymousClass2(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* renamed from: lambda$onInstallReferrerSetupFinished$0$com-appsflyer-internal-AFi1lSDK$2, reason: not valid java name */
        /* synthetic */ void m6644x151a52a7(InstallReferrerClient installReferrerClient, Context context, int i) {
            AFi1lSDK.this.valueOf(installReferrerClient, context, i);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1lSDK.this.AFInAppEventType;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.AFi1lSDK$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1lSDK.AnonymousClass2.this.m6644x151a52a7(installReferrerClient, context, i);
                }
            });
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Install Referrer service disconnected");
        }
    }

    protected final void valueOf(InstallReferrerClient installReferrerClient, Context context, int i) {
        this.valueOf.put("code", String.valueOf(i));
        this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, "com.android.vending")));
        this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, "com.android.vending"));
        if (i == -1) {
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.AFInAppEventParameterName.put("response", "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            this.AFInAppEventParameterName.put("response", "OK");
            try {
                AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.valueOf.put("val", installReferrer2);
                        this.AFInAppEventParameterName.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.valueOf.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.AFInAppEventParameterName.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.valueOf.put("install", Long.toString(installBeginTimestampSeconds));
                    this.AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.valueOf.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger.INSTANCE.e(AFg1aSDK.REFERRER, "some method not exist", e2, false, false);
                    }
                    if (!hashMap.isEmpty()) {
                        this.AFInAppEventParameterName.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "ReferrerClient: InstallReferrer is not ready");
                    this.valueOf.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, new StringBuilder("Failed to get install referrer: ").append(th.getMessage()).toString());
                this.valueOf.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
                AFLogger.INSTANCE.e(AFg1aSDK.REFERRER, "Failed to get install referrer", th, false, false);
            }
        } else if (i == 1) {
            this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i == 3) {
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.AFInAppEventParameterName.put("response", "DEVELOPER_ERROR");
        } else {
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "responseCode not found.");
        }
        AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Install Referrer collected locally");
        values();
    }
}
