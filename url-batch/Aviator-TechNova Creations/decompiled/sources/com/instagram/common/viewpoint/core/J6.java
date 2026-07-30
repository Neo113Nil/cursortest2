package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class J6 extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C0513Is A00;
    public final /* synthetic */ boolean A01;

    public J6(C0513Is c0513Is, boolean z) {
        this.A00 = c0513Is;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C0997ai c0997ai;
        c0997ai = this.A00.A0c;
        AbstractC0889Xm A0C = c0997ai.A0C();
        if (A0C == null) {
            return;
        }
        A0C.setPageDetailsVisible((this.A01 || A0C.A0B()) ? false : true);
        A0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
