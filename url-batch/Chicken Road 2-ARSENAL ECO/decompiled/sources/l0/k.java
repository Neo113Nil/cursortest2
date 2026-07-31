package l0;

import H5.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l1.InterfaceFutureC0490a;
import w0.C0709a;

/* loaded from: classes.dex */
public final class k implements InterfaceFutureC0490a {

    /* renamed from: f, reason: collision with root package name */
    public final w0.j f5278f = new w0.j();

    public k(a0 a0Var) {
        a0Var.G(false, true, new J5.o(4, this));
    }

    @Override // l1.InterfaceFutureC0490a
    public final void a(Runnable runnable, Executor executor) {
        this.f5278f.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return this.f5278f.cancel(z5);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5278f.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5278f.f6173f instanceof C0709a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5278f.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return this.f5278f.get(j4, timeUnit);
    }
}
