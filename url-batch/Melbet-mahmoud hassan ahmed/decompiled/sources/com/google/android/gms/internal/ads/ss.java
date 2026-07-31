package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ss extends aq3<ss, rs> implements lr3 {
    private static final ss zzb;
    private int zze;
    private int zzg;
    private zt zzi;
    private String zzf = "";
    private fq3 zzh = aq3.o();

    static {
        ss ssVar = new ss();
        zzb = ssVar;
        aq3.v(ss.class, ssVar);
    }

    private ss() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", ns.f9273a, "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new ss();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new rs(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
