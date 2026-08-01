package c3;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements ListenableFuture {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1741d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1742e = new j(this);

    public k(i iVar) {
        this.f1741d = new WeakReference(iVar);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f1742e.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f1741d.get();
        boolean cancel = this.f1742e.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f1736a = null;
            iVar.f1737b = null;
            iVar.f1738c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f1742e.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1742e.f1733d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1742e.isDone();
    }

    public final String toString() {
        return this.f1742e.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f1742e.get(j, timeUnit);
    }
}
