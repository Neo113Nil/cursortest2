package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Km, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0559Km {
    public final int A00;
    public final long A01;

    public C0559Km(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C0559Km A00(InterfaceC1625lN interfaceC1625lN, C4J c4j) throws IOException {
        interfaceC1625lN.AG9(c4j.A0l(), 0, 8);
        c4j.A0f(0);
        int A0C = c4j.A0C();
        long size = c4j.A0O();
        return new C0559Km(A0C, size);
    }
}
