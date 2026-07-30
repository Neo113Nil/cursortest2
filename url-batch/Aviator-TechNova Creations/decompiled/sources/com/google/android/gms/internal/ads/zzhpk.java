package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhpk extends zzibr implements zzidd {
    private static final zzhpk zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private zzhpg zzc;
    private zzian zzd;
    private zzian zze;

    static {
        zzhpk zzhpkVar = new zzhpk();
        zzf = zzhpkVar;
        zzibr.zzbu(zzhpk.class, zzhpkVar);
    }

    private zzhpk() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
    }

    public static zzhpk zze(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpk) zzibr.zzbT(zzf, zzianVar, zzibbVar);
    }

    public static zzhpj zzg() {
        return (zzhpj) zzf.zzbn();
    }

    public static zzhpk zzh() {
        return zzf;
    }

    public static zzidk zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhpg zzb() {
        zzhpg zzhpgVar = this.zzc;
        return zzhpgVar == null ? zzhpg.zzc() : zzhpgVar;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final zzian zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhpk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhpj(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzg;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhpk.class) {
            zzidkVar = zzg;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzf);
                zzg = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzj(zzhpg zzhpgVar) {
        zzhpgVar.getClass();
        this.zzc = zzhpgVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzk(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    final /* synthetic */ void zzl(zzian zzianVar) {
        this.zze = zzianVar;
    }
}
