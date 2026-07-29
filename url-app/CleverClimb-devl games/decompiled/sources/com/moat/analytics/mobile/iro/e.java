package com.moat.analytics.mobile.iro;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.AdActivity;
import com.moat.analytics.mobile.iro.base.functional.Optional;
import com.moat.analytics.mobile.iro.t;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class e {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static WeakReference<Activity> f1106 = new WeakReference<>(null);

    /* renamed from: ˏ, reason: contains not printable characters */
    private static WebAdTracker f1107;

    e() {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m1208(Activity activity) {
        try {
            if (t.m1319().f1230 == t.c.f1246) {
                return;
            }
            String name = activity.getClass().getName();
            b.m1182(3, "GMAInterstitialHelper", activity, "Activity name: " + name);
            if (name.contains(AdActivity.CLASS_NAME)) {
                if (f1106.get() == null || f1106.get() != activity) {
                    View decorView = activity.getWindow().getDecorView();
                    if (decorView instanceof ViewGroup) {
                        Optional<WebView> m1333 = v.m1333((ViewGroup) decorView, true);
                        if (m1333.isPresent()) {
                            f1106 = new WeakReference<>(activity);
                            WebView webView = m1333.get();
                            b.m1182(3, "GMAInterstitialHelper", f1106.get(), "Starting to track GMA interstitial");
                            WebAdTracker createWebAdTracker = MoatFactory.create().createWebAdTracker(webView);
                            f1107 = createWebAdTracker;
                            createWebAdTracker.startTracking();
                            return;
                        }
                        b.m1182(3, "GMAInterstitialHelper", activity, "Sorry, no WebView in this activity");
                        return;
                    }
                    return;
                }
                return;
            }
            if (f1107 != null) {
                b.m1182(3, "GMAInterstitialHelper", f1106.get(), "Stopping to track GMA interstitial");
                f1107.stopTracking();
                f1107 = null;
            }
            f1106 = new WeakReference<>(null);
        } catch (Exception e) {
            o.m1290(e);
        }
    }
}
