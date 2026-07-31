package y2;

import O1.t;
import R1.y;
import e2.InterfaceC0427f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m1.q;
import q2.C0820g;
import q2.C0821h;
import q2.InterfaceC0819f;
import q2.w0;
import s2.C0968b;
import v2.r;

/* loaded from: classes.dex */
public final class b implements InterfaceC0819f, w0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0821h f10396d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f10398f;

    public b(c cVar, C0821h c0821h, Object obj) {
        this.f10398f = cVar;
        this.f10396d = c0821h;
        this.f10397e = obj;
    }

    @Override // q2.InterfaceC0819f
    public final void B(Object obj) {
        this.f10396d.B(obj);
    }

    @Override // q2.InterfaceC0819f
    public final boolean C(Throwable th) {
        return this.f10396d.C(th);
    }

    @Override // q2.w0
    public final void a(r rVar, int i3) {
        this.f10396d.a(rVar, i3);
    }

    @Override // q2.InterfaceC0819f
    public final q j(Object obj, InterfaceC0427f interfaceC0427f) {
        c cVar = this.f10398f;
        C0968b c0968b = new C0968b(cVar, 1, this);
        q j3 = this.f10396d.j((y) obj, c0968b);
        if (j3 != null) {
            c.f10399g.set(cVar, this.f10397e);
        }
        return j3;
    }

    @Override // q2.InterfaceC0819f
    public final void m(Object obj, InterfaceC0427f interfaceC0427f) {
        y yVar = y.f4171a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f10399g;
        c cVar = this.f10398f;
        atomicReferenceFieldUpdater.set(cVar, this.f10397e);
        t tVar = new t(cVar, 3, this);
        C0821h c0821h = this.f10396d;
        c0821h.D(yVar, c0821h.f7850f, new C0820g(0, tVar));
    }

    @Override // V1.d
    public final V1.i t() {
        return this.f10396d.f7904h;
    }

    @Override // V1.d
    public final void u(Object obj) {
        this.f10396d.u(obj);
    }
}
