package z3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends H {

    /* renamed from: e, reason: collision with root package name */
    public H f12018e;

    public n(H delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f12018e = delegate;
    }

    @Override // z3.H
    public final H a() {
        return this.f12018e.a();
    }

    @Override // z3.H
    public final H b() {
        return this.f12018e.b();
    }

    @Override // z3.H
    public final long c() {
        return this.f12018e.c();
    }

    @Override // z3.H
    public final H d(long j4) {
        return this.f12018e.d(j4);
    }

    @Override // z3.H
    public final boolean e() {
        return this.f12018e.e();
    }

    @Override // z3.H
    public final void f() {
        this.f12018e.f();
    }

    @Override // z3.H
    public final H g(long j4, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f12018e.g(j4, unit);
    }
}
