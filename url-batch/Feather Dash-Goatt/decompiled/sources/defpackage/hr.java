package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hr extends s0 implements ScheduledFuture {
    public final ScheduledFuture l;

    public hr(gr grVar) {
        this.l = grVar.a(new s40(19, this));
    }

    @Override // defpackage.s0
    public final void b() {
        ScheduledFuture scheduledFuture = this.l;
        Object obj = this.d;
        scheduledFuture.cancel((obj instanceof l0) && ((l0) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.l.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.l.getDelay(timeUnit);
    }
}
