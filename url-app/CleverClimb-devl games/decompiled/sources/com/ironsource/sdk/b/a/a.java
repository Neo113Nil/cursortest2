package com.ironsource.sdk.b.a;

import android.app.Application;
import android.webkit.WebView;
import com.moat.analytics.mobile.iro.MoatAnalytics;
import com.moat.analytics.mobile.iro.MoatFactory;
import com.moat.analytics.mobile.iro.MoatOptions;
import com.moat.analytics.mobile.iro.TrackerListener;
import com.moat.analytics.mobile.iro.WebAdTracker;
import org.json.JSONObject;

/* compiled from: MOATManager.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static WebAdTracker f7004a;

    /* renamed from: b, reason: collision with root package name */
    private static InterfaceC0374a f7005b;

    /* renamed from: c, reason: collision with root package name */
    private static TrackerListener f7006c = new TrackerListener() { // from class: com.ironsource.sdk.b.a.a.1
        @Override // com.moat.analytics.mobile.iro.TrackerListener
        public void onTrackingStarted(String str) {
            if (a.f7005b != null) {
                a.f7005b.onTrackingStarted(str);
            }
        }

        @Override // com.moat.analytics.mobile.iro.TrackerListener
        public void onTrackingFailedToStart(String str) {
            if (a.f7005b != null) {
                a.f7005b.onTrackingFailedToStart(str);
            }
        }

        @Override // com.moat.analytics.mobile.iro.TrackerListener
        public void onTrackingStopped(String str) {
            if (a.f7005b != null) {
                a.f7005b.onTrackingStopped(str);
            }
        }
    };

    /* compiled from: MOATManager.java */
    /* renamed from: com.ironsource.sdk.b.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0374a extends TrackerListener {
    }

    public static void a(InterfaceC0374a interfaceC0374a) {
        f7005b = interfaceC0374a;
    }

    public static void a(JSONObject jSONObject, Application application) throws Exception {
        MoatAnalytics.getInstance().start((jSONObject == null || jSONObject.length() <= 0) ? null : a(jSONObject), application);
    }

    private static MoatOptions a(JSONObject jSONObject) {
        MoatOptions moatOptions = new MoatOptions();
        moatOptions.loggingEnabled = jSONObject.optBoolean("loggingEnabled");
        moatOptions.autoTrackGMAInterstitials = jSONObject.optBoolean("autoTrackGMAInterstitials");
        moatOptions.disableAdIdCollection = jSONObject.optBoolean("disableAdIdCollection");
        moatOptions.disableLocationServices = jSONObject.optBoolean("disableLocationServices");
        return moatOptions;
    }

    public static void a(WebView webView) throws Exception {
        f7004a = MoatFactory.create().createWebAdTracker(webView);
    }

    public static void a() throws Exception {
        if (f7004a != null) {
            f7004a.setListener(f7006c);
            f7004a.startTracking();
        }
    }

    public static void b() throws Exception {
        if (f7004a != null) {
            f7004a.stopTracking();
        }
    }
}
