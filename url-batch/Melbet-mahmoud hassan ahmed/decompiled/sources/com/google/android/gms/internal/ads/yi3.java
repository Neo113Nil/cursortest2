package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yi3 extends aq3<yi3, xi3> implements lr3 {
    private static final yi3 zzb;
    private int zze;
    private int zzf;

    static {
        yi3 yi3Var = new yi3();
        zzb = yi3Var;
        aq3.v(yi3.class, yi3Var);
    }

    private yi3() {
    }

    public static xi3 G() {
        return zzb.x();
    }

    public static yi3 I(uo3 uo3Var, mp3 mp3Var) {
        return (yi3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new yi3();
        }
        wi3 wi3Var = null;
        if (i8 == 4) {
            return new xi3(wi3Var);
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
