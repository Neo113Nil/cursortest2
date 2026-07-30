package X0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class B extends FutureTask {

    /* renamed from: n, reason: collision with root package name */
    public C f3633n;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f3633n.d((A) get());
            } catch (InterruptedException | ExecutionException e6) {
                this.f3633n.d(new A(e6));
            }
        } finally {
            this.f3633n = null;
        }
    }
}
