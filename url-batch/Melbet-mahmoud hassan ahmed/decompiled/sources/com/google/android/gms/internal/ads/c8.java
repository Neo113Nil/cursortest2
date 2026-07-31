package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c8 extends aq3<c8, b8> implements lr3 {
    private static final c8 zzb;
    private int zze;
    private e8 zzf;
    private h8 zzg;

    static {
        c8 c8Var = new c8();
        zzb = c8Var;
        aq3.v(c8.class, c8Var);
    }

    private c8() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new c8();
        }
        a8 a8Var = null;
        if (i8 == 4) {
            return new b8(a8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
