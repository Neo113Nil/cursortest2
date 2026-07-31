package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nk3 extends aq3<nk3, mk3> implements lr3 {
    private static final nk3 zzb;
    private int zze;
    private int zzf;

    static {
        nk3 nk3Var = new nk3();
        zzb = nk3Var;
        aq3.v(nk3.class, nk3Var);
    }

    private nk3() {
    }

    public static mk3 G() {
        return zzb.x();
    }

    public static nk3 I() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new nk3();
        }
        lk3 lk3Var = null;
        if (i8 == 4) {
            return new mk3(lk3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zzf;
    }

    public final int K() {
        int b7 = dk3.b(this.zze);
        if (b7 == 0) {
            return 1;
        }
        return b7;
    }
}
