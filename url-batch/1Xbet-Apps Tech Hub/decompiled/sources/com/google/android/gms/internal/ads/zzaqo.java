package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaqo extends zzgwm implements zzgxx {
    private static final zzaqo zzb;
    private int zzd;
    private String zze = "";

    static {
        zzaqo zzaqoVar = new zzaqo();
        zzb = zzaqoVar;
        zzgwm.zzaU(zzaqo.class, zzaqoVar);
    }

    private zzaqo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzaqo();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzaqn(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
