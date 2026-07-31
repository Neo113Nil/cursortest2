package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3630ns {
    public static final AbstractC3630ns A00 = new C2174Be();
    public static final AbstractC3630ns A02 = new C2172Bc(-1);
    public static final AbstractC3630ns A01 = new C2172Bc(1);

    public abstract int A05();

    public abstract AbstractC3630ns A06(int left, int right);

    public abstract AbstractC3630ns A07(long left, long right);

    public abstract <T> AbstractC3630ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC3630ns A09(boolean left, boolean right);

    public abstract AbstractC3630ns A0A(boolean left, boolean right);

    public AbstractC3630ns() {
    }

    public /* synthetic */ AbstractC3630ns(C2174Be c2174Be) {
        this();
    }

    public static AbstractC3630ns A01() {
        return A00;
    }
}
