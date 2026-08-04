package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaso extends zzhih implements zzhjt {
    private static final zzaso zzd;
    private static volatile zzhka zze;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;

    static {
        zzaso zzasoVar = new zzaso();
        zzd = zzasoVar;
        zzhih.zzbu(zzaso.class, zzasoVar);
    }

    private zzaso() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzatb.zza});
        }
        if (ordinal == 3) {
            return new zzaso();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzasn(bArr);
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
        synchronized (zzaso.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
