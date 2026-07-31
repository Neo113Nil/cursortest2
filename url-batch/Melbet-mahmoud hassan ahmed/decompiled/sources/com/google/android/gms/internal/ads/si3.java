package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class si3 extends aq3<si3, ri3> implements lr3 {
    private static final si3 zzb;
    private int zze;
    private int zzf;

    static {
        si3 si3Var = new si3();
        zzb = si3Var;
        aq3.v(si3.class, si3Var);
    }

    private si3() {
    }

    public static ri3 G() {
        return zzb.x();
    }

    public static si3 I(uo3 uo3Var, mp3 mp3Var) {
        return (si3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (i8 == 3) {
            return new si3();
        }
        qi3 qi3Var = null;
        if (i8 == 4) {
            return new ri3(qi3Var);
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
