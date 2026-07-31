package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3003dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C3002dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C3002dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C3002dC A01(C3218gi c3218gi, AbstractC3383jd abstractC3383jd, int i, InterfaceC3000dA interfaceC3000dA) {
        C3002dC c3002dC = new C3002dC(c3218gi, abstractC3383jd, c3218gi.A02().A0A(), i);
        c3002dC.A0b(interfaceC3000dA);
        c3002dC.A0X();
        A01.put(abstractC3383jd.A1D(), new WeakReference<>(c3002dC));
        return c3002dC;
    }

    public static C3002dC A02(String str) {
        WeakReference<C3002dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC3383jd abstractC3383jd, C3002dC c3002dC) {
        A01.put(abstractC3383jd.A1D(), new WeakReference<>(c3002dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
