package V7;

import O7.AbstractC0395u;
import O7.Q;
import T7.w;
import java.util.concurrent.Executor;
import v7.C5139j;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class d extends Q implements Executor {

    /* renamed from: v, reason: collision with root package name */
    public static final d f3351v = new d();

    /* renamed from: w, reason: collision with root package name */
    public static final AbstractC0395u f3352w;

    static {
        l lVar = l.f3367v;
        int i = w.f3171a;
        if (64 >= i) {
            i = 64;
        }
        f3352w = lVar.A(T7.a.k(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p(C5139j.f41372n, runnable);
    }

    @Override // O7.AbstractC0395u
    public final void p(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        f3352w.p(interfaceC5138i, runnable);
    }

    @Override // O7.AbstractC0395u
    public final void q(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        f3352w.q(interfaceC5138i, runnable);
    }

    @Override // O7.AbstractC0395u
    public final String toString() {
        return "Dispatchers.IO";
    }
}
