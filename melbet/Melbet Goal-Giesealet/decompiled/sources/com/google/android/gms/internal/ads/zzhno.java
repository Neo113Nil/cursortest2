package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzhno extends zzhih implements zzhjt {
    private static final zzhno zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhnn zzc;
    private zzhnn zzd;

    static {
        zzhno zzhnoVar = new zzhno();
        zze = zzhnoVar;
        zzhih.zzbu(zzhno.class, zzhnoVar);
    }

    private zzhno() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zza", "zzb", zzhnl.zza, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhno();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhnk(bArr);
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
        synchronized (zzhno.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
