package l0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0487a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5242a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5243b;

    public ThreadFactoryC0487a(boolean z5) {
        this.f5243b = z5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.f5243b ? "WM.task-" : "androidx.work-") + this.f5242a.incrementAndGet());
    }
}
