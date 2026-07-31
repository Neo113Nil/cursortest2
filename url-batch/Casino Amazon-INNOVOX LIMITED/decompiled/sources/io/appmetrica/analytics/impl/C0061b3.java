package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0061b3 implements InterfaceC0087c3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1175a;

    public C0061b3(int i) {
        this.f1175a = i;
    }

    public static InterfaceC0087c3 a(InterfaceC0087c3... interfaceC0087c3Arr) {
        return new C0061b3(b(interfaceC0087c3Arr));
    }

    public static int b(InterfaceC0087c3... interfaceC0087c3Arr) {
        int i = 0;
        for (InterfaceC0087c3 interfaceC0087c3 : interfaceC0087c3Arr) {
            if (interfaceC0087c3 != null) {
                i = interfaceC0087c3.getBytesTruncated() + i;
            }
        }
        return i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0087c3
    public final int getBytesTruncated() {
        return this.f1175a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f1175a + AbstractJsonLexerKt.END_OBJ;
    }
}
