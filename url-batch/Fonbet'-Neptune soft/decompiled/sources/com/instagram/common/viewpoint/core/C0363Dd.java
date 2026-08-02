package com.instagram.common.viewpoint.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0363Dd extends AbstractC0642Nz {
    public final /* synthetic */ C0362Dc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363Dd(C0362Dc c0362Dc, double d, double d2, double d3, boolean z) {
        super(d, d2, d3, z);
        this.A00 = c0362Dc;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0642Nz
    public final void A00(boolean z, boolean z2, O1 o1) {
        C1153dL c1153dL;
        String str;
        Map A0J;
        boolean z3;
        c1153dL = this.A00.A0D;
        if (U7.A0z(c1153dL)) {
            z3 = this.A00.A0A;
            if (z3) {
                return;
            }
        }
        if (z2) {
            this.A00.A0A = true;
            C0362Dc c0362Dc = this.A00;
            str = this.A00.A0J;
            A0J = this.A00.A0J(EnumC1160dS.A0B);
            c0362Dc.A0R(str, A0J);
        }
    }
}
