package b7;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1283d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f1284e;

    public /* synthetic */ e0(Handler handler, int i3) {
        this.f1283d = i3;
        this.f1284e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1283d) {
            case 0:
                this.f1284e.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f1284e;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}
