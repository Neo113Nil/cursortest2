package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0710i3 implements InterfaceC0735j3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8378a;

    public C0710i3(int i2) {
        this.f8378a = i2;
    }

    public static InterfaceC0735j3 a(InterfaceC0735j3... interfaceC0735j3Arr) {
        return new C0710i3(b(interfaceC0735j3Arr));
    }

    public static int b(InterfaceC0735j3... interfaceC0735j3Arr) {
        int i2 = 0;
        for (InterfaceC0735j3 interfaceC0735j3 : interfaceC0735j3Arr) {
            if (interfaceC0735j3 != null) {
                i2 = interfaceC0735j3.getBytesTruncated() + i2;
            }
        }
        return i2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0735j3
    public final int getBytesTruncated() {
        return this.f8378a;
    }

    public String toString() {
        return B0.o.k(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.f8378a, '}');
    }
}
