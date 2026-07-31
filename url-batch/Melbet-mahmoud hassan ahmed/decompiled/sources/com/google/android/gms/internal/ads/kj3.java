package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kj3 extends aq3<kj3, ij3> implements lr3 {
    private static final kj3 zzb;
    private tk3 zze;

    static {
        kj3 kj3Var = new kj3();
        zzb = kj3Var;
        aq3.v(kj3.class, kj3Var);
    }

    private kj3() {
    }

    public static ij3 F() {
        return zzb.x();
    }

    public static kj3 H() {
        return zzb;
    }

    static /* synthetic */ void J(kj3 kj3Var, tk3 tk3Var) {
        tk3Var.getClass();
        kj3Var.zze = tk3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i8 == 3) {
            return new kj3();
        }
        hj3 hj3Var = null;
        if (i8 == 4) {
            return new ij3(hj3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final tk3 I() {
        tk3 tk3Var = this.zze;
        return tk3Var == null ? tk3.H() : tk3Var;
    }
}
