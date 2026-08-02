package com.startapp.sdk.internal;

import android.net.Uri;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class va extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f7749a;

    public va(wa waVar) {
        this.f7749a = waVar;
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean a(String str) {
        return !this.f7749a.f7821B && str.contains("index=");
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean b(WebView webView, String str) {
        wa waVar = this.f7749a;
        waVar.getClass();
        if (si.c(webView.getContext(), str)) {
            return true;
        }
        if (!waVar.f7834y) {
            d9 d9Var = new d9(e9.f6839e);
            d9Var.f6792d = "fake_click";
            d9Var.f6795g = waVar.a();
            d9Var.f6793e = "jsTag=" + waVar.f7821B;
            d9Var.a();
        }
        if (waVar.f7821B && !waVar.f7834y) {
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
        wa waVar = this.f7749a;
        si.a(waVar.f7830t, true, "gClientInterface.onPageFinished", Boolean.FALSE);
        si.a(waVar.f7830t, true, "gClientInterface.setMode", waVar.f7664g);
        si.a(waVar.f7830t, true, "enableScheme", "externalLinks");
        waVar.q();
    }
}
