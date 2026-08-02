package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* loaded from: assets/audience_network.dex */
public final class N9 implements Serializable {
    public static final long serialVersionUID = 351643298236575728L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public N9(N8 n8) {
        String str;
        String str2;
        String str3;
        String str4;
        str = n8.A02;
        this.A02 = str;
        str2 = n8.A01;
        this.A01 = str2;
        str3 = n8.A00;
        this.A00 = str3;
        str4 = n8.A03;
        this.A03 = str4;
    }

    public final String A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }
}
