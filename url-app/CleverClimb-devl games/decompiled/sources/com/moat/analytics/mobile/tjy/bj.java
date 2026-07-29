package com.moat.analytics.mobile.tjy;

import android.util.Log;
import android.webkit.WebView;

/* loaded from: classes2.dex */
class bj implements WebAdTracker {

    /* renamed from: a, reason: collision with root package name */
    private final com.moat.analytics.mobile.tjy.base.functional.a f7269a;

    /* renamed from: b, reason: collision with root package name */
    private final ap f7270b;

    bj(WebView webView, a aVar, ap apVar) {
        com.moat.analytics.mobile.tjy.base.functional.a a2;
        this.f7270b = apVar;
        if (apVar.b()) {
            Log.d("MoatWebAdTracker", "In initialization method.");
        }
        if (webView == null) {
            if (apVar.b()) {
                Log.e("MoatWebAdTracker", "WebView is null. Will not track.");
            }
            a2 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        } else {
            a2 = com.moat.analytics.mobile.tjy.base.functional.a.a(new bi(webView, webView, false, aVar, apVar));
        }
        this.f7269a = a2;
    }

    @Override // com.moat.analytics.mobile.tjy.WebAdTracker
    public boolean track() {
        boolean b2 = this.f7270b.b();
        boolean z = false;
        if (b2) {
            try {
                Log.d("MoatWebAdTracker", "In track method.");
            } catch (com.moat.analytics.mobile.tjy.base.exception.b e) {
                com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            }
        }
        if (this.f7269a.c()) {
            z = ((bh) this.f7269a.b()).c();
        } else if (b2) {
            Log.e("MoatWebAdTracker", "Internal tracker not available. Not tracking.");
        }
        if (b2) {
            StringBuilder sb = new StringBuilder("Attempt to start tracking ad was ");
            sb.append(z ? "" : "un");
            sb.append("successful.");
            Log.d("MoatWebAdTracker", sb.toString());
        }
        return z;
    }
}
