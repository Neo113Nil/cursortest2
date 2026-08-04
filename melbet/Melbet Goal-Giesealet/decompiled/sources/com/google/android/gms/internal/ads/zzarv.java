package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzarv extends zzhih implements zzhjt {
    private static final zzarv zzg;
    private static volatile zzhka zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zzarv zzarvVar = new zzarv();
        zzg = zzarvVar;
        zzhih.zzbu(zzarv.class, zzarvVar);
    }

    private zzarv() {
    }

    public static zzarv zza() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzarv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaru(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzh;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzarv.class) {
            zzhkaVar = zzh;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzg);
                zzh = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
