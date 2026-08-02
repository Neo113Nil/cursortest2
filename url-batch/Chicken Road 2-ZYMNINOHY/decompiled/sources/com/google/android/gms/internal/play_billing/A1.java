package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class A1 extends AbstractC0353w0 {
    private static final A1 zzb;
    private int zzd;
    private C0327j1 zze;
    private long zzf;

    static {
        A1 a12 = new A1();
        zzb = a12;
        AbstractC0353w0.k(A1.class, a12);
    }

    public static /* synthetic */ void n(A1 a12, C0327j1 c0327j1) {
        a12.zze = c0327j1;
        a12.zzd |= 1;
    }

    public static /* synthetic */ void o(A1 a12, long j4) {
        a12.zzd |= 2;
        a12.zzf = j4;
    }

    public static z1 p() {
        return (z1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new A1();
        }
        if (i5 == 4) {
            return new z1(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
