package E;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class e implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f651d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f652e;

    public /* synthetic */ e(Handler handler, int i2) {
        this.f651d = i2;
        this.f652e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f651d) {
            case 0:
                runnable.getClass();
                Handler handler = this.f652e;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                runnable.getClass();
                Handler handler2 = this.f652e;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                this.f652e.post(runnable);
                return;
        }
    }
}
