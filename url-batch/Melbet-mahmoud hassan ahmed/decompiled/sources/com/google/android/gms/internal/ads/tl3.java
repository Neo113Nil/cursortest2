package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tl3 extends aq3<tl3, sl3> implements lr3 {
    private static final tl3 zzb;
    private String zze = "";
    private tk3 zzf;

    static {
        tl3 tl3Var = new tl3();
        zzb = tl3Var;
        aq3.v(tl3.class, tl3Var);
    }

    private tl3() {
    }

    public static tl3 H() {
        return zzb;
    }

    public static tl3 I(uo3 uo3Var, mp3 mp3Var) {
        return (tl3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new tl3();
        }
        rl3 rl3Var = null;
        if (i8 == 4) {
            return new sl3(rl3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final tk3 F() {
        tk3 tk3Var = this.zzf;
        return tk3Var == null ? tk3.H() : tk3Var;
    }

    public final String J() {
        return this.zze;
    }

    public final boolean K() {
        return this.zzf != null;
    }
}
