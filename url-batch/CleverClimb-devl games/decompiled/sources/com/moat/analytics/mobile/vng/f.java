package com.moat.analytics.mobile.vng;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.AdActivity;
import com.moat.analytics.mobile.vng.w;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private static WebAdTracker f7342a;

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference<Activity> f7343b = new WeakReference<>(null);

    f() {
    }

    private static void a() {
        if (f7342a != null) {
            p.a(3, "GMAInterstitialHelper", f7343b.get(), "Stopping to track GMA interstitial");
            f7342a.stopTracking();
            f7342a = null;
        }
    }

    static void a(Activity activity) {
        try {
            if (w.a().f7405a == w.d.OFF) {
                return;
            }
            if (!b(activity)) {
                a();
                f7343b = new WeakReference<>(null);
            } else if (f7343b.get() == null || f7343b.get() != activity) {
                View decorView = activity.getWindow().getDecorView();
                if (decorView instanceof ViewGroup) {
                    com.moat.analytics.mobile.vng.a.b.a<WebView> a2 = ab.a((ViewGroup) decorView);
                    if (a2.c()) {
                        f7343b = new WeakReference<>(activity);
                        a(a2.b());
                    } else {
                        p.a(3, "GMAInterstitialHelper", activity, "Sorry, no WebView in this activity");
                    }
                }
            }
        } catch (Exception e) {
            m.a(e);
        }
    }

    private static void a(WebView webView) {
        p.a(3, "GMAInterstitialHelper", f7343b.get(), "Starting to track GMA interstitial");
        f7342a = MoatFactory.create().createWebAdTracker(webView);
        f7342a.startTracking();
    }

    private static boolean b(Activity activity) {
        String name = activity.getClass().getName();
        p.a(3, "GMAInterstitialHelper", activity, "Activity name: " + name);
        return name.contains(AdActivity.CLASS_NAME);
    }
}
