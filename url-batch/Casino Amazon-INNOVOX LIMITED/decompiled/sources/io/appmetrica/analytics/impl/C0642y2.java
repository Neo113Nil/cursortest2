package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0642y2 {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0617x2 f1575a;
    public final Boolean b;

    public C0642y2(EnumC0617x2 enumC0617x2, Boolean bool) {
        this.f1575a = enumC0617x2;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0642y2.class == obj.getClass()) {
            C0642y2 c0642y2 = (C0642y2) obj;
            if (this.f1575a != c0642y2.f1575a) {
                return false;
            }
            Boolean bool = this.b;
            if (bool != null) {
                return bool.equals(c0642y2.b);
            }
            if (c0642y2.b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC0617x2 enumC0617x2 = this.f1575a;
        int hashCode = (enumC0617x2 != null ? enumC0617x2.hashCode() : 0) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f1575a + ", mBackgroundRestricted=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }
}
