package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class m1 extends AbstractC0353w0 {
    private static final m1 zzb;
    private int zzd;
    private int zzf;
    private C0327j1 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private InterfaceC0359z0 zzg = C0355x0.f6030e;
    private A0 zzh = Q0.f5901e;

    static {
        m1 m1Var = new m1();
        zzb = m1Var;
        AbstractC0353w0.k(m1.class, m1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", C0317g0.f5950f, "zzg", C0317g0.f5949e, "zzh", y1.class, "zzi", "zzj", "zzk"});
        }
        if (i5 == 3) {
            return new m1();
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
