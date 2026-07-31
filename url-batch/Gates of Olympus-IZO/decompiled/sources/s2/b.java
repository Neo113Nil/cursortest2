package s2;

import H1.o;
import L1.z;
import j1.p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.C0535g;
import k2.C0536h;
import k2.InterfaceC0534f;
import k2.w0;
import m2.C0627b;
import p2.s;

/* loaded from: classes.dex */
public final class b implements InterfaceC0534f, w0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0536h f7550d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f7552f;

    public b(c cVar, C0536h c0536h, Object obj) {
        this.f7552f = cVar;
        this.f7550d = c0536h;
        this.f7551e = obj;
    }

    @Override // k2.w0
    public final void a(s sVar, int i3) {
        this.f7550d.a(sVar, i3);
    }

    @Override // P1.d
    public final P1.i getContext() {
        return this.f7550d.f5365h;
    }

    @Override // k2.InterfaceC0534f
    public final p i(Object obj, Y1.f fVar) {
        c cVar = this.f7552f;
        C0627b c0627b = new C0627b(cVar, 1, this);
        p i3 = this.f7550d.i((z) obj, c0627b);
        if (i3 != null) {
            c.f7553g.set(cVar, this.f7551e);
        }
        return i3;
    }

    @Override // k2.InterfaceC0534f
    public final void n(Object obj, Y1.f fVar) {
        z zVar = z.f2729a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f7553g;
        c cVar = this.f7552f;
        atomicReferenceFieldUpdater.set(cVar, this.f7551e);
        o oVar = new o(cVar, 3, this);
        C0536h c0536h = this.f7550d;
        c0536h.A(zVar, c0536h.f5311f, new C0535g(0, oVar));
    }

    @Override // P1.d
    public final void resumeWith(Object obj) {
        this.f7550d.resumeWith(obj);
    }

    @Override // k2.InterfaceC0534f
    public final void t(Object obj) {
        this.f7550d.t(obj);
    }

    @Override // k2.InterfaceC0534f
    public final boolean v(Throwable th) {
        return this.f7550d.v(th);
    }
}
