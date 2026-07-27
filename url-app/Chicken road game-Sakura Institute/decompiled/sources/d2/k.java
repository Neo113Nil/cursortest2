package d2;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6078a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6079b;

    /* renamed from: c, reason: collision with root package name */
    public i f6080c;

    /* renamed from: d, reason: collision with root package name */
    public final i f6081d;

    public k(Object obj, Object obj2, i iVar, i iVar2) {
        this.f6078a = obj;
        this.f6079b = obj2;
        h hVar = h.f6077a;
        this.f6080c = iVar == null ? hVar : iVar;
        this.f6081d = iVar2 == null ? hVar : iVar2;
    }

    public final k a() {
        i iVar = this.f6080c;
        i k4 = iVar.k(iVar.o() ? 2 : 1, null, null);
        i iVar2 = this.f6081d;
        return k(o() ? 2 : 1, k4, iVar2.k(iVar2.o() ? 2 : 1, null, null));
    }

    @Override // d2.i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k k(int i2, i iVar, i iVar2) {
        if (iVar == null) {
            iVar = this.f6080c;
        }
        if (iVar2 == null) {
            iVar2 = this.f6081d;
        }
        Object obj = this.f6078a;
        Object obj2 = this.f6079b;
        return i2 == 1 ? new j(obj, obj2, iVar, iVar2) : new g(obj, obj2, iVar, iVar2);
    }

    public abstract k c(Object obj, Object obj2, i iVar, i iVar2);

    public final k d() {
        i iVar = this.f6081d;
        k kVar = (!iVar.o() || this.f6080c.o()) ? this : (k) iVar.k(e(), k(1, null, ((k) iVar).f6080c), null);
        if (kVar.f6080c.o() && ((k) kVar.f6080c).f6080c.o()) {
            kVar = kVar.q();
        }
        return (kVar.f6080c.o() && kVar.f6081d.o()) ? kVar.a() : kVar;
    }

    public abstract int e();

    @Override // d2.i
    public final i f() {
        return this.f6081d;
    }

    public final k g() {
        k a4 = a();
        i iVar = a4.f6081d;
        if (!iVar.i().o()) {
            return a4;
        }
        k c4 = a4.c(null, null, null, ((k) iVar).q());
        i iVar2 = c4.f6081d;
        return ((k) iVar2.k(c4.e(), c4.k(1, null, ((k) iVar2).f6080c), null)).a();
    }

    @Override // d2.i
    public final Object getKey() {
        return this.f6078a;
    }

    @Override // d2.i
    public final Object getValue() {
        return this.f6079b;
    }

    public final i h() {
        if (this.f6080c.isEmpty()) {
            return h.f6077a;
        }
        k g4 = (this.f6080c.o() || this.f6080c.i().o()) ? this : g();
        return g4.c(null, null, ((k) g4.f6080c).h(), null).d();
    }

    @Override // d2.i
    public final i i() {
        return this.f6080c;
    }

    @Override // d2.i
    public final boolean isEmpty() {
        return false;
    }

    @Override // d2.i
    public final i j(Object obj, Iterable iterable, Comparator comparator) {
        int compare = comparator.compare(obj, this.f6078a);
        return (compare < 0 ? c(null, null, this.f6080c.j(obj, iterable, comparator), null) : compare == 0 ? c(obj, iterable, null, null) : c(null, null, null, this.f6081d.j(obj, iterable, comparator))).d();
    }

    @Override // d2.i
    public final i l(Object obj, Comparator comparator) {
        k c4;
        if (comparator.compare(obj, this.f6078a) < 0) {
            k g4 = (this.f6080c.isEmpty() || this.f6080c.o() || ((k) this.f6080c).f6080c.o()) ? this : g();
            c4 = g4.c(null, null, g4.f6080c.l(obj, comparator), null);
        } else {
            k q2 = this.f6080c.o() ? q() : this;
            i iVar = q2.f6081d;
            if (!iVar.isEmpty() && !iVar.o() && !((k) iVar).f6080c.o()) {
                q2 = q2.a();
                if (q2.f6080c.i().o()) {
                    q2 = q2.q().a();
                }
            }
            if (comparator.compare(obj, q2.f6078a) == 0) {
                i iVar2 = q2.f6081d;
                if (iVar2.isEmpty()) {
                    return h.f6077a;
                }
                i m4 = iVar2.m();
                q2 = q2.c(m4.getKey(), m4.getValue(), null, ((k) iVar2).h());
            }
            c4 = q2.c(null, null, null, q2.f6081d.l(obj, comparator));
        }
        return c4.d();
    }

    @Override // d2.i
    public final i m() {
        return this.f6080c.isEmpty() ? this : this.f6080c.m();
    }

    @Override // d2.i
    public final void n(u3.d dVar) {
        this.f6080c.n(dVar);
        dVar.V(this.f6078a, this.f6079b);
        this.f6081d.n(dVar);
    }

    @Override // d2.i
    public final i p() {
        i iVar = this.f6081d;
        return iVar.isEmpty() ? this : iVar.p();
    }

    public final k q() {
        return (k) this.f6080c.k(e(), null, k(1, ((k) this.f6080c).f6081d, null));
    }

    public void r(k kVar) {
        this.f6080c = kVar;
    }
}
