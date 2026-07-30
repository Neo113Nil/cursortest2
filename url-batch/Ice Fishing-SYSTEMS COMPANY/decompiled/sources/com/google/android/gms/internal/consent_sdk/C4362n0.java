package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4362n0 extends AbstractC4368o2 {
    private static final C4362n0 zzb;
    private int zzd;
    private int zze;

    static {
        C4362n0 c4362n0 = new C4362n0();
        zzb = c4362n0;
        AbstractC4368o2.l(C4362n0.class, c4362n0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", S.f35757f});
        }
        if (i4 == 3) {
            return new C4362n0();
        }
        if (i4 == 4) {
            return new T(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
