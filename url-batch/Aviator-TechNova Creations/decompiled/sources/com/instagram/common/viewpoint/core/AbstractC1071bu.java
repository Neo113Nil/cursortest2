package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1071bu {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1070bt>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1070bt>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1070bt A01(C1159dL c1159dL, AbstractC1434hy abstractC1434hy, int i, InterfaceC1068br interfaceC1068br) {
        C1070bt c1070bt = new C1070bt(c1159dL, abstractC1434hy, c1159dL.A02().A0A(), i);
        c1070bt.A0b(interfaceC1068br);
        c1070bt.A0X();
        A01.put(abstractC1434hy.A17(), new WeakReference<>(c1070bt));
        return c1070bt;
    }

    public static C1070bt A02(String str) {
        WeakReference<C1070bt> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1434hy abstractC1434hy, C1070bt c1070bt) {
        A01.put(abstractC1434hy.A17(), new WeakReference<>(c1070bt));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
