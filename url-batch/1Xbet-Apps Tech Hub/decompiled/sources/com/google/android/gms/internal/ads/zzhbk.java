package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhbk extends zzgwm implements zzgxx {
    private static final zzhbk zzb;
    private int zzd;
    private zzhbj zze;
    private zzgve zzh;
    private int zzi;
    private zzgve zzj;
    private byte zzk = 2;
    private zzgwv zzf = zzaN();
    private zzgve zzg = zzgve.zzb;

    static {
        zzhbk zzhbkVar = new zzhbk();
        zzb = zzhbkVar;
        zzgwm.zzaU(zzhbk.class, zzhbkVar);
    }

    private zzhbk() {
        zzgve zzgveVar = zzgve.zzb;
        this.zzh = zzgveVar;
        this.zzj = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzhbc.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzhbk();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhbh(zzhagVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
