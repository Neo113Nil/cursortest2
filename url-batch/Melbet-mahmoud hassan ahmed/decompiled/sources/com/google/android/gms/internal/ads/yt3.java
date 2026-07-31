package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yt3 extends aq3<yt3, xt3> implements lr3 {
    private static final yt3 zzb;
    private int zze;
    private uo3 zzf;
    private uo3 zzg;
    private uo3 zzh;

    static {
        yt3 yt3Var = new yt3();
        zzb = yt3Var;
        aq3.v(yt3.class, yt3Var);
    }

    private yt3() {
        uo3 uo3Var = uo3.f12885g;
        this.zzf = uo3Var;
        this.zzg = uo3Var;
        this.zzh = uo3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new yt3();
        }
        ot3 ot3Var = null;
        if (i8 == 4) {
            return new xt3(ot3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
