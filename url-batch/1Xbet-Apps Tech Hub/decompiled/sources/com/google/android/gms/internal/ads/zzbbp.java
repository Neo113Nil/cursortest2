package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbbp extends zzgwm implements zzgxx {
    private static final zzbbp zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbbp zzbbpVar = new zzbbp();
        zzb = zzbbpVar;
        zzgwm.zzaU(zzbbp.class, zzbbpVar);
    }

    private zzbbp() {
    }

    public static zzbbo zza() {
        return (zzbbo) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzbbp zzbbpVar, int i) {
        zzbbpVar.zzd |= 1;
        zzbbpVar.zze = i;
    }

    static /* synthetic */ void zze(zzbbp zzbbpVar, int i) {
        zzbbpVar.zzd |= 2;
        zzbbpVar.zzf = i;
    }

    static /* synthetic */ void zzf(zzbbp zzbbpVar, int i) {
        zzbbpVar.zzd |= 4;
        zzbbpVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbbp();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbbo(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
