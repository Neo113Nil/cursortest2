package com.baidu.mshield.b.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public class c {
    public static PackageInfo a(Context context, String str, int i8) {
        try {
            com.baidu.mshield.b.c.a.a("---privacy getPackageInfo---" + System.currentTimeMillis());
            return com.baidu.sec.privacy.e.c.a(context).a(str, i8);
        } catch (PackageManager.NameNotFoundException e8) {
            com.baidu.mshield.b.c.a.a(e8);
            return null;
        }
    }
}
