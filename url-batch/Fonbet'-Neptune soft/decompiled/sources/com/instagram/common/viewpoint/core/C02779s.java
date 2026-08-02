package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.9s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02779s extends AbstractC1808oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC01424a.A0h(1);
    public static final String A03 = AbstractC01424a.A0h(2);
    public static final C1R<C02779s> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.op
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            C02779s A00;
            A00 = C02779s.A00(bundle);
            return A00;
        }
    };

    public C02779s() {
        this.A01 = false;
        this.A00 = false;
    }

    public C02779s(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C02779s A00(Bundle bundle) {
        boolean isRated = bundle.getInt(AbstractC1808oU.A02, -1) == 0;
        C3M.A07(isRated);
        boolean isRated2 = bundle.getBoolean(A04, false);
        if (isRated2) {
            return new C02779s(bundle.getBoolean(A03, false));
        }
        return new C02779s();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C02779s)) {
            return false;
        }
        C02779s c02779s = (C02779s) obj;
        return this.A00 == c02779s.A00 && this.A01 == c02779s.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
