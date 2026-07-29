package com.moat.analytics.mobile.cha;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AudienceNetworkActivity;
import com.moat.analytics.mobile.cha.j;
import com.mopub.mobileads.VastExtensionXmlManager;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: ˊ, reason: contains not printable characters */
    final String f842;

    /* renamed from: ˋ, reason: contains not printable characters */
    WebView f843;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f844;

    /* renamed from: ˏ, reason: contains not printable characters */
    j f845;

    /* renamed from: ॱ, reason: contains not printable characters */
    private final int f846;

    /* renamed from: ˎ, reason: contains not printable characters */
    static /* synthetic */ boolean m992(a aVar) {
        aVar.f844 = true;
        return true;
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class d {

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final int f849 = 2;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final int f850 = 1;

        static {
            int[] iArr = {1, 2};
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    a(Application application, int i) {
        this.f846 = i;
        this.f844 = false;
        this.f842 = String.format(Locale.ROOT, "_moatTracker%d", Integer.valueOf((int) (Math.random() * 1.0E8d)));
        this.f843 = new WebView(application);
        WebSettings settings = this.f843.getSettings();
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
            this.f845 = new j(this.f843, i == d.f849 ? j.e.f947 : j.e.f948);
        } catch (o e) {
            o.m1110(e);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final void m998(String str) {
        if (this.f846 == d.f850) {
            this.f843.setWebViewClient(new WebViewClient() { // from class: com.moat.analytics.mobile.cha.a.2
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str2) {
                    if (a.this.f844) {
                        return;
                    }
                    try {
                        a.m992(a.this);
                        a.this.f845.m1083();
                    } catch (Exception e) {
                        o.m1110(e);
                    }
                }
            });
            this.f843.loadData("<!DOCTYPE html>\n<html>\n<head lang=\"en\">\n   <meta charset=\"UTF-8\">\n   <title></title>\n</head>\n<body style=\"margin:0;padding:0;\">\n    <script src=\"https://z.moatads.com/" + str + "/moatad.js\" type=\"text/javascript\"></script>\n</body>\n</html>", AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final void m999(String str, Map<String, String> map, Integer num, Integer num2, Integer num3) {
        if (this.f846 == d.f849) {
            this.f843.setWebViewClient(new WebViewClient() { // from class: com.moat.analytics.mobile.cha.a.5
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str2) {
                    if (a.this.f844) {
                        return;
                    }
                    try {
                        a.m992(a.this);
                        a.this.f845.m1083();
                        a.this.f845.m1082(a.this.f842);
                    } catch (Exception e) {
                        o.m1110(e);
                    }
                }
            });
            JSONObject jSONObject = new JSONObject(map);
            this.f843.loadData(String.format(Locale.ROOT, "<html><head></head><body><div id=\"%s\" style=\"width: %dpx; height: %dpx;\"></div><script>(function initMoatTracking(apiname, pcode, ids, duration) {var events = [];window[pcode + '_moatElToTrack'] = document.getElementById('%s');var moatapi = {'dropTime':%d,'adData': {'ids': ids, 'duration': duration, 'url': 'n/a'},'dispatchEvent': function(ev) {if (this.sendEvent) {if (events) { events.push(ev); ev = events; events = false; }this.sendEvent(ev);} else {events.push(ev);}},'dispatchMany': function(evs){for (var i=0, l=evs.length; i<l; i++) {this.dispatchEvent(evs[i]);}}};Object.defineProperty(window, apiname, {'value': moatapi});var s = document.createElement('script');s.src = 'https://z.moatads.com/' + pcode + '/moatvideo.js?' + apiname + '#' + apiname;document.body.appendChild(s);})('%s', '%s', %s, %s);</script></body></html>", "mianahwvc", num, num2, "mianahwvc", Long.valueOf(System.currentTimeMillis()), this.f842, str, jSONObject.toString(), num3), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null);
        }
    }

    a() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static void m994(int i, String str, Object obj, String str2) {
        if (t.m1144().f1012) {
            if (obj == null) {
                Log.println(i, VastExtensionXmlManager.MOAT + str, String.format("message = %s", str2));
            } else {
                Log.println(i, VastExtensionXmlManager.MOAT + str, String.format("id = %s, message = %s", Integer.valueOf(obj.hashCode()), str2));
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static void m995(String str, Object obj, String str2) {
        if (t.m1144().f1009) {
            String str3 = VastExtensionXmlManager.MOAT + str;
            Object[] objArr = new Object[2];
            objArr[0] = obj == null ? "null" : Integer.valueOf(obj.hashCode());
            objArr[1] = str2;
            Log.println(2, str3, String.format("id = %s, message = %s", objArr));
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    static void m996(String str, Object obj, String str2, Exception exc) {
        if (t.m1144().f1012) {
            Log.e(VastExtensionXmlManager.MOAT + str, String.format("id = %s, message = %s", Integer.valueOf(obj.hashCode()), str2), exc);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m991(String str, String str2) {
        if (t.m1144().f1012 || !((f) MoatAnalytics.getInstance()).f888) {
            return;
        }
        Log.println(str.equals("[ERROR] ") ? 6 : 2, "MoatAnalytics", str + str2);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static String m993(View view) {
        if (view == null) {
            return "null";
        }
        return view.getClass().getSimpleName() + "@" + view.hashCode();
    }
}
