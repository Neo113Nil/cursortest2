package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nu extends aq3<nu, mu> implements lr3 {
    private static final nu zzb;
    private int zze;
    private int zzf = 1000;
    private ju zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        nu nuVar = new nu();
        zzb = nuVar;
        aq3.v(nu.class, nuVar);
    }

    private nu() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zze", "zzf", ns.f9273a, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new nu();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new mu(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
