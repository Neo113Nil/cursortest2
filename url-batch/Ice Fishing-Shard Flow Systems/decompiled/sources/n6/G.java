package n6;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class G implements H {

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f7013d;

    public G(ScheduledFuture scheduledFuture) {
        this.f7013d = scheduledFuture;
    }

    @Override // n6.H
    public final void dispose() {
        this.f7013d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f7013d + ']';
    }
}
