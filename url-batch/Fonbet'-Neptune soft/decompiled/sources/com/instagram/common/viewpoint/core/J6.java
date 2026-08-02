package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class J6 extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C0507Is A00;
    public final /* synthetic */ boolean A01;

    public J6(C0507Is c0507Is, boolean z) {
        this.A00 = c0507Is;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        C0991ai c0991ai;
        c0991ai = this.A00.A0c;
        AbstractC0883Xm A0C = c0991ai.A0C();
        if (A0C == null) {
            return;
        }
        A0C.setPageDetailsVisible((this.A01 || A0C.A0B()) ? false : true);
        A0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
