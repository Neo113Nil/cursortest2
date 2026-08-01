package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhaw extends zzgwm implements zzgxx {
    private static final zzhaw zzb;
    private int zzd;
    private zzhav zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        zzhaw zzhawVar = new zzhaw();
        zzb = zzhawVar;
        zzgwm.zzaU(zzhaw.class, zzhawVar);
    }

    private zzhaw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzhaw();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhat(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
