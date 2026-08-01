package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0481Ex extends AbstractC1026a9 {
    public View A00;
    public C0457Dz A01;

    public C0481Ex(C0457Dz c0457Dz, C01721r c01721r) {
        super(c0457Dz, c01721r);
        this.A01 = c0457Dz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1026a9
    public final void A0L() {
        if (this.A00 != null) {
            this.A01.A0E().A3u();
            this.A06.A0E(this.A00);
        } else {
            this.A01.A0E().A3v();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1026a9
    public final void A0N(InterfaceC01430o interfaceC01430o, C8F c8f, C8D c8d, C01731s c01731s) {
        this.A01.A0E().A3o();
        C1063ak c1063ak = (C1063ak) interfaceC01430o;
        C1029aC c1029aC = new C1029aC(this, c01731s, c1063ak);
        A0E().postDelayed(c1029aC, c8f.A05().A05());
        c1063ak.A0I(this.A01, this.A08, this.A07.A07, new C1028aB(this, c1029aC), c01731s);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1026a9
    public final void A0Q(String str) {
        this.A01.A0E().A3t(str != null);
        super.A0Q(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1026a9
    public final void A0T(boolean z) {
        super.A0T(z);
        this.A00 = null;
    }
}
