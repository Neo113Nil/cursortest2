package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ql3 extends aq3<ql3, pl3> implements lr3 {
    private static final ql3 zzb;
    private int zze;
    private tl3 zzf;

    static {
        ql3 ql3Var = new ql3();
        zzb = ql3Var;
        aq3.v(ql3.class, ql3Var);
    }

    private ql3() {
    }

    public static pl3 G() {
        return zzb.x();
    }

    public static ql3 I(uo3 uo3Var, mp3 mp3Var) {
        return (ql3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void L(ql3 ql3Var, tl3 tl3Var) {
        tl3Var.getClass();
        ql3Var.zzf = tl3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new ql3();
        }
        ol3 ol3Var = null;
        if (i8 == 4) {
            return new pl3(ol3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final tl3 J() {
        tl3 tl3Var = this.zzf;
        return tl3Var == null ? tl3.H() : tl3Var;
    }
}
