package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class gp2 {
    static ep2<h41, m41> a(Context context, pt2 pt2Var, iu2 iu2Var) {
        return c(context, pt2Var, iu2Var);
    }

    static ep2<v31, c41> b(Context context, pt2 pt2Var, iu2 iu2Var) {
        return c(context, pt2Var, iu2Var);
    }

    private static <AppOpenAdRequestComponent extends ea1<AppOpenAd>, AppOpenAd extends v61> ep2<AppOpenAdRequestComponent, AppOpenAd> c(Context context, pt2 pt2Var, iu2 iu2Var) {
        on0 e7 = ((Boolean) sw.c().b(m10.M4)).booleanValue() ? y2.t.p().h().e() : y2.t.p().h().f();
        boolean z6 = false;
        if (e7 != null && e7.h()) {
            z6 = true;
        }
        if (((Integer) sw.c().b(m10.f8174c5)).intValue() > 0) {
            if (!((Boolean) sw.c().b(m10.L4)).booleanValue() || z6) {
                hu2 a7 = iu2Var.a(xt2.AppOpen, context, pt2Var, new ho2(new eo2()));
                to2 to2Var = new to2(new so2());
                tt2 tt2Var = a7.f6424a;
                dc3 dc3Var = wo0.f13894a;
                return new jo2(to2Var, new po2(tt2Var, dc3Var), a7.f6425b, a7.f6424a.zza().f2974m, dc3Var);
            }
        }
        return new so2();
    }
}
