package com.dancingbogo.skyrolline.b;

import android.content.Context;

/* compiled from: SharePreferenceHelper.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static Context f4547a;

    /* renamed from: b, reason: collision with root package name */
    private static a f4548b;

    public static String a() {
        return "com.dancingbogo.skyrolline.preference";
    }

    public static void a(Context context, a aVar) {
        f4547a = context.getApplicationContext();
        f4548b = aVar;
    }

    public static void a(String str, String str2) {
        f4548b.b(str, str2);
    }

    public static void a(String str, int i) {
        f4548b.b(str, i);
    }

    public static String a(String str) {
        return f4548b.a(str, (String) null);
    }

    public static String b(String str, String str2) {
        return f4548b.a(str, str2);
    }
}
