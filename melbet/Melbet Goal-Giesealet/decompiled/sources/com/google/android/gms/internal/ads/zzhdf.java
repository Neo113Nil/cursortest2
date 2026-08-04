package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhdf extends zzhih implements zzhjt {
    private static final zzhdf zzc;
    private static volatile zzhka zzd;
    private int zza;
    private int zzb;

    static {
        zzhdf zzhdfVar = new zzhdf();
        zzc = zzhdfVar;
        zzhih.zzbu(zzhdf.class, zzhdfVar);
    }

    private zzhdf() {
    }

    public static zzhdf zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhdf) zzhih.zzbT(zzc, zzhhbVar, zzhhrVar);
    }

    public static zzhde zzd() {
        return (zzhde) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (ordinal == 3) {
            return new zzhdf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhde(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzd;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhdf.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }
}
