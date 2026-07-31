package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class k2 extends j2 {
    public k2(q2 q2Var) {
        super(q2Var);
    }

    @Override // com.startapp.sdk.internal.j2
    public final boolean a() {
        qg qgVar = pg.f382a;
        return (qgVar.c || qgVar.d) ? false : true;
    }

    @Override // com.startapp.sdk.internal.j2
    public final long b() {
        com.startapp.sdk.adsbase.f fVar = this.f283a.o;
        if (fVar == null) {
            return -1L;
        }
        Long adCacheTtl = fVar.getAdCacheTtl();
        Long lastLoadTime = fVar.getLastLoadTime();
        if (adCacheTtl == null || lastLoadTime == null) {
            return -1L;
        }
        long longValue = adCacheTtl.longValue() - (System.currentTimeMillis() - lastLoadTime.longValue());
        if (longValue >= 0) {
            return longValue;
        }
        return 0L;
    }
}
