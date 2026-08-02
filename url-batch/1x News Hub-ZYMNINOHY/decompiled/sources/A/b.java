package A;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f0a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1b;

    public /* synthetic */ b(Handler handler, int i3) {
        this.f0a = i3;
        this.f1b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f0a) {
            case 0:
                runnable.getClass();
                Handler handler = this.f1b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.f1b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
