package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qj3 extends aq3<qj3, pj3> implements lr3 {
    private static final qj3 zzb;
    private zj3 zze;
    private kj3 zzf;
    private int zzg;

    static {
        qj3 qj3Var = new qj3();
        zzb = qj3Var;
        aq3.v(qj3.class, qj3Var);
    }

    private qj3() {
    }

    public static pj3 G() {
        return zzb.x();
    }

    public static qj3 I() {
        return zzb;
    }

    static /* synthetic */ void K(qj3 qj3Var, zj3 zj3Var) {
        zj3Var.getClass();
        qj3Var.zze = zj3Var;
    }

    static /* synthetic */ void L(qj3 qj3Var, kj3 kj3Var) {
        kj3Var.getClass();
        qj3Var.zzf = kj3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new qj3();
        }
        oj3 oj3Var = null;
        if (i8 == 4) {
            return new pj3(oj3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final kj3 F() {
        kj3 kj3Var = this.zzf;
        return kj3Var == null ? kj3.H() : kj3Var;
    }

    public final zj3 J() {
        zj3 zj3Var = this.zze;
        return zj3Var == null ? zj3.H() : zj3Var;
    }

    public final int M() {
        int i7 = this.zzg;
        int i8 = 3;
        if (i7 == 0) {
            i8 = 2;
        } else if (i7 != 1) {
            i8 = i7 != 2 ? i7 != 3 ? 0 : 5 : 4;
        }
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }
}
