package com.instagram.common.viewpoint.core;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1794fz {
    public C1798g3 A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C1794fz A00(C1798g3 c1798g3) {
        this.A00 = c1798g3;
        return this;
    }

    public final C1794fz A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C1794fz A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C1794fz A03(boolean z8) {
        this.A04 = z8;
        return this;
    }

    public final C1794fz A04(boolean z8) {
        this.A03 = z8;
        return this;
    }

    public final C1795g0 A05() {
        return new C1795g0(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
