package com.baidu.sec.privacy.e;

import android.content.Context;
import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c f10658a;

    /* renamed from: b, reason: collision with root package name */
    public static Context f10659b;

    public c(Context context) {
        f10659b = context;
    }

    public static c a(Context context) {
        if (f10658a == null) {
            synchronized (c.class) {
                f10658a = new c(context);
            }
        }
        return f10658a;
    }

    public PackageInfo a(String str, int i8) {
        try {
            if (com.baidu.sec.privacy.d.a.b(19)) {
                return f10659b.getPackageManager().getPackageInfo(str, i8);
            }
            return null;
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return null;
        }
    }
}
