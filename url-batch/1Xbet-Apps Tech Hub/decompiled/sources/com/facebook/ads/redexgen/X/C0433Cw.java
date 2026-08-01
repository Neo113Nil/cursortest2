package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0433Cw {
    public final int A00;
    public final long A01;

    public C0433Cw(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C0433Cw A00(InterfaceC0400Bb interfaceC0400Bb, C0541Hh c0541Hh) throws IOException, InterruptedException {
        interfaceC0400Bb.ADl(c0541Hh.A00, 0, 8);
        c0541Hh.A0Y(0);
        int A08 = c0541Hh.A08();
        long size = c0541Hh.A0K();
        return new C0433Cw(A08, size);
    }
}
