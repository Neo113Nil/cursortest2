package u;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public final Handler f2983e;

    public b(Handler handler) {
        this.f2983e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f2983e;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
