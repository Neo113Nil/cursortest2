package f8;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y0 extends q0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4201i = 0;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z0 f4202r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f4203s;

    public y0(z0 z0Var, Callable callable) {
        this.f4202r = z0Var;
        callable.getClass();
        this.f4203s = callable;
    }

    @Override // f8.q0
    public final void a(Throwable th) {
        switch (this.f4201i) {
            case 0:
                this.f4202r.m(th);
                break;
            default:
                this.f4202r.m(th);
                break;
        }
    }

    @Override // f8.q0
    public final void b(Object obj) {
        switch (this.f4201i) {
            case 0:
                this.f4202r.n((ListenableFuture) obj);
                break;
            default:
                this.f4202r.l(obj);
                break;
        }
    }

    @Override // f8.q0
    public final boolean d() {
        switch (this.f4201i) {
        }
        return this.f4202r.isDone();
    }

    @Override // f8.q0
    public final Object e() {
        switch (this.f4201i) {
            case 0:
                y yVar = (y) this.f4203s;
                ListenableFuture call = yVar.call();
                i7.a.x(call, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", yVar);
                return call;
            default:
                return ((Callable) this.f4203s).call();
        }
    }

    @Override // f8.q0
    public final String f() {
        switch (this.f4201i) {
            case 0:
                return ((y) this.f4203s).toString();
            default:
                return ((Callable) this.f4203s).toString();
        }
    }

    public y0(z0 z0Var, y yVar) {
        this.f4202r = z0Var;
        this.f4203s = yVar;
    }
}
