package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhet extends zzhih implements zzhjt {
    private static final zzhet zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhex zzc;
    private zzhhb zzd = zzhhb.zzb;

    static {
        zzhet zzhetVar = new zzhet();
        zze = zzhetVar;
        zzhih.zzbu(zzhet.class, zzhetVar);
    }

    private zzhet() {
    }

    public static zzhet zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhet) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhes zze() {
        return (zzhes) zze.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhex zzb() {
        zzhex zzhexVar = this.zzc;
        return zzhexVar == null ? zzhex.zzc() : zzhexVar;
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
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhet();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhes(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzf;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhet.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzg(zzhex zzhexVar) {
        zzhexVar.getClass();
        this.zzc = zzhexVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        this.zzd = zzhhbVar;
    }
}
