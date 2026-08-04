package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzass extends zzhih implements zzhjt {
    private static final zzass zzj;
    private static volatile zzhka zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzass zzassVar = new zzass();
        zzj = zzassVar;
        zzhih.zzbu(zzass.class, zzassVar);
    }

    private zzass() {
    }

    public static zzasr zza() {
        return (zzasr) zzj.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    final /* synthetic */ void zzd(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzass();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzasr(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzk;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzass.class) {
            zzhkaVar = zzk;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzj);
                zzk = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 32;
        this.zzg = j;
    }
}
