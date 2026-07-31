package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0395o4 extends C0061b3 {
    public final int b;

    public C0395o4(int i, int i2) {
        super(i2);
        this.b = i;
    }

    @Override // io.appmetrica.analytics.impl.C0061b3
    public final String toString() {
        return "CollectionTrimInfo{itemsDropped=" + this.b + ", bytesTruncated=" + this.f1175a + AbstractJsonLexerKt.END_OBJ;
    }
}
