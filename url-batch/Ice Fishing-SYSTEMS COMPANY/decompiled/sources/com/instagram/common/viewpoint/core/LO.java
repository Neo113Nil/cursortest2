package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i, long j9) {
        this.A00 = i;
        this.A01 = j9;
    }

    public static LO A00(InterfaceC2190ms interfaceC2190ms, C06464v c06464v) throws IOException {
        interfaceC2190ms.AGt(c06464v.A0l(), 0, 8);
        c06464v.A0f(0);
        int A0C = c06464v.A0C();
        long size = c06464v.A0O();
        return new LO(A0C, size);
    }
}
