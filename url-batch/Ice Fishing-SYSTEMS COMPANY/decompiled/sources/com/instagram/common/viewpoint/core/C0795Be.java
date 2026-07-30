package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0795Be extends AbstractC2251ns {
    public C0795Be() {
        super(null);
    }

    private final AbstractC2251ns A00(int result) {
        AbstractC2251ns abstractC2251ns;
        AbstractC2251ns abstractC2251ns2;
        AbstractC2251ns abstractC2251ns3;
        if (result < 0) {
            abstractC2251ns3 = AbstractC2251ns.A02;
            return abstractC2251ns3;
        }
        if (result > 0) {
            abstractC2251ns2 = AbstractC2251ns.A01;
            return abstractC2251ns2;
        }
        abstractC2251ns = AbstractC2251ns.A00;
        return abstractC2251ns;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2251ns
    public final int A05() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2251ns
    public final AbstractC2251ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2251ns
    public final AbstractC2251ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2251ns
    public final <T> AbstractC2251ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2251ns
    public final AbstractC2251ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2251ns
    public final AbstractC2251ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
