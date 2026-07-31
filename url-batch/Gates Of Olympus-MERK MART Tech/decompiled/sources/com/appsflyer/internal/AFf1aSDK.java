package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFf1aSDK {
    private final Map<String, Object> AFInAppEventParameterName;
    private final PackageManager valueOf;
    private final String values;

    public AFf1aSDK(AFd1nSDK aFd1nSDK, AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.AFInAppEventParameterName = new LinkedHashMap();
        Context context = aFd1nSDK.AFKeystoreWrapper;
        this.valueOf = context != null ? context.getPackageManager() : null;
        String packageName = aFd1pSDK.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.values = packageName;
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        InstallSourceInfo installSourceInfo;
        String installerPackageName;
        if (this.AFInAppEventParameterName.isEmpty()) {
            try {
                PackageManager packageManager = this.valueOf;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.values)) != null) {
                    this.AFInAppEventParameterName.put("installer_package", installerPackageName);
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.AFInAppEventParameterName;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.values;
                PackageManager packageManager2 = this.valueOf;
                if (packageManager2 != null && (installSourceInfo = packageManager2.getInstallSourceInfo(str)) != null) {
                    Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
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
}
