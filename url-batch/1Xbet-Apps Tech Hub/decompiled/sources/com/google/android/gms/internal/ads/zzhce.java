package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhce extends zzgwm implements zzgxx {
    private static final zzhce zzb;
    private int zzd;
    private int zze;
    private zzhbg zzg;
    private zzhbk zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private zzgwr zzj = zzaJ();
    private String zzk = "";
    private zzgwv zzm = zzgwm.zzaN();

    static {
        zzhce zzhceVar = new zzhce();
        zzb = zzhceVar;
        zzgwm.zzaU(zzhce.class, zzhceVar);
    }

    private zzhce() {
    }

    public static zzhcd zzc() {
        return (zzhcd) zzb.zzaA();
    }

    static /* synthetic */ void zzf(zzhce zzhceVar, int i) {
        zzhceVar.zzd |= 1;
        zzhceVar.zze = i;
    }

    static /* synthetic */ void zzg(zzhce zzhceVar, String str) {
        str.getClass();
        zzhceVar.zzd |= 2;
        zzhceVar.zzf = str;
    }

    static /* synthetic */ void zzh(zzhce zzhceVar, zzhbg zzhbgVar) {
        zzhbgVar.getClass();
        zzhceVar.zzg = zzhbgVar;
        zzhceVar.zzd |= 4;
    }

    static /* synthetic */ void zzi(zzhce zzhceVar, String str) {
        str.getClass();
        zzgwv zzgwvVar = zzhceVar.zzm;
        if (!zzgwvVar.zzc()) {
            zzhceVar.zzm = zzgwm.zzaO(zzgwvVar);
        }
        zzhceVar.zzm.add(str);
    }

    static /* synthetic */ void zzj(zzhce zzhceVar, int i) {
        zzhceVar.zzl = i - 1;
        zzhceVar.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final String zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhcb.zza, "zzm"});
        }
        if (i2 == 3) {
            return new zzhce();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhcd(zzhagVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
