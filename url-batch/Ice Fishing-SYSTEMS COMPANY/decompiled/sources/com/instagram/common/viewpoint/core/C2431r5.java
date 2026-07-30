package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2431r5 {
    public static C2431r5 A03;
    public static InterfaceC2454rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2441rF A02;

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            byte b9 = copyOfRange[i10];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            copyOfRange[i10] = (byte) ((b9 - i9) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C2431r5(ViewpointQeConfig viewpointQeConfig, AbstractC2446rL abstractC2446rL, C2441rF c2441rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2441rF;
        abstractC2446rL.A03(new C0776Aj(c2441rF));
    }

    public static ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C2431r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC2446rL abstractC2446rL, InterfaceC2451rQ interfaceC2451rQ, InterfaceC0777Al interfaceC0777Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C2431r5 c2431r5 = A03;
        if (c2431r5 != null) {
            return c2431r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C2431r5(viewpointQeConfig, abstractC2446rL, new C2441rF(viewpointQeConfig, interfaceC2451rQ, ck, interfaceC0777Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC2445rK interfaceC2445rK) {
        this.A02.A0H(interfaceC2445rK);
    }

    public final void A05(InterfaceC2443rI interfaceC2443rI) {
        this.A02.A0I(interfaceC2443rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C2452rU c2452rU) {
        if (this.A00.A00 && c2452rU != null) {
            this.A01.A06(dspViewableNode, c2452rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C2452rU c2452rU, C2448rN c2448rN) {
        if (this.A00.A00 && c2452rU != null) {
            this.A01.A07(dspViewableNode, c2452rU, c2448rN);
        } else {
            this.A01.A08(dspViewableNode, c2448rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C2448rN c2448rN) {
        A08(dspViewableNode, null, c2448rN);
    }
}
