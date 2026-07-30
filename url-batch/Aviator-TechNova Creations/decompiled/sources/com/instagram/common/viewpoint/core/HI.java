package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public abstract class HI {
    public final H1 A00;

    public abstract boolean A0B(C4J c4j) throws C01042i;

    public abstract boolean A0C(C4J c4j, long j) throws C01042i;

    public HI(H1 h1) {
        this.A00 = h1;
    }

    public final boolean A00(C4J c4j, long j) throws C01042i {
        return A0B(c4j) && A0C(c4j, j);
    }
}
