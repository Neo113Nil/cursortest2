package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kh3 extends aq3<kh3, jh3> implements lr3 {
    private static final kh3 zzb;
    private int zze;
    private qh3 zzf;
    private gk3 zzg;

    static {
        kh3 kh3Var = new kh3();
        zzb = kh3Var;
        aq3.v(kh3.class, kh3Var);
    }

    private kh3() {
    }

    public static jh3 G() {
        return zzb.x();
    }

    public static kh3 I(uo3 uo3Var, mp3 mp3Var) {
        return (kh3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void M(kh3 kh3Var, qh3 qh3Var) {
        qh3Var.getClass();
        kh3Var.zzf = qh3Var;
    }

    static /* synthetic */ void N(kh3 kh3Var, gk3 gk3Var) {
        gk3Var.getClass();
        kh3Var.zzg = gk3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new kh3();
        }
        ih3 ih3Var = null;
        if (i8 == 4) {
            return new jh3(ih3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final qh3 J() {
        qh3 qh3Var = this.zzf;
        return qh3Var == null ? qh3.I() : qh3Var;
    }

    public final gk3 K() {
        gk3 gk3Var = this.zzg;
        return gk3Var == null ? gk3.I() : gk3Var;
    }
}
