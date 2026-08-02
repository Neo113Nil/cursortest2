package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class v1 extends AbstractC0353w0 {
    private static final v1 zzb;
    private int zzd;
    private A0 zze = Q0.f5901e;
    private String zzf = "";
    private boolean zzg;

    static {
        v1 v1Var = new v1();
        zzb = v1Var;
        AbstractC0353w0.k(v1.class, v1Var);
    }

    public static /* synthetic */ void n(v1 v1Var, boolean z) {
        v1Var.zzd |= 2;
        v1Var.zzg = z;
    }

    public static v1 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", u1.class, "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new v1();
        }
        if (i5 == 4) {
            return new t1(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
