package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.k7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1559k7 implements J7 {
    public final long[] A00;
    public final C1787o2[] A01;

    public C1559k7(C1787o2[] c1787o2Arr, long[] jArr) {
        this.A01 = c1787o2Arr;
        this.A00 = jArr;
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final List<C1787o2> A7P(long j) {
        int A0L = AbstractC01484a.A0L(this.A00, j, true, false);
        if (A0L == -1 || this.A01[A0L] == C1787o2.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[A0L]);
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final long A7v(int i) {
        boolean z = true;
        C3M.A07(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        C3M.A07(z);
        return this.A00[i];
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final int A7w() {
        return this.A00.length;
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final int A8S(long j) {
        int A0K = AbstractC01484a.A0K(this.A00, j, false, false);
        int index = this.A00.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
