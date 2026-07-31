package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qk3 extends aq3<qk3, pk3> implements lr3 {
    private static final qk3 zzb;
    private String zze = "";
    private uo3 zzf = uo3.f12885g;
    private int zzg;

    static {
        qk3 qk3Var = new qk3();
        zzb = qk3Var;
        aq3.v(qk3.class, qk3Var);
    }

    private qk3() {
    }

    public static pk3 F() {
        return zzb.x();
    }

    public static qk3 H() {
        return zzb;
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
            return new qk3();
        }
        ok3 ok3Var = null;
        if (i8 == 4) {
            return new pk3(ok3Var);
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
        int i7 = this.zzg;
        int i8 = 4;
        if (i7 == 0) {
            i8 = 2;
        } else if (i7 == 1) {
            i8 = 3;
        } else if (i7 != 2) {
            i8 = i7 != 3 ? i7 != 4 ? 0 : 6 : 5;
        }
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }
}
