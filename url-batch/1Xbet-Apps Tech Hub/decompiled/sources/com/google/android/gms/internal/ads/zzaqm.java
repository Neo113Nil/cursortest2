package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaqm extends zzgwm implements zzgxx {
    private static final zzaqm zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgve zzg = zzgve.zzb;

    static {
        zzaqm zzaqmVar = new zzaqm();
        zzb = zzaqmVar;
        zzgwm.zzaU(zzaqm.class, zzaqmVar);
    }

    private zzaqm() {
    }

    public static zzaqm zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaqm();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzaql(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
