package F;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f222a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f223b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f224c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f222a = executorService;
    }

    @Override // F.e
    public final void a(c cVar) {
        this.f223b.add(cVar);
        this.f222a.execute(new h(0, this));
    }
}
