package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class TY {
    public static TY A00 = new TY();

    public static TY A00() {
        return A00;
    }

    public final C0848Wb A01(SQ sq, boolean z) {
        return new C0848Wb(sq, z, new S5());
    }

    public final Map<String, String> A02(SQ sq) {
        try {
            return A01(sq, false).A06();
        } catch (Throwable th) {
            sq.A08().A4A(th);
            return TQ.A01(sq);
        }
    }
}
