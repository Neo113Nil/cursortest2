package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhcf extends zzhih implements zzhjt {
    private static final zzhcf zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private zzhch zzc;

    static {
        zzhcf zzhcfVar = new zzhcf();
        zzd = zzhcfVar;
        zzhih.zzbu(zzhcf.class, zzhcfVar);
    }

    private zzhcf() {
    }

    public static zzhcf zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhcf) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzhce zzd() {
        return (zzhce) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhch zzb() {
        zzhch zzhchVar = this.zzc;
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
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhcf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhce(bArr);
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
        synchronized (zzhcf.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzb = i;
    }

    final /* synthetic */ void zzg(zzhch zzhchVar) {
        zzhchVar.getClass();
        this.zzc = zzhchVar;
        this.zza |= 1;
    }
}
