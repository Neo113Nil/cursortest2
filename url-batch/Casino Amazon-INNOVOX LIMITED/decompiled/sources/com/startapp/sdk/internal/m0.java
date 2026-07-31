package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.provider.Settings;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.list3d.List3DView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f327a = 0;

    static {
        "startapp.".concat("m0");
    }

    public static void a(List3DView list3DView) {
        list3DView.animate().alpha(1.0f).setDuration(1500L).setListener(null);
    }

    public static boolean b(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) != 0;
    }

    public static boolean c(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "auto_time", 0) > 0;
    }

    public static void a(WebView webView) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
    }

    public static int a(Activity activity, int i, boolean z) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = (z || rotation == 0 || rotation == 1) ? 0 : 8;
            }
        } else if (!z && (rotation == 1 || rotation == 2)) {
            i2 = 9;
        }
        try {
            activity.setRequestedOrientation(i2);
        } catch (Throwable unused) {
        }
        return i2;
    }

    public static Long a(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    public static boolean a(BannerBase bannerBase, boolean z) {
        if (1 != bannerBase.getLayerType() && z) {
            return bannerBase.isHardwareAccelerated();
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean a(int i, Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 128).versionCode >= i;
    }
}
