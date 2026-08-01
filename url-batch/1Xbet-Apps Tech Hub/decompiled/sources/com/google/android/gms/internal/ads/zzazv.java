package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzazv extends zzgwm implements zzgxx {
    private static final zzazv zzb;
    private int zzd;
    private int zze;
    private zzbbn zzf;
    private zzbbn zzg;
    private zzbbn zzh;
    private zzgwv zzi = zzaN();
    private int zzj;

    static {
        zzazv zzazvVar = new zzazv();
        zzb = zzazvVar;
        zzgwm.zzaU(zzazv.class, zzazvVar);
    }

    private zzazv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzbbn.class, "zzj"});
        }
        if (i2 == 3) {
            return new zzazv();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzazu(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
