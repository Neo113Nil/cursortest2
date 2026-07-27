package W2;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class K implements L {

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f4226d;

    public K(ScheduledFuture scheduledFuture) {
        this.f4226d = scheduledFuture;
    }

    @Override // W2.L
    public final void a() {
        this.f4226d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f4226d + ']';
    }
}
