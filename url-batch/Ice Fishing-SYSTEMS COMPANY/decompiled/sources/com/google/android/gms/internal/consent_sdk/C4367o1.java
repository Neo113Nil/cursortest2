package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4367o1 extends AbstractC4368o2 {
    private static final C4367o1 zzb;
    private InterfaceC4376q2 zzd = C4372p2.f35896x;

    static {
        C4367o1 c4367o1 = new C4367o1();
        zzb = c4367o1;
        AbstractC4368o2.l(C4367o1.class, c4367o1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", S.f35749A});
        }
        if (i4 == 3) {
            return new C4367o1();
        }
        if (i4 == 4) {
            return new H0(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
