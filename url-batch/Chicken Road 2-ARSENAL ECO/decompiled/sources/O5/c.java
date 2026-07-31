package O5;

import H5.AbstractC0161v;
import H5.Q;
import M5.w;
import java.util.concurrent.Executor;
import o5.C0570j;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class c extends Q implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public static final c f1814h = new c();

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC0161v f1815i;

    static {
        k kVar = k.f1830h;
        int i7 = w.f1626a;
        if (64 >= i7) {
            i7 = 64;
        }
        f1815i = kVar.I(M5.a.k("kotlinx.coroutines.io.parallelism", i7, 12));
    }

    @Override // H5.AbstractC0161v
    public final void F(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        f1815i.F(interfaceC0569i, runnable);
    }

    @Override // H5.AbstractC0161v
    public final void G(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        f1815i.G(interfaceC0569i, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        F(C0570j.f5620f, runnable);
    }

    @Override // H5.AbstractC0161v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
