package A;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4b;

    public /* synthetic */ c(Handler handler, int i4) {
        this.f3a = i4;
        this.f4b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3a) {
            case 0:
                runnable.getClass();
                Handler handler = this.f4b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                runnable.getClass();
                Handler handler2 = this.f4b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                this.f4b.post(runnable);
                return;
        }
    }
}
