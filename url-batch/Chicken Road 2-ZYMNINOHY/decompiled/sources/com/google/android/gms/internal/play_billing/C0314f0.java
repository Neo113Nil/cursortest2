package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314f0 extends AbstractC0353w0 {
    private static final C0314f0 zzb;
    private int zzd;
    private String zze = "";

    static {
        C0314f0 c0314f0 = new C0314f0();
        zzb = c0314f0;
        AbstractC0353w0.k(C0314f0.class, c0314f0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i5 == 3) {
            return new C0314f0();
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
