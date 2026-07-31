package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zh3 extends aq3<zh3, yh3> implements lr3 {
    private static final zh3 zzb;
    private int zze;
    private fi3 zzf;
    private uo3 zzg = uo3.f12885g;

    static {
        zh3 zh3Var = new zh3();
        zzb = zh3Var;
        aq3.v(zh3.class, zh3Var);
    }

    private zh3() {
    }

    public static yh3 G() {
        return zzb.x();
    }

    public static zh3 I(uo3 uo3Var, mp3 mp3Var) {
        return (zh3) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void M(zh3 zh3Var, fi3 fi3Var) {
        fi3Var.getClass();
        zh3Var.zzf = fi3Var;
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
            return new zh3();
        }
        xh3 xh3Var = null;
        if (i8 == 4) {
            return new yh3(xh3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }

    public final fi3 J() {
        fi3 fi3Var = this.zzf;
        return fi3Var == null ? fi3.I() : fi3Var;
    }

    public final uo3 K() {
        return this.zzg;
    }
}
