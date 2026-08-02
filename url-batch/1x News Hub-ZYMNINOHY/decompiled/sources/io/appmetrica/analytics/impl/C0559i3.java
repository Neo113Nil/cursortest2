package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0559i3 implements InterfaceC0584j3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7496a;

    public C0559i3(int i3) {
        this.f7496a = i3;
    }

    public static InterfaceC0584j3 a(InterfaceC0584j3... interfaceC0584j3Arr) {
        return new C0559i3(b(interfaceC0584j3Arr));
    }

    public static int b(InterfaceC0584j3... interfaceC0584j3Arr) {
        int i3 = 0;
        for (InterfaceC0584j3 interfaceC0584j3 : interfaceC0584j3Arr) {
            if (interfaceC0584j3 != null) {
                i3 = interfaceC0584j3.getBytesTruncated() + i3;
            }
        }
        return i3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0584j3
    public final int getBytesTruncated() {
        return this.f7496a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f7496a + '}';
    }
}
