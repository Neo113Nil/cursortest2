package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class z42 implements tg0 {

    /* renamed from: a, reason: collision with root package name */
    private final tg0 f14942a;

    /* renamed from: b, reason: collision with root package name */
    private final tg0 f14943b;

    public z42(tg0 tg0Var, tg0 tg0Var2) {
        this.f14942a = tg0Var;
        this.f14943b = tg0Var2;
    }

    private final tg0 b() {
        return ((Boolean) sw.c().b(m10.D3)).booleanValue() ? this.f14942a : this.f14943b;
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final String a(Context context) {
        return b().a(context);
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void g0(x3.a aVar) {
        b().g0(aVar);
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void h0(x3.a aVar, View view) {
        b().h0(aVar, view);
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final x3.a i0(String str, WebView webView, String str2, String str3, String str4, vg0 vg0Var, ug0 ug0Var, String str5) {
        return b().i0(str, webView, "", "javascript", str4, vg0Var, ug0Var, str5);
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final x3.a j0(String str, WebView webView, String str2, String str3, String str4, String str5, vg0 vg0Var, ug0 ug0Var, String str6) {
        return b().j0(str, webView, "", "javascript", str4, str5, vg0Var, ug0Var, str6);
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final boolean k0(Context context) {
        return b().k0(context);
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void l0(x3.a aVar, View view) {
        b().l0(aVar, view);
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void zze(x3.a aVar) {
        b().zze(aVar);
    }
}
