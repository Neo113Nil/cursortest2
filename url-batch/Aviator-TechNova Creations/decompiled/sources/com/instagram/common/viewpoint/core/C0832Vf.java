package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0832Vf implements ViewpointAction<UE, UJ> {
    public VN A00;

    public C0832Vf(VN vn) {
        this.A00 = vn;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.instagram.common.viewpoint.core.ViewpointAction
    public final void A6J(C1883pu<UE, UJ> c1883pu, InterfaceC1874pk interfaceC1874pk) {
        switch (interfaceC1874pk.A9M(c1883pu)) {
            case A02:
            case A04:
                this.A00.A02(c1883pu, interfaceC1874pk);
                break;
        }
    }
}
