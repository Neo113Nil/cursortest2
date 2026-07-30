package androidx.lifecycle;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import n6.C0787u;
import n6.InterfaceC0789w;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239e implements Closeable, InterfaceC0789w {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f3900d;

    public C0239e(CoroutineContext coroutineContext) {
        this.f3900d = coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n6.X x7 = (n6.X) this.f3900d.g(C0787u.f7085e);
        if (x7 != null) {
            x7.d(null);
        }
    }

    @Override // n6.InterfaceC0789w
    public final CoroutineContext h() {
        return this.f3900d;
    }
}
