package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2174Be extends AbstractC3630ns {
    public C2174Be() {
        super(null);
    }

    private final AbstractC3630ns A00(int result) {
        AbstractC3630ns abstractC3630ns;
        AbstractC3630ns abstractC3630ns2;
        AbstractC3630ns abstractC3630ns3;
        if (result < 0) {
            abstractC3630ns3 = AbstractC3630ns.A02;
            return abstractC3630ns3;
        }
        if (result > 0) {
            abstractC3630ns2 = AbstractC3630ns.A01;
            return abstractC3630ns2;
        }
        abstractC3630ns = AbstractC3630ns.A00;
        return abstractC3630ns;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final AbstractC3630ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final AbstractC3630ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final <T> AbstractC3630ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final AbstractC3630ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3630ns
    public final AbstractC3630ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
