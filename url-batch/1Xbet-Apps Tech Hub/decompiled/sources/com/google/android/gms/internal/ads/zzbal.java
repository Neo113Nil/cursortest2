package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbal extends zzgwm implements zzgxx {
    private static final zzbal zzb;
    private int zzd;
    private zzbah zze;
    private zzgwv zzf = zzaN();
    private int zzg;
    private zzbbn zzh;

    static {
        zzbal zzbalVar = new zzbal();
        zzb = zzbalVar;
        zzgwm.zzaU(zzbal.class, zzbalVar);
    }

    private zzbal() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbbl.class, "zzg", zzbac.zza, "zzh"});
        }
        if (i2 == 3) {
            return new zzbal();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbak(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
