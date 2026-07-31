package q2;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class F implements G {

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f7852d;

    public F(ScheduledFuture scheduledFuture) {
        this.f7852d = scheduledFuture;
    }

    @Override // q2.G
    public final void a() {
        this.f7852d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f7852d + ']';
    }
}
