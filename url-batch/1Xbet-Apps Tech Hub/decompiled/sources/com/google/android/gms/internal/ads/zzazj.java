package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzazj extends zzgwm implements zzgxx {
    private static final zzazj zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzazj zzazjVar = new zzazj();
        zzb = zzazjVar;
        zzgwm.zzaU(zzazj.class, zzazjVar);
    }

    private zzazj() {
    }

    public static zzazi zza() {
        return (zzazi) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzazj zzazjVar, boolean z) {
        zzazjVar.zzd |= 1;
        zzazjVar.zze = z;
    }

    static /* synthetic */ void zze(zzazj zzazjVar, boolean z) {
        zzazjVar.zzd |= 2;
        zzazjVar.zzf = z;
    }

    static /* synthetic */ void zzf(zzazj zzazjVar, int i) {
        zzazjVar.zzd |= 4;
        zzazjVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzazj();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzazi(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
