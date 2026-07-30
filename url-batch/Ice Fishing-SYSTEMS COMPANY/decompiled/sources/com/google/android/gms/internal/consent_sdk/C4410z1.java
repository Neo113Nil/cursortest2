package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4410z1 extends AbstractC4368o2 {
    private static final C4410z1 zzb;

    static {
        C4410z1 c4410z1 = new C4410z1();
        zzb = c4410z1;
        AbstractC4368o2.l(C4410z1.class, c4410z1);
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
            return new C4410z1();
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
