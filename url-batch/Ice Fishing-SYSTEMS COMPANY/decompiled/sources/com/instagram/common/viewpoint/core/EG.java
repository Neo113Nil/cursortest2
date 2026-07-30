package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class EG extends AbstractC1126Od {
    public final /* synthetic */ EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EG(EF ef, double d2, double d3, double d9, boolean z8) {
        super(d2, d3, d9, z8);
        this.A00 = ef;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1126Od
    public final void A00(boolean z8, boolean z9, C1128Of c1128Of) {
        C1839gi c1839gi;
        String str;
        Map A0J;
        boolean z10;
        c1839gi = this.A00.A0D;
        if (C1289Up.A0z(c1839gi)) {
            z10 = this.A00.A0A;
            if (z10) {
                return;
            }
        }
        if (z9) {
            this.A00.A0A = true;
            EF ef = this.A00;
            str = this.A00.A0J;
            A0J = this.A00.A0J(EnumC1717ek.A0B);
            ef.A0R(str, A0J);
        }
    }
}
