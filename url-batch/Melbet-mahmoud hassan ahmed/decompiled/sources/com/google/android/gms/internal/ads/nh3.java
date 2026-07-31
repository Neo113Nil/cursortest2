package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nh3 extends aq3<nh3, mh3> implements lr3 {
    private static final nh3 zzb;
    private th3 zze;
    private jk3 zzf;

    static {
        nh3 nh3Var = new nh3();
        zzb = nh3Var;
        aq3.v(nh3.class, nh3Var);
    }

    private nh3() {
    }

    public static mh3 F() {
        return zzb.x();
    }

    public static nh3 H(uo3 uo3Var, mp3 mp3Var) {
        return (nh3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void K(nh3 nh3Var, th3 th3Var) {
        th3Var.getClass();
        nh3Var.zze = th3Var;
    }

    static /* synthetic */ void L(nh3 nh3Var, jk3 jk3Var) {
        jk3Var.getClass();
        nh3Var.zzf = jk3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new nh3();
        }
        lh3 lh3Var = null;
        if (i8 == 4) {
            return new mh3(lh3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final th3 I() {
        th3 th3Var = this.zze;
        return th3Var == null ? th3.I() : th3Var;
    }

    public final jk3 J() {
        jk3 jk3Var = this.zzf;
        return jk3Var == null ? jk3.I() : jk3Var;
    }
}
