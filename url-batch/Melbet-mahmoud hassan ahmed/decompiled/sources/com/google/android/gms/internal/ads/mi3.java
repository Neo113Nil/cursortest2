package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mi3 extends aq3<mi3, li3> implements lr3 {
    private static final mi3 zzb;
    private int zze;
    private int zzf;

    static {
        mi3 mi3Var = new mi3();
        zzb = mi3Var;
        aq3.v(mi3.class, mi3Var);
    }

    private mi3() {
    }

    public static li3 G() {
        return zzb.x();
    }

    public static mi3 I(uo3 uo3Var, mp3 mp3Var) {
        return (mi3) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new mi3();
        }
        ki3 ki3Var = null;
        if (i8 == 4) {
            return new li3(ki3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zze;
    }
}
