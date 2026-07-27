package D4;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class F implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f462a;

    public F(ScheduledFuture scheduledFuture) {
        this.f462a = scheduledFuture;
    }

    @Override // D4.G
    public final void b() {
        this.f462a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f462a + ']';
    }
}
