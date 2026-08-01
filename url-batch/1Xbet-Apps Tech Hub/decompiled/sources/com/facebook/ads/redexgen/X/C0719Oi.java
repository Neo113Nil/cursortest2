package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0719Oi {
    public static final Map<String, WeakReference<C0718Oh>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static C0718Oh A01(YA ya, AbstractC1045aS abstractC1045aS, int i, InterfaceC0716Of interfaceC0716Of) {
        C0718Oh c0718Oh = new C0718Oh(ya, abstractC1045aS, ya.A01().A09(), i);
        c0718Oh.A0b(interfaceC0716Of);
        c0718Oh.A0X();
        A00.put(abstractC1045aS.A0R(), new WeakReference<>(c0718Oh));
        return c0718Oh;
    }

    public static C0718Oh A02(String str) {
        WeakReference<C0718Oh> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1045aS abstractC1045aS, C0718Oh c0718Oh) {
        A00.put(abstractC1045aS.A0R(), new WeakReference<>(c0718Oh));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
