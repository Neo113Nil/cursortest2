package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgqe extends zzgwm implements zzgxx {
    private static final zzgqe zzb;
    private int zzd;

    static {
        zzgqe zzgqeVar = new zzgqe();
        zzb = zzgqeVar;
        zzgwm.zzaU(zzgqe.class, zzgqeVar);
    }

    private zzgqe() {
    }

    public static zzgqd zzc() {
        return (zzgqd) zzb.zzaA();
    }

    public static zzgqe zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzgqe();
        }
        zzgqc zzgqcVar = null;
        if (i2 == 4) {
            return new zzgqd(zzgqcVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
