package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbce extends zzgwm implements zzgxx {
    private static final zzbce zzb;
    private int zzd;
    private int zze = 1000;
    private zzbbw zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        zzbce zzbceVar = new zzbce();
        zzb = zzbceVar;
        zzgwm.zzaU(zzbce.class, zzbceVar);
    }

    private zzbce() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", zzbac.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzbce();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbcd(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
