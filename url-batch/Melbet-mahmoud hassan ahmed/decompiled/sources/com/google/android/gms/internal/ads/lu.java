package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lu extends aq3<lu, ku> implements lr3 {
    private static final lu zzb;
    private int zze;
    private bu zzf;
    private int zzg = 1000;
    private ju zzh;
    private zt zzi;

    static {
        lu luVar = new lu();
        zzb = luVar;
        aq3.v(lu.class, luVar);
    }

    private lu() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", ns.f9273a, "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new lu();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new ku(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
