package f8;

import com.google.android.gms.internal.measurement.l5;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 extends q0 {

    /* renamed from: i, reason: collision with root package name */
    public final Executor f4114i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c0 f4115r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4116s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f4117t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f4118u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Callable callable) {
        this(c0Var, d0.f4128d);
        this.f4116s = 1;
        this.f4117t = c0Var;
        this.f4118u = callable;
    }

    @Override // f8.q0
    public final void a(Throwable th) {
        c0 c0Var = this.f4115r;
        c0Var.B = null;
        if (th instanceof ExecutionException) {
            c0Var.m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c0Var.cancel(false);
        } else {
            c0Var.m(th);
        }
    }

    @Override // f8.q0
    public final void b(Object obj) {
        this.f4115r.B = null;
        switch (this.f4116s) {
            case 0:
                this.f4117t.n((ListenableFuture) obj);
                break;
            default:
                this.f4117t.l(obj);
                break;
        }
    }

    @Override // f8.q0
    public final boolean d() {
        return this.f4115r.isDone();
    }

    @Override // f8.q0
    public final Object e() {
        switch (this.f4116s) {
            case 0:
                return ((l5) this.f4118u).call();
            default:
                return ((Callable) this.f4118u).call();
        }
    }

    @Override // f8.q0
    public final String f() {
        switch (this.f4116s) {
            case 0:
                return ((l5) this.f4118u).toString();
            default:
                return ((Callable) this.f4118u).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, l5 l5Var, Executor executor) {
        this(c0Var, executor);
        this.f4116s = 0;
        this.f4117t = c0Var;
        this.f4118u = l5Var;
    }

    public b0(c0 c0Var, Executor executor) {
        this.f4115r = c0Var;
        executor.getClass();
        this.f4114i = executor;
    }
}
