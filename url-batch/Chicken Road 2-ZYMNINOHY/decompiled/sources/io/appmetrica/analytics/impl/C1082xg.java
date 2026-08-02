package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* renamed from: io.appmetrica.analytics.impl.xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082xg {

    /* renamed from: a, reason: collision with root package name */
    public final String f13028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13029b;

    /* renamed from: c, reason: collision with root package name */
    public final C0542cj f13030c;

    public C1082xg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C0542cj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f13028a + "', identifier='" + this.f13029b + "', screen=" + this.f13030c + '}';
    }

    public C1082xg(String str, String str2, C0542cj c0542cj) {
        this.f13028a = str;
        this.f13029b = str2;
        this.f13030c = c0542cj;
    }
}
