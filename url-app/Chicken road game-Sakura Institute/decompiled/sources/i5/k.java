package i5;

import java.util.Comparator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4944a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4945b;

    /* renamed from: c, reason: collision with root package name */
    public i f4946c;

    /* renamed from: d, reason: collision with root package name */
    public final i f4947d;

    public k(Object obj, Object obj2, i iVar, i iVar2) {
        this.f4944a = obj;
        this.f4945b = obj2;
        h hVar = h.f4943a;
        this.f4946c = iVar == null ? hVar : iVar;
        this.f4947d = iVar2 == null ? hVar : iVar2;
    }

    public final k a() {
        i iVar = this.f4946c;
        i s5 = iVar.s(iVar.p() ? 2 : 1, null, null);
        i iVar2 = this.f4947d;
        return s(p() ? 2 : 1, s5, iVar2.s(iVar2.p() ? 2 : 1, null, null));
    }

    @Override // i5.i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k s(int i7, i iVar, i iVar2) {
        if (iVar == null) {
            iVar = this.f4946c;
        }
        if (iVar2 == null) {
            iVar2 = this.f4947d;
        }
        Object obj = this.f4944a;
        Object obj2 = this.f4945b;
        return i7 == 1 ? new j(obj, obj2, iVar, iVar2) : new g(obj, obj2, iVar, iVar2);
    }

    public abstract k c(Object obj, Object obj2, i iVar, i iVar2);

    @Override // i5.i
    public final i d() {
        return this.f4946c;
    }

    public final k e() {
        i iVar = this.f4947d;
        k kVar = (!iVar.p() || this.f4946c.p()) ? this : (k) iVar.s(f(), s(1, null, ((k) iVar).f4946c), null);
        if (kVar.f4946c.p() && ((k) kVar.f4946c).f4946c.p()) {
            kVar = kVar.i();
        }
        return (kVar.f4946c.p() && kVar.f4947d.p()) ? kVar.a() : kVar;
    }

    public abstract int f();

    public final k g() {
        k a3 = a();
        i iVar = a3.f4947d;
        if (!iVar.d().p()) {
            return a3;
        }
        k c4 = a3.c(null, null, null, ((k) iVar).i());
        i iVar2 = c4.f4947d;
        return ((k) iVar2.s(c4.f(), c4.s(1, null, ((k) iVar2).f4946c), null)).a();
    }

    @Override // i5.i
    public final Object getKey() {
        return this.f4944a;
    }

    @Override // i5.i
    public final Object getValue() {
        return this.f4945b;
    }

    public final i h() {
        if (this.f4946c.isEmpty()) {
            return h.f4943a;
        }
        k g9 = (this.f4946c.p() || this.f4946c.d().p()) ? this : g();
        return g9.c(null, null, ((k) g9.f4946c).h(), null).e();
    }

    public final k i() {
        return (k) this.f4946c.s(f(), null, s(1, ((k) this.f4946c).f4947d, null));
    }

    @Override // i5.i
    public final boolean isEmpty() {
        return false;
    }

    public void j(k kVar) {
        this.f4946c = kVar;
    }

    @Override // i5.i
    public final i m() {
        return this.f4947d;
    }

    @Override // i5.i
    public final void n(a8.d dVar) {
        this.f4946c.n(dVar);
        dVar.f0(this.f4944a, this.f4945b);
        this.f4947d.n(dVar);
    }

    @Override // i5.i
    public final i o(Object obj, Object obj2, Comparator comparator) {
        int compare = comparator.compare(obj, this.f4944a);
        return (compare < 0 ? c(null, null, this.f4946c.o(obj, obj2, comparator), null) : compare == 0 ? c(obj, obj2, null, null) : c(null, null, null, this.f4947d.o(obj, obj2, comparator))).e();
    }

    @Override // i5.i
    public final i q(Object obj, Comparator comparator) {
        k c4;
        if (comparator.compare(obj, this.f4944a) < 0) {
            k g9 = (this.f4946c.isEmpty() || this.f4946c.p() || ((k) this.f4946c).f4946c.p()) ? this : g();
            c4 = g9.c(null, null, g9.f4946c.q(obj, comparator), null);
        } else {
            k i7 = this.f4946c.p() ? i() : this;
            i iVar = i7.f4947d;
            if (!iVar.isEmpty() && !iVar.p() && !((k) iVar).f4946c.p()) {
                i7 = i7.a();
                if (i7.f4946c.d().p()) {
                    i7 = i7.i().a();
                }
            }
            i iVar2 = i7.f4947d;
            if (comparator.compare(obj, i7.f4944a) == 0) {
                if (iVar2.isEmpty()) {
                    return h.f4943a;
                }
                i r8 = iVar2.r();
                i7 = i7.c(r8.getKey(), r8.getValue(), null, ((k) iVar2).h());
            }
            c4 = i7.c(null, null, null, i7.f4947d.q(obj, comparator));
        }
        return c4.e();
    }

    @Override // i5.i
    public final i r() {
        return this.f4946c.isEmpty() ? this : this.f4946c.r();
    }

    @Override // i5.i
    public final i t() {
        i iVar = this.f4947d;
        return iVar.isEmpty() ? this : iVar.t();
    }
}
