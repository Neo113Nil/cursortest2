package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305c0 extends AbstractC0353w0 {
    private static final C0305c0 zzb;
    private int zzd;
    private C0314f0 zze;
    private C0314f0 zzf;
    private int zzg;

    static {
        C0305c0 c0305c0 = new C0305c0();
        zzb = c0305c0;
        AbstractC0353w0.k(C0305c0.class, c0305c0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", C0317g0.f5946b});
        }
        if (i5 == 3) {
            return new C0305c0();
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
