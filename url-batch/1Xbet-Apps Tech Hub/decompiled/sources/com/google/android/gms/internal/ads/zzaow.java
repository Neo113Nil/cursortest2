package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaow extends zzgwm implements zzgxx {
    private static final zzaow zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private zzgwv zzp = zzaN();

    static {
        zzaow zzaowVar = new zzaow();
        zzb = zzaowVar;
        zzgwm.zzaU(zzaow.class, zzaowVar);
    }

    private zzaow() {
    }

    public static zzaos zza() {
        return (zzaos) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaow zzaowVar, long j) {
        zzaowVar.zzd |= 2;
        zzaowVar.zzf = j;
    }

    static /* synthetic */ void zze(zzaow zzaowVar, String str) {
        str.getClass();
        zzaowVar.zzd |= 4;
        zzaowVar.zzg = str;
    }

    static /* synthetic */ void zzf(zzaow zzaowVar, String str) {
        str.getClass();
        zzaowVar.zzd |= 8;
        zzaowVar.zzh = str;
    }

    static /* synthetic */ void zzg(zzaow zzaowVar, String str) {
        zzaowVar.zzd |= 16;
        zzaowVar.zzi = str;
    }

    static /* synthetic */ void zzh(zzaow zzaowVar, String str) {
        zzaowVar.zzd |= 1024;
        zzaowVar.zzo = str;
    }

    static /* synthetic */ void zzi(zzaow zzaowVar, String str) {
        str.getClass();
        zzaowVar.zzd |= 1;
        zzaowVar.zze = str;
    }

    static /* synthetic */ void zzj(zzaow zzaowVar, int i) {
        zzaowVar.zzq = i - 1;
        zzaowVar.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzaou.class, "zzq", zzaov.zza});
        }
        if (i2 == 3) {
            return new zzaow();
        }
        zzaor zzaorVar = null;
        if (i2 == 4) {
            return new zzaos(zzaorVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
