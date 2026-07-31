package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tj3 extends aq3<tj3, sj3> implements lr3 {
    private static final tj3 zzb;
    private int zze;
    private wj3 zzf;
    private uo3 zzg = uo3.f12885g;

    static {
        tj3 tj3Var = new tj3();
        zzb = tj3Var;
        aq3.v(tj3.class, tj3Var);
    }

    private tj3() {
    }

    public static sj3 G() {
        return zzb.x();
    }

    public static tj3 I(uo3 uo3Var, mp3 mp3Var) {
        return (tj3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void M(tj3 tj3Var, wj3 wj3Var) {
        wj3Var.getClass();
        tj3Var.zzf = wj3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new tj3();
        }
        rj3 rj3Var = null;
        if (i8 == 4) {
            return new sj3(rj3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final wj3 J() {
        wj3 wj3Var = this.zzf;
        return wj3Var == null ? wj3.J() : wj3Var;
    }

    public final uo3 K() {
        return this.zzg;
    }
}
