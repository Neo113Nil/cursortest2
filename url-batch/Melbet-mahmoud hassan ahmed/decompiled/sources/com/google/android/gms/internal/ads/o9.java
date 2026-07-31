package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o9 extends aq3<o9, n9> implements lr3 {
    private static final o9 zzb;
    private int zze;
    private jq3<uo3> zzf = aq3.r();
    private uo3 zzg = uo3.f12885g;
    private int zzh = 1;
    private int zzi = 1;

    static {
        o9 o9Var = new o9();
        zzb = o9Var;
        aq3.v(o9.class, o9Var);
    }

    private o9() {
    }

    public static n9 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(o9 o9Var, uo3 uo3Var) {
        jq3<uo3> jq3Var = o9Var.zzf;
        if (!jq3Var.c()) {
            o9Var.zzf = aq3.s(jq3Var);
        }
        o9Var.zzf.add(uo3Var);
    }

    static /* synthetic */ void I(o9 o9Var, uo3 uo3Var) {
        o9Var.zze |= 1;
        o9Var.zzg = uo3Var;
    }

    static /* synthetic */ void J(o9 o9Var, int i7) {
        o9Var.zzi = i7 - 1;
        o9Var.zze |= 4;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", h9.f6136a, "zzi", f9.f5044a});
        }
        if (i8 == 3) {
            return new o9();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new n9(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
