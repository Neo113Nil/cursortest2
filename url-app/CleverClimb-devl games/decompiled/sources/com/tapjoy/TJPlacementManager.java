package com.tapjoy;

import android.content.Context;
import com.tapjoy.internal.az;
import com.tapjoy.internal.gw;
import com.tapjoy.internal.hf;
import com.tapjoy.internal.jr;

/* loaded from: classes2.dex */
public class TJPlacementManager {

    /* renamed from: a, reason: collision with root package name */
    private static final az f7720a = az.a();

    /* renamed from: b, reason: collision with root package name */
    private static int f7721b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f7722c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static int f7723d = 3;
    private static int e = 3;

    public static TJPlacement createPlacement(Context context, String str, boolean z, TJPlacementListener tJPlacementListener) {
        TJCorePlacement a2 = a(str, null, null, z, false);
        a2.j = z;
        a2.f7681c.setPlacementType(TapjoyConstants.TJC_SDK_PLACEMENT);
        a2.setContext(context);
        return new TJPlacement(a2, tJPlacementListener);
    }

    public static TJPlacement a(String str, String str2, String str3, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement;
        synchronized (f7720a) {
            tJPlacement = new TJPlacement(a(str, str2, str3, false, false), tJPlacementListener);
        }
        return tJPlacement;
    }

    public static TJPlacement b(String str, String str2, String str3, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement;
        synchronized (f7720a) {
            tJPlacement = new TJPlacement(a(str, str2, str3, false, true), tJPlacementListener);
        }
        return tJPlacement;
    }

    static TJCorePlacement a(String str) {
        TJCorePlacement tJCorePlacement;
        synchronized (f7720a) {
            tJCorePlacement = (TJCorePlacement) f7720a.get(str);
        }
        return tJCorePlacement;
    }

    public static void setCachedPlacementLimit(int i) {
        f7723d = i;
    }

    public static void setPreRenderedPlacementLimit(int i) {
        e = i;
    }

    public static int getCachedPlacementLimit() {
        return f7723d;
    }

    public static int getPreRenderedPlacementLimit() {
        return e;
    }

    public static int getCachedPlacementCount() {
        return f7721b;
    }

    public static int getPreRenderedPlacementCount() {
        return f7722c;
    }

    public static boolean canCachePlacement() {
        return getCachedPlacementCount() < getCachedPlacementLimit();
    }

    public static boolean canPreRenderPlacement() {
        return getPreRenderedPlacementCount() < getPreRenderedPlacementLimit();
    }

    public static void incrementPlacementCacheCount() {
        int i = f7721b + 1;
        f7721b = i;
        if (i > f7723d) {
            f7721b = f7723d;
        }
        printPlacementCacheInformation();
    }

    public static void decrementPlacementCacheCount() {
        int i = f7721b - 1;
        f7721b = i;
        if (i < 0) {
            f7721b = 0;
        }
        printPlacementCacheInformation();
    }

    public static void incrementPlacementPreRenderCount() {
        int i = f7722c + 1;
        f7722c = i;
        if (i > e) {
            f7722c = e;
        }
    }

    public static void decrementPlacementPreRenderCount() {
        int i = f7722c - 1;
        f7722c = i;
        if (i < 0) {
            f7722c = 0;
        }
    }

    public static void printPlacementCacheInformation() {
        TapjoyLog.i("TJPlacementManager", "Space available in placement cache: " + f7721b + " out of " + f7723d);
    }

    public static void printPlacementPreRenderInformation() {
        TapjoyLog.i("TJPlacementManager", "Space available for placement pre-render: " + f7722c + " out of " + e);
    }

    public static void dismissContentShowing(boolean z) {
        if (z) {
            TJAdUnitActivity.a();
        }
        hf.a();
        gw.a();
    }

    static TJCorePlacement a(String str, String str2, String str3, boolean z, boolean z2) {
        TJCorePlacement a2;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "!SYSTEM!" : "");
        sb.append(!jr.c(str) ? str : "");
        if (jr.c(str2)) {
            str2 = "";
        }
        sb.append(str2);
        if (jr.c(str3)) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(Boolean.toString(z2));
        String sb2 = sb.toString();
        TapjoyLog.d("TJPlacementManager", "TJCorePlacement key=" + sb2);
        synchronized (f7720a) {
            a2 = a(sb2);
            if (a2 == null) {
                a2 = new TJCorePlacement(str, sb2, z2);
                f7720a.put(sb2, a2);
                TapjoyLog.d("TJPlacementManager", "Created TJCorePlacement with GUID: " + a2.f7682d);
            }
        }
        return a2;
    }
}
