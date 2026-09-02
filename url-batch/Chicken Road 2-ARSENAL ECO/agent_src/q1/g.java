package q1;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r.C0608a;

/* loaded from: classes.dex */
public final class g extends r.h implements ScheduledFuture {

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledFuture f5774m;

    public g(f fVar) {
        this.f5774m = fVar.a(new a6.d(this));
    }

    @Override // r.h
    public final void c() {
        ScheduledFuture scheduledFuture = this.f5774m;
        Object obj = this.f5837f;
        scheduledFuture.cancel((obj instanceof C0608a) && ((C0608a) obj).f5817a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f5774m.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f5774m.getDelay(timeUnit);
    }
}
