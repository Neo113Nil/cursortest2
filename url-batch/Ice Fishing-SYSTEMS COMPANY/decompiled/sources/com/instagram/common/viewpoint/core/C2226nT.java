package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2226nT implements InterfaceC1003Jj {
    public final long A00;
    public final BP<C2349pT> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C2226nT(long j9, BP<C2349pT> bp) {
        this.A00 = j9;
        this.A01 = bp;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final List<C2349pT> A7X(long j9) {
        return j9 >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final long A83(int i) {
        AbstractC06233y.A07(i == 0);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final int A8a(long j9) {
        return this.A00 > j9 ? 0 : -1;
    }
}
