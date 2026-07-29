package com.moat.analytics.mobile.vng;

import android.webkit.WebView;

/* loaded from: classes2.dex */
class aa extends b implements WebAdTracker {
    aa(WebView webView) {
        super(webView, false, false);
        p.a(3, "WebAdTracker", this, "In initialization method.");
        super.a(webView);
        p.a("[SUCCESS] ", a() + " created for " + e());
    }

    @Override // com.moat.analytics.mobile.vng.b
    String a() {
        return "WebAdTracker";
    }
}
