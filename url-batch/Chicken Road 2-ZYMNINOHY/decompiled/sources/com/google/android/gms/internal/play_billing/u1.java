package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class u1 extends AbstractC0353w0 {
    private static final u1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        u1 u1Var = new u1();
        zzb = u1Var;
        AbstractC0353w0.k(u1.class, u1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C0317g0.f5952h, "zzf"});
        }
        if (i5 == 3) {
            return new u1();
        }
        if (i5 == 4) {
            return new C0302b0(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
