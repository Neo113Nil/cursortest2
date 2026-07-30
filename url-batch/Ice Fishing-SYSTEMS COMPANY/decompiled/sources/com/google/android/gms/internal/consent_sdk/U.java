package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class U extends AbstractC4368o2 {
    private static final U zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        U u7 = new U();
        zzb = u7;
        AbstractC4368o2.l(U.class, u7);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new U();
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
