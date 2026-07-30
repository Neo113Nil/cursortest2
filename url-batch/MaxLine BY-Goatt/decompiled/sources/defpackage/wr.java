package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wr implements bf1 {
    public final WeakReference m;
    public final vr n = new vr(this);

    public wr(ur urVar) {
        this.m = new WeakReference(urVar);
    }

    @Override // defpackage.bf1
    public final void addListener(Runnable runnable, Executor executor) {
        this.n.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ur urVar = (ur) this.m.get();
        boolean cancel = this.n.cancel(z);
        if (cancel && urVar != null) {
            urVar.a = null;
            urVar.b = null;
            urVar.c.set(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.n.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.n.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.n.isDone();
    }

    public final String toString() {
        return this.n.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.n.get(j, timeUnit);
    }
}
