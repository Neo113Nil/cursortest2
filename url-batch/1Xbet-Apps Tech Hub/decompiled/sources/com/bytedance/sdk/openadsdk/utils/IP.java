package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: InitChecker.java */
/* loaded from: classes2.dex */
public class IP {
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pvs() {
        Context pvs = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        if (pvs != null && com.bytedance.sdk.component.utils.Ju.Jd()) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "The pangolin sdk access, the environment is debug, the initial configuration detection starts");
            String packageName = pvs.getPackageName();
            int i = pvs.getApplicationInfo().targetSdkVersion;
            boolean z = true;
            try {
                String[] strArr = pvs.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr != null && strArr.length > 0) {
                    List<String> icD = icD();
                    for (String str : strArr) {
                        if (str != null) {
                            icD.remove(str);
                        }
                    }
                    if (icD.isEmpty()) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "AndroidManifest.xml permissions configuration is normal");
                    } else {
                        Iterator<String> it = icD.iterator();
                        while (it.hasNext()) {
                            try {
                                com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "    May be missing permissions：" + it.next() + "，Please refer to the access documentation");
                                z = false;
                            } catch (Throwable th) {
                                th = th;
                                z = false;
                                com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation", th);
                                if (i < 23) {
                                }
                                if (!z) {
                                }
                                com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "End of pangolin sdk initial configuration test");
                            }
                        }
                    }
                } else {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation");
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (i < 23) {
                try {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "No adaptation required for dynamic permissions：target=" + i + "&phone=" + Build.VERSION.SDK_INT + ", require=23");
                } catch (Throwable th3) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "The dynamic permission is abnormal. Please check and read the access document in detail： ", th3);
                }
            }
            if (!z) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion");
            }
            com.bytedance.sdk.component.utils.Ju.pvs("TTAdSdk-InitChecker", "End of pangolin sdk initial configuration test");
        }
    }

    private static List<String> icD() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
