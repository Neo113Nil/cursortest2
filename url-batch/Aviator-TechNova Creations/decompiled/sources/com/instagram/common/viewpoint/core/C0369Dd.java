package com.instagram.common.viewpoint.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0369Dd extends AbstractC0648Nz {
    public final /* synthetic */ C0368Dc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0369Dd(C0368Dc c0368Dc, double d, double d2, double d3, boolean z) {
        super(d, d2, d3, z);
        this.A00 = c0368Dc;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0648Nz
    public final void A00(boolean z, boolean z2, O1 o1) {
        C1159dL c1159dL;
        String str;
        Map A0J;
        boolean z3;
        c1159dL = this.A00.A0D;
        if (U7.A0z(c1159dL)) {
            z3 = this.A00.A0A;
            if (z3) {
                return;
            }
        }
        if (z2) {
            this.A00.A0A = true;
            C0368Dc c0368Dc = this.A00;
            str = this.A00.A0J;
            A0J = this.A00.A0J(EnumC1166dS.A0B);
            c0368Dc.A0R(str, A0J);
        }
    }
}
