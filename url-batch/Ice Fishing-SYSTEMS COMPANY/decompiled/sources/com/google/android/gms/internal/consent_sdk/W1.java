package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class W1 extends AbstractC4368o2 {
    private static final W1 zzb;
    private int zzd;
    private InterfaceC4379r2 zze = G2.f35682x;
    private M2 zzf;

    static {
        W1 w12 = new W1();
        zzb = w12;
        AbstractC4368o2.l(W1.class, w12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", V1.class, "zzf"});
        }
        if (i4 == 3) {
            return new W1();
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
