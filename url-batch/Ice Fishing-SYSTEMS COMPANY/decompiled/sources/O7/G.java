package O7;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class G implements H {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledFuture f2554n;

    public G(ScheduledFuture scheduledFuture) {
        this.f2554n = scheduledFuture;
    }

    @Override // O7.H
    public final void b() {
        this.f2554n.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f2554n + ']';
    }
}
