package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zt extends aq3<zt, yt> implements lr3 {
    private static final zt zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zt ztVar = new zt();
        zzb = ztVar;
        aq3.v(zt.class, ztVar);
    }

    private zt() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new zt();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new yt(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
