package m8;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends c3.h implements ScheduledFuture {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledFuture f6601v;

    public i(h hVar) {
        this.f6601v = hVar.b(new l.d(9, this));
    }

    @Override // c3.h
    public final void c() {
        ScheduledFuture scheduledFuture = this.f6601v;
        Object obj = this.f1733d;
        scheduledFuture.cancel((obj instanceof c3.a) && ((c3.a) obj).f1713a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f6601v.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f6601v.getDelay(timeUnit);
    }
}
