package com.moat.analytics.mobile.iro;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AudienceNetworkActivity;
import com.moat.analytics.mobile.iro.f;
import com.mopub.mobileads.VastExtensionXmlManager;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: ˊ, reason: contains not printable characters */
    final String f1072;

    /* renamed from: ˋ, reason: contains not printable characters */
    f f1073;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final int f1074;

    /* renamed from: ˏ, reason: contains not printable characters */
    WebView f1075;

    /* renamed from: ॱ, reason: contains not printable characters */
    private boolean f1076;

    /* renamed from: ˊ, reason: contains not printable characters */
    static /* synthetic */ boolean m1179(b bVar) {
        bVar.f1076 = true;
        return true;
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final int f1079 = 2;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final int f1080 = 1;

        static {
            int[] iArr = {1, 2};
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    b(Application application, int i) {
        this.f1074 = i;
        this.f1076 = false;
        this.f1072 = String.format(Locale.ROOT, "_moatTracker%d", Integer.valueOf((int) (Math.random() * 1.0E8d)));
        this.f1075 = new WebView(application);
        WebSettings settings = this.f1075.getSettings();
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
            this.f1073 = new f(this.f1075, i == a.f1079 ? f.b.f1131 : f.b.f1132);
        } catch (o e) {
            o.m1290(e);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final void m1185(String str) {
        if (this.f1074 == a.f1080) {
            this.f1075.setWebViewClient(new WebViewClient() { // from class: com.moat.analytics.mobile.iro.b.5
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str2) {
                    if (b.this.f1076) {
                        return;
                    }
                    try {
                        b.m1179(b.this);
                        b.this.f1073.m1235();
                    } catch (Exception e) {
                        o.m1290(e);
                    }
                }
            });
            this.f1075.loadData("<!DOCTYPE html>\n<html>\n<head lang=\"en\">\n   <meta charset=\"UTF-8\">\n   <title></title>\n</head>\n<body style=\"margin:0;padding:0;\">\n    <script src=\"https://z.moatads.com/" + str + "/moatad.js\" type=\"text/javascript\"></script>\n</body>\n</html>", AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    final void m1186(String str, Map<String, String> map, Integer num, Integer num2, Integer num3) {
        if (this.f1074 == a.f1079) {
            this.f1075.setWebViewClient(new WebViewClient() { // from class: com.moat.analytics.mobile.iro.b.1
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str2) {
                    if (b.this.f1076) {
                        return;
                    }
                    try {
                        b.m1179(b.this);
                        b.this.f1073.m1235();
                        b.this.f1073.m1237(b.this.f1072);
                    } catch (Exception e) {
                        o.m1290(e);
                    }
                }
            });
            JSONObject jSONObject = new JSONObject(map);
            this.f1075.loadData(String.format(Locale.ROOT, "<html><head></head><body><div id=\"%s\" style=\"width: %dpx; height: %dpx;\"></div><script>(function initMoatTracking(apiname, pcode, ids, duration) {var events = [];window[pcode + '_moatElToTrack'] = document.getElementById('%s');var moatapi = {'dropTime':%d,'adData': {'ids': ids, 'duration': duration, 'url': 'n/a'},'dispatchEvent': function(ev) {if (this.sendEvent) {if (events) { events.push(ev); ev = events; events = false; }this.sendEvent(ev);} else {events.push(ev);}},'dispatchMany': function(evs){for (var i=0, l=evs.length; i<l; i++) {this.dispatchEvent(evs[i]);}}};Object.defineProperty(window, apiname, {'value': moatapi});var s = document.createElement('script');s.src = 'https://z.moatads.com/' + pcode + '/moatvideo.js?' + apiname + '#' + apiname;document.body.appendChild(s);})('%s', '%s', %s, %s);</script></body></html>", "mianahwvc", num, num2, "mianahwvc", Long.valueOf(System.currentTimeMillis()), this.f1072, str, jSONObject.toString(), num3), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null);
        }
    }

    b() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static void m1182(int i, String str, Object obj, String str2) {
        if (t.m1319().f1232) {
            if (obj == null) {
                Log.println(i, VastExtensionXmlManager.MOAT + str, String.format("message = %s", str2));
            } else {
                Log.println(i, VastExtensionXmlManager.MOAT + str, String.format("id = %s, message = %s", Integer.valueOf(obj.hashCode()), str2));
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static void m1183(String str, Object obj, String str2) {
        if (t.m1319().f1233) {
            String str3 = VastExtensionXmlManager.MOAT + str;
            Object[] objArr = new Object[2];
            objArr[0] = obj == null ? "null" : Integer.valueOf(obj.hashCode());
            objArr[1] = str2;
            Log.println(2, str3, String.format("id = %s, message = %s", objArr));
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m1178(String str, Object obj, String str2, Exception exc) {
        if (t.m1319().f1232) {
            Log.e(VastExtensionXmlManager.MOAT + str, String.format("id = %s, message = %s", Integer.valueOf(obj.hashCode()), str2), exc);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static void m1180(String str, String str2) {
        if (t.m1319().f1232 || !((j) MoatAnalytics.getInstance()).f1171) {
            return;
        }
        Log.println(str.equals("[ERROR] ") ? 6 : 2, "MoatAnalytics", str + str2);
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    static String m1184(View view) {
        if (view == null) {
            return "null";
        }
        return view.getClass().getSimpleName() + "@" + view.hashCode();
    }
}
