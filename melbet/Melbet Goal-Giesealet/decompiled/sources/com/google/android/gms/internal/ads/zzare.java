package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzare extends zzhih implements zzhjt {
    private static final zzare zzd;
    private static volatile zzhka zze;
    private int zza;
    private String zzb = "";
    private String zzc = "";

    static {
        zzare zzareVar = new zzare();
        zzd = zzareVar;
        zzhih.zzbu(zzare.class, zzareVar);
    }

    private zzare() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzare();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzard(bArr);
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
        synchronized (zzare.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
