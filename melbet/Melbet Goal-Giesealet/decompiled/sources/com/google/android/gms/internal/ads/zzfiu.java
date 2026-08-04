package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfiu extends zzhih implements zzhjt {
    private static final zzfiu zzb;
    private static volatile zzhka zzc;
    private boolean zza;

    static {
        zzfiu zzfiuVar = new zzfiu();
        zzb = zzfiuVar;
        zzhih.zzbu(zzfiu.class, zzfiuVar);
    }

    private zzfiu() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzfiu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfit(bArr);
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
        synchronized (zzfiu.class) {
            zzhkaVar = zzc;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzb);
                zzc = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
