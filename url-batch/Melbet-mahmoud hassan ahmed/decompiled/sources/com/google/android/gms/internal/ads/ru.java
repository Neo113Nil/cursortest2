package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ru extends aq3<ru, qu> implements lr3 {
    private static final ru zzb;
    private int zze;
    private int zzf = 1000;
    private ju zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        ru ruVar = new ru();
        zzb = ruVar;
        aq3.v(ru.class, ruVar);
    }

    private ru() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zze", "zzf", ns.f9273a, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new ru();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new qu(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
