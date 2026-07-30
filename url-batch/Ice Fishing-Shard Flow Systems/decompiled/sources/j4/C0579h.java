package j4;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: j4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579h implements InterfaceC0576e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5975a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5976b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5977c = new AtomicBoolean(false);

    public C0579h(ExecutorService executorService) {
        this.f5975a = executorService;
    }

    @Override // j4.InterfaceC0576e
    public final void a(RunnableC0574c runnableC0574c) {
        this.f5976b.add(runnableC0574c);
        this.f5975a.execute(new A.k(19, this));
    }
}
