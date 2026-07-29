package com.moat.analytics.mobile.cha;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.AdActivity;
import com.moat.analytics.mobile.cha.base.functional.Optional;
import com.moat.analytics.mobile.cha.t;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class e {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static WeakReference<Activity> f881 = new WeakReference<>(null);

    /* renamed from: ˋ, reason: contains not printable characters */
    private static WebAdTracker f882;

    e() {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static void m1029(Activity activity) {
        try {
            if (t.m1144().f1011 == t.a.f1023) {
                return;
            }
            String name = activity.getClass().getName();
            a.m994(3, "GMAInterstitialHelper", activity, "Activity name: " + name);
            if (name.contains(AdActivity.CLASS_NAME)) {
                if (f881.get() == null || f881.get() != activity) {
                    View decorView = activity.getWindow().getDecorView();
                    if (decorView instanceof ViewGroup) {
                        Optional<WebView> m1165 = x.m1165((ViewGroup) decorView, true);
                        if (m1165.isPresent()) {
                            f881 = new WeakReference<>(activity);
                            WebView webView = m1165.get();
                            a.m994(3, "GMAInterstitialHelper", f881.get(), "Starting to track GMA interstitial");
                            WebAdTracker createWebAdTracker = MoatFactory.create().createWebAdTracker(webView);
                            f882 = createWebAdTracker;
                            createWebAdTracker.startTracking();
                            return;
                        }
                        a.m994(3, "GMAInterstitialHelper", activity, "Sorry, no WebView in this activity");
                        return;
                    }
                    return;
                }
                return;
            }
            if (f882 != null) {
                a.m994(3, "GMAInterstitialHelper", f881.get(), "Stopping to track GMA interstitial");
                f882.stopTracking();
                f882 = null;
            }
            f881 = new WeakReference<>(null);
        } catch (Exception e) {
            o.m1110(e);
        }
    }
}
