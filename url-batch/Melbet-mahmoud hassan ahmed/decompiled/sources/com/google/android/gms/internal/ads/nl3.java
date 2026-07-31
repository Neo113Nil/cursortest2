package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nl3 extends aq3<nl3, ml3> implements lr3 {
    private static final nl3 zzb;
    private String zze = "";

    static {
        nl3 nl3Var = new nl3();
        zzb = nl3Var;
        aq3.v(nl3.class, nl3Var);
    }

    private nl3() {
    }

    public static nl3 G() {
        return zzb;
    }

    public static nl3 H(uo3 uo3Var, mp3 mp3Var) {
        return (nl3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (i8 == 3) {
            return new nl3();
        }
        kl3 kl3Var = null;
        if (i8 == 4) {
            return new ml3(kl3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final String I() {
        return this.zze;
    }
}
