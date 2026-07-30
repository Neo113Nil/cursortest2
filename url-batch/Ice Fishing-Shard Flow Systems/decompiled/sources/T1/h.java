package T1;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w.AbstractC0987g;
import w.C0981a;

/* loaded from: classes.dex */
public final class h extends AbstractC0987g implements ScheduledFuture {

    /* renamed from: p, reason: collision with root package name */
    public final ScheduledFuture f2588p;

    public h(g gVar) {
        this.f2588p = gVar.a(new B.f(14, this));
    }

    @Override // w.AbstractC0987g
    public final void c() {
        ScheduledFuture scheduledFuture = this.f2588p;
        Object obj = this.f8276d;
        scheduledFuture.cancel((obj instanceof C0981a) && ((C0981a) obj).f8257a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f2588p.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f2588p.getDelay(timeUnit);
    }
}
