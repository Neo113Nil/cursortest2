package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Uq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0882Uq implements InterfaceC1117bj<IV, C0560Ia> {
    public C0879Un A00;

    public C0882Uq(C0879Un c0879Un) {
        this.A00 = c0879Un;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1117bj
    public final void A5X(C1114bg<IV, C0560Ia> c1114bg, InterfaceC1103bV interfaceC1103bV) {
        switch (IT.A00[interfaceC1103bV.A8A(c1114bg).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c1114bg, interfaceC1103bV);
                break;
        }
    }
}
