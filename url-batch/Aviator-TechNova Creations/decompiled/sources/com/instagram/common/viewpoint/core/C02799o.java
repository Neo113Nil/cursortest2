package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02799o extends AbstractC1814oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC01484a.A0h(1);
    public static final String A03 = AbstractC01484a.A0h(2);
    public static final C1R<C02799o> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oS
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            C02799o A00;
            A00 = C02799o.A00(bundle);
            return A00;
        }
    };

    public C02799o() {
        this.A01 = false;
        this.A00 = false;
    }

    public C02799o(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C02799o A00(Bundle bundle) {
        boolean rated = bundle.getInt(AbstractC1814oU.A02, -1) == 3;
        C3M.A07(rated);
        boolean rated2 = bundle.getBoolean(A04, false);
        if (rated2) {
            return new C02799o(bundle.getBoolean(A03, false));
        }
        return new C02799o();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C02799o)) {
            return false;
        }
        C02799o c02799o = (C02799o) obj;
        return this.A00 == c02799o.A00 && this.A01 == c02799o.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
