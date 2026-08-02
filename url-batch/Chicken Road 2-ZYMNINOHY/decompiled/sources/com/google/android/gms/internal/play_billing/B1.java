package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class B1 extends AbstractC0353w0 {
    private static final B1 zzb;
    private int zzd;
    private int zze;

    static {
        B1 b12 = new B1();
        zzb = b12;
        AbstractC0353w0.k(B1.class, b12);
    }

    public static B1 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C0317g0.f5953i});
        }
        if (i5 == 3) {
            return new B1();
        }
        if (i5 == 4) {
            return new C0302b0(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
