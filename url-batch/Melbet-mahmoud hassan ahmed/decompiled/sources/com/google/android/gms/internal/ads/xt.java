package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xt extends aq3<xt, wt> implements lr3 {
    private static final xt zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private zt zzh;

    static {
        xt xtVar = new xt();
        zzb = xtVar;
        aq3.v(xt.class, xtVar);
    }

    private xt() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", ns.f9273a, "zzh"});
        }
        if (i8 == 3) {
            return new xt();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new wt(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
