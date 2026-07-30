package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1624dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1623dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1623dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1623dC A01(C1839gi c1839gi, AbstractC2004jd abstractC2004jd, int i, InterfaceC1621dA interfaceC1621dA) {
        C1623dC c1623dC = new C1623dC(c1839gi, abstractC2004jd, c1839gi.A02().A0A(), i);
        c1623dC.A0b(interfaceC1621dA);
        c1623dC.A0X();
        A01.put(abstractC2004jd.A1D(), new WeakReference<>(c1623dC));
        return c1623dC;
    }

    public static C1623dC A02(String str) {
        WeakReference<C1623dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2004jd abstractC2004jd, C1623dC c1623dC) {
        A01.put(abstractC2004jd.A1D(), new WeakReference<>(c1623dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
