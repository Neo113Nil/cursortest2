package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ej3 extends aq3<ej3, dj3> implements lr3 {
    private static final ej3 zzb;

    static {
        ej3 ej3Var = new ej3();
        zzb = ej3Var;
        aq3.v(ej3.class, ej3Var);
    }

    private ej3() {
    }

    public static ej3 G() {
        return zzb;
    }

    public static ej3 H(uo3 uo3Var, mp3 mp3Var) {
        return (ej3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        cj3 cj3Var = null;
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0000", null);
        }
        if (i8 == 3) {
            return new ej3();
        }
        if (i8 == 4) {
            return new dj3(cj3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
