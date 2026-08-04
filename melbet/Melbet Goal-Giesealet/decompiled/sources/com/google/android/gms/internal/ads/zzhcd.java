package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhcd extends zzhih implements zzhjt {
    private static final zzhcd zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhhb zzc = zzhhb.zzb;
    private zzhch zzd;

    static {
        zzhcd zzhcdVar = new zzhcd();
        zze = zzhcdVar;
        zzhih.zzbu(zzhcd.class, zzhcdVar);
    }

    private zzhcd() {
    }

    public static zzhcd zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhcd) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhcc zze() {
        return (zzhcc) zze.zzbn();
    }

    public static zzhka zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhhb zzb() {
        return this.zzc;
    }

    public final zzhch zzc() {
        zzhch zzhchVar = this.zzd;
        return zzhchVar == null ? zzhch.zzc() : zzhchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhcd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhcc(bArr);
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
        synchronized (zzhcd.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        this.zzc = zzhhbVar;
    }

    final /* synthetic */ void zzi(zzhch zzhchVar) {
        zzhchVar.getClass();
        this.zzd = zzhchVar;
        this.zza |= 1;
    }
}
