package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhni extends zzhih implements zzhjt {
    private static final zzhni zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhhb zzc;
    private zzhhb zzd;

    static {
        zzhni zzhniVar = new zzhni();
        zze = zzhniVar;
        zzhih.zzbu(zzhni.class, zzhniVar);
    }

    private zzhni() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzc = zzhhbVar;
        this.zzd = zzhhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhni();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhnh(bArr);
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
        synchronized (zzhni.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
