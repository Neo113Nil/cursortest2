package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class U1 extends AbstractC4368o2 {
    private static final U1 zzb;
    private int zzd;
    private String zze = "";

    static {
        U1 u12 = new U1();
        zzb = u12;
        AbstractC4368o2.l(U1.class, u12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new U1();
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
