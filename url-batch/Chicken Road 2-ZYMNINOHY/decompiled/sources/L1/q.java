package L1;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m2.HandlerC1312d;

/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1659a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1660b;

    public q() {
        HandlerC1312d handlerC1312d = new HandlerC1312d(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f1660b = handlerC1312d;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1659a) {
            case 0:
                ((Executor) this.f1660b).execute(new B.b(6, runnable));
                break;
            default:
                ((HandlerC1312d) this.f1660b).post(runnable);
                break;
        }
    }

    public q(ExecutorService executorService) {
        this.f1660b = executorService;
    }
}
