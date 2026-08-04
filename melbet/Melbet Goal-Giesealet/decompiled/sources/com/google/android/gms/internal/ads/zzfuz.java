package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfuz extends zzhih implements zzhjt {
    private static final zzfuz zzh;
    private static volatile zzhka zzi;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";

    static {
        zzfuz zzfuzVar = new zzfuz();
        zzh = zzfuzVar;
        zzhih.zzbu(zzfuz.class, zzfuzVar);
    }

    private zzfuz() {
    }

    public static zzfuy zzg() {
        return (zzfuy) zzh.zzbn();
    }

    public static zzfuz zzh() {
        return zzh;
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzfuz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfuy(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzi;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzfuz.class) {
            zzhkaVar = zzi;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzh);
                zzi = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    public final long zze() {
        return this.zzf;
    }

    final /* synthetic */ void zzi(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }
}
