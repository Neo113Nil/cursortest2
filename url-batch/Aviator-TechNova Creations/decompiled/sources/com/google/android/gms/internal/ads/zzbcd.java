package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbcd extends zzibr implements zzidd {
    private static final zzbcd zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private zzian zzb = zzian.zza;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        zzbcd zzbcdVar = new zzbcd();
        zzh = zzbcdVar;
        zzibr.zzbu(zzbcd.class, zzbcdVar);
    }

    private zzbcd() {
    }

    public static zzbcc zza() {
        return (zzbcc) zzh.zzbn();
    }

    final /* synthetic */ void zzb(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzbcd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbcc(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzi;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzbcd.class) {
            zzidkVar = zzi;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzh);
                zzi = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }
}
