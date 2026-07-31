package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ls extends aq3<ls, js> implements lr3 {
    private static final ls zzb;
    private int zze;
    private int zzf;
    private bu zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        ls lsVar = new ls();
        zzb = lsVar;
        aq3.v(ls.class, lsVar);
    }

    private ls() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", ks.f7610a, "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new ls();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new js(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
