package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0881Ep extends AbstractRunnableC1326Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0876Ek A02;

    public C0881Ep(C0876Ek c0876Ek, int i, int i4) {
        this.A02 = c0876Ek;
        this.A00 = i;
        this.A01 = i4;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        UM um;
        um = this.A02.A0C;
        um.A02(new C0864Dy(this.A00, this.A01));
    }
}
