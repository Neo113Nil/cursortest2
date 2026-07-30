package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1jSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFf1cSDK extends AFf1oSDK {
    public AFf1cSDK(Runnable runnable) {
        super("store", "xiaomi", runnable);
    }

    private static boolean values() {
        if (!AFf1oSDK.AFKeystoreWrapper()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.afDebugLog("Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(final Context context) {
        if (values()) {
            this.AFLogger = System.currentTimeMillis();
            this.afRDLog = AFf1jSDK.AFa1vSDK.STARTED;
            addObserver(new AFf1jSDK.AnonymousClass5());
            final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
            build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFf1cSDK.4
                public final void onGetAppsReferrerSetupFinished(int i) {
                    AFf1cSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, "com.xiaomi.mipicks")));
                    AFf1cSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, "com.xiaomi.mipicks"));
                    if (i == -1) {
                        AFLogger.afWarnLog("XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFf1cSDK.this.AFKeystoreWrapper.put("response", "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
                        AFf1cSDK aFf1cSDK = AFf1cSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFf1cSDK.AFKeystoreWrapper.put("response", "OK");
                        try {
                            AFLogger.afDebugLog("XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFf1cSDK.AFKeystoreWrapper.put("referrer", installReferrer2);
                                }
                                aFf1cSDK.AFKeystoreWrapper.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFf1cSDK.AFKeystoreWrapper.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFf1cSDK.AFKeystoreWrapper.put("xiaomi_custom", hashMap);
                            } else {
                                AFLogger.afWarnLog("XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb.append(th.getMessage());
                            AFLogger.afWarnLog(sb.toString());
                        }
                    } else if (i == 1) {
                        AFf1cSDK.this.AFKeystoreWrapper.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.afWarnLog("XiaomiInstallReferrer not supported");
                    } else if (i == 2) {
                        AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFf1cSDK.this.AFKeystoreWrapper.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i == 3) {
                        AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFf1cSDK.this.AFKeystoreWrapper.put("response", "DEVELOPER_ERROR");
                    } else if (i != 4) {
                        AFLogger.afWarnLog("responseCode not found.");
                    } else {
                        AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFf1cSDK.this.AFKeystoreWrapper.put("response", "PERMISSION_ERROR");
                    }
                    AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
                    AFf1cSDK.this.AFInAppEventType();
                    build.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
