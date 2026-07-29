package com.moat.analytics.mobile.tjy;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class af implements NativeDisplayTracker {

    /* renamed from: a, reason: collision with root package name */
    private WebView f7221a;

    /* renamed from: b, reason: collision with root package name */
    private bh f7222b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7223c;

    /* renamed from: d, reason: collision with root package name */
    private final ap f7224d;
    private boolean e;

    public af(View view, String str, a aVar, ap apVar) {
        if (apVar.b()) {
            Log.d("MoatNativeDispTracker", "Initializing.");
        }
        this.f7223c = str;
        this.f7221a = new WebView(view.getContext());
        WebSettings settings = this.f7221a.getSettings();
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
        this.f7224d = apVar;
        this.f7222b = new bi(view, this.f7221a, true, aVar, apVar);
        this.e = false;
    }

    private static String a(int i, int i2, String str, String str2) {
        return "<!DOCTYPE html>\n<html>\n<head lang=\"en\">\n    <meta charset=\"UTF-8\">\n    <title></title>\n</head>\n<body style=\"margin:0;padding:0;\">\n<div id=\"mianahwvc\" style=\"width:" + i + "px;height:" + i2 + "px;\">\n    <script src=\"https://z.moatads.com/" + str + "/moatad.js#" + str2 + "\" type=\"text/javascript\"></script>\n</div>\n</body>\n</html>";
    }

    private static String a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 8; i++) {
            String str = "moatClientLevel" + i;
            if (map.containsKey(str)) {
                linkedHashMap.put(str, map.get(str));
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            String str2 = "moatClientSlicer" + i2;
            if (map.containsKey(str2)) {
                linkedHashMap.put(str2, map.get(str2));
            }
        }
        for (String str3 : map.keySet()) {
            if (!linkedHashMap.containsKey(str3)) {
                linkedHashMap.put(str3, (String) map.get(str3));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str4 : linkedHashMap.keySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            String str5 = (String) linkedHashMap.get(str4);
            sb.append(str4);
            sb.append('=');
            sb.append(str5);
        }
        return String.valueOf(sb);
    }

    private void a() {
        if (this.e) {
            return;
        }
        a("Shutting down.");
        this.f7222b.d();
        this.f7221a.loadUrl("about:blank");
        this.f7221a.destroy();
        this.f7221a = null;
        this.f7222b = null;
        this.e = true;
    }

    private void a(String str) {
        if (this.f7224d.b()) {
            Log.d("MoatNativeDispTracker", String.format("id = %s, message = %s", Integer.valueOf(hashCode()), str));
        }
    }

    @Override // com.moat.analytics.mobile.tjy.NativeDisplayTracker
    public void stopTracking() {
        a("Called stopTracking.");
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    @Override // com.moat.analytics.mobile.tjy.NativeDisplayTracker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean track(Map map) {
        boolean z;
        if (map != null) {
            try {
            } catch (Exception e) {
                e = e;
                z = false;
            }
            if (!map.isEmpty()) {
                z = this.f7222b.c();
                if (z) {
                    try {
                        Rect e2 = this.f7222b.e();
                        int width = e2.width();
                        int height = e2.height();
                        String a2 = a(map);
                        a("Parsed ad ids = " + a2);
                        this.f7221a.loadData(a(width, height, this.f7223c, a2), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING);
                    } catch (Exception e3) {
                        e = e3;
                        com.moat.analytics.mobile.tjy.base.exception.a.a(e);
                        StringBuilder sb = new StringBuilder("Attempt to start tracking ad was ");
                        sb.append(!z ? "" : "un");
                        sb.append("successful.");
                        a(sb.toString());
                        return z;
                    }
                }
                StringBuilder sb2 = new StringBuilder("Attempt to start tracking ad was ");
                sb2.append(!z ? "" : "un");
                sb2.append("successful.");
                a(sb2.toString());
                return z;
            }
        }
        a("adIdMap is null or empty. Shutting down.");
        a();
        return false;
    }
}
