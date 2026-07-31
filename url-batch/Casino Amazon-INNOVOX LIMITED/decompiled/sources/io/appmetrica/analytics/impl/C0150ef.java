package io.appmetrica.analytics.impl;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0150ef implements R7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0480rf f1237a;
    public final List<C0125df> b;

    public C0150ef(C0480rf c0480rf, List<C0125df> list) {
        this.f1237a = c0480rf;
        this.b = list;
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final List<C0125df> a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final Object b() {
        return this.f1237a;
    }

    public final C0480rf c() {
        return this.f1237a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f1237a + ", candidates=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }
}
