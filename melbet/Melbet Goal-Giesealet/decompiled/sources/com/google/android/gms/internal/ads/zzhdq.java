package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhdq extends zzhih implements zzhjt {
    private static final zzhdq zzc;
    private static volatile zzhka zzd;
    private int zza;
    private int zzb;

    static {
        zzhdq zzhdqVar = new zzhdq();
        zzc = zzhdqVar;
        zzhih.zzbu(zzhdq.class, zzhdqVar);
    }

    private zzhdq() {
    }

    public static zzhdp zzc() {
        return (zzhdp) zzc.zzbn();
    }

    public static zzhdq zzd() {
        return zzc;
    }

    public final zzhdk zza() {
        int i = this.zza;
        zzhdk zzhdkVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzhdk.SHA224 : zzhdk.SHA512 : zzhdk.SHA256 : zzhdk.SHA384 : zzhdk.SHA1 : zzhdk.UNKNOWN_HASH;
        return zzhdkVar == null ? zzhdk.UNRECOGNIZED : zzhdkVar;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhdq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhdp(bArr);
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
        synchronized (zzhdq.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(zzhdk zzhdkVar) {
        this.zza = zzhdkVar.zza();
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb = i;
    }
}
