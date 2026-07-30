package c7;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 implements i0 {

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledFuture f1703f;

    public h0(ScheduledFuture scheduledFuture) {
        this.f1703f = scheduledFuture;
    }

    @Override // c7.i0
    public final void a() {
        this.f1703f.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f1703f + ']';
    }
}
