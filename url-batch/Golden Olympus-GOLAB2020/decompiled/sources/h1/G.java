package h1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class G implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f36710b;

    public G(Handler handler) {
        this.f36710b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f36710b.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.f36710b + " is shutting down");
    }
}
