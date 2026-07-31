package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2731Xf implements ViewpointAction<C2675Uw, V1> {
    public XM A00;

    public C2731Xf(XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6R(C3827rN<C2675Uw, V1> c3827rN, InterfaceC3818rD interfaceC3818rD) {
        switch (interfaceC3818rD.A9U(c3827rN)) {
            case A02:
            case A04:
                this.A00.A02(c3827rN, interfaceC3818rD);
                break;
        }
    }
}
