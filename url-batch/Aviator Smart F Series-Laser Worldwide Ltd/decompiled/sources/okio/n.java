package okio;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class n extends y0 {
    private y0 delegate;

    public n(y0 delegate) {
        kotlin.jvm.internal.s.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // okio.y0
    public y0 clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // okio.y0
    public y0 clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // okio.y0
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    public final y0 delegate() {
        return this.delegate;
    }

    @Override // okio.y0
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    public final n setDelegate(y0 delegate) {
        kotlin.jvm.internal.s.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }

    @Override // okio.y0
    public void throwIfReached() {
        this.delegate.throwIfReached();
    }

    @Override // okio.y0
    public y0 timeout(long j8, TimeUnit unit) {
        kotlin.jvm.internal.s.checkNotNullParameter(unit, "unit");
        return this.delegate.timeout(j8, unit);
    }

    @Override // okio.y0
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    @Override // okio.y0
    public y0 deadlineNanoTime(long j8) {
        return this.delegate.deadlineNanoTime(j8);
    }

    /* renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m1457setDelegate(y0 y0Var) {
        kotlin.jvm.internal.s.checkNotNullParameter(y0Var, "<set-?>");
        this.delegate = y0Var;
    }
}
