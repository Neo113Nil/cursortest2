package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhad extends zzgwm implements zzgxx {
    private static final zzhad zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        zzhad zzhadVar = new zzhad();
        zzb = zzhadVar;
        zzgwm.zzaU(zzhad.class, zzhadVar);
    }

    private zzhad() {
    }

    public static zzhac zza() {
        return (zzhac) zzb.zzaA();
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzhad();
        }
        zzhab zzhabVar = null;
        if (i2 == 4) {
            return new zzhac(zzhabVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
