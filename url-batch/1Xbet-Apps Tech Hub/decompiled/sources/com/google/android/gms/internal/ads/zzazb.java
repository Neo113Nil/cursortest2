package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzazb extends zzgwm implements zzgxx {
    private static final zzazb zzb;
    private int zzd;
    private int zze;
    private zzazr zzg;
    private zzazt zzh;
    private zzazv zzj;
    private zzbbf zzk;
    private zzbav zzl;
    private zzbaj zzm;
    private zzbal zzn;
    private int zzf = 1000;
    private zzgwv zzi = zzaN();
    private zzgwv zzo = zzaN();

    static {
        zzazb zzazbVar = new zzazb();
        zzb = zzazbVar;
        zzgwm.zzaU(zzazb.class, zzazbVar);
    }

    private zzazb() {
    }

    public static zzazb zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzazb zzazbVar, zzayz zzayzVar) {
        zzazbVar.zze = zzayzVar.zza();
        zzazbVar.zzd |= 1;
    }

    static /* synthetic */ void zzf(zzazb zzazbVar, zzazt zzaztVar) {
        zzaztVar.getClass();
        zzazbVar.zzh = zzaztVar;
        zzazbVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zzayy.zza, "zzf", zzbac.zza, "zzg", "zzh", "zzi", zzazp.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzbbr.class});
        }
        if (i2 == 3) {
            return new zzazb();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzaza(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzazt zzd() {
        zzazt zzaztVar = this.zzh;
        return zzaztVar == null ? zzazt.zzc() : zzaztVar;
    }
}
