package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class Y1 extends AbstractC0225g1 {
    private static final Y1 zzb;
    private int zzd;
    private int zzf;
    private U1 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private InterfaceC0234j1 zzg = C0228h1.f2869e;
    private InterfaceC0237k1 zzh = B1.f2711e;

    static {
        Y1 y12 = new Y1();
        zzb = y12;
        AbstractC0225g1.k(Y1.class, y12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0225g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", R0.f, "zzg", R0.f2780e, "zzh", j2.class, "zzi", "zzj", "zzk"});
        }
        if (i4 == 3) {
            return new Y1();
        }
        if (i4 == 4) {
            return new V1(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
