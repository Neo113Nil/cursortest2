package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gk3 extends aq3<gk3, fk3> implements lr3 {
    private static final gk3 zzb;
    private int zze;
    private nk3 zzf;
    private uo3 zzg = uo3.f12885g;

    static {
        gk3 gk3Var = new gk3();
        zzb = gk3Var;
        aq3.v(gk3.class, gk3Var);
    }

    private gk3() {
    }

    public static fk3 G() {
        return zzb.x();
    }

    public static gk3 I() {
        return zzb;
    }

    public static gk3 J(uo3 uo3Var, mp3 mp3Var) {
        return (gk3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void N(gk3 gk3Var, nk3 nk3Var) {
        nk3Var.getClass();
        gk3Var.zzf = nk3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new gk3();
        }
        ek3 ek3Var = null;
        if (i8 == 4) {
            return new fk3(ek3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final nk3 K() {
        nk3 nk3Var = this.zzf;
        return nk3Var == null ? nk3.I() : nk3Var;
    }

    public final uo3 L() {
        return this.zzg;
    }
}
