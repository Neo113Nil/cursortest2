package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* loaded from: assets/audience_network.dex */
public final class NF implements Serializable {
    public static final long serialVersionUID = 42;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public NF(NE ne) {
        String str;
        String str2;
        String str3;
        String str4;
        str = ne.A02;
        this.A02 = str;
        str2 = ne.A03;
        this.A03 = str2;
        str3 = ne.A01;
        this.A01 = str3;
        str4 = ne.A00;
        this.A00 = str4;
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
}
