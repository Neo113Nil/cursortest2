package U0;

import E0.l;
import M0.C0048f;
import M0.InterfaceC0047e;
import M0.l0;
import R0.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.C0247g;

/* loaded from: classes.dex */
public final class c implements InterfaceC0047e, l0 {

    /* renamed from: e, reason: collision with root package name */
    public final C0048f f1029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1030f;

    public c(d dVar, C0048f c0048f) {
        this.f1030f = dVar;
        this.f1029e = c0048f;
    }

    @Override // M0.l0
    public final void a(v vVar, int i2) {
        this.f1029e.a(vVar, i2);
    }

    @Override // M0.InterfaceC0047e
    public final void c(Object obj, l lVar) {
        C0247g c0247g = C0247g.f3005a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1031g;
        d dVar = this.f1030f;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f1029e.c(c0247g, new b(0, dVar, this));
    }

    @Override // M0.InterfaceC0047e
    public final A.j e(Object obj, l lVar) {
        d dVar = this.f1030f;
        b bVar = new b(1, dVar, this);
        A.j e2 = this.f1029e.e((C0247g) obj, bVar);
        if (e2 != null) {
            d.f1031g.set(dVar, null);
        }
        return e2;
    }

    @Override // w0.d
    public final w0.i getContext() {
        return this.f1029e.f662i;
    }

    @Override // M0.InterfaceC0047e
    public final void j(Object obj) {
        this.f1029e.j(obj);
    }

    @Override // w0.d
    public final void resumeWith(Object obj) {
        this.f1029e.resumeWith(obj);
    }
}
