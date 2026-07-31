package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wj3 extends aq3<wj3, vj3> implements lr3 {
    private static final wj3 zzb;
    private int zze;
    private qj3 zzf;
    private uo3 zzg;
    private uo3 zzh;

    static {
        wj3 wj3Var = new wj3();
        zzb = wj3Var;
        aq3.v(wj3.class, wj3Var);
    }

    private wj3() {
        uo3 uo3Var = uo3.f12885g;
        this.zzg = uo3Var;
        this.zzh = uo3Var;
    }

    public static vj3 H() {
        return zzb.x();
    }

    public static wj3 J() {
        return zzb;
    }

    public static wj3 K(uo3 uo3Var, mp3 mp3Var) {
        return (wj3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void O(wj3 wj3Var, qj3 qj3Var) {
        qj3Var.getClass();
        wj3Var.zzf = qj3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new wj3();
        }
        uj3 uj3Var = null;
        if (i8 == 4) {
            return new vj3(uj3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final qj3 G() {
        qj3 qj3Var = this.zzf;
        return qj3Var == null ? qj3.I() : qj3Var;
    }

    public final uo3 L() {
        return this.zzg;
    }

    public final uo3 M() {
        return this.zzh;
    }
}
