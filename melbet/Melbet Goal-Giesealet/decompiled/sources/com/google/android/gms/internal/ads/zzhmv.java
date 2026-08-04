package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhmv extends zzhih implements zzhjt {
    private static final zzhmv zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzhmu zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        zzhmv zzhmvVar = new zzhmv();
        zzf = zzhmvVar;
        zzhih.zzbu(zzhmv.class, zzhmvVar);
    }

    private zzhmv() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhmv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhms(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzg;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhmv.class) {
            zzhkaVar = zzg;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzf);
                zzg = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
