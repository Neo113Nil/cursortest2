package s;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0221a implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public final Handler f2837e;

    public ExecutorC0221a(Handler handler) {
        this.f2837e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f2837e;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
