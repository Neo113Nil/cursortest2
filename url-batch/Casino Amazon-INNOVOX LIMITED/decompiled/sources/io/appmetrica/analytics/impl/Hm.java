package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class Hm {

    /* renamed from: a, reason: collision with root package name */
    public final long f879a;

    public Hm(long j) {
        this.f879a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Hm.class == obj.getClass() && this.f879a == ((Hm) obj).f879a;
    }

    public final int hashCode() {
        long j = this.f879a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f879a + AbstractJsonLexerKt.END_OBJ;
    }
}
