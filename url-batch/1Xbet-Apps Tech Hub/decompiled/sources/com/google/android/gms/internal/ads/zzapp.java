package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzapp extends zzgwm implements zzgxx {
    private static final zzapp zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzapp zzappVar = new zzapp();
        zzb = zzappVar;
        zzgwm.zzaU(zzapp.class, zzappVar);
    }

    private zzapp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgwq zzgwqVar = zzaqj.zza;
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", zzgwqVar, "zzg", zzgwqVar});
        }
        if (i2 == 3) {
            return new zzapp();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzapo(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
