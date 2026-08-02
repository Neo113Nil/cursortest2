package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public class w7 extends com.startapp.sdk.adsbase.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(Context context, m8 ad, AdEventListener adEventListener, ib networkApiExecutor, ib eventTracer, ib webViewCacheLoader, String adm) {
        super(ad, networkApiExecutor, context, adEventListener, adm);
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(ad, "ad");
        kotlin.jvm.internal.j.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.j.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.j.e(webViewCacheLoader, "webViewCacheLoader");
        kotlin.jvm.internal.j.e(adm, "adm");
    }

    @Override // com.startapp.sdk.adsbase.d
    public Object a(String adm) {
        kotlin.jvm.internal.j.e(adm, "adm");
        try {
            Ad ad = this.f3318a;
            kotlin.jvm.internal.j.c(ad, "null cannot be cast to non-null type com.startapp.sdk.adsbase.HtmlAd");
            m8 m8Var = (m8) ad;
            m8Var.d(adm);
            t0.a(m8Var.f4130b, 0);
            return m8Var;
        } catch (Throwable unused) {
            return null;
        }
    }
}
