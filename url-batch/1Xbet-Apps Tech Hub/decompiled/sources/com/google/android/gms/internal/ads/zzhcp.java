package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhcp extends zzgwm implements zzgxx {
    private static final zzhcp zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private zzgwr zzg = zzaJ();
    private zzgwv zzi = zzaN();
    private zzgve zzj = zzgve.zzb;

    static {
        zzhcp zzhcpVar = new zzhcp();
        zzb = zzhcpVar;
        zzgwm.zzaU(zzhcp.class, zzhcpVar);
    }

    private zzhcp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzhcn.class, "zzj"});
        }
        if (i2 == 3) {
            return new zzhcp();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhco(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
