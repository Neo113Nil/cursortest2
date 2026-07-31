package com.startapp.sdk.internal;

import android.webkit.WebView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class xj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f502a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ yj c;

    public xj(yj yjVar, String str, WebView webView) {
        this.c = yjVar;
        this.f502a = str;
        this.b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.g = this.f502a;
        this.b.setWebViewClient(new tj());
        yj yjVar = this.c;
        WebView webView = this.b;
        yjVar.getClass();
        try {
            yjVar.f.addLast(webView);
        } catch (Throwable th) {
            if (yjVar.a(4)) {
                n8.a(th);
            }
        }
    }
}
