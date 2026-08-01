package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mk implements nk {
    public final ScheduledFuture f;

    public mk(ScheduledFuture scheduledFuture) {
        this.f = scheduledFuture;
    }

    @Override // defpackage.nk
    public final void a() {
        this.f.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f + ']';
    }
}
