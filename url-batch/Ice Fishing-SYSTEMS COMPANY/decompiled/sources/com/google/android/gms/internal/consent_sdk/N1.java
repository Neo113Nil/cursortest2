package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class N1 extends AbstractC4368o2 {
    private static final N1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        N1 n1 = new N1();
        zzb = n1;
        AbstractC4368o2.l(N1.class, n1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", J1.J, "zzi", J1.f35711v, H1.class, I1.class, M1.class, K1.class, L1.class});
        }
        if (i4 == 3) {
            return new N1();
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
