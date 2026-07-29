package com.moat.analytics.mobile.tjy;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class ae extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f7220a;

    ae(ad adVar) {
        this.f7220a = adVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        boolean z;
        WeakReference weakReference;
        WebView webView2;
        z = this.f7220a.i;
        if (z) {
            return;
        }
        try {
            this.f7220a.i = true;
            ad adVar = this.f7220a;
            weakReference = this.f7220a.g;
            View view = (View) weakReference.get();
            webView2 = this.f7220a.h;
            adVar.f7218c = new bi(view, webView2, true, this.f7220a.f7216a, this.f7220a.f7217b);
            this.f7220a.f7218c.c();
            this.f7220a.a();
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
