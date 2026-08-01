package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhba extends zzgwm implements zzgxx {
    private static final zzhba zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zzhba zzhbaVar = new zzhba();
        zzb = zzhbaVar;
        zzgwm.zzaU(zzhba.class, zzhbaVar);
    }

    private zzhba() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzhaz.zza, "zzf", zzhax.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzhba();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhay(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
