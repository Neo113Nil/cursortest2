package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tu extends aq3<tu, su> implements lr3 {
    private static final tu zzb;
    private int zze;
    private int zzf = 1000;
    private ju zzg;
    private zt zzh;

    static {
        tu tuVar = new tu();
        zzb = tuVar;
        aq3.v(tu.class, tuVar);
    }

    private tu() {
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
            return new tu();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new su(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
