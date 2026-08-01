package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbah extends zzgwm implements zzgxx {
    private static final zzbah zzb;
    private int zzd;
    private int zzf;
    private zzbbn zzh;
    private String zze = "";
    private zzgwr zzg = zzaJ();

    static {
        zzbah zzbahVar = new zzbah();
        zzb = zzbahVar;
        zzgwm.zzaU(zzbah.class, zzbahVar);
    }

    private zzbah() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbac.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbah();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbag(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
