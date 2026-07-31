package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gu3 extends aq3<gu3, eu3> implements lr3 {
    private static final gu3 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private uo3 zzh = uo3.f12885g;

    static {
        gu3 gu3Var = new gu3();
        zzb = gu3Var;
        aq3.v(gu3.class, gu3Var);
    }

    private gu3() {
    }

    public static eu3 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(gu3 gu3Var, String str) {
        gu3Var.zze |= 2;
        gu3Var.zzg = "image/png";
    }

    static /* synthetic */ void I(gu3 gu3Var, uo3 uo3Var) {
        uo3Var.getClass();
        gu3Var.zze |= 4;
        gu3Var.zzh = uo3Var;
    }

    static /* synthetic */ void J(gu3 gu3Var, int i7) {
        gu3Var.zzf = 1;
        gu3Var.zze = 1 | gu3Var.zze;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", fu3.f5244a, "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new gu3();
        }
        ot3 ot3Var = null;
        if (i8 == 4) {
            return new eu3(ot3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
