package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaqa extends zzgwm implements zzgxx {
    private static final zzaqa zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzaqa zzaqaVar = new zzaqa();
        zzb = zzaqaVar;
        zzgwm.zzaU(zzaqa.class, zzaqaVar);
    }

    private zzaqa() {
    }

    public static zzapz zza() {
        return (zzapz) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 1;
        zzaqaVar.zze = j;
    }

    static /* synthetic */ void zze(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 2;
        zzaqaVar.zzf = j;
    }

    static /* synthetic */ void zzf(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 4;
        zzaqaVar.zzg = j;
    }

    static /* synthetic */ void zzg(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 8;
        zzaqaVar.zzh = j;
    }

    static /* synthetic */ void zzh(zzaqa zzaqaVar) {
        zzaqaVar.zzd &= -9;
        zzaqaVar.zzh = -1L;
    }

    static /* synthetic */ void zzi(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 16;
        zzaqaVar.zzi = j;
    }

    static /* synthetic */ void zzj(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 32;
        zzaqaVar.zzj = j;
    }

    static /* synthetic */ void zzk(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 128;
        zzaqaVar.zzl = j;
    }

    static /* synthetic */ void zzl(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 256;
        zzaqaVar.zzm = j;
    }

    static /* synthetic */ void zzm(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 512;
        zzaqaVar.zzn = j;
    }

    static /* synthetic */ void zzn(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 2048;
        zzaqaVar.zzp = j;
    }

    static /* synthetic */ void zzo(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 4096;
        zzaqaVar.zzq = j;
    }

    static /* synthetic */ void zzp(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 8192;
        zzaqaVar.zzr = j;
    }

    static /* synthetic */ void zzq(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 16384;
        zzaqaVar.zzs = j;
    }

    static /* synthetic */ void zzr(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 32768;
        zzaqaVar.zzt = j;
    }

    static /* synthetic */ void zzs(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 65536;
        zzaqaVar.zzu = j;
    }

    static /* synthetic */ void zzt(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 131072;
        zzaqaVar.zzv = j;
    }

    static /* synthetic */ void zzu(zzaqa zzaqaVar, long j) {
        zzaqaVar.zzd |= 262144;
        zzaqaVar.zzw = j;
    }

    static /* synthetic */ void zzv(zzaqa zzaqaVar, int i) {
        zzaqaVar.zzk = i - 1;
        zzaqaVar.zzd |= 64;
    }

    static /* synthetic */ void zzw(zzaqa zzaqaVar, int i) {
        zzaqaVar.zzo = i - 1;
        zzaqaVar.zzd |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgwq zzgwqVar = zzaqj.zza;
            return zzaR(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgwqVar, "zzl", "zzm", "zzn", "zzo", zzgwqVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new zzaqa();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzapz(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
