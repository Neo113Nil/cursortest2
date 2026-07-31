package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ci3 extends aq3<ci3, bi3> implements lr3 {
    private static final ci3 zzb;
    private fi3 zze;
    private int zzf;

    static {
        ci3 ci3Var = new ci3();
        zzb = ci3Var;
        aq3.v(ci3.class, ci3Var);
    }

    private ci3() {
    }

    public static bi3 G() {
        return zzb.x();
    }

    public static ci3 I(uo3 uo3Var, mp3 mp3Var) {
        return (ci3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void K(ci3 ci3Var, fi3 fi3Var) {
        fi3Var.getClass();
        ci3Var.zze = fi3Var;
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
            return new ci3();
        }
        ai3 ai3Var = null;
        if (i8 == 4) {
            return new bi3(ai3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zzf;
    }

    public final fi3 J() {
        fi3 fi3Var = this.zze;
        return fi3Var == null ? fi3.I() : fi3Var;
    }
}
