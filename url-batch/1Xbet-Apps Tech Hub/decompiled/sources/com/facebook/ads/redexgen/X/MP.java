package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class MP {
    public int A00;
    public EnumC0636Ld A01;
    public MT A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final YA A0C;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    public MP(YA ya, MT mt) {
        this.A0C = ya;
        this.A02 = mt;
    }

    public final MP A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final MP A0E(EnumC0636Ld enumC0636Ld) {
        this.A01 = enumC0636Ld;
        return this;
    }

    public final MP A0F(String str) {
        this.A03 = str;
        return this;
    }

    public final MP A0G(String str) {
        this.A04 = str;
        return this;
    }

    public final MP A0H(String str) {
        this.A05 = str;
        return this;
    }

    public final MP A0I(String str) {
        this.A06 = str;
        return this;
    }

    public final MP A0J(boolean z) {
        this.A09 = z;
        return this;
    }

    public final MP A0K(boolean z) {
        this.A0A = z;
        return this;
    }

    public final MP A0L(boolean z) {
        this.A0B = z;
        return this;
    }

    public final MQ A0M() {
        return new MQ(this, null);
    }
}
