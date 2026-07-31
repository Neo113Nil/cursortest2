package com.startapp.sdk.internal;

import android.net.Uri;
import android.webkit.WebView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ca extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da f198a;

    public ca(da daVar) {
        this.f198a = daVar;
    }

    @Override // com.startapp.sdk.internal.u0
    public final boolean a(String str) {
        return !this.f198a.B && str.contains("index=");
    }

    @Override // com.startapp.sdk.internal.u0
    public final boolean b(WebView webView, String str) {
        da daVar = this.f198a;
        if (zh.c(webView.getContext(), str)) {
            return true;
        }
        if (!daVar.y) {
            n8 n8Var = new n8(o8.e);
            n8Var.d = "fake_click";
            n8Var.g = daVar.a();
            n8Var.e = "jsTag=" + daVar.B;
            n8Var.a();
        }
        if (daVar.B && !daVar.y) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"startappad".equals(parse.getScheme())) {
            return daVar.a(str, false);
        }
        if (parse.getHost() != null) {
            daVar.a(parse.getHost());
        }
        return true;
    }

    @Override // com.startapp.sdk.internal.u0
    public final void a(WebView webView, String str) {
        da daVar = this.f198a;
        zh.a(daVar.t, true, "gClientInterface.onPageFinished", Boolean.FALSE);
        zh.a(daVar.t, true, "gClientInterface.setMode", daVar.g);
        zh.a(daVar.t, true, "enableScheme", "externalLinks");
        daVar.q();
    }
}
