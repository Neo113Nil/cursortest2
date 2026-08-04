package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfik extends zzhih implements zzhjt {
    private static final zzfik zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzfih zzb;

    static {
        zzfik zzfikVar = new zzfik();
        zzc = zzfikVar;
        zzhih.zzbu(zzfik.class, zzfikVar);
    }

    private zzfik() {
    }

    public static zzfij zza() {
        return (zzfij) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfih zzfihVar) {
        zzfihVar.getClass();
        this.zzb = zzfihVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfik();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfij(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzd;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzfik.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
