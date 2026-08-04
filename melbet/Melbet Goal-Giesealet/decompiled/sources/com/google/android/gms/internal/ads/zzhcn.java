package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhcn extends zzhih implements zzhjt {
    private static final zzhcn zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhcr zzc;
    private zzhhb zzd = zzhhb.zzb;

    static {
        zzhcn zzhcnVar = new zzhcn();
        zze = zzhcnVar;
        zzhih.zzbu(zzhcn.class, zzhcnVar);
    }

    private zzhcn() {
    }

    public static zzhcm zzd() {
        return (zzhcm) zze.zzbn();
    }

    public static zzhcn zze() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhcr zzb() {
        zzhcr zzhcrVar = this.zzc;
        return zzhcrVar == null ? zzhcr.zzc() : zzhcrVar;
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
            return new zzhcn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhcm(bArr);
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
        synchronized (zzhcn.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzg(zzhcr zzhcrVar) {
        zzhcrVar.getClass();
        this.zzc = zzhcrVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        this.zzd = zzhhbVar;
    }
}
