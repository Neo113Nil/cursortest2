package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0138e3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1229a;

    public C0138e3(long j) {
        this.f1229a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0138e3.class == obj.getClass() && this.f1229a == ((C0138e3) obj).f1229a;
    }

    public final int hashCode() {
        long j = this.f1229a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f1229a + AbstractJsonLexerKt.END_OBJ;
    }
}
