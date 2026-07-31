package m0;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f2877a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f2878b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f2879c = new AtomicBoolean(false);

    public h(ExecutorService executorService) {
        this.f2877a = executorService;
    }

    @Override // m0.e
    public final void a(c cVar) {
        this.f2878b.add(cVar);
        this.f2877a.execute(new androidx.lifecycle.k(2, this));
    }
}
