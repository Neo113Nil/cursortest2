package androidx.lifecycle;

import D4.C0021v;
import D4.InterfaceC0022w;
import java.io.Closeable;
import k4.InterfaceC1223i;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235e implements Closeable, InterfaceC0022w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1223i f4571a;

    public C0235e(InterfaceC1223i interfaceC1223i) {
        this.f4571a = interfaceC1223i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        D4.X x5 = (D4.X) this.f4571a.o(C0021v.f545b);
        if (x5 != null) {
            x5.b(null);
        }
    }

    @Override // D4.InterfaceC0022w
    public final InterfaceC1223i g() {
        return this.f4571a;
    }
}
