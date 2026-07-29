package com.moat.analytics.mobile.you;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.AdActivity;
import com.moat.analytics.mobile.you.w;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private static WebAdTracker f7462a;

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference<Activity> f7463b = new WeakReference<>(null);

    f() {
    }

    private static void a() {
        if (f7462a != null) {
            p.a(3, "GMAInterstitialHelper", f7463b.get(), "Stopping to track GMA interstitial");
            f7462a.stopTracking();
            f7462a = null;
        }
    }

    static void a(Activity activity) {
        try {
            if (w.a().f7538a == w.d.OFF) {
                return;
            }
            if (!b(activity)) {
                a();
                f7463b = new WeakReference<>(null);
            } else if (f7463b.get() == null || f7463b.get() != activity) {
                View decorView = activity.getWindow().getDecorView();
                if (decorView instanceof ViewGroup) {
                    com.moat.analytics.mobile.you.a.b.a<WebView> a2 = ab.a((ViewGroup) decorView, true);
                    if (a2.c()) {
                        f7463b = new WeakReference<>(activity);
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
        p.a(3, "GMAInterstitialHelper", f7463b.get(), "Starting to track GMA interstitial");
        f7462a = MoatFactory.create().createWebAdTracker(webView);
        f7462a.startTracking();
    }

    private static boolean b(Activity activity) {
        String name = activity.getClass().getName();
        p.a(3, "GMAInterstitialHelper", activity, "Activity name: " + name);
        return name.contains(AdActivity.CLASS_NAME);
    }
}
