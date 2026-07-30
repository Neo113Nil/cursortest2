package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class O1 extends AbstractC4368o2 {
    private static final O1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        O1 o12 = new O1();
        zzb = o12;
        AbstractC4368o2.l(O1.class, o12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", J1.f35705K, "zzf", J1.f35714y});
        }
        if (i4 == 3) {
            return new O1();
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
