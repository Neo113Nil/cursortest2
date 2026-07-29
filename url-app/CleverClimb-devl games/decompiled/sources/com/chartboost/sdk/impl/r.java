package com.chartboost.sdk.impl;

import android.app.Application;
import android.webkit.WebView;
import com.chartboost.sdk.Libraries.CBLogging;
import com.moat.analytics.mobile.cha.MoatAnalytics;
import com.moat.analytics.mobile.cha.MoatFactory;
import com.moat.analytics.mobile.cha.MoatOptions;
import com.moat.analytics.mobile.cha.WebAdTracker;

/* loaded from: classes.dex */
public class r implements q {

    /* renamed from: b, reason: collision with root package name */
    private static String f3856b = "r";

    /* renamed from: a, reason: collision with root package name */
    WebAdTracker f3857a = null;

    @Override // com.chartboost.sdk.impl.q
    public void a(Application application, boolean z, boolean z2, boolean z3) {
        String str = f3856b;
        StringBuilder sb = new StringBuilder();
        sb.append("start MOAT provider, Debugging Enabled: ");
        sb.append(z);
        sb.append("Location Enabled:");
        sb.append(!z2);
        sb.append("idfaCollectionEnabled:");
        sb.append(!z3);
        CBLogging.a(str, sb.toString());
        MoatOptions moatOptions = new MoatOptions();
        moatOptions.disableLocationServices = z2;
        moatOptions.disableAdIdCollection = z3;
        moatOptions.loggingEnabled = z;
        MoatAnalytics.getInstance().start(moatOptions, application);
    }

    @Override // com.chartboost.sdk.impl.p
    public void a(WebView webView) {
        this.f3857a = MoatFactory.create().createWebAdTracker(webView);
    }

    @Override // com.chartboost.sdk.impl.p
    public void a() {
        if (this.f3857a != null) {
            CBLogging.a(f3856b, "start MOAT tracker");
            this.f3857a.startTracking();
        }
    }

    @Override // com.chartboost.sdk.impl.p
    public void b() {
        if (this.f3857a != null) {
            CBLogging.a(f3856b, "stop MOAT tracker");
            this.f3857a.stopTracking();
            this.f3857a = null;
        }
    }
}
