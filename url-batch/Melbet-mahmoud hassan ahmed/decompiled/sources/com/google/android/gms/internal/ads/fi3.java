package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fi3 extends aq3<fi3, ei3> implements lr3 {
    private static final fi3 zzb;
    private int zze;

    static {
        fi3 fi3Var = new fi3();
        zzb = fi3Var;
        aq3.v(fi3.class, fi3Var);
    }

    private fi3() {
    }

    public static ei3 G() {
        return zzb.x();
    }

    public static fi3 I() {
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
            return new fi3();
        }
        di3 di3Var = null;
        if (i8 == 4) {
            return new ei3(di3Var);
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
