package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ju extends aq3<ju, hu> implements lr3 {
    private static final ju zzb;
    private int zze;
    private int zzf;

    static {
        ju juVar = new ju();
        zzb = juVar;
        aq3.v(ju.class, juVar);
    }

    private ju() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", iu.f6788a});
        }
        if (i8 == 3) {
            return new ju();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new hu(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
