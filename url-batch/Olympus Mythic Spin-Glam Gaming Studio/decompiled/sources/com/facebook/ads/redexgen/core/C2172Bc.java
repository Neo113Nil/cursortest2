package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Bc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2172Bc extends AbstractC3630ns {
    public final int A00;

    public C2172Bc(int result) {
        super(null);
        this.A00 = result;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final int A05() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final AbstractC3630ns A06(int left, int right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final AbstractC3630ns A07(long left, long right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final <T> AbstractC3630ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final AbstractC3630ns A09(boolean left, boolean right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final AbstractC3630ns A0A(boolean left, boolean right) {
        return this;
    }
}
