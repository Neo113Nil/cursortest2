package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1865pb {
    public static C1865pb A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C1876pm A02;

    public C1865pb(ViewpointQeConfig viewpointQeConfig, AbstractC1881ps abstractC1881ps, C1876pm c1876pm, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c1876pm;
        abstractC1881ps.A03(new A4(c1876pm));
    }

    public static C1865pb A00(ViewpointQeConfig viewpointQeConfig, AbstractC1881ps abstractC1881ps, InterfaceC1886px interfaceC1886px, A6 a6) {
        C1865pb localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C1865pb(viewpointQeConfig, abstractC1881ps, new C1876pm(viewpointQeConfig, interfaceC1886px, C0322Bg.A00, a6, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC1880pr interfaceC1880pr) {
        this.A02.A0E(interfaceC1880pr);
    }

    public final void A02(InterfaceC1878pp interfaceC1878pp) {
        this.A02.A0F(interfaceC1878pp);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C1887q0 c1887q0) {
        if (this.A00.A00 && c1887q0 != null) {
            this.A01.A06(dspViewableNode, c1887q0);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C1887q0 c1887q0, C1883pu c1883pu) {
        if (this.A00.A00 && c1887q0 != null) {
            this.A01.A07(dspViewableNode, c1887q0, c1883pu);
        } else {
            this.A01.A08(dspViewableNode, c1883pu);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, C1883pu c1883pu) {
        A05(dspViewableNode, null, c1883pu);
    }
}
