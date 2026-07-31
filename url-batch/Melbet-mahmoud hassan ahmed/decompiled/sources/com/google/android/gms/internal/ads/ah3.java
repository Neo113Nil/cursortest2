package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ah3 extends aq3<ah3, zg3> implements lr3 {
    private static final ah3 zzb;
    private int zze;
    private uo3 zzf = uo3.f12885g;
    private gh3 zzg;

    static {
        ah3 ah3Var = new ah3();
        zzb = ah3Var;
        aq3.v(ah3.class, ah3Var);
    }

    private ah3() {
    }

    public static zg3 G() {
        return zzb.x();
    }

    public static ah3 I(uo3 uo3Var, mp3 mp3Var) {
        return (ah3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void N(ah3 ah3Var, gh3 gh3Var) {
        gh3Var.getClass();
        ah3Var.zzg = gh3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new ah3();
        }
        yg3 yg3Var = null;
        if (i8 == 4) {
            return new zg3(yg3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final gh3 J() {
        gh3 gh3Var = this.zzg;
        return gh3Var == null ? gh3.I() : gh3Var;
    }

    public final uo3 K() {
        return this.zzf;
    }
}
