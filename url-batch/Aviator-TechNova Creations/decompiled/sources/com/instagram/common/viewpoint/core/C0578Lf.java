package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Lf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0578Lf implements InterfaceC0888Xl {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ C0575Lc A00;

    public C0578Lf(C0575Lc c0575Lc) {
        this.A00 = c0575Lc;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0888Xl
    public final void ACC(AbstractC0889Xm abstractC0889Xm) {
        boolean A0W;
        boolean z;
        C0802Ua c0802Ua;
        NB nb;
        InterfaceC0890Xn interfaceC0890Xn;
        YY yy;
        C1159dL c1159dL;
        AtomicBoolean atomicBoolean;
        boolean A0V;
        AtomicBoolean atomicBoolean2;
        C0971aI c0971aI;
        A0W = this.A00.A0W();
        if (A0W) {
            atomicBoolean2 = this.A00.A0V;
            if (!atomicBoolean2.get()) {
                c0971aI = this.A00.A0T;
                c0971aI.A07(this.A00);
                return;
            }
        }
        C0575Lc c0575Lc = this.A00;
        if (A01[4].charAt(5) == '8') {
            A01[1] = "011C";
            z = c0575Lc.A0X;
            if (z) {
                atomicBoolean = this.A00.A0V;
                if (!atomicBoolean.get()) {
                    A0V = this.A00.A0V();
                    if (A0V) {
                        this.A00.A0a.setToolbarActionMode(0);
                        this.A00.A0L();
                        return;
                    }
                }
            }
            c0802Ua = this.A00.A0N;
            c0802Ua.A04(UZ.A07, null);
            nb = this.A00.A0J;
            if (nb.A0P()) {
                c1159dL = this.A00.A0L;
                c1159dL.A0F().ADk();
            }
            interfaceC0890Xn = this.A00.A0Q;
            C0575Lc c0575Lc2 = this.A00;
            if (A01[2].length() == 9) {
                A01[6] = "SsRiNY9tvP3hEWy4eyTF9NsffnrPtCfL";
                yy = c0575Lc2.A0R;
                interfaceC0890Xn.A4b(yy.A7o());
                return;
            }
        }
        throw new RuntimeException();
    }
}
