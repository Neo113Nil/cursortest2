package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class x1 extends AbstractC0353w0 {
    private static final x1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private o1 zzg;
    private p1 zzh;

    static {
        x1 x1Var = new x1();
        zzb = x1Var;
        AbstractC0353w0.k(x1.class, x1Var);
    }

    public static /* synthetic */ void n(x1 x1Var, C0315f1 c0315f1) {
        x1Var.zzf = c0315f1;
        x1Var.zze = 2;
    }

    public static /* synthetic */ void o(x1 x1Var, C0321h1 c0321h1) {
        x1Var.zzf = c0321h1;
        x1Var.zze = 3;
    }

    public static /* synthetic */ void p(x1 x1Var, C0330k1 c0330k1) {
        c0330k1.getClass();
        x1Var.zzf = c0330k1;
        x1Var.zze = 7;
    }

    public static /* synthetic */ void q(x1 x1Var, o1 o1Var) {
        o1Var.getClass();
        x1Var.zzg = o1Var;
        x1Var.zzd |= 1;
    }

    public static /* synthetic */ void r(x1 x1Var, A1 a12) {
        x1Var.zzf = a12;
        x1Var.zze = 8;
    }

    public static /* synthetic */ void s(x1 x1Var, B1 b12) {
        x1Var.zzf = b12;
        x1Var.zze = 4;
    }

    public static w1 t() {
        return (w1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C0315f1.class, C0321h1.class, B1.class, m1.class, "zzh", C0330k1.class, A1.class});
        }
        if (i5 == 3) {
            return new x1();
        }
        if (i5 == 4) {
            return new w1(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
