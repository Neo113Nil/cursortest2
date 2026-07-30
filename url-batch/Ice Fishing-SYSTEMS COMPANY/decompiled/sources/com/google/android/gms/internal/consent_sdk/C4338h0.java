package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4338h0 extends AbstractC4368o2 {
    private static final C4338h0 zzb;
    private int zzd;
    private C4334g0 zze;
    private C4398w1 zzf;
    private int zzg;

    static {
        C4338h0 c4338h0 = new C4338h0();
        zzb = c4338h0;
        AbstractC4368o2.l(C4338h0.class, c4338h0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003᠌\u0002\u0004ဉ\u0001", new Object[]{"zzd", "zze", "zzg", S.f35762l, "zzf"});
        }
        if (i4 == 3) {
            return new C4338h0();
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
