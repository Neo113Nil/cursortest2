package com.moat.analytics.mobile.you;

import android.view.ViewGroup;
import android.webkit.WebView;

/* loaded from: classes2.dex */
class aa extends b implements WebAdTracker {
    aa(ViewGroup viewGroup) {
        this(ab.a(viewGroup, false).c(null));
        if (viewGroup == null) {
            p.a("[ERROR] ", 3, "WebAdTracker", this, "WebAdTracker initialization not successful, Target ViewGroup is null");
            this.f7457a = new m("Target ViewGroup is null");
        }
        if (this.f7458b == null) {
            p.a("[ERROR] ", 3, "WebAdTracker", this, "WebAdTracker initialization not successful, No WebView to track inside of ad container");
            this.f7457a = new m("No WebView to track inside of ad container");
        }
    }

    aa(WebView webView) {
        super(webView, false, false);
        p.a(3, "WebAdTracker", this, "Initializing.");
        if (webView == null) {
            p.a("[ERROR] ", 3, "WebAdTracker", this, "WebAdTracker initialization not successful, WebView is null");
            this.f7457a = new m("WebView is null");
            return;
        }
        try {
            super.a(webView);
            p.a("[SUCCESS] ", a() + " created for " + g());
        } catch (m e) {
            this.f7457a = e;
        }
    }

    @Override // com.moat.analytics.mobile.you.b
    String a() {
        return "WebAdTracker";
    }
}
