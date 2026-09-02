package H5;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class G implements H {

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledFuture f1030f;

    public G(ScheduledFuture scheduledFuture) {
        this.f1030f = scheduledFuture;
    }

    @Override // H5.H
    public final void b() {
        this.f1030f.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f1030f + ']';
    }
}
