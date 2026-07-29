package com.moat.analytics.mobile.iro;

import android.view.ViewGroup;
import android.webkit.WebView;

/* loaded from: classes2.dex */
final class x extends c implements WebAdTracker {
    @Override // com.moat.analytics.mobile.iro.c
    /* renamed from: ˊ */
    final String mo1190() {
        return "WebAdTracker";
    }

    x(ViewGroup viewGroup) {
        this(v.m1333(viewGroup, false).orElse(null));
        if (viewGroup == null) {
            String str = "WebAdTracker initialization not successful, Target ViewGroup is null";
            b.m1182(3, "WebAdTracker", this, str);
            b.m1180("[ERROR] ", str);
            this.f1088 = new o("Target ViewGroup is null");
        }
        if (this.f1092 == null) {
            String str2 = "WebAdTracker initialization not successful, No WebView to track inside of ad container";
            b.m1182(3, "WebAdTracker", this, str2);
            b.m1180("[ERROR] ", str2);
            this.f1088 = new o("No WebView to track inside of ad container");
        }
    }

    x(WebView webView) {
        super(webView, false, false);
        b.m1182(3, "WebAdTracker", this, "Initializing.");
        if (webView == null) {
            String str = "WebAdTracker initialization not successful, WebView is null";
            b.m1182(3, "WebAdTracker", this, str);
            b.m1180("[ERROR] ", str);
            this.f1088 = new o("WebView is null");
            return;
        }
        try {
            super.m1192(webView);
            b.m1180("[SUCCESS] ", "WebAdTracker created for " + m1189());
        } catch (o e) {
            this.f1088 = e;
        }
    }
}
