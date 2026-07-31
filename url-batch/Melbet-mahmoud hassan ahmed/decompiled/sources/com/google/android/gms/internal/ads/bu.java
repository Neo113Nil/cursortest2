package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bu extends aq3<bu, au> implements lr3 {
    private static final bu zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        bu buVar = new bu();
        zzb = buVar;
        aq3.v(bu.class, buVar);
    }

    private bu() {
    }

    public static au F() {
        return zzb.x();
    }

    static /* synthetic */ void H(bu buVar, int i7) {
        buVar.zze |= 1;
        buVar.zzf = i7;
    }

    static /* synthetic */ void I(bu buVar, int i7) {
        buVar.zze |= 2;
        buVar.zzg = i7;
    }

    static /* synthetic */ void J(bu buVar, int i7) {
        buVar.zze |= 4;
        buVar.zzh = i7;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new bu();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new au(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
