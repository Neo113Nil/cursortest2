package d4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class s implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f15715a = Executors.defaultThreadFactory();

    s(g0 g0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f15715a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
