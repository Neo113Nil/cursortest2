package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tk3 extends aq3<tk3, sk3> implements lr3 {
    private static final tk3 zzb;
    private String zze = "";
    private uo3 zzf = uo3.f12885g;
    private int zzg;

    static {
        tk3 tk3Var = new tk3();
        zzb = tk3Var;
        aq3.v(tk3.class, tk3Var);
    }

    private tk3() {
    }

    public static sk3 F() {
        return zzb.x();
    }

    public static tk3 H() {
        return zzb;
    }

    static /* synthetic */ void K(tk3 tk3Var, String str) {
        str.getClass();
        tk3Var.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new tk3();
        }
        rk3 rk3Var = null;
        if (i8 == 4) {
            return new sk3(rk3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final uo3 I() {
        return this.zzf;
    }

    public final String J() {
        return this.zze;
    }

    public final int M() {
        int b7 = vl3.b(this.zzg);
        if (b7 == 0) {
            return 1;
        }
        return b7;
    }
}
