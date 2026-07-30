package f5;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends q2.h implements ScheduledFuture {

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledFuture f3392m;

    public i(h hVar) {
        this.f3392m = hVar.a(new b6.c(14, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f3392m.compareTo(delayed);
    }

    @Override // q2.h
    public final void e() {
        ScheduledFuture scheduledFuture = this.f3392m;
        Object obj = this.f7508f;
        scheduledFuture.cancel((obj instanceof q2.a) && ((q2.a) obj).f7491a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f3392m.getDelay(timeUnit);
    }
}
