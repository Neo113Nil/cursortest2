package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class W1 extends AbstractC0225g1 {
    private static final W1 zzb;

    static {
        W1 w1 = new W1();
        zzb = w1;
        AbstractC0225g1.k(W1.class, w1);
    }

    public static W1 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0225g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0000", null);
        }
        if (i4 == 3) {
            return new W1();
        }
        if (i4 == 4) {
            return new V1(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
