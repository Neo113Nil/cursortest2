package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gl3 extends aq3<gl3, dl3> implements lr3 {
    private static final gl3 zzb;
    private int zze;
    private jq3<fl3> zzf = aq3.r();

    static {
        gl3 gl3Var = new gl3();
        zzb = gl3Var;
        aq3.v(gl3.class, gl3Var);
    }

    private gl3() {
    }

    public static dl3 F() {
        return zzb.x();
    }

    static /* synthetic */ void I(gl3 gl3Var, fl3 fl3Var) {
        fl3Var.getClass();
        jq3<fl3> jq3Var = gl3Var.zzf;
        if (!jq3Var.c()) {
            gl3Var.zzf = aq3.s(jq3Var);
        }
        gl3Var.zzf.add(fl3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", fl3.class});
        }
        if (i8 == 3) {
            return new gl3();
        }
        cl3 cl3Var = null;
        if (i8 == 4) {
            return new dl3(cl3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
