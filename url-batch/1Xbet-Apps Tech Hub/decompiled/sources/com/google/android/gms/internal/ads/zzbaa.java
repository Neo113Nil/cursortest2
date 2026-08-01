package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbaa extends zzgwm implements zzgxx {
    private static final zzbaa zzb;
    private int zzd;
    private int zze;
    private zzbbp zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzbaa zzbaaVar = new zzbaa();
        zzb = zzbaaVar;
        zzgwm.zzaU(zzbaa.class, zzbaaVar);
    }

    private zzbaa() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", zzazz.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbaa();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzazy(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
