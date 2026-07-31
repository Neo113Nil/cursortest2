package com.startapp.sdk.internal;

import android.content.pm.PackageManager;
import java.io.File;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class de {
    public static boolean a(String str) {
        String[] strArr = ee.c;
        boolean z = false;
        for (int i = 0; i < 14; i++) {
            if (new File(strArr[i], str).exists()) {
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
