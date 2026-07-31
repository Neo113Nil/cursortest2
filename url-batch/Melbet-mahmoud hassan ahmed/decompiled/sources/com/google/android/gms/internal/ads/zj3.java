package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zj3 extends aq3<zj3, yj3> implements lr3 {
    private static final zj3 zzb;
    private int zze;
    private int zzf;
    private uo3 zzg = uo3.f12885g;

    static {
        zj3 zj3Var = new zj3();
        zzb = zj3Var;
        aq3.v(zj3.class, zj3Var);
    }

    private zj3() {
    }

    public static yj3 F() {
        return zzb.x();
    }

    public static zj3 H() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new zj3();
        }
        xj3 xj3Var = null;
        if (i8 == 4) {
            return new yj3(xj3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final uo3 I() {
        return this.zzg;
    }

    public final int K() {
        int i7 = this.zze;
        int i8 = 5;
        if (i7 == 0) {
            i8 = 2;
        } else if (i7 == 2) {
            i8 = 4;
        } else if (i7 != 3) {
            i8 = i7 != 4 ? i7 != 5 ? 0 : 7 : 6;
        }
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }

    public final int L() {
        int b7 = dk3.b(this.zzf);
        if (b7 == 0) {
            return 1;
        }
        return b7;
    }
}
