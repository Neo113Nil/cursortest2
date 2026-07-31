package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* loaded from: classes3.dex */
public final class Kg {

    /* renamed from: a, reason: collision with root package name */
    public final String f37891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37892b;

    /* renamed from: c, reason: collision with root package name */
    public final C2890pj f37893c;

    public Kg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C2890pj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f37891a + "', identifier='" + this.f37892b + "', screen=" + this.f37893c + '}';
    }

    public Kg(String str, String str2, C2890pj c2890pj) {
        this.f37891a = str;
        this.f37892b = str2;
        this.f37893c = c2890pj;
    }
}
