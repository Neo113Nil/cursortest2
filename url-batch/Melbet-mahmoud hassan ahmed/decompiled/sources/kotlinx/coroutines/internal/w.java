package kotlinx.coroutines.internal;

import m6.o1;

/* loaded from: classes.dex */
public class w<T> extends m6.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: h, reason: collision with root package name */
    public final y5.d<T> f18380h;

    @Override // m6.v1
    protected final boolean U() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        y5.d<T> dVar = this.f18380h;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // m6.v1
    protected void p(Object obj) {
        y5.d b7;
        b7 = z5.c.b(this.f18380h);
        g.c(b7, m6.c0.a(obj, this.f18380h), null, 2, null);
    }

    @Override // m6.a
    protected void t0(Object obj) {
        y5.d<T> dVar = this.f18380h;
        dVar.resumeWith(m6.c0.a(obj, dVar));
    }

    public final o1 x0() {
        m6.q N = N();
        if (N == null) {
            return null;
        }
        return N.getParent();
    }
}
