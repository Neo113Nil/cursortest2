package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class H1 extends AbstractC4368o2 {
    private static final H1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        H1 h12 = new H1();
        zzb = h12;
        AbstractC4368o2.l(H1.class, h12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", S.f35751C, "zzf", O2.f35747a, "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new H1();
        }
        if (i4 == 4) {
            return new C4382s1(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
