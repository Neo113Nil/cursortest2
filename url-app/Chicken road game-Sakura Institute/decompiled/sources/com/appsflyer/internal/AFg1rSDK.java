package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFg1rSDK {
    private final String AFInAppEventParameterName;
    private final Map<String, Object> AFInAppEventType;
    private final PackageManager AFKeystoreWrapper;

    public AFg1rSDK(AFd1lSDK aFd1lSDK, AFd1sSDK aFd1sSDK) {
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        this.AFInAppEventType = new LinkedHashMap();
        Context context = aFd1lSDK.AFKeystoreWrapper;
        this.AFKeystoreWrapper = context != null ? context.getPackageManager() : null;
        String packageName = aFd1sSDK.valueOf.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFInAppEventParameterName = packageName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r2 = r3.getInstallSourceInfo(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> values() {
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        String installingPackageName;
        String originatingPackageName;
        String installerPackageName;
        if (this.AFInAppEventType.isEmpty()) {
            try {
                PackageManager packageManager = this.AFKeystoreWrapper;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFInAppEventParameterName)) != null) {
                    this.AFInAppEventType.put("installer_package", installerPackageName);
                }
            } catch (Exception e4) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e4);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.AFInAppEventType;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.AFInAppEventParameterName;
                PackageManager packageManager2 = this.AFKeystoreWrapper;
                if (packageManager2 != null && installSourceInfo != null) {
                    Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                    linkedHashMap = new LinkedHashMap();
                    initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (initiatingPackageName != null) {
                        linkedHashMap.put("initiating_package", initiatingPackageName);
                    }
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null) {
                        linkedHashMap.put("installing_package", installingPackageName);
                    }
                    originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    if (originatingPackageName != null) {
                        linkedHashMap.put("originating_package", originatingPackageName);
                    }
                }
                map.put("install_source_info", linkedHashMap);
            }
        }
        return this.AFInAppEventType;
    }
}
