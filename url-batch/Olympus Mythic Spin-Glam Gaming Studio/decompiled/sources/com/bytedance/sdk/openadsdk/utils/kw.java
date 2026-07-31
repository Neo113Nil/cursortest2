package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class kw {
    public static void zmn() {
        Context zmn = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        if (zmn != null && com.bytedance.sdk.component.utils.cn.zn()) {
            String packageName = zmn.getPackageName();
            int i = zmn.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = zmn.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> fs = fs();
                for (String str : strArr) {
                    if (str != null) {
                        fs.remove(str);
                    }
                }
                if (fs.isEmpty()) {
                    return;
                }
                for (String str2 : fs) {
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static List<String> fs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
