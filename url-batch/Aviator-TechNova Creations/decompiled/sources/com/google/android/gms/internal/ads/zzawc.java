package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzawc extends zzibr implements zzidd {
    private static final zzawc zzi;
    private static volatile zzidk zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzawc zzawcVar = new zzawc();
        zzi = zzawcVar;
        zzibr.zzbu(zzawc.class, zzawcVar);
    }

    private zzawc() {
    }

    public static zzawb zza() {
        return (zzawb) zzi.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", zzawd.zza, "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzawc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawb(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzj;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzawc.class) {
            zzidkVar = zzj;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzi);
                zzj = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    final /* synthetic */ void zzh(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }
}
