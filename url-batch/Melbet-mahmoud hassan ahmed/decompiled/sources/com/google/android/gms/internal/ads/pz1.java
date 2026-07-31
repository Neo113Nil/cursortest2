package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class pz1 implements kv3<cc3<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<nw2> f10490a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f10491b;

    public pz1(yv3<nw2> yv3Var, yv3<Context> yv3Var2) {
        this.f10490a = yv3Var;
        this.f10491b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        nw2 a7 = this.f10490a.a();
        final CookieManager l7 = y2.t.r().l(this.f10491b.a());
        dw2 i7 = wv2.a(new Callable() { // from class: com.google.android.gms.internal.ads.mz1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = l7;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) sw.c().b(m10.C0));
            }
        }, gw2.WEBVIEW_COOKIE, a7).i(1L, TimeUnit.SECONDS);
        final lz1 lz1Var = new pv2() { // from class: com.google.android.gms.internal.ads.lz1
            @Override // com.google.android.gms.internal.ads.pv2
            public final Object c(Object obj) {
                return "";
            }
        };
        return i7.c(Exception.class, new xa3() { // from class: com.google.android.gms.internal.ads.yv2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return rb3.i("");
            }
        }).a();
    }
}
