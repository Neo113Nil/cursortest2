package k2;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class F implements G {

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f5313d;

    public F(ScheduledFuture scheduledFuture) {
        this.f5313d = scheduledFuture;
    }

    @Override // k2.G
    public final void a() {
        this.f5313d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f5313d + ']';
    }
}
