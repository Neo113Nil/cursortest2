package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xx2 extends aq3<xx2, wx2> implements lr3 {
    private static final xx2 zzb;
    private tx2 zze;

    static {
        xx2 xx2Var = new xx2();
        zzb = xx2Var;
        aq3.v(xx2.class, xx2Var);
    }

    private xx2() {
    }

    public static wx2 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(xx2 xx2Var, tx2 tx2Var) {
        tx2Var.getClass();
        xx2Var.zze = tx2Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        }
        if (i8 == 3) {
            return new xx2();
        }
        ux2 ux2Var = null;
        if (i8 == 4) {
            return new wx2(ux2Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
