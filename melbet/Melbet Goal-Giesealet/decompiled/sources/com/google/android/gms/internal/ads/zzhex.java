package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhex extends zzhih implements zzhjt {
    private static final zzhex zzb;
    private static volatile zzhka zzc;
    private int zza;

    static {
        zzhex zzhexVar = new zzhex();
        zzb = zzhexVar;
        zzhih.zzbu(zzhex.class, zzhexVar);
    }

    private zzhex() {
    }

    public static zzhew zzb() {
        return (zzhew) zzb.zzbn();
    }

    public static zzhex zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i;
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
            return new zzhex();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhew(bArr);
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
        synchronized (zzhex.class) {
            zzhkaVar = zzc;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzb);
                zzc = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
