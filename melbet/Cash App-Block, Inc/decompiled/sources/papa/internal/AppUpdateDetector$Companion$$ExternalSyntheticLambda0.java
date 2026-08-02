package papa.internal;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class AppUpdateDetector$Companion$$ExternalSyntheticLambda0 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("app-upgrade-detector");
        return thread;
    }
}
