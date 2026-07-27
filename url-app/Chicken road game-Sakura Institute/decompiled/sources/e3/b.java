package e3;

import A1.T;
import W2.C0;
import W2.C0285g;
import W2.C0286h;
import W2.InterfaceC0284f;
import b3.r;
import b3.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class b implements InterfaceC0284f, C0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0286h f6256d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6257e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f6258i;

    public b(c cVar, C0286h c0286h, Object obj) {
        this.f6258i = cVar;
        this.f6256d = c0286h;
        this.f6257e = obj;
    }

    @Override // W2.InterfaceC0284f
    public final boolean H(Throwable th) {
        return this.f6256d.H(th);
    }

    @Override // W2.C0
    public final void a(r rVar, int i2) {
        this.f6256d.a(rVar, i2);
    }

    @Override // W2.InterfaceC0284f
    public final t c(Object obj, L2.c cVar) {
        c cVar2 = this.f6258i;
        Y2.b bVar = new Y2.b(cVar2, 1, this);
        t c4 = this.f6256d.c((Unit) obj, bVar);
        if (c4 != null) {
            c.f6259g.set(cVar2, this.f6257e);
        }
        return c4;
    }

    @Override // W2.InterfaceC0284f
    public final void n(Object obj, L2.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f6259g;
        c cVar2 = this.f6258i;
        atomicReferenceFieldUpdater.set(cVar2, this.f6257e);
        T t4 = new T(cVar2, 3, this);
        C0286h c0286h = this.f6256d;
        c0286h.D((Unit) obj, c0286h.f4224i, new C0285g(0, t4));
    }

    @Override // C2.a
    public final CoroutineContext p() {
        return this.f6256d.f4266k;
    }

    @Override // C2.a
    public final void u(Object obj) {
        this.f6256d.u(obj);
    }

    @Override // W2.InterfaceC0284f
    public final void z(Object obj) {
        this.f6256d.z(obj);
    }
}
