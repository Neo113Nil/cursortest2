package j2;

import B1.C0097d;
import g.ThreadFactoryC0634b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712b extends ScheduledThreadPoolExecutor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0097d f7155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0712b(C0097d c0097d, ThreadFactoryC0634b threadFactoryC0634b) {
        super(1, threadFactoryC0634b);
        this.f7155d = c0097d;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            try {
                if (future.isDone()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
            } catch (ExecutionException e4) {
                th = e4.getCause();
            }
        }
        if (th != null) {
            this.f7155d.u(th);
        }
    }
}
