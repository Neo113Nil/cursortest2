package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.9s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02839s extends AbstractC1814oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC01484a.A0h(1);
    public static final String A03 = AbstractC01484a.A0h(2);
    public static final C1R<C02839s> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.op
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            C02839s A00;
            A00 = C02839s.A00(bundle);
            return A00;
        }
    };

    public C02839s() {
        this.A01 = false;
        this.A00 = false;
    }

    public C02839s(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C02839s A00(Bundle bundle) {
        boolean isRated = bundle.getInt(AbstractC1814oU.A02, -1) == 0;
        C3M.A07(isRated);
        boolean isRated2 = bundle.getBoolean(A04, false);
        if (isRated2) {
            return new C02839s(bundle.getBoolean(A03, false));
        }
        return new C02839s();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C02839s)) {
            return false;
        }
        C02839s c02839s = (C02839s) obj;
        return this.A00 == c02839s.A00 && this.A01 == c02839s.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
