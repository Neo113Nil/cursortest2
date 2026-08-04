package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfja extends zzhih implements zzhjt {
    private static final zzfja zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzc;
    private String zzb = "";
    private String zzd = "";

    static {
        zzfja zzfjaVar = new zzfja();
        zze = zzfjaVar;
        zzhih.zzbu(zzfja.class, zzfjaVar);
    }

    private zzfja() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzfja();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfiz(bArr);
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
        synchronized (zzfja.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
