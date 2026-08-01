package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhbo extends zzgwm implements zzgxx {
    private static final zzhbo zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzhbo zzhboVar = new zzhbo();
        zzb = zzhboVar;
        zzgwm.zzaU(zzhbo.class, zzhboVar);
    }

    private zzhbo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgwq zzgwqVar = zzhbm.zza;
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzgwqVar, "zzf", "zzg", zzgwqVar});
        }
        if (i2 == 3) {
            return new zzhbo();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhbn(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
