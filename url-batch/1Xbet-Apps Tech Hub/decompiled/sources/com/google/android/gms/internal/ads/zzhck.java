package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhck extends zzgwm implements zzgxx {
    private static final zzhck zzb;
    private int zzd;
    private String zze = "";
    private zzgve zzf = zzgve.zzb;

    static {
        zzhck zzhckVar = new zzhck();
        zzb = zzhckVar;
        zzgwm.zzaU(zzhck.class, zzhckVar);
    }

    private zzhck() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzhck();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhcj(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
