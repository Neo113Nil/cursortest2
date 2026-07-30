package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.oC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1797oC implements C1S {
    public final C1802oH A00;
    public final AbstractC0303Am<Integer> A01;
    public static final String A04 = AbstractC01484a.A0h(0);
    public static final String A03 = AbstractC01484a.A0h(1);
    public static final C1R<C1797oC> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oD
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C1797oC.A00(bundle);
        }
    };

    public C1797oC(C1802oH c1802oH, List<Integer> trackIndices) {
        if (trackIndices.isEmpty() || (((Integer) Collections.min(trackIndices)).intValue() >= 0 && ((Integer) Collections.max(trackIndices)).intValue() < c1802oH.A01)) {
            this.A00 = c1802oH;
            this.A01 = AbstractC0303Am.A05(trackIndices);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ C1797oC A00(Bundle bundle) {
        return new C1797oC(C1802oH.A06.A6X((Bundle) C3M.A01(bundle.getBundle(A04))), AD.A0A((int[]) C3M.A01(bundle.getIntArray(A03))));
    }

    public final int A01() {
        return this.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1797oC c1797oC = (C1797oC) obj;
        return this.A00.equals(c1797oC.A00) && this.A01.equals(c1797oC.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
