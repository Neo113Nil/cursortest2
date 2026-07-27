package k1;

import java.util.concurrent.ThreadFactory;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0752a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7372a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f7372a);
        thread.setPriority(10);
        return thread;
    }
}
