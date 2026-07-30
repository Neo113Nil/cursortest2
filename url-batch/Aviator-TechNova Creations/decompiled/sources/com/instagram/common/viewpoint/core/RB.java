package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.Context;

/* loaded from: assets/audience_network.dex */
public final class RB {
    public static String[] A00 = {"9O", "28H1kjICyCSP", "QKFmg3qmSW84YfLR5DXewrEtWZ47Hzy", "P", "Em", "YyES7HR0UsWs", "rGxFrAuyTsOha0QpVFZkpdTTHXBTZM0k", "CeAnScf1I32vhT13KQ6XZJy"};

    public static LH A00(Context context, SS ss) {
        return A01(context, ss, null);
    }

    public static LH A01(Context context, SS ss, String str) {
        C1133cu sdkContext = A09(context);
        LL A84 = ss.A84(sdkContext);
        if (A84 != null) {
            return str != null ? A84.ABo(str) : A84.ABn();
        }
        return new C1495j3();
    }

    public static C1159dL A02(Activity activity) {
        return new C1159dL(activity, (SS) A0A(), A00(activity, A0A()));
    }

    public static C1159dL A03(Context context) {
        return new C1159dL(context, A0A(), new C1495j3());
    }

    public static C1159dL A04(Context context) {
        if (U7.A0w(context)) {
            return new C1159dL(context, A0A(), A00(context, A0A()));
        }
        C1159dL A03 = A03(context);
        if (A00[2].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "B";
        strArr[7] = "J1bgC2YpAkuTguvKBul5HQJ";
        return A03;
    }

    public static C1159dL A05(Context context, String str) {
        LH A01 = A01(context, A0A(), str);
        A01.AIj(1000);
        return new C1159dL(context, A0A(), A01);
    }

    public static C1159dL A06(Context context, String str) {
        return new C1159dL(context, A0A(), A01(context, A0A(), str));
    }

    public static C1159dL A07(Context context, String str) {
        return new C1159dL(context, A0A(), A01(context, A0A(), str));
    }

    public static C6M A08(Context context) {
        return new C6M(context, A0A(), A0A().A84(A09(context)));
    }

    public static C1133cu A09(Context context) {
        return new C1133cu(context, A0A());
    }

    public static synchronized C0870Wt A0A() {
        C0870Wt A02;
        synchronized (RB.class) {
            A02 = C0870Wt.A02();
        }
        return A02;
    }
}
