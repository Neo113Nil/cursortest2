package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfux extends zzhih implements zzhjt {
    private static final zzfux zzf;
    private static volatile zzhka zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        zzfux zzfuxVar = new zzfux();
        zzf = zzfuxVar;
        zzhih.zzbu(zzfux.class, zzfuxVar);
    }

    private zzfux() {
    }

    public static zzfuw zze() {
        return (zzfuw) zzf.zzbn();
    }

    public static zzfux zzg() {
        return zzf;
    }

    public final String zza() {
        return this.zzb;
    }

    public final float zzb() {
        return this.zzc;
    }

    public final long zzc() {
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
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfux();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfuw(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzg;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzfux.class) {
            zzhkaVar = zzg;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzf);
                zzg = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzh(float f) {
        this.zza |= 2;
        this.zzc = f;
    }
}
