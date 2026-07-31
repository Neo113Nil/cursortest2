package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0656yg {

    /* renamed from: a, reason: collision with root package name */
    public final String f1586a;
    public final String b;
    public final C0129dj c;

    public C0656yg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C0129dj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f1586a + "', identifier='" + this.b + "', screen=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public C0656yg(String str, String str2, C0129dj c0129dj) {
        this.f1586a = str;
        this.b = str2;
        this.c = c0129dj;
    }
}
