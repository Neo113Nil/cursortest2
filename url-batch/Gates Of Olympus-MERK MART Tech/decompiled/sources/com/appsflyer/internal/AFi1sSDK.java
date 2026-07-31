package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1pSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class AFi1sSDK extends AFi1zSDK {
    public AFi1sSDK(AFd1pSDK aFd1pSDK, Runnable runnable) {
        super("store", "xiaomi", aFd1pSDK, runnable);
    }

    private boolean valueOf() {
        if (!AFInAppEventParameterName()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFg1jSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFg1jSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1jSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final void AFInAppEventType(final Context context) {
        if (valueOf()) {
            this.AFLogger = System.currentTimeMillis();
            this.registerClient = AFi1pSDK.AFa1tSDK.STARTED;
            addObserver(new AFi1pSDK.AnonymousClass2());
            final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
            build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFi1sSDK.5
                public final void onGetAppsServiceDisconnected() {
                }

                public final void onGetAppsReferrerSetupFinished(int i) {
                    AFi1sSDK.this.values.put("api_ver", Long.valueOf(AFb1rSDK.AFKeystoreWrapper(context, "com.xiaomi.mipicks")));
                    AFi1sSDK.this.values.put("api_ver_name", AFb1rSDK.AFInAppEventType(context, "com.xiaomi.mipicks"));
                    if (i == -1) {
                        AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFi1sSDK.this.values.put("response", "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
                        AFi1sSDK aFi1sSDK = AFi1sSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFi1sSDK.values.put("response", "OK");
                        try {
                            AFLogger.INSTANCE.d(AFg1jSDK.REFERRER, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFi1sSDK.values.put("referrer", installReferrer2);
                                }
                                aFi1sSDK.values.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFi1sSDK.values.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFi1sSDK.values.put("xiaomi_custom", hashMap);
                            } else {
                                AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, new StringBuilder("Failed to get Xiaomi install referrer: ").append(th.getMessage()).toString());
                        }
                    } else if (i == 1) {
                        AFi1sSDK.this.values.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i == 2) {
                        AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFi1sSDK.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i == 3) {
                        AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFi1sSDK.this.values.put("response", "DEVELOPER_ERROR");
                    } else if (i == 4) {
                        AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFi1sSDK.this.values.put("response", "PERMISSION_ERROR");
                    } else {
                        AFLogger.INSTANCE.w(AFg1jSDK.REFERRER, "responseCode not found.");
                    }
                    AFLogger.INSTANCE.d(AFg1jSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFi1sSDK.this.AFKeystoreWrapper();
                    build.endConnection();
                }
            });
        }
    }
}
