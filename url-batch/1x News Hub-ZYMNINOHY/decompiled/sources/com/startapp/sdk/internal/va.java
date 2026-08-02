package com.startapp.sdk.internal;

import android.net.Uri;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class va extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f4607a;

    public va(wa waVar) {
        this.f4607a = waVar;
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean a(String str) {
        return !this.f4607a.f4676B && str.contains("index=");
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean b(WebView webView, String str) {
        wa waVar = this.f4607a;
        waVar.getClass();
        if (si.c(webView.getContext(), str)) {
            return true;
        }
        if (!waVar.f4689y) {
            d9 d9Var = new d9(e9.f3725e);
            d9Var.f3680d = "fake_click";
            d9Var.f3682g = waVar.a();
            d9Var.f3681e = "jsTag=" + waVar.f4676B;
            d9Var.a();
        }
        if (waVar.f4676B && !waVar.f4689y) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"startappad".equals(parse.getScheme())) {
            return waVar.a(str, false);
        }
        if (parse.getHost() != null) {
            waVar.a(parse.getHost());
        }
        return true;
    }

    @Override // com.startapp.sdk.internal.x0
    public final void a(WebView webView, String str) {
        wa waVar = this.f4607a;
        si.a(waVar.f4685t, true, "gClientInterface.onPageFinished", Boolean.FALSE);
        si.a(waVar.f4685t, true, "gClientInterface.setMode", waVar.f4523g);
        si.a(waVar.f4685t, true, "enableScheme", "externalLinks");
        waVar.q();
    }
}
