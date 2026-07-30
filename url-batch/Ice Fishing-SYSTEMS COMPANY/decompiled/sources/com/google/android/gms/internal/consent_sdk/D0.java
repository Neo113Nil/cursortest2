package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class D0 extends AbstractC4368o2 {
    private static final D0 zzb;

    static {
        D0 d02 = new D0();
        zzb = d02;
        AbstractC4368o2.l(D0.class, d02);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0000", null);
        }
        if (i4 == 3) {
            return new D0();
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
