package okhttp3.internal;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class _UtilJvmKt$$ExternalSyntheticLambda1 implements ThreadFactory {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ _UtilJvmKt$$ExternalSyntheticLambda1(String str, boolean z) {
        this.f$0 = str;
        this.f$1 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f$0);
        thread.setDaemon(this.f$1);
        return thread;
    }
}
