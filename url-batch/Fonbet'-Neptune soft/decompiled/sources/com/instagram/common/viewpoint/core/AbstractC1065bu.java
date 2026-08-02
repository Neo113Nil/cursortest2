package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1065bu {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1064bt>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1064bt>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1064bt A01(C1153dL c1153dL, AbstractC1428hy abstractC1428hy, int i, InterfaceC1062br interfaceC1062br) {
        C1064bt c1064bt = new C1064bt(c1153dL, abstractC1428hy, c1153dL.A02().A0A(), i);
        c1064bt.A0b(interfaceC1062br);
        c1064bt.A0X();
        A01.put(abstractC1428hy.A17(), new WeakReference<>(c1064bt));
        return c1064bt;
    }

    public static C1064bt A02(String str) {
        WeakReference<C1064bt> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1428hy abstractC1428hy, C1064bt c1064bt) {
        A01.put(abstractC1428hy.A17(), new WeakReference<>(c1064bt));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
