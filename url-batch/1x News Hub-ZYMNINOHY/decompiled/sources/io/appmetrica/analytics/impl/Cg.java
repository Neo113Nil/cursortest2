package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* loaded from: classes.dex */
public final class Cg {

    /* renamed from: a, reason: collision with root package name */
    public final String f5850a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5851b;

    /* renamed from: c, reason: collision with root package name */
    public final C0549hj f5852c;

    public Cg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C0549hj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f5850a + "', identifier='" + this.f5851b + "', screen=" + this.f5852c + '}';
    }

    public Cg(String str, String str2, C0549hj c0549hj) {
        this.f5850a = str;
        this.f5851b = str2;
        this.f5852c = c0549hj;
    }
}
