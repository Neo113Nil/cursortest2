package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: assets/audience_network.dex */
public final class A8 implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public static String[] A09 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC1883q2 A00;
    public InterfaceC1872pp A01;
    public C1859pb A02;
    public final InterfaceC1873pq A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC1872pp A03 = new A9(this);

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

    public A8(ViewpointQeConfig viewpointQeConfig, InterfaceC1883q2 interfaceC1883q2, InterfaceC1873pq interfaceC1873pq) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC1883q2;
        this.A04 = interfaceC1873pq;
    }

    public static A8 A01() {
        return new A8(new ViewpointQeConfig(), new AC(), null);
    }

    private void A05(AbstractC1875ps abstractC1875ps, InterfaceC1880px interfaceC1880px, A6 a6) {
        this.A02 = C1859pb.A00(this.A05, abstractC1875ps, interfaceC1880px, a6);
        if (0 != 0) {
            this.A02.A01(null);
        }
        this.A02.A02(this.A03);
        String[] strArr = A09;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A09[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(DspViewableNode dspViewableNode, C1881q0 c1881q0) {
        C1859pb c1859pb = this.A02;
        if (c1859pb != null && dspViewableNode != null) {
            if (this.A05.A00 && c1881q0 != null) {
                c1859pb.A04(dspViewableNode, c1881q0);
            } else {
                c1859pb.A03(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C1881q0 c1881q0, C1877pu c1877pu) {
        C1859pb c1859pb = this.A02;
        if (c1859pb != null && dspViewableNode != null && c1877pu != null) {
            if (this.A05.A00 && c1881q0 != null) {
                c1877pu.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c1877pu.A08 + c1881q0;
                c1859pb.A05(dspViewableNode, c1881q0, c1877pu);
            } else {
                c1859pb.A06(dspViewableNode, c1877pu);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C1877pu<?, ?> c1877pu) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c1877pu);
    }

    public final void A0A(AbstractC1875ps abstractC1875ps, View view) {
        if (abstractC1875ps != null && view != null) {
            A05(abstractC1875ps, new AA(view, this.A00), new C1H(null));
        }
    }
}
