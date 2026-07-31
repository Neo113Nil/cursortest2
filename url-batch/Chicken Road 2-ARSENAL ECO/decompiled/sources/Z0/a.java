package Z0;

import D0.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f3104a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f3105b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f3104a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3105b.newThread(new p(runnable, 1));
        newThread.setName(this.f3104a);
        return newThread;
    }
}
