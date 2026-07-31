package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qh3 extends aq3<qh3, ph3> implements lr3 {
    private static final qh3 zzb;
    private int zze;
    private wh3 zzf;
    private uo3 zzg = uo3.f12885g;

    static {
        qh3 qh3Var = new qh3();
        zzb = qh3Var;
        aq3.v(qh3.class, qh3Var);
    }

    private qh3() {
    }

    public static ph3 G() {
        return zzb.x();
    }

    public static qh3 I() {
        return zzb;
    }

    public static qh3 J(uo3 uo3Var, mp3 mp3Var) {
        return (qh3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void N(qh3 qh3Var, wh3 wh3Var) {
        wh3Var.getClass();
        qh3Var.zzf = wh3Var;
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
            return new qh3();
        }
        oh3 oh3Var = null;
        if (i8 == 4) {
            return new ph3(oh3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final wh3 K() {
        wh3 wh3Var = this.zzf;
        return wh3Var == null ? wh3.I() : wh3Var;
    }

    public final uo3 L() {
        return this.zzg;
    }
}
