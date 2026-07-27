package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class Q0 extends AbstractC0334g1 {
    private static final Q0 zzb;
    private int zzd;
    private String zze = "";

    static {
        Q0 q02 = new Q0();
        zzb = q02;
        AbstractC0334g1.k(Q0.class, q02);
    }

    public static P0 n() {
        return (P0) zzb.f();
    }

    public static /* synthetic */ void o(Q0 q02, String str) {
        q02.zzd |= 1;
        q02.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new Q0();
        }
        if (i3 == 4) {
            return new P0(zzb);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
