package com.cmplay.kinfoc.report.a;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SharePreferenceHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static Context f4411a;

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f4412b;

    public static void a(Context context) {
        f4411a = context.getApplicationContext();
        a();
    }

    private static SharedPreferences a() {
        if (f4411a == null) {
            return null;
        }
        if (f4412b == null) {
            f4412b = f4411a.getSharedPreferences("cloudconfig", 0);
        }
        return f4412b;
    }

    public static String a(String str, String str2) {
        SharedPreferences a2 = a();
        return a2 == null ? str2 : a2.getString(str, str2);
    }
}
