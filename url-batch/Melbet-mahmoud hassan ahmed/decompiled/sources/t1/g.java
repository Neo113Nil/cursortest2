package t1;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import r0.r3;
import t1.e0;
import t1.x;
import v0.w;

/* loaded from: classes.dex */
public abstract class g<T> extends t1.a {

    /* renamed from: m, reason: collision with root package name */
    private final HashMap<T, b<T>> f22011m = new HashMap<>();

    /* renamed from: n, reason: collision with root package name */
    private Handler f22012n;

    /* renamed from: o, reason: collision with root package name */
    private n2.p0 f22013o;

    private final class a implements e0, v0.w {

        /* renamed from: f, reason: collision with root package name */
        private final T f22014f;

        /* renamed from: g, reason: collision with root package name */
        private e0.a f22015g;

        /* renamed from: h, reason: collision with root package name */
        private w.a f22016h;

        public a(T t6) {
            this.f22015g = g.this.w(null);
            this.f22016h = g.this.u(null);
            this.f22014f = t6;
        }

        private boolean b(int i7, x.b bVar) {
            x.b bVar2;
            if (bVar != null) {
                bVar2 = g.this.I(this.f22014f, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int K = g.this.K(this.f22014f, i7);
            e0.a aVar = this.f22015g;
            if (aVar.f22003a != K || !o2.m0.c(aVar.f22004b, bVar2)) {
                this.f22015g = g.this.v(K, bVar2, 0L);
            }
            w.a aVar2 = this.f22016h;
            if (aVar2.f22710a == K && o2.m0.c(aVar2.f22711b, bVar2)) {
                return true;
            }
            this.f22016h = g.this.t(K, bVar2);
            return true;
        }

        private t i(t tVar) {
            long J = g.this.J(this.f22014f, tVar.f22219f);
            long J2 = g.this.J(this.f22014f, tVar.f22220g);
            return (J == tVar.f22219f && J2 == tVar.f22220g) ? tVar : new t(tVar.f22214a, tVar.f22215b, tVar.f22216c, tVar.f22217d, tVar.f22218e, J, J2);
        }

        @Override // t1.e0
        public void C(int i7, x.b bVar, q qVar, t tVar) {
            if (b(i7, bVar)) {
                this.f22015g.s(qVar, i(tVar));
            }
        }

        @Override // t1.e0
        public void I(int i7, x.b bVar, q qVar, t tVar) {
            if (b(i7, bVar)) {
                this.f22015g.v(qVar, i(tVar));
            }
        }

        @Override // t1.e0
        public void J(int i7, x.b bVar, t tVar) {
            if (b(i7, bVar)) {
                this.f22015g.E(i(tVar));
            }
        }

        @Override // v0.w
        public void N(int i7, x.b bVar) {
            if (b(i7, bVar)) {
                this.f22016h.i();
            }
        }

        @Override // t1.e0
        public void O(int i7, x.b bVar, t tVar) {
            if (b(i7, bVar)) {
                this.f22015g.j(i(tVar));
            }
        }

        @Override // t1.e0
        public void Q(int i7, x.b bVar, q qVar, t tVar, IOException iOException, boolean z6) {
            if (b(i7, bVar)) {
                this.f22015g.y(qVar, i(tVar), iOException, z6);
            }
        }

        @Override // v0.w
        public void S(int i7, x.b bVar) {
            if (b(i7, bVar)) {
                this.f22016h.h();
            }
        }

        @Override // v0.w
        public /* synthetic */ void U(int i7, x.b bVar) {
            v0.p.a(this, i7, bVar);
        }

        @Override // t1.e0
        public void X(int i7, x.b bVar, q qVar, t tVar) {
            if (b(i7, bVar)) {
                this.f22015g.B(qVar, i(tVar));
            }
        }

        @Override // v0.w
        public void d0(int i7, x.b bVar) {
            if (b(i7, bVar)) {
                this.f22016h.m();
            }
        }

        @Override // v0.w
        public void g0(int i7, x.b bVar) {
            if (b(i7, bVar)) {
                this.f22016h.j();
            }
        }

        @Override // v0.w
        public void h0(int i7, x.b bVar, Exception exc) {
            if (b(i7, bVar)) {
                this.f22016h.l(exc);
            }
        }

        @Override // v0.w
        public void q0(int i7, x.b bVar, int i8) {
            if (b(i7, bVar)) {
                this.f22016h.k(i8);
            }
        }
    }

    private static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final x f22018a;

        /* renamed from: b, reason: collision with root package name */
        public final x.c f22019b;

        /* renamed from: c, reason: collision with root package name */
        public final g<T>.a f22020c;

        public b(x xVar, x.c cVar, g<T>.a aVar) {
            this.f22018a = xVar;
            this.f22019b = cVar;
            this.f22020c = aVar;
        }
    }

    protected g() {
    }

    @Override // t1.a
    protected void C(n2.p0 p0Var) {
        this.f22013o = p0Var;
        this.f22012n = o2.m0.w();
    }

    @Override // t1.a
    protected void E() {
        for (b<T> bVar : this.f22011m.values()) {
            bVar.f22018a.p(bVar.f22019b);
            bVar.f22018a.b(bVar.f22020c);
            bVar.f22018a.q(bVar.f22020c);
        }
        this.f22011m.clear();
    }

    protected final void G(T t6) {
        b bVar = (b) o2.a.e(this.f22011m.get(t6));
        bVar.f22018a.n(bVar.f22019b);
    }

    protected final void H(T t6) {
        b bVar = (b) o2.a.e(this.f22011m.get(t6));
        bVar.f22018a.k(bVar.f22019b);
    }

    protected x.b I(T t6, x.b bVar) {
        return bVar;
    }

    protected long J(T t6, long j7) {
        return j7;
    }

    protected int K(T t6, int i7) {
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public abstract void L(T t6, x xVar, r3 r3Var);

    protected final void N(final T t6, x xVar) {
        o2.a.a(!this.f22011m.containsKey(t6));
        x.c cVar = new x.c() { // from class: t1.f
            @Override // t1.x.c
            public final void a(x xVar2, r3 r3Var) {
                g.this.L(t6, xVar2, r3Var);
            }
        };
        a aVar = new a(t6);
        this.f22011m.put(t6, new b<>(xVar, cVar, aVar));
        xVar.d((Handler) o2.a.e(this.f22012n), aVar);
        xVar.r((Handler) o2.a.e(this.f22012n), aVar);
        xVar.i(cVar, this.f22013o, A());
        if (B()) {
            return;
        }
        xVar.n(cVar);
    }

    protected final void O(T t6) {
        b bVar = (b) o2.a.e(this.f22011m.remove(t6));
        bVar.f22018a.p(bVar.f22019b);
        bVar.f22018a.b(bVar.f22020c);
        bVar.f22018a.q(bVar.f22020c);
    }

    @Override // t1.x
    public void c() {
        Iterator<b<T>> it = this.f22011m.values().iterator();
        while (it.hasNext()) {
            it.next().f22018a.c();
        }
    }

    @Override // t1.a
    protected void y() {
        for (b<T> bVar : this.f22011m.values()) {
            bVar.f22018a.n(bVar.f22019b);
        }
    }

    @Override // t1.a
    protected void z() {
        for (b<T> bVar : this.f22011m.values()) {
            bVar.f22018a.k(bVar.f22019b);
        }
    }
}
