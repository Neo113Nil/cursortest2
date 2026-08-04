package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhnn extends zzhih implements zzhjt {
    private static final zzhnn zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        zzhnn zzhnnVar = new zzhnn();
        zze = zzhnnVar;
        zzhih.zzbu(zzhnn.class, zzhnnVar);
    }

    private zzhnn() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzhin zzhinVar = zzhnl.zza;
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", zzhinVar, "zzc", "zzd", zzhinVar});
        }
        if (ordinal == 3) {
            return new zzhnn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhnm(bArr);
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
        synchronized (zzhnn.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
