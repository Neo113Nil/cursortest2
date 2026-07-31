package o6;

import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.internal.y;
import m6.k;
import m6.p0;
import m6.q0;
import v5.k;

/* loaded from: classes.dex */
public abstract class a<E> extends o6.c<E> implements f<E> {

    /* renamed from: o6.a$a, reason: collision with other inner class name */
    private static final class C0118a<E> implements g<E> {

        /* renamed from: a, reason: collision with root package name */
        public final a<E> f19891a;

        /* renamed from: b, reason: collision with root package name */
        private Object f19892b = o6.b.f19902d;

        public C0118a(a<E> aVar) {
            this.f19891a = aVar;
        }

        private final boolean c(Object obj) {
            if (!(obj instanceof j)) {
                return true;
            }
            j jVar = (j) obj;
            if (jVar.f19925i == null) {
                return false;
            }
            throw x.k(jVar.E());
        }

        private final Object d(y5.d<? super Boolean> dVar) {
            y5.d b7;
            Object c7;
            Object a7;
            b7 = z5.c.b(dVar);
            m6.l a8 = m6.n.a(b7);
            b bVar = new b(this, a8);
            while (true) {
                if (this.f19891a.p(bVar)) {
                    this.f19891a.w(a8, bVar);
                    break;
                }
                Object v6 = this.f19891a.v();
                e(v6);
                if (v6 instanceof j) {
                    j jVar = (j) v6;
                    if (jVar.f19925i == null) {
                        a7 = kotlin.coroutines.jvm.internal.b.a(false);
                        k.a aVar = v5.k.f22832f;
                    } else {
                        Throwable E = jVar.E();
                        k.a aVar2 = v5.k.f22832f;
                        a7 = v5.l.a(E);
                    }
                    a8.resumeWith(v5.k.a(a7));
                } else if (v6 != o6.b.f19902d) {
                    Boolean a9 = kotlin.coroutines.jvm.internal.b.a(true);
                    f6.l<E, v5.q> lVar = this.f19891a.f19906b;
                    a8.e(a9, lVar == null ? null : kotlinx.coroutines.internal.t.a(lVar, v6, a8.getContext()));
                }
            }
            Object w6 = a8.w();
            c7 = z5.d.c();
            if (w6 == c7) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return w6;
        }

        @Override // o6.g
        public Object a(y5.d<? super Boolean> dVar) {
            Object b7 = b();
            y yVar = o6.b.f19902d;
            if (b7 == yVar) {
                e(this.f19891a.v());
                if (b() == yVar) {
                    return d(dVar);
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(c(b()));
        }

        public final Object b() {
            return this.f19892b;
        }

        public final void e(Object obj) {
            this.f19892b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o6.g
        public E next() {
            E e7 = (E) this.f19892b;
            if (e7 instanceof j) {
                throw x.k(((j) e7).E());
            }
            y yVar = o6.b.f19902d;
            if (e7 == yVar) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.f19892b = yVar;
            return e7;
        }
    }

    private static class b<E> extends o<E> {

        /* renamed from: i, reason: collision with root package name */
        public final C0118a<E> f19893i;

        /* renamed from: j, reason: collision with root package name */
        public final m6.k<Boolean> f19894j;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C0118a<E> c0118a, m6.k<? super Boolean> kVar) {
            this.f19893i = c0118a;
            this.f19894j = kVar;
        }

        public f6.l<Throwable, v5.q> A(E e7) {
            f6.l<E, v5.q> lVar = this.f19893i.f19891a.f19906b;
            if (lVar == null) {
                return null;
            }
            return kotlinx.coroutines.internal.t.a(lVar, e7, this.f19894j.getContext());
        }

        @Override // o6.q
        public void a(E e7) {
            this.f19893i.e(e7);
            this.f19894j.k(m6.m.f19306a);
        }

        @Override // o6.q
        public y f(E e7, n.b bVar) {
            Object d7 = this.f19894j.d(Boolean.TRUE, null, A(e7));
            if (d7 == null) {
                return null;
            }
            if (p0.a()) {
                if (!(d7 == m6.m.f19306a)) {
                    throw new AssertionError();
                }
            }
            return m6.m.f19306a;
        }

        @Override // kotlinx.coroutines.internal.n
        public String toString() {
            return kotlin.jvm.internal.i.i("ReceiveHasNext@", q0.b(this));
        }

        @Override // o6.o
        public void z(j<?> jVar) {
            Object a7 = jVar.f19925i == null ? k.a.a(this.f19894j, Boolean.FALSE, null, 2, null) : this.f19894j.j(jVar.E());
            if (a7 != null) {
                this.f19893i.e(jVar);
                this.f19894j.k(a7);
            }
        }
    }

    private final class c extends m6.e {

        /* renamed from: f, reason: collision with root package name */
        private final o<?> f19895f;

        public c(o<?> oVar) {
            this.f19895f = oVar;
        }

        @Override // m6.j
        public void a(Throwable th) {
            if (this.f19895f.u()) {
                a.this.t();
            }
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ v5.q invoke(Throwable th) {
            a(th);
            return v5.q.f22838a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f19895f + ']';
        }
    }

    public static final class d extends n.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.n f19897d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f19898e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.n nVar, a aVar) {
            super(nVar);
            this.f19897d = nVar;
            this.f19898e = aVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.n nVar) {
            if (this.f19898e.s()) {
                return null;
            }
            return kotlinx.coroutines.internal.m.a();
        }
    }

    public a(f6.l<? super E, v5.q> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(o<? super E> oVar) {
        boolean q7 = q(oVar);
        if (q7) {
            u();
        }
        return q7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(m6.k<?> kVar, o<?> oVar) {
        kVar.g(new c(oVar));
    }

    @Override // o6.p
    public final g<E> iterator() {
        return new C0118a(this);
    }

    @Override // o6.c
    protected q<E> l() {
        q<E> l7 = super.l();
        if (l7 != null && !(l7 instanceof j)) {
            t();
        }
        return l7;
    }

    protected boolean q(o<? super E> oVar) {
        int x6;
        kotlinx.coroutines.internal.n q7;
        if (!r()) {
            kotlinx.coroutines.internal.n e7 = e();
            d dVar = new d(oVar, this);
            do {
                kotlinx.coroutines.internal.n q8 = e7.q();
                if (!(!(q8 instanceof s))) {
                    return false;
                }
                x6 = q8.x(oVar, e7, dVar);
                if (x6 != 1) {
                }
            } while (x6 != 2);
            return false;
        }
        kotlinx.coroutines.internal.n e8 = e();
        do {
            q7 = e8.q();
            if (!(!(q7 instanceof s))) {
                return false;
            }
        } while (!q7.j(oVar, e8));
        return true;
    }

    protected abstract boolean r();

    protected abstract boolean s();

    protected void t() {
    }

    protected void u() {
    }

    protected Object v() {
        while (true) {
            s m7 = m();
            if (m7 == null) {
                return o6.b.f19902d;
            }
            y A = m7.A(null);
            if (A != null) {
                if (p0.a()) {
                    if (!(A == m6.m.f19306a)) {
                        throw new AssertionError();
                    }
                }
                m7.y();
                return m7.z();
            }
            m7.B();
        }
    }
}
