package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3055w3 implements InterfaceC3081x3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f40000a;

    public C3055w3(int i4) {
        this.f40000a = i4;
    }

    public static InterfaceC3081x3 a(InterfaceC3081x3... interfaceC3081x3Arr) {
        return new C3055w3(b(interfaceC3081x3Arr));
    }

    public static int b(InterfaceC3081x3... interfaceC3081x3Arr) {
        int i4 = 0;
        for (InterfaceC3081x3 interfaceC3081x3 : interfaceC3081x3Arr) {
            if (interfaceC3081x3 != null) {
                i4 = interfaceC3081x3.getBytesTruncated() + i4;
            }
        }
        return i4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3081x3
    public final int getBytesTruncated() {
        return this.f40000a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f40000a + '}';
    }
}
