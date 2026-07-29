package com.dancingbogo.skyrolline.c;

import android.content.Context;
import android.text.TextUtils;
import com.dancingbogo.skyrolline.util.o;

/* compiled from: RuntimeCheck.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f4549a = ":service";

    /* renamed from: b, reason: collision with root package name */
    private static String f4550b = ":";

    /* renamed from: c, reason: collision with root package name */
    private static String f4551c = ":web";

    /* renamed from: d, reason: collision with root package name */
    private static String f4552d = ":inner";
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static String j;

    public static boolean a() {
        return e;
    }

    public static boolean b() {
        return f;
    }

    public static boolean c() {
        return g;
    }

    public static void d() {
        if (!a()) {
            throw new RuntimeException("Must run in Service Process");
        }
    }

    public static void e() {
        if (!c()) {
            throw new RuntimeException("Must run in Web Process");
        }
    }

    public static void a(Context context) {
        if (i) {
            return;
        }
        String a2 = o.a(context);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        j = a2;
        if (a2.contains(f4549a)) {
            e = true;
        } else if (!a2.contains(f4550b)) {
            f = true;
        } else if (a2.contains(f4551c)) {
            g = true;
        } else if (a2.contains(f4552d)) {
            h = true;
        }
        i = true;
    }
}
