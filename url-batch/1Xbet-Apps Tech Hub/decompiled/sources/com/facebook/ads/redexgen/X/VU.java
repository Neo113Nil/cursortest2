package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class VU implements FW {
    public final C0503Ft A00;
    public final Map<String, C0509Fz> A01;
    public final Map<String, C0504Fu> A02;
    public final long[] A03;

    public VU(C0503Ft c0503Ft, Map<String, C0509Fz> map, Map<String, C0504Fu> map2) {
        Map<String, C0509Fz> emptyMap;
        this.A00 = c0503Ft;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c0503Ft.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final List<FV> A6T(long j) {
        return this.A00.A0D(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final long A6t(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final int A6u() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final int A7L(long j) {
        int A0A = C0557Hx.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
