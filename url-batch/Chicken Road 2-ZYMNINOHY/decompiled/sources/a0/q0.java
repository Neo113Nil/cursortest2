package a0;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class q0 implements S {

    /* renamed from: a, reason: collision with root package name */
    public final W.D f4233a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4234b;

    /* renamed from: c, reason: collision with root package name */
    public long f4235c;

    /* renamed from: d, reason: collision with root package name */
    public long f4236d;

    /* renamed from: e, reason: collision with root package name */
    public T.I f4237e = T.I.f2663d;

    public q0(W.D d4) {
        this.f4233a = d4;
    }

    @Override // a0.S
    public final long a() {
        long j4 = this.f4235c;
        if (!this.f4234b) {
            return j4;
        }
        this.f4233a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4236d;
        return (this.f4237e.f2664a == 1.0f ? W.J.M(elapsedRealtime) : elapsedRealtime * r4.f2666c) + j4;
    }

    public final void c(long j4) {
        this.f4235c = j4;
        if (this.f4234b) {
            this.f4233a.getClass();
            this.f4236d = SystemClock.elapsedRealtime();
        }
    }

    @Override // a0.S
    public final void d(T.I i4) {
        if (this.f4234b) {
            c(a());
        }
        this.f4237e = i4;
    }

    @Override // a0.S
    public final T.I e() {
        return this.f4237e;
    }

    public final void f() {
        if (this.f4234b) {
            return;
        }
        this.f4233a.getClass();
        this.f4236d = SystemClock.elapsedRealtime();
        this.f4234b = true;
    }
}
