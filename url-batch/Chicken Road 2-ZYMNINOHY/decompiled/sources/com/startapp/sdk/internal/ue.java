package com.startapp.sdk.internal;

import android.content.pm.PackageManager;
import java.io.File;

/* loaded from: classes.dex */
public abstract class ue {
    public static boolean a(String str) {
        String[] strArr = ve.f7755c;
        boolean z = false;
        for (int i4 = 0; i4 < 14; i4++) {
            if (new File(strArr[i4], str).exists()) {
                z = true;
            }
        }
        return z;
    }

    public static boolean a(PackageManager packageManager, String[] strArr) {
        boolean z = false;
        for (String str : strArr) {
            try {
                packageManager.getPackageInfo(str, 0);
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }
}
