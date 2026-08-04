package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfwk extends zzhih implements zzhjt {
    private static final zzfwk zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzfwm zzb;
    private zzhhb zzc;
    private zzhhb zzd;
    private int zze;

    static {
        zzfwk zzfwkVar = new zzfwk();
        zzf = zzfwkVar;
        zzhih.zzbu(zzfwk.class, zzfwkVar);
    }

    private zzfwk() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzc = zzhhbVar;
        this.zzd = zzhhbVar;
    }

    public static zzfwj zzd() {
        return (zzfwj) zzf.zzbn();
    }

    public final zzfwm zza() {
        zzfwm zzfwmVar = this.zzb;
        return zzfwmVar == null ? zzfwm.zzd() : zzfwmVar;
    }

    public final zzhhb zzb() {
        return this.zzc;
    }

    public final zzhhb zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzfwx.zza});
        }
        if (ordinal == 3) {
            return new zzfwk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfwj(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzg;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzfwk.class) {
            zzhkaVar = zzg;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzf);
                zzg = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(zzfwm zzfwmVar) {
        zzfwmVar.getClass();
        this.zzb = zzfwmVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhhb zzhhbVar) {
        zzhhbVar.getClass();
        this.zza |= 2;
        this.zzc = zzhhbVar;
    }

    final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        zzhhbVar.getClass();
        this.zza |= 4;
        this.zzd = zzhhbVar;
    }

    public final int zzj() {
        int zza = zzfwy.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    final /* synthetic */ void zzk(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }
}
