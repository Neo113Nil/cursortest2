package com.facebook.ads.redexgen.X;

import android.graphics.Rect;

/* renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0879Un implements IU {
    public static String[] A02 = {"AMQNzlG2eGPOJo74lPpddO6twtMEce", "8uZuLGh3CZSzV4eSaK74M9a8aAW81o1g", "CYs8BZmCr6kO5jRRUq4laItl384RlovT", "PO4hUmmCpilEicL1R3sLdD9hI0Kiey5Z", "WmgRsP13YsLJamj9MMjVCco3tjnpIVCq", "0ErvOAeoLZJf3MJzf6jF5Cw5BrHPqp", "S0kgbIpbc64QMPj8XCJtTK8zDrzNpUnW", "MO6xPizLQkqntlkNHRrNVg7dZ2stU5UP"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A01(C1114bg<IV, C0560Ia> c1114bg, InterfaceC1103bV interfaceC1103bV) {
        float f = -1.0f;
        try {
            f = interfaceC1103bV.A8D(c1114bg);
        } catch (IllegalStateException unused) {
        }
        if (f > 0.0f && A00(c1114bg)) {
            return true;
        }
        if (c1114bg.A02.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c1114bg)) {
            return true;
        }
        interfaceC1103bV.A8C(this.A00);
        interfaceC1103bV.A71(c1114bg, this.A01);
        return (this.A00.bottom - this.A00.top > 0 && this.A01.bottom - this.A00.top > 0) && A00(c1114bg);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C1114bg<IV, C0560Ia> c1114bg) {
        if (c1114bg.A02.A05()) {
            return c1114bg.A03.A07();
        }
        if (!c1114bg.A02.A06()) {
            return true;
        }
        C0560Ia c0560Ia = c1114bg.A03;
        String[] strArr = A02;
        if (strArr[3].charAt(7) != strArr[2].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "8O0EOVeCMdEJdeSbYPFIeNjJXhTUSITs";
        strArr2[2] = "Km62DwbCV8Ma1ecjtuIU72b1y8KakI9d";
        return c0560Ia.A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C1114bg<IV, C0560Ia> c1114bg, InterfaceC1103bV interfaceC1103bV) {
        if (c1114bg.A03.A04() && A01(c1114bg, interfaceC1103bV)) {
            c1114bg.A03.A01();
            c1114bg.A02.A02().A9e(c1114bg.A02.A03(), c1114bg.A02.A04());
        }
        if (c1114bg.A03.A05() && IP.A1L(c1114bg.A02.A01())) {
            c1114bg.A03.A02();
            c1114bg.A02.A02().A9U(c1114bg.A02.A03(), c1114bg.A02.A04());
        }
    }
}
