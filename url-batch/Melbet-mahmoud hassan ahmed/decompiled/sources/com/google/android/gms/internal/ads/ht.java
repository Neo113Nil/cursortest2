package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ht extends aq3<ht, gt> implements lr3 {
    private static final ht zzb;
    private int zze;
    private int zzf;
    private zt zzg;

    static {
        ht htVar = new ht();
        zzb = htVar;
        aq3.v(ht.class, htVar);
    }

    private ht() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", ns.f9273a, "zzg"});
        }
        if (i8 == 3) {
            return new ht();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new gt(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
