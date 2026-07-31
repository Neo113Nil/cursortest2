package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gu extends aq3<gu, eu> implements lr3 {
    private static final gu zzb;
    private int zze;
    private int zzf = 1000;
    private ju zzg;
    private zt zzh;

    static {
        gu guVar = new gu();
        zzb = guVar;
        aq3.v(gu.class, guVar);
    }

    private gu() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", ns.f9273a, "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new gu();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new eu(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
