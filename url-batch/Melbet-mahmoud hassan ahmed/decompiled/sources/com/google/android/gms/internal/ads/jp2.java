package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class jp2 implements kv3<ep2<ms1, hs1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f7204a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<pt2> f7205b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<iu2> f7206c;

    public jp2(yv3<Context> yv3Var, yv3<pt2> yv3Var2, yv3<iu2> yv3Var3) {
        this.f7204a = yv3Var;
        this.f7205b = yv3Var2;
        this.f7206c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ep2<ms1, hs1> a() {
        Context a7 = this.f7204a.a();
        pt2 a8 = this.f7205b.a();
        iu2 a9 = this.f7206c.a();
        on0 e7 = ((Boolean) sw.c().b(m10.M4)).booleanValue() ? y2.t.p().h().e() : y2.t.p().h().f();
        boolean z6 = false;
        if (e7 != null && e7.h()) {
            z6 = true;
        }
        if (((Integer) sw.c().b(m10.O4)).intValue() > 0) {
            if (!((Boolean) sw.c().b(m10.L4)).booleanValue() || z6) {
                hu2 a10 = a9.a(xt2.Rewarded, a7, a8, new ho2(new eo2()));
                to2 to2Var = new to2(new so2());
                tt2 tt2Var = a10.f6424a;
                dc3 dc3Var = wo0.f13894a;
                return new jo2(to2Var, new po2(tt2Var, dc3Var), a10.f6425b, a10.f6424a.zza().f2974m, dc3Var);
            }
        }
        return new so2();
    }
}
