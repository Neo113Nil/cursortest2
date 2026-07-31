package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gs extends aq3<gs, fs> implements lr3 {
    private static final gs zzb;
    private int zze;
    private int zzf;
    private zt zzg;
    private zt zzh;
    private zt zzi;
    private jq3<zt> zzj = aq3.r();
    private int zzk;

    static {
        gs gsVar = new gs();
        zzb = gsVar;
        aq3.v(gs.class, gsVar);
    }

    private gs() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zt.class, "zzk"});
        }
        if (i8 == 3) {
            return new gs();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new fs(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
