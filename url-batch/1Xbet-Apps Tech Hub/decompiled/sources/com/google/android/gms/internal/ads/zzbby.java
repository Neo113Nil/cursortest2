package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbby extends zzgwm implements zzgxx {
    private static final zzbby zzb;
    private int zzd;
    private zzbbp zze;
    private int zzf = 1000;
    private zzbbw zzg;
    private zzbbn zzh;

    static {
        zzbby zzbbyVar = new zzbby();
        zzb = zzbbyVar;
        zzgwm.zzaU(zzbby.class, zzbbyVar);
    }

    private zzbby() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzbac.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbby();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbbx(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
