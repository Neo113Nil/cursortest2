package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhbf extends zzgwm implements zzgxx {
    private static final zzhbf zzb;
    private int zzd;
    private zzgve zze = zzgve.zzb;
    private zzgve zzf;
    private zzgve zzg;

    static {
        zzhbf zzhbfVar = new zzhbf();
        zzb = zzhbfVar;
        zzgwm.zzaU(zzhbf.class, zzhbfVar);
    }

    private zzhbf() {
        zzgve zzgveVar = zzgve.zzb;
        this.zzf = zzgveVar;
        this.zzg = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzhbf();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhbe(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
