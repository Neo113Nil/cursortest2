package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w13 extends aq3<w13, u13> implements lr3 {
    private static final w13 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private s13 zzi;

    static {
        w13 w13Var = new w13();
        zzb = w13Var;
        aq3.v(w13.class, w13Var);
    }

    private w13() {
    }

    public static u13 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(w13 w13Var, String str) {
        str.getClass();
        w13Var.zze |= 2;
        w13Var.zzg = str;
    }

    static /* synthetic */ void I(w13 w13Var, s13 s13Var) {
        s13Var.getClass();
        w13Var.zzi = s13Var;
        w13Var.zze |= 8;
    }

    static /* synthetic */ void J(w13 w13Var, int i7) {
        w13Var.zzf = 1;
        w13Var.zze = 1 | w13Var.zze;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", v13.f13070a, "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new w13();
        }
        t13 t13Var = null;
        if (i8 == 4) {
            return new u13(t13Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
