package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nj3 extends aq3<nj3, mj3> implements lr3 {
    private static final nj3 zzb;
    private qj3 zze;

    static {
        nj3 nj3Var = new nj3();
        zzb = nj3Var;
        aq3.v(nj3.class, nj3Var);
    }

    private nj3() {
    }

    public static mj3 F() {
        return zzb.x();
    }

    public static nj3 H(uo3 uo3Var, mp3 mp3Var) {
        return (nj3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void J(nj3 nj3Var, qj3 qj3Var) {
        qj3Var.getClass();
        nj3Var.zze = qj3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i8 == 3) {
            return new nj3();
        }
        lj3 lj3Var = null;
        if (i8 == 4) {
            return new mj3(lj3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final qj3 I() {
        qj3 qj3Var = this.zze;
        return qj3Var == null ? qj3.I() : qj3Var;
    }
}
