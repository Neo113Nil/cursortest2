package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgpg extends zzgwm implements zzgxx {
    private static final zzgpg zzb;
    private int zzd;

    static {
        zzgpg zzgpgVar = new zzgpg();
        zzb = zzgpgVar;
        zzgwm.zzaU(zzgpg.class, zzgpgVar);
    }

    private zzgpg() {
    }

    public static zzgpf zzc() {
        return (zzgpf) zzb.zzaA();
    }

    public static zzgpg zze() {
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
            return new zzgpg();
        }
        zzgpe zzgpeVar = null;
        if (i2 == 4) {
            return new zzgpf(zzgpeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
