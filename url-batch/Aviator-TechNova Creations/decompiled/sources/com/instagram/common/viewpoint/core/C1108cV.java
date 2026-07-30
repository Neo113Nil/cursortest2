package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1108cV {
    public String A02;
    public String A03;
    public String A04;
    public final C0620Mw A06;
    public final N9 A07;
    public final C1159dL A08;
    public C0622My A01 = C0622My.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C1108cV(C1159dL c1159dL, C0620Mw c0620Mw, N9 n9) {
        this.A08 = c1159dL;
        this.A06 = c0620Mw;
        this.A07 = n9;
    }

    public final C1108cV A09(int i) {
        this.A00 = i;
        return this;
    }

    public final C1108cV A0A(C0622My c0622My) {
        this.A01 = c0622My;
        return this;
    }

    public final C1108cV A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C1108cV A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C1108cV A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C1108cV A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C1110cX A0F() {
        return new C1110cX(this, null);
    }
}
