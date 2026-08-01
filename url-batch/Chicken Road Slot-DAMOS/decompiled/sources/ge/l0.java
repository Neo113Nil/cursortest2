package ge;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l0 implements m0 {

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f4377d;

    public l0(ScheduledFuture scheduledFuture) {
        this.f4377d = scheduledFuture;
    }

    @Override // ge.m0
    public final void a() {
        this.f4377d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f4377d + ']';
    }
}
