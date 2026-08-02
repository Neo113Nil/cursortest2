package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public class w7 extends com.startapp.sdk.adsbase.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(Context context, m8 ad, AdEventListener adEventListener, ib networkApiExecutor, ib eventTracer, ib webViewCacheLoader, String adm) {
        super(ad, networkApiExecutor, context, adEventListener, adm);
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(ad, "ad");
        kotlin.jvm.internal.i.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.i.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.i.e(webViewCacheLoader, "webViewCacheLoader");
        kotlin.jvm.internal.i.e(adm, "adm");
    }

    @Override // com.startapp.sdk.adsbase.d
    public Object a(String adm) {
        kotlin.jvm.internal.i.e(adm, "adm");
        try {
            Ad ad = this.f6408a;
            kotlin.jvm.internal.i.c(ad, "null cannot be cast to non-null type com.startapp.sdk.adsbase.HtmlAd");
            m8 m8Var = (m8) ad;
            m8Var.d(adm);
            t0.a(m8Var.f7258b, 0);
            return m8Var;
        } catch (Throwable unused) {
            return null;
        }
    }
}
