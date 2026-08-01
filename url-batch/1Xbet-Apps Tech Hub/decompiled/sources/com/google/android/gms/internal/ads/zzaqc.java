package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaqc extends zzgwm implements zzgxx {
    private static final zzaqc zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzaqc zzaqcVar = new zzaqc();
        zzb = zzaqcVar;
        zzgwm.zzaU(zzaqc.class, zzaqcVar);
    }

    private zzaqc() {
    }

    public static zzaqb zza() {
        return (zzaqb) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaqc zzaqcVar, long j) {
        zzaqcVar.zzd |= 1;
        zzaqcVar.zze = j;
    }

    static /* synthetic */ void zze(zzaqc zzaqcVar, long j) {
        zzaqcVar.zzd |= 4;
        zzaqcVar.zzg = j;
    }

    static /* synthetic */ void zzf(zzaqc zzaqcVar, long j) {
        zzaqcVar.zzd |= 8;
        zzaqcVar.zzh = j;
    }

    static /* synthetic */ void zzg(zzaqc zzaqcVar, long j) {
        zzaqcVar.zzd |= 16;
        zzaqcVar.zzi = j;
    }

    static /* synthetic */ void zzh(zzaqc zzaqcVar, long j) {
        zzaqcVar.zzd |= 32;
        zzaqcVar.zzj = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzaqc();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzaqb(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
