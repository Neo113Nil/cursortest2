package com.moat.analytics.mobile.you;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AudienceNetworkActivity;
import com.moat.analytics.mobile.you.j;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    WebView f7464a;

    /* renamed from: b, reason: collision with root package name */
    j f7465b;

    /* renamed from: d, reason: collision with root package name */
    private final a f7467d;
    private Handler f;
    private Runnable g;
    private boolean e = false;

    /* renamed from: c, reason: collision with root package name */
    final String f7466c = String.format(Locale.ROOT, "_moatTracker%d", Integer.valueOf((int) (Math.random() * 1.0E8d)));

    enum a {
        DISPLAY,
        VIDEO
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    g(Context context, a aVar) {
        this.f7467d = aVar;
        this.f7464a = new WebView(context);
        WebSettings settings = this.f7464a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSaveFormData(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(1);
        }
        try {
            this.f7465b = new j(this.f7464a, aVar == a.VIDEO ? j.a.NATIVE_VIDEO : j.a.NATIVE_DISPLAY);
        } catch (m e) {
            m.a(e);
        }
    }

    private static String a(String str, String str2, Integer num, Integer num2, JSONObject jSONObject, Integer num3) {
        return String.format(Locale.ROOT, "<html><head></head><body><div id=\"%s\" style=\"width: %dpx; height: %dpx;\"></div><script>(function initMoatTracking(apiname, pcode, ids, duration) {var events = [];window[pcode + '_moatElToTrack'] = document.getElementById('%s');var moatapi = {'dropTime':%d,'adData': {'ids': ids, 'duration': duration, 'url': 'n/a'},'dispatchEvent': function(ev) {if (this.sendEvent) {if (events) { events.push(ev); ev = events; events = false; }this.sendEvent(ev);} else {events.push(ev);}},'dispatchMany': function(evs){for (var i=0, l=evs.length; i<l; i++) {this.dispatchEvent(evs[i]);}}};Object.defineProperty(window, apiname, {'value': moatapi});var s = document.createElement('script');s.src = 'https://z.moatads.com/' + pcode + '/moatvideo.js?' + apiname + '#' + apiname;document.body.appendChild(s);})('%s', '%s', %s, %s);</script></body></html>", "mianahwvc", num, num2, "mianahwvc", Long.valueOf(System.currentTimeMillis()), str, str2, jSONObject.toString(), num3);
    }

    private static String b(String str) {
        return "<!DOCTYPE html>\n<html>\n<head lang=\"en\">\n   <meta charset=\"UTF-8\">\n   <title></title>\n</head>\n<body style=\"margin:0;padding:0;\">\n    <script src=\"https://z.moatads.com/" + str + "/moatad.js\" type=\"text/javascript\"></script>\n</body>\n</html>";
    }

    void a() {
        p.a(3, "GlobalWebView", this, "Cleaning up");
        this.f7465b.b();
        this.f7465b = null;
        this.f7464a.destroy();
        this.f7464a = null;
    }

    void a(String str) {
        if (this.f7467d == a.DISPLAY) {
            this.f7464a.setWebViewClient(new WebViewClient() { // from class: com.moat.analytics.mobile.you.g.1
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    if (g.this.e) {
                        return;
                    }
                    try {
                        g.this.e = true;
                        g.this.f7465b.a();
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            });
            this.f7464a.loadData(b(str), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING);
        }
    }

    void a(String str, Map<String, String> map, Integer num, Integer num2, Integer num3) {
        if (this.f7467d == a.VIDEO) {
            if (Build.VERSION.SDK_INT >= 19) {
                p.a(3, "GlobalWebView", this, "Starting off polling interval to check for Video API instance presence");
                this.f = new Handler();
                this.g = new Runnable() { // from class: com.moat.analytics.mobile.you.g.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (g.this.f7464a == null || Build.VERSION.SDK_INT < 19) {
                                return;
                            }
                            g.this.f7464a.evaluateJavascript("typeof " + g.this.f7466c + " !== 'undefined'", new ValueCallback<String>() { // from class: com.moat.analytics.mobile.you.g.2.1
                                @Override // android.webkit.ValueCallback
                                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                public void onReceiveValue(String str2) {
                                    if (!"true".equals(str2)) {
                                        g.this.f.postDelayed(g.this.g, 200L);
                                        return;
                                    }
                                    p.a(3, "GlobalWebView", this, String.format("Video API instance %s detected. Flushing event queue", g.this.f7466c));
                                    try {
                                        g.this.e = true;
                                        g.this.f7465b.a();
                                        g.this.f7465b.c(g.this.f7466c);
                                    } catch (Exception e) {
                                        m.a(e);
                                    }
                                }
                            });
                        } catch (Exception e) {
                            m.a(e);
                        }
                    }
                };
                this.f.post(this.g);
            } else {
                p.a(3, "GlobalWebView", this, "Android API version is less than KitKat: " + Build.VERSION.SDK_INT);
                this.f7464a.setWebViewClient(new WebViewClient() { // from class: com.moat.analytics.mobile.you.g.3
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        if (g.this.e) {
                            return;
                        }
                        p.a(3, "GlobalWebView", this, "onPageFinished is called for the first time. Flushing event queue");
                        try {
                            g.this.e = true;
                            g.this.f7465b.a();
                            g.this.f7465b.c(g.this.f7466c);
                        } catch (Exception e) {
                            m.a(e);
                        }
                    }
                });
            }
            this.f7464a.loadData(a(this.f7466c, str, num, num2, new JSONObject(map), num3), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null);
        }
    }
}
