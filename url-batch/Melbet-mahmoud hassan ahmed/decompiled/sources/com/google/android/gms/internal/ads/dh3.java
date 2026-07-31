package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dh3 extends aq3<dh3, ch3> implements lr3 {
    private static final dh3 zzb;
    private int zze;
    private gh3 zzf;

    static {
        dh3 dh3Var = new dh3();
        zzb = dh3Var;
        aq3.v(dh3.class, dh3Var);
    }

    private dh3() {
    }

    public static ch3 G() {
        return zzb.x();
    }

    public static dh3 I(uo3 uo3Var, mp3 mp3Var) {
        return (dh3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void L(dh3 dh3Var, gh3 gh3Var) {
        gh3Var.getClass();
        dh3Var.zzf = gh3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new dh3();
        }
        bh3 bh3Var = null;
        if (i8 == 4) {
            return new ch3(bh3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final gh3 J() {
        gh3 gh3Var = this.zzf;
        return gh3Var == null ? gh3.I() : gh3Var;
    }
}
