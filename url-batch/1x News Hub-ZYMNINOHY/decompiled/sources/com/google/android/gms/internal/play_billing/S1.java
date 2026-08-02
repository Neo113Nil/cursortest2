package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class S1 extends AbstractC0225g1 {
    private static final S1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        S1 s12 = new S1();
        zzb = s12;
        AbstractC0225g1.k(S1.class, s12);
    }

    public static /* synthetic */ void n(S1 s12, e2 e2Var) {
        s12.zzf = e2Var;
        s12.zze = 2;
    }

    public static /* synthetic */ void o(S1 s12, o2 o2Var) {
        s12.zzf = o2Var;
        s12.zze = 3;
    }

    public static /* synthetic */ void p(S1 s12, int i3) {
        s12.zzg = i3 - 1;
        s12.zzd |= 1;
    }

    public static R1 q() {
        return (R1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0225g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", R0.f2778c, e2.class, o2.class, g2.class});
        }
        if (i4 == 3) {
            return new S1();
        }
        if (i4 == 4) {
            return new R1(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
