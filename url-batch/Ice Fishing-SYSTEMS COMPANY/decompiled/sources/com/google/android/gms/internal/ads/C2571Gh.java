package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Gh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2571Gh {

    /* renamed from: a, reason: collision with root package name */
    public final Vx f25201a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2520Dh f25202b;

    public C2571Gh(ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh, Vx vx) {
        this.f25201a = vx;
        this.f25202b = viewTreeObserverOnGlobalLayoutListenerC2520Dh;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            t2.C.k("Click string is empty, not proceeding.");
            return "";
        }
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = this.f25202b;
        C3348i7 c3348i7 = viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24498u;
        if (c3348i7 == null) {
            t2.C.k("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC3240g7 interfaceC3240g7 = c3348i7.f31319b;
        if (interfaceC3240g7 == null) {
            t2.C.k("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC2520Dh.getContext() != null) {
            return interfaceC3240g7.c(viewTreeObserverOnGlobalLayoutListenerC2520Dh.getContext(), str, viewTreeObserverOnGlobalLayoutListenerC2520Dh, viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24490n.f26730a);
        }
        t2.C.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = this.f25202b;
        C3348i7 c3348i7 = viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24498u;
        if (c3348i7 == null) {
            t2.C.k("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC3240g7 interfaceC3240g7 = c3348i7.f31319b;
        if (interfaceC3240g7 == null) {
            t2.C.k("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC2520Dh.getContext() != null) {
            return interfaceC3240g7.i(viewTreeObserverOnGlobalLayoutListenerC2520Dh.getContext(), viewTreeObserverOnGlobalLayoutListenerC2520Dh, viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24490n.f26730a);
        }
        t2.C.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = this.f25202b;
        AbstractC3368ia.a(viewTreeObserverOnGlobalLayoutListenerC2520Dh.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f3if)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            C2588Hh c2588Hh = viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24472G;
            C3270gk c3270gk = c2588Hh != null ? c2588Hh.f25399T : null;
            if (c3270gk != null) {
                long j9 = c3270gk.f31098a.get();
                if (j9 > 0) {
                    jSONObject.put("plcmtid", j9);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e6) {
            t2.C.l("Error constructing JSON.", e6);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (!TextUtils.isEmpty(str)) {
            t2.G.f40858l.post(new MD(19, this, str));
        } else {
            int i = t2.C.f40822b;
            u2.i.f("URL is empty, ignoring message");
        }
    }
}
