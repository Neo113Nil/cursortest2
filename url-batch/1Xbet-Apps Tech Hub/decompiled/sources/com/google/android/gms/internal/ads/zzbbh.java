package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbbh extends zzgwm implements zzgxx {
    private static final zzbbh zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzbbh zzbbhVar = new zzbbh();
        zzb = zzbbhVar;
        zzgwm.zzaU(zzbbh.class, zzbbhVar);
    }

    private zzbbh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbbh();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbbg(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
