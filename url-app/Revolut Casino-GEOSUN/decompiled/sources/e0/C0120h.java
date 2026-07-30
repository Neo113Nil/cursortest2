package e0;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120h implements InterfaceC0117e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f1871a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1872b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f1873c = new AtomicBoolean(false);

    public C0120h(ExecutorService executorService) {
        this.f1871a = executorService;
    }

    @Override // e0.InterfaceC0117e
    public final void a(RunnableC0115c runnableC0115c) {
        this.f1872b.add(runnableC0115c);
        this.f1871a.execute(new androidx.lifecycle.k(1, this));
    }
}
