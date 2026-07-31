package com.facebook.ads.redexgen.core;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.Ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2494Ns implements Serializable {
    public static final long serialVersionUID = 42;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C2494Ns(C2493Nr c2493Nr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String str8;
        String str9;
        str = c2493Nr.A06;
        this.A06 = str;
        str2 = c2493Nr.A09;
        this.A09 = str2;
        str3 = c2493Nr.A08;
        this.A08 = str3;
        str4 = c2493Nr.A07;
        this.A07 = str4;
        str5 = c2493Nr.A04;
        this.A04 = str5;
        str6 = c2493Nr.A03;
        this.A03 = str6;
        str7 = c2493Nr.A05;
        this.A05 = str7;
        i = c2493Nr.A00;
        this.A00 = i;
        str8 = c2493Nr.A02;
        this.A02 = str8;
        str9 = c2493Nr.A01;
        this.A01 = str9;
    }

    public final int A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03 != null ? this.A03 : "";
    }

    public final String A04() {
        return this.A04 != null ? this.A04 : "";
    }

    public final String A05() {
        return this.A05;
    }

    public final String A06() {
        return this.A06;
    }

    public final String A07() {
        return this.A07 != null ? this.A07 : "";
    }

    public final String A08() {
        return this.A08 != null ? this.A08 : "";
    }
}
