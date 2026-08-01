package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0561Ib {
    public double A00;
    public EnumC0567Ih A01;
    public EnumC0568Ii A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final C0561Ib A00(double d) {
        this.A00 = d;
        return this;
    }

    public final C0561Ib A01(EnumC0567Ih enumC0567Ih) {
        this.A01 = enumC0567Ih;
        return this;
    }

    public final C0561Ib A02(EnumC0568Ii enumC0568Ii) {
        this.A02 = enumC0568Ii;
        return this;
    }

    public final C0561Ib A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C0561Ib A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C0561Ib A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C0561Ib A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C0562Ic A07(C7S c7s) {
        return new C0562Ic(c7s, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
