package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC2319oz implements InterfaceC1003Jj {
    public long A00;
    public InterfaceC1003Jj A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC2319oz
    public abstract void A0B();

    @Override // com.instagram.common.viewpoint.core.AbstractC06715u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j9, InterfaceC1003Jj interfaceC1003Jj, long j10) {
        super.A01 = j9;
        this.A01 = interfaceC1003Jj;
        if (j10 == Long.MAX_VALUE) {
            j10 = super.A01;
        }
        this.A00 = j10;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final List<C2349pT> A7X(long j9) {
        return ((InterfaceC1003Jj) AbstractC06233y.A01(this.A01)).A7X(j9 - this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final long A83(int i) {
        return ((InterfaceC1003Jj) AbstractC06233y.A01(this.A01)).A83(i) + this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final int A84() {
        return ((InterfaceC1003Jj) AbstractC06233y.A01(this.A01)).A84();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final int A8a(long j9) {
        return ((InterfaceC1003Jj) AbstractC06233y.A01(this.A01)).A8a(j9 - this.A00);
    }
}
