package com.startapp.sdk.internal;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class uk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f4590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vk f4591c;

    public uk(vk vkVar, String str, WebView webView) {
        this.f4591c = vkVar;
        this.f4589a = str;
        this.f4590b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4591c.f4636g = this.f4589a;
        this.f4590b.setWebViewClient(new qk());
        vk vkVar = this.f4591c;
        WebView webView = this.f4590b;
        vkVar.getClass();
        try {
            vkVar.f.addLast(webView);
        } catch (Throwable th) {
            if (vkVar.a(4)) {
                d9.a(th);
            }
        }
    }
}
