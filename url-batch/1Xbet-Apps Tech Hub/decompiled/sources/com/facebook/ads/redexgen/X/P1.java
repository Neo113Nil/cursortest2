package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class P1 {
    public String A02;
    public String A03;
    public final C1K A04;
    public final C1X A05;
    public final YA A06;
    public C1M A01 = C1M.A01(null);
    public int A00 = 1000;

    public P1(YA ya, C1K c1k, C1X c1x) {
        this.A06 = ya;
        this.A04 = c1k;
        this.A05 = c1x;
    }

    public final P1 A07(int i) {
        this.A00 = i;
        return this;
    }

    public final P1 A08(C1M c1m) {
        this.A01 = c1m;
        return this;
    }

    public final P1 A09(String str) {
        this.A02 = str;
        return this;
    }

    public final P1 A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final P3 A0B() {
        return new P3(this, null);
    }
}
