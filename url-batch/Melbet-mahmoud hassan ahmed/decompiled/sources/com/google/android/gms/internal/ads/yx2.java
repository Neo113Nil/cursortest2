package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yx2 extends aq3<yx2, vx2> implements lr3 {
    private static final yx2 zzb;
    private jq3<xx2> zze = aq3.r();

    static {
        yx2 yx2Var = new yx2();
        zzb = yx2Var;
        aq3.v(yx2.class, yx2Var);
    }

    private yx2() {
    }

    public static vx2 G() {
        return zzb.x();
    }

    static /* synthetic */ void J(yx2 yx2Var, xx2 xx2Var) {
        xx2Var.getClass();
        jq3<xx2> jq3Var = yx2Var.zze;
        if (!jq3Var.c()) {
            yx2Var.zze = aq3.s(jq3Var);
        }
        yx2Var.zze.add(xx2Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", xx2.class});
        }
        if (i8 == 3) {
            return new yx2();
        }
        ux2 ux2Var = null;
        if (i8 == 4) {
            return new vx2(ux2Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze.size();
    }
}
