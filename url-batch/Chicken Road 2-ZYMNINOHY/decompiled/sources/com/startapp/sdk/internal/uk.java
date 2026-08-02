package com.startapp.sdk.internal;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class uk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f7732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vk f7733c;

    public uk(vk vkVar, String str, WebView webView) {
        this.f7733c = vkVar;
        this.f7731a = str;
        this.f7732b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7733c.f7781g = this.f7731a;
        this.f7732b.setWebViewClient(new qk());
        vk vkVar = this.f7733c;
        WebView webView = this.f7732b;
        vkVar.getClass();
        try {
            vkVar.f7780f.addLast(webView);
        } catch (Throwable th) {
            if (vkVar.a(4)) {
                d9.a(th);
            }
        }
    }
}
