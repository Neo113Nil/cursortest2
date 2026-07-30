package com.anythink.core.express.b;

import D.y;
import android.webkit.WebView;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17683a = "placementType";

    /* renamed from: b, reason: collision with root package name */
    public static final String f17684b = "state";

    /* renamed from: c, reason: collision with root package name */
    public static final String f17685c = "viewable";

    /* renamed from: d, reason: collision with root package name */
    public static final String f17686d = "currentAppOrientation";

    /* renamed from: e, reason: collision with root package name */
    public static final String f17687e = "loading";

    /* renamed from: f, reason: collision with root package name */
    public static final String f17688f = "default";

    /* renamed from: g, reason: collision with root package name */
    public static final String f17689g = "expanded";

    /* renamed from: h, reason: collision with root package name */
    public static final String f17690h = "hidden";
    public static final String i = "resized";

    /* renamed from: j, reason: collision with root package name */
    public static final String f17691j = "Interstitial";

    /* renamed from: k, reason: collision with root package name */
    public static final String f17692k = "inline";

    /* renamed from: com.anythink.core.express.b.a$a, reason: collision with other inner class name */
    public static class C0105a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f17693a = new a();

        private C0105a() {
        }
    }

    public static a a() {
        return C0105a.f17693a;
    }

    public static void b(WebView webView, float f6, float f9) {
        d(webView, String.format(Locale.US, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f6), Float.valueOf(f9)));
    }

    public static void c(WebView webView, float f6, float f9) {
        d(webView, String.format(Locale.US, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f6), Float.valueOf(f9)));
    }

    private static void d(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(WebView webView) {
        d(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    public static void b(WebView webView, float f6, float f9, float f10, float f11) {
        d(webView, String.format(Locale.US, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f6), Float.valueOf(f9), Float.valueOf(f10), Float.valueOf(f11)));
    }

    private static void c(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        d(webView, y.k("javascript:window.mraidbridge.setPlacementType(", str, ");"));
    }

    public static void a(WebView webView, Map<String, Object> map) {
        if (map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        String jSONObject2 = jSONObject.toString();
        try {
            jSONObject2 = URLEncoder.encode(jSONObject2, "UTF-8");
        } catch (Throwable unused) {
        }
        d(webView, y.k("javascript:window.mraidbridge.fireChangeEvent(", jSONObject2, ");"));
    }

    public static void b(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        d(webView, y.k("javascript:window.mraidbridge.setIsViewable(", str, ");"));
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        d(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public static void a(WebView webView, float f6, float f9) {
        d(webView, String.format(Locale.US, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f6), Float.valueOf(f9)));
    }

    public static void a(WebView webView, double d2) {
        Locale locale = Locale.US;
        d(webView, "javascript:window.mraidbridge.audioVolumeChange(" + d2 + ");");
    }

    public static void a(WebView webView, float f6, float f9, float f10, float f11) {
        d(webView, String.format(Locale.US, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f6), Float.valueOf(f9), Float.valueOf(f10), Float.valueOf(f11)));
    }

    public static void a(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        d(webView, y.k("javascript:window.mraidbridge.nativeCallComplete('", str, "');"));
    }
}
