package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zr extends aq3<zr, yr> implements lr3 {
    private static final zr zzb;
    private int zze;
    private int zzf;
    private vt zzg;

    static {
        zr zrVar = new zr();
        zzb = zrVar;
        aq3.v(zr.class, zrVar);
    }

    private zr() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", xr.d(), "zzg"});
        }
        if (i8 == 3) {
            return new zr();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new yr(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
