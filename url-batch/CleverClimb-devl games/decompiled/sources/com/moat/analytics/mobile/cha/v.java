package com.moat.analytics.mobile.cha;

import android.view.ViewGroup;
import android.webkit.WebView;

/* loaded from: classes2.dex */
final class v extends d implements WebAdTracker {
    @Override // com.moat.analytics.mobile.cha.d
    /* renamed from: ˋ */
    final String mo1024() {
        return "WebAdTracker";
    }

    v(ViewGroup viewGroup) {
        this(x.m1165(viewGroup, false).orElse(null));
        if (viewGroup == null) {
            String str = "WebAdTracker initialization not successful, Target ViewGroup is null";
            a.m994(3, "WebAdTracker", this, str);
            a.m991("[ERROR] ", str);
            this.f879 = new o("Target ViewGroup is null");
        }
        if (this.f877 == null) {
            String str2 = "WebAdTracker initialization not successful, No WebView to track inside of ad container";
            a.m994(3, "WebAdTracker", this, str2);
            a.m991("[ERROR] ", str2);
            this.f879 = new o("No WebView to track inside of ad container");
        }
    }

    v(WebView webView) {
        super(webView, false, false);
        a.m994(3, "WebAdTracker", this, "Initializing.");
        if (webView == null) {
            String str = "WebAdTracker initialization not successful, WebView is null";
            a.m994(3, "WebAdTracker", this, str);
            a.m991("[ERROR] ", str);
            this.f879 = new o("WebView is null");
            return;
        }
        try {
            super.m1027(webView);
            a.m991("[SUCCESS] ", "WebAdTracker created for " + m1020());
        } catch (o e) {
            this.f879 = e;
        }
    }
}
