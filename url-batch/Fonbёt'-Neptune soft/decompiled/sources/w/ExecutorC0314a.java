package w;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0314a implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public final Handler f3548e;

    public ExecutorC0314a(Handler handler) {
        this.f3548e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f3548e;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
