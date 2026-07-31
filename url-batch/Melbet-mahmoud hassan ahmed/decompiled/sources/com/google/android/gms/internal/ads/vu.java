package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vu extends aq3<vu, uu> implements lr3 {
    private static final vu zzb;
    private int zze;
    private int zzf = 1000;
    private ju zzg;

    static {
        vu vuVar = new vu();
        zzb = vuVar;
        aq3.v(vu.class, vuVar);
    }

    private vu() {
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
            return new vu();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new uu(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
