package O1;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s.C1409a;

/* loaded from: classes.dex */
public final class i extends s.g implements ScheduledFuture {

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f2255h;

    public i(h hVar) {
        this.f2255h = hVar.a(new B1.g(25, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f2255h.compareTo(delayed);
    }

    @Override // s.g
    public final void d() {
        ScheduledFuture scheduledFuture = this.f2255h;
        Object obj = this.f11745a;
        scheduledFuture.cancel((obj instanceof C1409a) && ((C1409a) obj).f11726a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f2255h.getDelay(timeUnit);
    }
}
