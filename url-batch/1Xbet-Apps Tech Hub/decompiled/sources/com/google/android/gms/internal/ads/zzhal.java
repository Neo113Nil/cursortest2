package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhal extends zzgwm implements zzgxx {
    private static final zzhal zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgve zzg = zzgve.zzb;

    static {
        zzhal zzhalVar = new zzhal();
        zzb = zzhalVar;
        zzgwm.zzaU(zzhal.class, zzhalVar);
    }

    private zzhal() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", zzhak.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzhal();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhaj(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
