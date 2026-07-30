package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class UG {
    public static UG A00 = new UG();

    public static UG A00() {
        return A00;
    }

    public final ZJ A01(T8 t82, boolean z8) {
        return new ZJ(t82, z8, new C1235Sn());
    }

    public final Map<String, String> A02(T8 t82) {
        try {
            return A01(t82, false).A06();
        } catch (Throwable th) {
            t82.A08().A4I(th);
            return U8.A01(t82);
        }
    }
}
