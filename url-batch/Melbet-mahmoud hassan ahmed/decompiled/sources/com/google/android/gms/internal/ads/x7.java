package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x7 extends aq3<x7, w7> implements lr3 {
    private static final x7 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        x7 x7Var = new x7();
        zzb = x7Var;
        aq3.v(x7.class, x7Var);
    }

    private x7() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new x7();
        }
        u7 u7Var = null;
        if (i8 == 4) {
            return new w7(u7Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
