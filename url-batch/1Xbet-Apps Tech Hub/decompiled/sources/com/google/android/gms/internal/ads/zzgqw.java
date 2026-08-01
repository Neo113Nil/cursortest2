package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgqw extends zzgwm implements zzgxx {
    private static final zzgqw zzb;

    static {
        zzgqw zzgqwVar = new zzgqw();
        zzb = zzgqwVar;
        zzgwm.zzaU(zzgqw.class, zzgqwVar);
    }

    private zzgqw() {
    }

    public static zzgqw zzc() {
        return zzb;
    }

    public static zzgqw zzd(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgqw) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zzgqu zzgquVar = null;
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new zzgqw();
        }
        if (i2 == 4) {
            return new zzgqv(zzgquVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
