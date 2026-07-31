package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gh3 extends aq3<gh3, fh3> implements lr3 {
    private static final gh3 zzb;
    private int zze;

    static {
        gh3 gh3Var = new gh3();
        zzb = gh3Var;
        aq3.v(gh3.class, gh3Var);
    }

    private gh3() {
    }

    public static fh3 G() {
        return zzb.x();
    }

    public static gh3 I() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i8 == 3) {
            return new gh3();
        }
        eh3 eh3Var = null;
        if (i8 == 4) {
            return new fh3(eh3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }
}
