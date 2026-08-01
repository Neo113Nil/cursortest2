package t5;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f9281a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9282b;

    public a(boolean z10) {
        this.f9282b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.f9282b ? "WM.task-" : "androidx.work-") + this.f9281a.incrementAndGet());
    }
}
