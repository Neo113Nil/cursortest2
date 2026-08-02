package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330k1 extends AbstractC0353w0 {
    private static final C0330k1 zzb;

    static {
        C0330k1 c0330k1 = new C0330k1();
        zzb = c0330k1;
        AbstractC0353w0.k(C0330k1.class, c0330k1);
    }

    public static C0330k1 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0000", null);
        }
        if (i5 == 3) {
            return new C0330k1();
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
