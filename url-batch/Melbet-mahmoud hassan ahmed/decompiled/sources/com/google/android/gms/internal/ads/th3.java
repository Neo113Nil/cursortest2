package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class th3 extends aq3<th3, sh3> implements lr3 {
    private static final th3 zzb;
    private wh3 zze;
    private int zzf;

    static {
        th3 th3Var = new th3();
        zzb = th3Var;
        aq3.v(th3.class, th3Var);
    }

    private th3() {
    }

    public static sh3 G() {
        return zzb.x();
    }

    public static th3 I() {
        return zzb;
    }

    public static th3 J(uo3 uo3Var, mp3 mp3Var) {
        return (th3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void L(th3 th3Var, wh3 wh3Var) {
        wh3Var.getClass();
        th3Var.zze = wh3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new th3();
        }
        rh3 rh3Var = null;
        if (i8 == 4) {
            return new sh3(rh3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zzf;
    }

    public final wh3 K() {
        wh3 wh3Var = this.zze;
        return wh3Var == null ? wh3.I() : wh3Var;
    }
}
