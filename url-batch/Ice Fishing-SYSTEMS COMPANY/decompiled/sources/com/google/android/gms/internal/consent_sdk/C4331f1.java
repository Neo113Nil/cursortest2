package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4331f1 extends AbstractC4368o2 {
    private static final C4331f1 zzb;
    private int zzd;
    private C4327e1 zze;
    private C4315b1 zzf;

    static {
        C4331f1 c4331f1 = new C4331f1();
        zzb = c4331f1;
        AbstractC4368o2.l(C4331f1.class, c4331f1);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new C4331f1();
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
