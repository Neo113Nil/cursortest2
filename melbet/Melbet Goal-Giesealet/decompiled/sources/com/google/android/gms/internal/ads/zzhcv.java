package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhcv extends zzhih implements zzhjt {
    private static final zzhcv zzd;
    private static volatile zzhka zze;
    private int zza;
    private zzhcx zzb;
    private int zzc;

    static {
        zzhcv zzhcvVar = new zzhcv();
        zzd = zzhcvVar;
        zzhih.zzbu(zzhcv.class, zzhcvVar);
    }

    private zzhcv() {
    }

    public static zzhcv zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhcv) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzhcu zzd() {
        return (zzhcu) zzd.zzbn();
    }

    public final zzhcx zza() {
        zzhcx zzhcxVar = this.zzb;
        return zzhcxVar == null ? zzhcx.zzc() : zzhcxVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhcv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhcu(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zze;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhcv.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(zzhcx zzhcxVar) {
        zzhcxVar.getClass();
        this.zzb = zzhcxVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
