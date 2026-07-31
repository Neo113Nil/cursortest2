package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fl3 extends aq3<fl3, el3> implements lr3 {
    private static final fl3 zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        fl3 fl3Var = new fl3();
        zzb = fl3Var;
        aq3.v(fl3.class, fl3Var);
    }

    private fl3() {
    }

    public static el3 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(fl3 fl3Var, String str) {
        str.getClass();
        fl3Var.zze = str;
    }

    static /* synthetic */ void K(fl3 fl3Var, int i7) {
        if (i7 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        fl3Var.zzf = i7 - 2;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new fl3();
        }
        cl3 cl3Var = null;
        if (i8 == 4) {
            return new el3(cl3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
