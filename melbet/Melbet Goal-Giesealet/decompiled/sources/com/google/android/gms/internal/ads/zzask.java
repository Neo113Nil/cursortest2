package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzask extends zzhih implements zzhjt {
    private static final zzask zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzask zzaskVar = new zzask();
        zzd = zzaskVar;
        zzhih.zzbu(zzask.class, zzaskVar);
    }

    private zzask() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", zzasa.zza, "zzc"});
        }
        if (ordinal == 3) {
            return new zzask();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzasj(bArr);
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
        synchronized (zzask.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
