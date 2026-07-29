package com.cmplay.internalpush;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;

/* compiled from: CMPPromotionUtils.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f4182a;

    public static boolean a(int i, boolean z) {
        return b.a(i, z);
    }

    public static boolean a(Activity activity, int i, int i2, int i3, int i4, int i5) {
        com.cmplay.base.util.h.a("internal_push", "CMPPromotion showSettingSmallVideo");
        return b.a(activity, i, i2, i3, i4, i5);
    }

    public static void a(Activity activity) {
        b.a(activity);
    }

    public static boolean b(int i, boolean z) {
        return b.b(i, z);
    }

    public static boolean b(Activity activity, int i, int i2, int i3, int i4, int i5) {
        com.cmplay.base.util.h.a("internal_push", "CMPPromotion showResultSmallVideo");
        return b.b(activity, i, i2, i3, i4, i5);
    }

    public static void b(Activity activity) {
        b.b(activity);
    }

    public static void a(boolean z) {
        com.cmplay.base.util.h.a("internal_push", "onVideoClosed    UnityPlayer.UnitySendMessage");
        try {
            if (f4182a) {
                UnityPlayer.UnitySendMessage(com.cmplay.base.util.j.b(), "onVideoClosed", String.valueOf(z));
            }
        } catch (Throwable unused) {
        }
    }

    public static void a() {
        com.cmplay.base.util.h.a("internal_push", "onSettingsPushUpdate    UnityPlayer.UnitySendMessage");
        try {
            if (f4182a) {
                UnityPlayer.UnitySendMessage(com.cmplay.base.util.j.b(), "onSettingsPushUpdate", "");
            }
        } catch (Throwable unused) {
        }
    }

    public static void b() {
        com.cmplay.base.util.h.a("internal_push", "onFamilyGamesPushUpdate    UnityPlayer.UnitySendMessage");
        try {
            if (f4182a) {
                UnityPlayer.UnitySendMessage(com.cmplay.base.util.j.b(), "onFamilyGamesPushUpdate", "");
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean c() {
        return f4182a;
    }

    public static void a(String str, String str2, String str3) {
        try {
            if (f4182a) {
                UnityPlayer.UnitySendMessage(str, str2, str3);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2) {
        a(com.cmplay.base.util.j.b(), str, str2);
    }

    public static void a(int i) {
        a("networkStatusChange", String.valueOf(i));
    }
}
