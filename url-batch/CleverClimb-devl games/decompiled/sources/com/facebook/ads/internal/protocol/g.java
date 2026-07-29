package com.facebook.ads.internal.protocol;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<e, f> f5384a = new HashMap();

    static {
        f5384a.put(e.RECTANGLE_HEIGHT_250, f.WEBVIEW_BANNER_250);
        f5384a.put(e.BANNER_HEIGHT_90, f.WEBVIEW_BANNER_90);
        f5384a.put(e.BANNER_HEIGHT_50, f.WEBVIEW_BANNER_50);
    }

    public static f a(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i2 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        return com.facebook.ads.internal.q.a.g.a(i, i2) ? f.WEBVIEW_INTERSTITIAL_TABLET : i2 > i ? f.WEBVIEW_INTERSTITIAL_VERTICAL : f.WEBVIEW_INTERSTITIAL_HORIZONTAL;
    }

    public static f a(e eVar) {
        f fVar = f5384a.get(eVar);
        return fVar == null ? f.WEBVIEW_BANNER_LEGACY : fVar;
    }

    public static void a(DisplayMetrics displayMetrics, View view, e eVar) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= eVar.a() ? displayMetrics.widthPixels : (int) Math.ceil(eVar.a() * displayMetrics.density), (int) Math.ceil(eVar.b() * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
