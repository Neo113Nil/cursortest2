package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ou3 extends aq3<ou3, nu3> implements lr3 {
    private static final ou3 zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;

    static {
        ou3 ou3Var = new ou3();
        zzb = ou3Var;
        aq3.v(ou3.class, ou3Var);
    }

    private ou3() {
    }

    public static nu3 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(ou3 ou3Var, String str) {
        ou3Var.zze |= 1;
        ou3Var.zzf = str;
    }

    static /* synthetic */ void I(ou3 ou3Var, long j7) {
        ou3Var.zze |= 2;
        ou3Var.zzg = j7;
    }

    static /* synthetic */ void J(ou3 ou3Var, boolean z6) {
        ou3Var.zze |= 4;
        ou3Var.zzh = z6;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new ou3();
        }
        ot3 ot3Var = null;
        if (i8 == 4) {
            return new nu3(ot3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
