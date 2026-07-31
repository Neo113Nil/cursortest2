package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class em3 extends aq3<em3, dm3> implements lr3 {
    private static final em3 zzb;
    private int zze;

    static {
        em3 em3Var = new em3();
        zzb = em3Var;
        aq3.v(em3.class, em3Var);
    }

    private em3() {
    }

    public static em3 G() {
        return zzb;
    }

    public static em3 H(uo3 uo3Var, mp3 mp3Var) {
        return (em3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i8 == 3) {
            return new em3();
        }
        cm3 cm3Var = null;
        if (i8 == 4) {
            return new dm3(cm3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
