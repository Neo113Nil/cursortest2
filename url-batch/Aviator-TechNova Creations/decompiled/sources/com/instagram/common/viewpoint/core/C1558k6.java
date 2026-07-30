package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1558k6 implements J7 {
    public final C0531Jk A00;
    public final Map<String, C0538Jr> A01;
    public final Map<String, String> A02;
    public final Map<String, C0532Jl> A03;
    public final long[] A04;

    public C1558k6(C0531Jk c0531Jk, Map<String, C0538Jr> map, Map<String, C0532Jl> map2, Map<String, String> imageMap) {
        this.A00 = c0531Jk;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = c0531Jk.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final List<C1787o2> A7P(long j) {
        return this.A00.A0E(j, this.A01, this.A03, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final long A7v(int i) {
        return this.A04[i];
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final int A7w() {
        return this.A04.length;
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final int A8S(long j) {
        int A0K = AbstractC01484a.A0K(this.A04, j, false, false);
        int index = this.A04.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
