package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bm3 extends aq3<bm3, am3> implements lr3 {
    private static final bm3 zzb;
    private int zze;
    private uo3 zzf = uo3.f12885g;

    static {
        bm3 bm3Var = new bm3();
        zzb = bm3Var;
        aq3.v(bm3.class, bm3Var);
    }

    private bm3() {
    }

    public static am3 G() {
        return zzb.x();
    }

    public static bm3 I(uo3 uo3Var, mp3 mp3Var) {
        return (bm3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new bm3();
        }
        zl3 zl3Var = null;
        if (i8 == 4) {
            return new am3(zl3Var);
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
