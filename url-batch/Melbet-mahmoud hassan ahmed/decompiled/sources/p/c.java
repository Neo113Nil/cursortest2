package p;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class c {

    private static class a implements Executor {

        /* renamed from: f, reason: collision with root package name */
        private final Handler f19928f;

        a(Handler handler) {
            this.f19928f = (Handler) q.f.a(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f19928f.post((Runnable) q.f.a(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f19928f + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
