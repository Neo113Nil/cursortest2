package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class Ei implements InterfaceC0087c3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f829a;
    public final InterfaceC0087c3 b;

    public Ei(Object obj, InterfaceC0087c3 interfaceC0087c3) {
        this.f829a = obj;
        this.b = interfaceC0087c3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0087c3
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f829a + ", metaInfo=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }
}
