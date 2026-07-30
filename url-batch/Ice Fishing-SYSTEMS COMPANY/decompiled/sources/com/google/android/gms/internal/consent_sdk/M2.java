package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class M2 extends AbstractC4368o2 {
    private static final M2 zzb;
    private long zzd;
    private int zze;

    static {
        M2 m22 = new M2();
        zzb = m22;
        AbstractC4368o2.l(M2.class, m22);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new M2();
        }
        if (i4 == 4) {
            return new C4312a2(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
