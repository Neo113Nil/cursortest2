package ie;

import ge.a0;
import ge.d1;
import ge.j1;
import ge.k1;
import ge.q;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends ge.a implements g, o {

    /* renamed from: r, reason: collision with root package name */
    public final c f4755r;

    public n(CoroutineContext coroutineContext, c cVar) {
        super(coroutineContext, true);
        this.f4755r = cVar;
    }

    @Override // ge.k1, ge.c1
    public final void a(CancellationException cancellationException) {
        Object obj = k1.f4374d.get(this);
        if (obj instanceof q) {
            return;
        }
        if ((obj instanceof j1) && ((j1) obj).c()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new d1(t(), null, this);
        }
        q(cancellationException);
    }

    @Override // ie.o
    public final Object b(Object obj) {
        return this.f4755r.b(obj);
    }

    @Override // ie.g
    public final Object c(ld.a aVar) {
        return this.f4755r.c(aVar);
    }

    @Override // ge.a
    public final void f0(Throwable th, boolean z10) {
        if (this.f4755r.h(th, false) || z10) {
            return;
        }
        a0.o(th, this.f4322i);
    }

    @Override // ge.a
    public final void g0(Object obj) {
        this.f4755r.h(null, false);
    }

    @Override // ie.o
    public final Object i(Object obj, ld.a aVar) {
        return this.f4755r.i(obj, aVar);
    }

    @Override // ie.g
    public final b iterator() {
        c cVar = this.f4755r;
        cVar.getClass();
        return new b(cVar);
    }

    @Override // ge.k1
    public final void q(CancellationException cancellationException) {
        this.f4755r.h(cancellationException, true);
        n(cancellationException);
    }
}
