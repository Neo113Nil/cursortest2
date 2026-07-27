package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class e2 extends AbstractC0334g1 {
    private static final e2 zzb;
    private int zzd;
    private int zze;

    static {
        e2 e2Var = new e2();
        zzb = e2Var;
        AbstractC0334g1.k(e2.class, e2Var);
    }

    public static /* synthetic */ void n(e2 e2Var, int i2) {
        e2Var.zze = i2 - 1;
        e2Var.zzd |= 1;
    }

    public static c2 o() {
        return (c2) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", R0.f5096g});
        }
        if (i3 == 3) {
            return new e2();
        }
        if (i3 == 4) {
            return new c2(zzb);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
