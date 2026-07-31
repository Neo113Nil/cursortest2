package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c9 extends aq3<c9, b9> implements lr3 {
    private static final c9 zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private fq3 zzi = aq3.o();
    private long zzj;

    static {
        c9 c9Var = new c9();
        zzb = c9Var;
        aq3.v(c9.class, c9Var);
    }

    private c9() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new c9();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new b9(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
