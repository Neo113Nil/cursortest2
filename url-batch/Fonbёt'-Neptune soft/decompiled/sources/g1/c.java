package g1;

import B.m;
import P0.l;
import Y0.C0112f;
import Y0.InterfaceC0111e;
import Y0.l0;
import d1.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c implements InterfaceC0111e, l0 {

    /* renamed from: e, reason: collision with root package name */
    public final C0112f f2227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f2228f;

    public c(d dVar, C0112f c0112f) {
        this.f2228f = dVar;
        this.f2227e = c0112f;
    }

    @Override // Y0.l0
    public final void a(v vVar, int i2) {
        this.f2227e.a(vVar, i2);
    }

    @Override // Y0.InterfaceC0111e
    public final m c(Object obj, l lVar) {
        d dVar = this.f2228f;
        b bVar = new b(1, dVar, this);
        m c2 = this.f2227e.c((F0.h) obj, bVar);
        if (c2 != null) {
            d.f2229g.set(dVar, null);
        }
        return c2;
    }

    @Override // H0.d
    public final H0.i f() {
        return this.f2227e.f1205i;
    }

    @Override // H0.d
    public final void j(Object obj) {
        this.f2227e.j(obj);
    }

    @Override // Y0.InterfaceC0111e
    public final void n(Object obj) {
        this.f2227e.n(obj);
    }

    @Override // Y0.InterfaceC0111e
    public final void o(Object obj, l lVar) {
        F0.h hVar = F0.h.f469a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f2229g;
        d dVar = this.f2228f;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f2227e.o(hVar, new b(0, dVar, this));
    }
}
