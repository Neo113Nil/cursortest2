package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2158Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC3834rY A00;
    public InterfaceC3822rI A01;
    public C3810r5 A02;
    public final InterfaceC3823rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC3822rI A03 = new C2159Ap(this);

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C2158Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC3834rY interfaceC3834rY, InterfaceC3823rJ interfaceC3823rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC3834rY;
        this.A04 = interfaceC3823rJ;
    }

    public static C2158Ao A01() {
        return new C2158Ao(new ViewpointQeConfig(), new C2161Ar(), null);
    }

    private void A05(AbstractC3825rL abstractC3825rL, InterfaceC3830rQ interfaceC3830rQ, InterfaceC2156Al interfaceC2156Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C3810r5.A01(this.A05, abstractC3825rL, interfaceC3830rQ, interfaceC2156Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C3831rU c3831rU) {
        C3810r5 c3810r5 = this.A02;
        if (c3810r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c3831rU != null) {
                c3810r5.A07(dspViewableNode, c3831rU);
            } else {
                c3810r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C3831rU c3831rU, C3827rN c3827rN) {
        C3810r5 c3810r5 = this.A02;
        if (c3810r5 != null && dspViewableNode != null && c3827rN != null) {
            if (this.A05.A00 && c3831rU != null) {
                c3827rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c3827rN.A08 + c3831rU;
                c3810r5.A08(dspViewableNode, c3831rU, c3827rN);
            } else {
                c3810r5.A09(dspViewableNode, c3827rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C3827rN<?, ?> c3827rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c3827rN);
    }

    public final void A0A(AbstractC3825rL abstractC3825rL, View view) {
        if (abstractC3825rL != null && view != null) {
            A05(abstractC3825rL, new C2160Aq(view, this.A00), new C19501u(null), null);
        }
    }
}
