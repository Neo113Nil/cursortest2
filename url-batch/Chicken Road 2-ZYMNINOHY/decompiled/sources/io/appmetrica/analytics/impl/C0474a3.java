package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0474a3 implements InterfaceC0500b3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11415a;

    public C0474a3(int i4) {
        this.f11415a = i4;
    }

    public static InterfaceC0500b3 a(InterfaceC0500b3... interfaceC0500b3Arr) {
        return new C0474a3(b(interfaceC0500b3Arr));
    }

    public static int b(InterfaceC0500b3... interfaceC0500b3Arr) {
        int i4 = 0;
        for (InterfaceC0500b3 interfaceC0500b3 : interfaceC0500b3Arr) {
            if (interfaceC0500b3 != null) {
                i4 = interfaceC0500b3.getBytesTruncated() + i4;
            }
        }
        return i4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0500b3
    public final int getBytesTruncated() {
        return this.f11415a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f11415a + '}';
    }
}
