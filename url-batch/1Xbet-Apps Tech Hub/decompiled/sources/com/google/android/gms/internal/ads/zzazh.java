package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzazh extends zzgwm implements zzgxx {
    private static final zzazh zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzazh zzazhVar = new zzazh();
        zzb = zzazhVar;
        zzgwm.zzaU(zzazh.class, zzazhVar);
    }

    private zzazh() {
    }

    public static zzazg zza() {
        return (zzazg) zzb.zzaA();
    }

    public static zzazh zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzazh zzazhVar, boolean z) {
        zzazhVar.zzd |= 1;
        zzazhVar.zze = z;
    }

    static /* synthetic */ void zzf(zzazh zzazhVar, int i) {
        zzazhVar.zzd |= 2;
        zzazhVar.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzazh();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzazg(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
