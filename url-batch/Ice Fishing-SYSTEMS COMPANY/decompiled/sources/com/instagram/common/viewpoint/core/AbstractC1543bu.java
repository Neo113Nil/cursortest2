package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1543bu {
    public static float A00(NR nr) {
        int height = nr.A0H().A01();
        int width = nr.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d2) {
        int availableWidth = (int) ((XW.A00().widthPixels - (AbstractC1552c3.A08 * 2)) / d2);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = YB.A01(16);
        int ctaTextHeight = AbstractC1524bb.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC1552c3.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = XW.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC1542bt A03(ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr, String str) {
        return new ViewOnClickListenerC1542bt(viewOnClickListenerC1037Kr, str);
    }

    public static boolean A04(double d2) {
        return d2 < 0.9d;
    }

    public static boolean A05(double d2, int i) {
        return A02(i) < A01(d2);
    }

    public static boolean A06(int i, int i4, double d2) {
        return i == 2 || A05(d2, i4);
    }
}
