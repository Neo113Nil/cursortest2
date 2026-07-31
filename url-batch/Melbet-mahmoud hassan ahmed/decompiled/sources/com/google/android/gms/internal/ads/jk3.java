package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jk3 extends aq3<jk3, ik3> implements lr3 {
    private static final jk3 zzb;
    private nk3 zze;
    private int zzf;
    private int zzg;

    static {
        jk3 jk3Var = new jk3();
        zzb = jk3Var;
        aq3.v(jk3.class, jk3Var);
    }

    private jk3() {
    }

    public static ik3 G() {
        return zzb.x();
    }

    public static jk3 I() {
        return zzb;
    }

    public static jk3 J(uo3 uo3Var, mp3 mp3Var) {
        return (jk3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void L(jk3 jk3Var, nk3 nk3Var) {
        nk3Var.getClass();
        jk3Var.zze = nk3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new jk3();
        }
        hk3 hk3Var = null;
        if (i8 == 4) {
            return new ik3(hk3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zzf;
    }

    public final nk3 K() {
        nk3 nk3Var = this.zze;
        return nk3Var == null ? nk3.I() : nk3Var;
    }
}
