package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bj3 extends aq3<bj3, aj3> implements lr3 {
    private static final bj3 zzb;
    private int zze;
    private uo3 zzf = uo3.f12885g;

    static {
        bj3 bj3Var = new bj3();
        zzb = bj3Var;
        aq3.v(bj3.class, bj3Var);
    }

    private bj3() {
    }

    public static aj3 G() {
        return zzb.x();
    }

    public static bj3 I(uo3 uo3Var, mp3 mp3Var) {
        return (bj3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new bj3();
        }
        zi3 zi3Var = null;
        if (i8 == 4) {
            return new aj3(zi3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final uo3 J() {
        return this.zzf;
    }
}
