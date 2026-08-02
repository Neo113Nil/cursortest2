package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class r1 extends AbstractC0353w0 {
    private static final r1 zzb;
    private int zzd;
    private int zze;

    static {
        r1 r1Var = new r1();
        zzb = r1Var;
        AbstractC0353w0.k(r1.class, r1Var);
    }

    public static /* synthetic */ void n(r1 r1Var, int i4) {
        r1Var.zze = i4 - 1;
        r1Var.zzd |= 1;
    }

    public static q1 o() {
        return (q1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C0317g0.f5951g});
        }
        if (i5 == 3) {
            return new r1();
        }
        if (i5 == 4) {
            return new q1(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
