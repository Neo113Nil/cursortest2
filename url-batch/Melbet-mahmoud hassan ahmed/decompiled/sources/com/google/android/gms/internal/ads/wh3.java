package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wh3 extends aq3<wh3, vh3> implements lr3 {
    private static final wh3 zzb;
    private int zze;

    static {
        wh3 wh3Var = new wh3();
        zzb = wh3Var;
        aq3.v(wh3.class, wh3Var);
    }

    private wh3() {
    }

    public static vh3 G() {
        return zzb.x();
    }

    public static wh3 I() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i8 == 3) {
            return new wh3();
        }
        uh3 uh3Var = null;
        if (i8 == 4) {
            return new vh3(uh3Var);
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
