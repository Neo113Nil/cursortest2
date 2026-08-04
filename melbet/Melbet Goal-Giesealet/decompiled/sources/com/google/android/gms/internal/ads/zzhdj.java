package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhdj extends zzhih implements zzhjt {
    private static final zzhdj zza;
    private static volatile zzhka zzb;

    static {
        zzhdj zzhdjVar = new zzhdj();
        zza = zzhdjVar;
        zzhih.zzbu(zzhdj.class, zzhdjVar);
    }

    private zzhdj() {
    }

    public static zzhdj zza(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhdj) zzhih.zzbT(zza, zzhhbVar, zzhhrVar);
    }

    public static zzhdj zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (ordinal == 2) {
            return zzbv(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new zzhdj();
        }
        if (ordinal == 4) {
            return new zzhdi(bArr);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzb;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhdj.class) {
            zzhkaVar = zzb;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zza);
                zzb = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
