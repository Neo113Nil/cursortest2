package com.anythink.expressad.mbbanner.a.a;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19982a = "BannerCallJS";

    private static void a(WebView webView) {
        h.a();
        com.anythink.core.express.d.a.a(webView);
    }

    private static void b(WebView webView) {
        h.a();
        com.anythink.core.express.d.a.a(webView);
    }

    private static void a(WebView webView, float f6, float f9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f6);
            jSONObject.put("startY", f9);
            jSONObject.put("scale", v.c(t.b().g()));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            h.a();
            com.anythink.core.express.d.a.a(webView, "webviewshow", encodeToString);
        } catch (Throwable unused) {
        }
    }

    private static void a(WebView webView, int i, int i4) {
        try {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView, i, i4);
        } catch (Throwable unused) {
        }
    }

    private static void a(WindVaneWebView windVaneWebView, boolean z8) {
        try {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(windVaneWebView, z8 ? "true" : "false");
        } catch (Throwable unused) {
        }
    }

    private static void a(WebView webView, int i, int i4, int i9, int i10) {
        String str;
        try {
            int i11 = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i11 == 2) {
                str = "landscape";
            } else {
                str = i11 == 1 ? "portrait" : "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float f6 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h9 = n.h(t.b().g());
            int intValue = ((Integer) h9.get("width")).intValue();
            int intValue2 = ((Integer) h9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17683a, com.anythink.core.express.b.a.f17692k);
            hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17688f);
            hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject);
            com.anythink.core.express.b.a.a();
            float f9 = i;
            float f10 = i4;
            float f11 = i9;
            float f12 = i10;
            com.anythink.core.express.b.a.a(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f6, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(webView, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView);
        } catch (Throwable unused) {
        }
    }
}
