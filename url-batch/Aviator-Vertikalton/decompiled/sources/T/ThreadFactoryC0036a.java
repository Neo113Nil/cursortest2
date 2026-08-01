package T;

import java.util.concurrent.ThreadFactory;

/* renamed from: T.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0036a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f777a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f777a);
        thread.setPriority(10);
        return thread;
    }
}
