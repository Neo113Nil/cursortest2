package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qs implements rs {
    public final ScheduledFuture d;

    public qs(ScheduledFuture scheduledFuture) {
        this.d = scheduledFuture;
    }

    @Override // defpackage.rs
    public final void a() {
        this.d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.d + ']';
    }
}
