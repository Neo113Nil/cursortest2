package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tt3 extends aq3<tt3, st3> implements lr3 {
    private static final tt3 zzb;
    private int zze;
    private String zzf = "";

    static {
        tt3 tt3Var = new tt3();
        zzb = tt3Var;
        aq3.v(tt3.class, tt3Var);
    }

    private tt3() {
    }

    public static st3 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(tt3 tt3Var, String str) {
        tt3Var.zze |= 1;
        tt3Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new tt3();
        }
        ot3 ot3Var = null;
        if (i8 == 4) {
            return new st3(ot3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
