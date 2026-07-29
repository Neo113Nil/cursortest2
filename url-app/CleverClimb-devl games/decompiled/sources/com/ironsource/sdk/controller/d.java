package com.ironsource.sdk.controller;

import android.app.Application;
import android.webkit.WebView;
import com.ironsource.sdk.b.a.a;
import com.ironsource.sdk.controller.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MOATJSAdapter.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private Application f7124a;

    public d(Application application) {
        this.f7124a = application;
    }

    /* compiled from: MOATJSAdapter.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        String f7129a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f7130b;

        /* renamed from: c, reason: collision with root package name */
        String f7131c;

        /* renamed from: d, reason: collision with root package name */
        String f7132d;

        private a() {
        }
    }

    void a(String str, c.C0376c.a aVar, WebView webView) throws Exception {
        a a2 = a(str);
        if ("initWithOptions".equals(a2.f7129a)) {
            com.ironsource.sdk.b.a.a.a(a2.f7130b, this.f7124a);
            return;
        }
        if ("createAdTracker".equals(a2.f7129a) && webView != null) {
            com.ironsource.sdk.b.a.a.a(webView);
            return;
        }
        if ("startTracking".equals(a2.f7129a)) {
            com.ironsource.sdk.b.a.a.a(a(aVar, a2.f7131c, a2.f7132d));
            com.ironsource.sdk.b.a.a.a();
        } else if ("stopTracking".equals(a2.f7129a)) {
            com.ironsource.sdk.b.a.a.a(a(aVar, a2.f7131c, a2.f7132d));
            com.ironsource.sdk.b.a.a.b();
        }
    }

    private a.InterfaceC0374a a(final c.C0376c.a aVar, final String str, final String str2) {
        return new a.InterfaceC0374a() { // from class: com.ironsource.sdk.controller.d.1
            @Override // com.moat.analytics.mobile.iro.TrackerListener
            public void onTrackingStarted(String str3) {
                if (aVar != null) {
                    aVar.a(true, str, str3);
                }
            }

            @Override // com.moat.analytics.mobile.iro.TrackerListener
            public void onTrackingFailedToStart(String str3) {
                if (aVar != null) {
                    aVar.a(false, str2, str3);
                }
            }

            @Override // com.moat.analytics.mobile.iro.TrackerListener
            public void onTrackingStopped(String str3) {
                if (aVar != null) {
                    aVar.a(true, str, str3);
                }
            }
        };
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f7129a = jSONObject.optString("moatFunction");
        aVar.f7130b = jSONObject.optJSONObject("moatParams");
        aVar.f7131c = jSONObject.optString("success");
        aVar.f7132d = jSONObject.optString("fail");
        return aVar;
    }
}
