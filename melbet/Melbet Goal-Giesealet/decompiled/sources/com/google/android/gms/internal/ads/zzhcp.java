package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhcp extends zzhih implements zzhjt {
    private static final zzhcp zzd;
    private static volatile zzhka zze;
    private int zza;
    private zzhcr zzb;
    private int zzc;

    static {
        zzhcp zzhcpVar = new zzhcp();
        zzd = zzhcpVar;
        zzhih.zzbu(zzhcp.class, zzhcpVar);
    }

    private zzhcp() {
    }

    public static zzhco zzc() {
        return (zzhco) zzd.zzbn();
    }

    public static zzhcp zzd() {
        return zzd;
    }

    public final zzhcr zza() {
        zzhcr zzhcrVar = this.zzb;
        return zzhcrVar == null ? zzhcr.zzc() : zzhcrVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhcp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhco(bArr);
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
        synchronized (zzhcp.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(zzhcr zzhcrVar) {
        zzhcrVar.getClass();
        this.zzb = zzhcrVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
