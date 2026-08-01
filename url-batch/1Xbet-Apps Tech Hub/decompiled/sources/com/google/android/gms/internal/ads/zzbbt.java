package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbbt extends zzgwm implements zzgxx {
    private static final zzbbt zzb;
    private int zzd;
    private int zze = 1000;
    private zzbbw zzf;
    private zzbbn zzg;

    static {
        zzbbt zzbbtVar = new zzbbt();
        zzb = zzbbtVar;
        zzgwm.zzaU(zzbbt.class, zzbbtVar);
    }

    private zzbbt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzbac.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbbt();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbbs(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
