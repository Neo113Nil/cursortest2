package okio;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class l extends C {

    /* renamed from: b, reason: collision with root package name */
    private C f43278b;

    public l(C delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f43278b = delegate;
    }

    public final C b() {
        return this.f43278b;
    }

    public final l c(C delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f43278b = delegate;
        return this;
    }

    @Override // okio.C
    public C clearDeadline() {
        return this.f43278b.clearDeadline();
    }

    @Override // okio.C
    public C clearTimeout() {
        return this.f43278b.clearTimeout();
    }

    @Override // okio.C
    public long deadlineNanoTime() {
        return this.f43278b.deadlineNanoTime();
    }

    @Override // okio.C
    public boolean hasDeadline() {
        return this.f43278b.hasDeadline();
    }

    @Override // okio.C
    public void throwIfReached() {
        this.f43278b.throwIfReached();
    }

    @Override // okio.C
    public C timeout(long j4, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f43278b.timeout(j4, unit);
    }

    @Override // okio.C
    public long timeoutNanos() {
        return this.f43278b.timeoutNanos();
    }

    @Override // okio.C
    public C deadlineNanoTime(long j4) {
        return this.f43278b.deadlineNanoTime(j4);
    }
}
