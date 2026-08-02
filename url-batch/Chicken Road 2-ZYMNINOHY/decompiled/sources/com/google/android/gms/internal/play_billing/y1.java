package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class y1 extends AbstractC0353w0 {
    private static final y1 zzb;
    private int zzd;
    private int zzf;
    private A0 zze = Q0.f5901e;
    private String zzg = "";

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        AbstractC0353w0.k(y1.class, y1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new y1();
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
