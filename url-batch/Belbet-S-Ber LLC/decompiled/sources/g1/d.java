package g1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1628f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1629g;

    public d(Handler handler) {
        this.f1628f = 1;
        this.f1629g = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1628f) {
            case 0:
                this.f1629g.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f1629g;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public d() {
        this.f1628f = 0;
        this.f1629g = new Handler(Looper.getMainLooper());
    }
}
