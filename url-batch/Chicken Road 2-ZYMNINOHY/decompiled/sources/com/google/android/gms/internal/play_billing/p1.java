package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class p1 extends AbstractC0353w0 {
    private static final p1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        p1 p1Var = new p1();
        zzb = p1Var;
        AbstractC0353w0.k(p1.class, p1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new p1();
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
