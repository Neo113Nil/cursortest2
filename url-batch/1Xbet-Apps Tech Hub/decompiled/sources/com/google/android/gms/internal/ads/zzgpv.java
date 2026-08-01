package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgpv extends zzgwm implements zzgxx {
    private static final zzgpv zzb;
    private int zzd;

    static {
        zzgpv zzgpvVar = new zzgpv();
        zzb = zzgpvVar;
        zzgwm.zzaU(zzgpv.class, zzgpvVar);
    }

    private zzgpv() {
    }

    public static zzgpu zzc() {
        return (zzgpu) zzb.zzaA();
    }

    public static zzgpv zze() {
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
            return new zzgpv();
        }
        zzgpt zzgptVar = null;
        if (i2 == 4) {
            return new zzgpu(zzgptVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
