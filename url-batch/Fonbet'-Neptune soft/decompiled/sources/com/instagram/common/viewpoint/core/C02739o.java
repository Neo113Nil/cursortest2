package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02739o extends AbstractC1808oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC01424a.A0h(1);
    public static final String A03 = AbstractC01424a.A0h(2);
    public static final C1R<C02739o> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oS
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            C02739o A00;
            A00 = C02739o.A00(bundle);
            return A00;
        }
    };

    public C02739o() {
        this.A01 = false;
        this.A00 = false;
    }

    public C02739o(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C02739o A00(Bundle bundle) {
        boolean rated = bundle.getInt(AbstractC1808oU.A02, -1) == 3;
        C3M.A07(rated);
        boolean rated2 = bundle.getBoolean(A04, false);
        if (rated2) {
            return new C02739o(bundle.getBoolean(A03, false));
        }
        return new C02739o();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C02739o)) {
            return false;
        }
        C02739o c02739o = (C02739o) obj;
        return this.A00 == c02739o.A00 && this.A01 == c02739o.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
