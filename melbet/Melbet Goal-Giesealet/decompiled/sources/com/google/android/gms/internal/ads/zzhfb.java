package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhfb extends zzhih implements zzhjt {
    private static final zzhfb zzb;
    private static volatile zzhka zzc;
    private int zza;

    static {
        zzhfb zzhfbVar = new zzhfb();
        zzb = zzhfbVar;
        zzhih.zzbu(zzhfb.class, zzhfbVar);
    }

    private zzhfb() {
    }

    public static zzhfb zzb(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhfb) zzhih.zzbT(zzb, zzhhbVar, zzhhrVar);
    }

    public static zzhfb zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhfb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhfa(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzc;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhfb.class) {
            zzhkaVar = zzc;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzb);
                zzc = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
