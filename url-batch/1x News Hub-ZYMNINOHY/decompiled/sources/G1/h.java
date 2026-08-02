package G1;

import B0.n;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f552a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f553b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f554c = new AtomicBoolean(false);

    public h(ExecutorService executorService) {
        this.f552a = executorService;
    }

    @Override // G1.e
    public final void a(c cVar) {
        this.f553b.add(cVar);
        this.f552a.execute(new n(1, this));
    }
}
