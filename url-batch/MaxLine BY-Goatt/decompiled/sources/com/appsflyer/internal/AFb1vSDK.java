package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1vSDK {
    private final Map<String, Object> AFInAppEventParameterName;
    private final String AFInAppEventType;
    private final PackageManager valueOf;

    public AFb1vSDK(AFb1bSDK aFb1bSDK, AFb1cSDK aFb1cSDK) {
        aFb1bSDK.getClass();
        aFb1cSDK.getClass();
        this.AFInAppEventParameterName = new LinkedHashMap();
        Context context = aFb1bSDK.AFInAppEventParameterName;
        this.valueOf = context != null ? context.getPackageManager() : null;
        String packageName = aFb1cSDK.values.AFInAppEventParameterName.getPackageName();
        packageName.getClass();
        this.AFInAppEventType = packageName;
    }

    public static boolean AFInAppEventParameterName(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean valueOf(String str) {
        return str == null || str.trim().length() == 0;
    }

    public final Map<String, Object> AFInAppEventType() {
        InstallSourceInfo installSourceInfo;
        String installerPackageName;
        if (this.AFInAppEventParameterName.isEmpty()) {
            try {
                PackageManager packageManager = this.valueOf;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFInAppEventType)) != null) {
                    this.AFInAppEventParameterName.put("installer_package", installerPackageName);
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.AFInAppEventParameterName;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.AFInAppEventType;
                PackageManager packageManager2 = this.valueOf;
                if (packageManager2 != null && (installSourceInfo = packageManager2.getInstallSourceInfo(str)) != null) {
                    linkedHashMap = new LinkedHashMap();
                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (initiatingPackageName != null) {
                        linkedHashMap.put("initiating_package", initiatingPackageName);
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null) {
                        linkedHashMap.put("installing_package", installingPackageName);
                    }
                    String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    if (originatingPackageName != null) {
                        linkedHashMap.put("originating_package", originatingPackageName);
                    }
                }
                map.put("install_source_info", linkedHashMap);
            }
        }
        return this.AFInAppEventParameterName;
    }

    public AFb1vSDK() {
    }
}
