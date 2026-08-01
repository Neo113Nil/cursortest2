package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzazd extends zzgwm implements zzgxx {
    private static final zzazd zzb;
    private int zzd;
    private int zze;
    private zzazh zzf;
    private zzazj zzg;

    static {
        zzazd zzazdVar = new zzazd();
        zzb = zzazdVar;
        zzgwm.zzaU(zzazd.class, zzazdVar);
    }

    private zzazd() {
    }

    public static zzazc zza() {
        return (zzazc) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzazd zzazdVar, zzazh zzazhVar) {
        zzazhVar.getClass();
        zzazdVar.zzf = zzazhVar;
        zzazdVar.zzd |= 2;
    }

    static /* synthetic */ void zze(zzazd zzazdVar, zzazj zzazjVar) {
        zzazjVar.getClass();
        zzazdVar.zzg = zzazjVar;
        zzazdVar.zzd |= 4;
    }

    static /* synthetic */ void zzf(zzazd zzazdVar, int i) {
        zzazdVar.zze = 1;
        zzazdVar.zzd = 1 | zzazdVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzazf.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzazd();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzazc(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
