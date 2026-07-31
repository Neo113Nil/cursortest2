package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ft extends aq3<ft, xs> implements lr3 {
    private static final ft zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ft ftVar = new ft();
        zzb = ftVar;
        aq3.v(ft.class, ftVar);
    }

    private ft() {
    }

    public static xs F() {
        return zzb.x();
    }

    public static ft H() {
        return zzb;
    }

    static /* synthetic */ void M(ft ftVar, int i7) {
        ftVar.zzf = i7 - 1;
        ftVar.zze |= 1;
    }

    static /* synthetic */ void N(ft ftVar, int i7) {
        ftVar.zzg = i7 - 1;
        ftVar.zze |= 2;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", ct.f3936a, "zzg", zs.f15242a});
        }
        if (i8 == 3) {
            return new ft();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new xs(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean I() {
        return (this.zze & 2) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final int K() {
        int a7 = at.a(this.zzg);
        if (a7 == 0) {
            return 1;
        }
        return a7;
    }

    public final int L() {
        int a7 = dt.a(this.zzf);
        if (a7 == 0) {
            return 1;
        }
        return a7;
    }
}
