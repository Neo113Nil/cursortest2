package androidx.lifecycle;

import H5.C0162w;
import H5.InterfaceC0163x;
import java.io.Closeable;
import o5.InterfaceC0569i;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238e implements Closeable, InterfaceC0163x {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0569i f3506f;

    public C0238e(InterfaceC0569i interfaceC0569i) {
        this.f3506f = interfaceC0569i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        H5.X x6 = (H5.X) this.f3506f.m(C0162w.f1110g);
        if (x6 != null) {
            x6.d(null);
        }
    }

    @Override // H5.InterfaceC0163x
    public final InterfaceC0569i e() {
        return this.f3506f;
    }
}
