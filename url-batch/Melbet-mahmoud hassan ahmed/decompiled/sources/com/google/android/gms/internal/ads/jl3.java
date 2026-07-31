package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jl3 extends aq3<jl3, il3> implements lr3 {
    private static final jl3 zzb;
    private int zze;
    private nl3 zzf;

    static {
        jl3 jl3Var = new jl3();
        zzb = jl3Var;
        aq3.v(jl3.class, jl3Var);
    }

    private jl3() {
    }

    public static il3 G() {
        return zzb.x();
    }

    public static jl3 I(uo3 uo3Var, mp3 mp3Var) {
        return (jl3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void L(jl3 jl3Var, nl3 nl3Var) {
        nl3Var.getClass();
        jl3Var.zzf = nl3Var;
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
            return new jl3();
        }
        hl3 hl3Var = null;
        if (i8 == 4) {
            return new il3(hl3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final nl3 J() {
        nl3 nl3Var = this.zzf;
        return nl3Var == null ? nl3.G() : nl3Var;
    }
}
