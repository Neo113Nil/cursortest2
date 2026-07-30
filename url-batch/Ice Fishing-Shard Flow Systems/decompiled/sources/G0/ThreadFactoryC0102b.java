package G0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: G0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0102b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f781a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f782b;

    public ThreadFactoryC0102b(boolean z7) {
        this.f782b = z7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.f782b ? "WM.task-" : "androidx.work-") + this.f781a.incrementAndGet());
    }
}
