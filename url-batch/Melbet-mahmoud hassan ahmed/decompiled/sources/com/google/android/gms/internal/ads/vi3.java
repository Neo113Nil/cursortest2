package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vi3 extends aq3<vi3, ui3> implements lr3 {
    private static final vi3 zzb;
    private int zze;
    private uo3 zzf = uo3.f12885g;

    static {
        vi3 vi3Var = new vi3();
        zzb = vi3Var;
        aq3.v(vi3.class, vi3Var);
    }

    private vi3() {
    }

    public static ui3 G() {
        return zzb.x();
    }

    public static vi3 I(uo3 uo3Var, mp3 mp3Var) {
        return (vi3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new vi3();
        }
        ti3 ti3Var = null;
        if (i8 == 4) {
            return new ui3(ti3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final uo3 J() {
        return this.zzf;
    }
}
