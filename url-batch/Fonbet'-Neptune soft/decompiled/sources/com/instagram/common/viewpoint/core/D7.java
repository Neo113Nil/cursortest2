package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class D7 extends AbstractC0776Tf<C3Q> {
    public final /* synthetic */ D6 A00;

    public D7(D6 d6) {
        this.A00 = d6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3Q c3q) {
        E1 e1;
        E1 e12;
        E1 e13;
        String A02;
        e1 = this.A00.A00;
        if (e1 == null) {
            return;
        }
        D6 d6 = this.A00;
        D6 d62 = this.A00;
        e12 = this.A00.A00;
        int duration = e12.getDuration();
        e13 = this.A00.A00;
        A02 = d62.A02(duration - e13.getCurrentPositionInMillis());
        d6.setText(A02);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
    public final Class<C3Q> A01() {
        return C3Q.class;
    }
}
