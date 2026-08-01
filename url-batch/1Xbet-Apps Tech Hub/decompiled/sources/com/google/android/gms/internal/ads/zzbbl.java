package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbbl extends zzgwm implements zzgxx {
    private static final zzbbl zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzbbn zzg;

    static {
        zzbbl zzbblVar = new zzbbl();
        zzb = zzbblVar;
        zzgwm.zzaU(zzbbl.class, zzbblVar);
    }

    private zzbbl() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbac.zza, "zzg"});
        }
        if (i2 == 3) {
            return new zzbbl();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbbk(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
