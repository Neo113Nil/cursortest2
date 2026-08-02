package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hud extends hvg {
    private final Executor a;
    final /* synthetic */ hue b;

    public hud(hue hueVar, Executor executor) {
        this.b = hueVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.hvg
    public final void d(Throwable th) {
        hue hueVar = this.b;
        hueVar.b = null;
        if (th instanceof ExecutionException) {
            hueVar.p(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            hueVar.cancel(false);
        } else {
            hueVar.p(th);
        }
    }

    @Override // defpackage.hvg
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.p(e);
        }
    }

    @Override // defpackage.hvg
    public final boolean g() {
        return this.b.isDone();
    }
}
