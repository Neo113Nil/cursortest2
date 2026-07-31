package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class us extends aq3<us, ts> implements lr3 {
    private static final us zzb;
    private int zze;
    private int zzf;
    private fq3 zzg = aq3.o();

    static {
        us usVar = new us();
        zzb = usVar;
        aq3.v(us.class, usVar);
    }

    private us() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zze", "zzf", ns.f9273a, "zzg"});
        }
        if (i8 == 3) {
            return new us();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new ts(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
