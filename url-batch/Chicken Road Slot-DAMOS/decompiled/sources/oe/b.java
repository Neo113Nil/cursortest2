package oe;

import ge.b2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import le.s;
import vd.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements ge.f, b2 {

    /* renamed from: d, reason: collision with root package name */
    public final ge.h f7564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f7565e;

    public b(c cVar, ge.h hVar) {
        this.f7565e = cVar;
        this.f7564d = hVar;
    }

    @Override // ge.b2
    public final void a(s sVar, int i3) {
        this.f7564d.a(sVar, i3);
    }

    @Override // ge.f
    public final void e(Object obj, n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f7566v;
        c cVar = this.f7565e;
        atomicReferenceFieldUpdater.set(cVar, null);
        a1.d dVar = new a1.d(13, cVar, this);
        ge.h hVar = this.f7564d;
        hVar.A((Unit) obj, hVar.f4361i, new ge.g(0, dVar));
    }

    @Override // ge.f
    public final a8.f f(Object obj, n nVar) {
        c cVar = this.f7565e;
        ge.g gVar = new ge.g(cVar, this);
        a8.f f3 = this.f7564d.f((Unit) obj, gVar);
        if (f3 != null) {
            c.f7566v.set(cVar, null);
        }
        return f3;
    }

    @Override // ge.f
    public final void g(Object obj) {
        this.f7564d.g(obj);
    }

    @Override // ld.a
    public final CoroutineContext getContext() {
        return this.f7564d.f4357s;
    }

    @Override // ld.a
    public final void resumeWith(Object obj) {
        this.f7564d.resumeWith(obj);
    }
}
