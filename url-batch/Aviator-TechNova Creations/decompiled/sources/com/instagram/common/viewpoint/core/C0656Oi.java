package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0656Oi implements R6 {
    public final /* synthetic */ OD A00;

    public C0656Oi(OD od) {
        this.A00 = od;
    }

    @Override // com.instagram.common.viewpoint.core.R6
    public final boolean AAA() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
