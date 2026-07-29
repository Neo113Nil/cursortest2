package com.cmplay.internalpush;

import android.app.Activity;

/* compiled from: CMPPromotion.java */
/* loaded from: classes.dex */
public class b {
    public static boolean a(String str, String str2) {
        new com.cmplay.a.d().a(1, 1, 0, 1, 99);
        new com.cmplay.a.d().a(2, 1, 0, 1, 99);
        return g.a(str, str2);
    }

    public static boolean a(int i, boolean z) {
        return com.cmplay.internalpush.video.g.a(i, z);
    }

    public static boolean a(Activity activity, int i, int i2, int i3, int i4, int i5) {
        com.cmplay.base.util.h.a("internal_push", "CMPPromotion showSettingSmallVideo");
        return com.cmplay.internalpush.video.g.a(activity, i, i2, i3, i4, i5);
    }

    public static void a(Activity activity) {
        s.a().a(true);
        s.a().a(activity);
    }

    public static boolean b(int i, boolean z) {
        return com.cmplay.internalpush.video.f.a(i, z);
    }

    public static boolean b(Activity activity, int i, int i2, int i3, int i4, int i5) {
        com.cmplay.base.util.h.a("internal_push", "CMPPromotion showResultSmallVideo");
        return com.cmplay.internalpush.video.f.a(activity, i, i2, i3, i4, i5);
    }

    public static void b(Activity activity) {
        s.a().a(true);
        s.a().a(activity);
    }

    public static boolean c(int i, boolean z) {
        return com.cmplay.internalpush.video.e.a(i, z);
    }

    public static boolean a(int i) {
        return com.cmplay.internalpush.video.e.a(i);
    }

    public static boolean d(int i, boolean z) {
        return com.cmplay.internalpush.video.e.b(i, z);
    }

    public static void b(String str, String str2) {
        if (str.contains(com.cmplay.base.util.j.a())) {
            f.a(str, str2, true);
        } else {
            f.a(str, str2);
        }
    }
}
