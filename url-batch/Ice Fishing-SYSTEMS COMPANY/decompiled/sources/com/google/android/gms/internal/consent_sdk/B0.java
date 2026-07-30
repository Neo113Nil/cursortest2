package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class B0 extends AbstractC4368o2 {
    private static final B0 zzb;
    private int zzd;
    private C4405y0 zze;
    private A0 zzg;
    private C4397w0 zzh;
    private C4385t0 zzi;
    private String zzf = "";
    private InterfaceC4379r2 zzj = G2.f35682x;

    static {
        B0 b02 = new B0();
        zzb = b02;
        AbstractC4368o2.l(B0.class, b02);
    }

    public static C4389u0 m() {
        return (C4389u0) zzb.g();
    }

    public static void n(B0 b02, String str) {
        str.getClass();
        InterfaceC4379r2 interfaceC4379r2 = b02.zzj;
        if (!((AbstractC4324d2) interfaceC4379r2).f35827n) {
            int size = interfaceC4379r2.size();
            b02.zzj = interfaceC4379r2.b(size + size);
        }
        b02.zzj.add(str);
    }

    public static /* synthetic */ void o(B0 b02, String str) {
        b02.zzd |= 2;
        b02.zzf = str;
    }

    public static /* synthetic */ void p(B0 b02, C4385t0 c4385t0) {
        b02.zzi = c4385t0;
        b02.zzd |= 16;
    }

    public static /* synthetic */ void q(B0 b02, C4397w0 c4397w0) {
        b02.zzh = c4397w0;
        b02.zzd |= 8;
    }

    public static /* synthetic */ void r(B0 b02, C4405y0 c4405y0) {
        b02.zze = c4405y0;
        b02.zzd |= 1;
    }

    public static /* synthetic */ void s(B0 b02, A0 a02) {
        b02.zzg = a02;
        b02.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i4 == 3) {
            return new B0();
        }
        if (i4 == 4) {
            return new C4389u0(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
