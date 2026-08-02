package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class D1 extends AbstractC0353w0 {
    private static final D1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        D1 d12 = new D1();
        zzb = d12;
        AbstractC0353w0.k(D1.class, d12);
    }

    public static /* synthetic */ void n(D1 d12, boolean z) {
        d12.zzd |= 8;
        d12.zzh = z;
    }

    public static /* synthetic */ void o(D1 d12) {
        d12.zzd |= 16;
        d12.zzi = 0;
    }

    public static /* synthetic */ void p(D1 d12, long j4) {
        d12.zzd |= 4;
        d12.zzg = j4;
    }

    public static /* synthetic */ void q(D1 d12) {
        d12.zzd |= 2;
        d12.zzf = true;
    }

    public static C1 r() {
        return (C1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new D1();
        }
        if (i5 == 4) {
            return new C1(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
