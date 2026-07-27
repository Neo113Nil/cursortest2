package a2;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w2.C1294c;

/* renamed from: a2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledFutureC0420i extends Q0.h implements ScheduledFuture {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledFuture f4934n;

    public ScheduledFutureC0420i(InterfaceC0419h interfaceC0419h) {
        this.f4934n = interfaceC0419h.a(new C1294c(this));
    }

    @Override // Q0.h
    public final void c() {
        ScheduledFuture scheduledFuture = this.f4934n;
        Object obj = this.f3936d;
        scheduledFuture.cancel((obj instanceof Q0.a) && ((Q0.a) obj).f3919a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f4934n.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4934n.getDelay(timeUnit);
    }
}
