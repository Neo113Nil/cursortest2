package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Km, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0553Km {
    public final int A00;
    public final long A01;

    public C0553Km(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C0553Km A00(InterfaceC1619lN interfaceC1619lN, C4J c4j) throws IOException {
        interfaceC1619lN.AG9(c4j.A0l(), 0, 8);
        c4j.A0f(0);
        int A0C = c4j.A0C();
        long size = c4j.A0O();
        return new C0553Km(A0C, size);
    }
}
