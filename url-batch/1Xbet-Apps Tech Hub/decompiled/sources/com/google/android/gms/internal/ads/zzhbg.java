package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhbg extends zzgwm implements zzgxx {
    private static final zzhbg zzb;
    private int zzd;
    private zzhbf zze;
    private int zzi;
    private byte zzj = 2;
    private zzgwv zzf = zzaN();
    private zzgve zzg = zzgve.zzb;
    private zzgve zzh = zzgve.zzb;

    static {
        zzhbg zzhbgVar = new zzhbg();
        zzb = zzhbgVar;
        zzgwm.zzaU(zzhbg.class, zzhbgVar);
    }

    private zzhbg() {
    }

    public static zzhbd zza() {
        return (zzhbd) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzhbg zzhbgVar, zzhbc zzhbcVar) {
        zzhbcVar.getClass();
        zzgwv zzgwvVar = zzhbgVar.zzf;
        if (!zzgwvVar.zzc()) {
            zzhbgVar.zzf = zzgwm.zzaO(zzgwvVar);
        }
        zzhbgVar.zzf.add(zzhbcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzhbc.class, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzhbg();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhbd(zzhagVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
