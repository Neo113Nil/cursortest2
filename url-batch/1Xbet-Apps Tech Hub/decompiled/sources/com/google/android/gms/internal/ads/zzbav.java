package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbav extends zzgwm implements zzgxx {
    private static final zzbav zzb;
    private int zzd;
    private int zze;
    private zzbbn zzf;

    static {
        zzbav zzbavVar = new zzbav();
        zzb = zzbavVar;
        zzgwm.zzaU(zzbav.class, zzbavVar);
    }

    private zzbav() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzbac.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzbav();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbau(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
