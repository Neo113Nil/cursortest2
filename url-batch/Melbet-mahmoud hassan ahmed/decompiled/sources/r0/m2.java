package r0;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t1.e0;
import t1.s0;
import t1.x;
import v0.w;

/* loaded from: classes.dex */
final class m2 {

    /* renamed from: a, reason: collision with root package name */
    private final s0.u1 f20777a;

    /* renamed from: e, reason: collision with root package name */
    private final d f20781e;

    /* renamed from: f, reason: collision with root package name */
    private final e0.a f20782f;

    /* renamed from: g, reason: collision with root package name */
    private final w.a f20783g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<c, b> f20784h;

    /* renamed from: i, reason: collision with root package name */
    private final Set<c> f20785i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20787k;

    /* renamed from: l, reason: collision with root package name */
    private n2.p0 f20788l;

    /* renamed from: j, reason: collision with root package name */
    private t1.s0 f20786j = new s0.a(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<t1.u, c> f20779c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f20780d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f20778b = new ArrayList();

    private final class a implements t1.e0, v0.w {

        /* renamed from: f, reason: collision with root package name */
        private final c f20789f;

        /* renamed from: g, reason: collision with root package name */
        private e0.a f20790g;

        /* renamed from: h, reason: collision with root package name */
        private w.a f20791h;

        public a(c cVar) {
            this.f20790g = m2.this.f20782f;
            this.f20791h = m2.this.f20783g;
            this.f20789f = cVar;
        }

        private boolean b(int i7, x.b bVar) {
            x.b bVar2;
            if (bVar != null) {
                bVar2 = m2.n(this.f20789f, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int r7 = m2.r(this.f20789f, i7);
            e0.a aVar = this.f20790g;
            if (aVar.f22003a != r7 || !o2.m0.c(aVar.f22004b, bVar2)) {
                this.f20790g = m2.this.f20782f.F(r7, bVar2, 0L);
            }
            w.a aVar2 = this.f20791h;
            if (aVar2.f22710a == r7 && o2.m0.c(aVar2.f22711b, bVar2)) {
                return true;
            }
            this.f20791h = m2.this.f20783g.u(r7, bVar2);
            return true;
        }

        @Override // t1.e0
        public void C(int i7, x.b bVar, t1.q qVar, t1.t tVar) {
            if (b(i7, bVar)) {
                this.f20790g.s(qVar, tVar);
            }
        }

        @Override // t1.e0
        public void I(int i7, x.b bVar, t1.q qVar, t1.t tVar) {
            if (b(i7, bVar)) {
                this.f20790g.v(qVar, tVar);
            }
        }

        @Override // t1.e0
        public void J(int i7, x.b bVar, t1.t tVar) {
            if (b(i7, bVar)) {
                this.f20790g.E(tVar);
            }
        }

        @Override // v0.w
        public void N(int i7, x.b bVar) {
            if (b(i7, bVar)) {
                this.f20791h.i();
            }
        }

        @Override // t1.e0
        public void O(int i7, x.b bVar, t1.t tVar) {
            if (b(i7, bVar)) {
                this.f20790g.j(tVar);
            }
        }

        @Override // t1.e0
        public void Q(int i7, x.b bVar, t1.q qVar, t1.t tVar, IOException iOException, boolean z6) {
            if (b(i7, bVar)) {
                this.f20790g.y(qVar, tVar, iOException, z6);
            }
        }

        @Override // v0.w
        public void S(int i7, x.b bVar) {
            if (b(i7, bVar)) {
                this.f20791h.h();
            }
        }

        @Override // v0.w
        public /* synthetic */ void U(int i7, x.b bVar) {
            v0.p.a(this, i7, bVar);
        }

        @Override // t1.e0
        public void X(int i7, x.b bVar, t1.q qVar, t1.t tVar) {
            if (b(i7, bVar)) {
                this.f20790g.B(qVar, tVar);
            }
        }

        @Override // v0.w
        public void d0(int i7, x.b bVar) {
            if (b(i7, bVar)) {
                this.f20791h.m();
            }
        }

        @Override // v0.w
        public void g0(int i7, x.b bVar) {
            if (b(i7, bVar)) {
                this.f20791h.j();
            }
        }

        @Override // v0.w
        public void h0(int i7, x.b bVar, Exception exc) {
            if (b(i7, bVar)) {
                this.f20791h.l(exc);
            }
        }

        @Override // v0.w
        public void q0(int i7, x.b bVar, int i8) {
            if (b(i7, bVar)) {
                this.f20791h.k(i8);
            }
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final t1.x f20793a;

        /* renamed from: b, reason: collision with root package name */
        public final x.c f20794b;

        /* renamed from: c, reason: collision with root package name */
        public final a f20795c;

        public b(t1.x xVar, x.c cVar, a aVar) {
            this.f20793a = xVar;
            this.f20794b = cVar;
            this.f20795c = aVar;
        }
    }

    static final class c implements k2 {

        /* renamed from: a, reason: collision with root package name */
        public final t1.s f20796a;

        /* renamed from: d, reason: collision with root package name */
        public int f20799d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f20800e;

        /* renamed from: c, reason: collision with root package name */
        public final List<x.b> f20798c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f20797b = new Object();

        public c(t1.x xVar, boolean z6) {
            this.f20796a = new t1.s(xVar, z6);
        }

        @Override // r0.k2
        public Object a() {
            return this.f20797b;
        }

        @Override // r0.k2
        public r3 b() {
            return this.f20796a.T();
        }

        public void c(int i7) {
            this.f20799d = i7;
            this.f20800e = false;
            this.f20798c.clear();
        }
    }

    public interface d {
        void a();
    }

    public m2(d dVar, s0.a aVar, Handler handler, s0.u1 u1Var) {
        this.f20777a = u1Var;
        this.f20781e = dVar;
        e0.a aVar2 = new e0.a();
        this.f20782f = aVar2;
        w.a aVar3 = new w.a();
        this.f20783g = aVar3;
        this.f20784h = new HashMap<>();
        this.f20785i = new HashSet();
        aVar2.g(handler, aVar);
        aVar3.g(handler, aVar);
    }

    private void B(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            c remove = this.f20778b.remove(i9);
            this.f20780d.remove(remove.f20797b);
            g(i9, -remove.f20796a.T().t());
            remove.f20800e = true;
            if (this.f20787k) {
                u(remove);
            }
        }
    }

    private void g(int i7, int i8) {
        while (i7 < this.f20778b.size()) {
            this.f20778b.get(i7).f20799d += i8;
            i7++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f20784h.get(cVar);
        if (bVar != null) {
            bVar.f20793a.n(bVar.f20794b);
        }
    }

    private void k() {
        Iterator<c> it = this.f20785i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f20798c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f20785i.add(cVar);
        b bVar = this.f20784h.get(cVar);
        if (bVar != null) {
            bVar.f20793a.k(bVar.f20794b);
        }
    }

    private static Object m(Object obj) {
        return r0.a.A(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x.b n(c cVar, x.b bVar) {
        for (int i7 = 0; i7 < cVar.f20798c.size(); i7++) {
            if (cVar.f20798c.get(i7).f22252d == bVar.f22252d) {
                return bVar.c(p(cVar, bVar.f22249a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return r0.a.B(obj);
    }

    private static Object p(c cVar, Object obj) {
        return r0.a.D(cVar.f20797b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(c cVar, int i7) {
        return i7 + cVar.f20799d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(t1.x xVar, r3 r3Var) {
        this.f20781e.a();
    }

    private void u(c cVar) {
        if (cVar.f20800e && cVar.f20798c.isEmpty()) {
            b bVar = (b) o2.a.e(this.f20784h.remove(cVar));
            bVar.f20793a.p(bVar.f20794b);
            bVar.f20793a.b(bVar.f20795c);
            bVar.f20793a.q(bVar.f20795c);
            this.f20785i.remove(cVar);
        }
    }

    private void x(c cVar) {
        t1.s sVar = cVar.f20796a;
        x.c cVar2 = new x.c() { // from class: r0.l2
            @Override // t1.x.c
            public final void a(t1.x xVar, r3 r3Var) {
                m2.this.t(xVar, r3Var);
            }
        };
        a aVar = new a(cVar);
        this.f20784h.put(cVar, new b(sVar, cVar2, aVar));
        sVar.d(o2.m0.y(), aVar);
        sVar.r(o2.m0.y(), aVar);
        sVar.i(cVar2, this.f20788l, this.f20777a);
    }

    public r3 A(int i7, int i8, t1.s0 s0Var) {
        o2.a.a(i7 >= 0 && i7 <= i8 && i8 <= q());
        this.f20786j = s0Var;
        B(i7, i8);
        return i();
    }

    public r3 C(List<c> list, t1.s0 s0Var) {
        B(0, this.f20778b.size());
        return f(this.f20778b.size(), list, s0Var);
    }

    public r3 D(t1.s0 s0Var) {
        int q7 = q();
        if (s0Var.a() != q7) {
            s0Var = s0Var.h().d(0, q7);
        }
        this.f20786j = s0Var;
        return i();
    }

    public r3 f(int i7, List<c> list, t1.s0 s0Var) {
        int i8;
        if (!list.isEmpty()) {
            this.f20786j = s0Var;
            for (int i9 = i7; i9 < list.size() + i7; i9++) {
                c cVar = list.get(i9 - i7);
                if (i9 > 0) {
                    c cVar2 = this.f20778b.get(i9 - 1);
                    i8 = cVar2.f20799d + cVar2.f20796a.T().t();
                } else {
                    i8 = 0;
                }
                cVar.c(i8);
                g(i9, cVar.f20796a.T().t());
                this.f20778b.add(i9, cVar);
                this.f20780d.put(cVar.f20797b, cVar);
                if (this.f20787k) {
                    x(cVar);
                    if (this.f20779c.isEmpty()) {
                        this.f20785i.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public t1.u h(x.b bVar, n2.b bVar2, long j7) {
        Object o7 = o(bVar.f22249a);
        x.b c7 = bVar.c(m(bVar.f22249a));
        c cVar = (c) o2.a.e(this.f20780d.get(o7));
        l(cVar);
        cVar.f20798c.add(c7);
        t1.r j8 = cVar.f20796a.j(c7, bVar2, j7);
        this.f20779c.put(j8, cVar);
        k();
        return j8;
    }

    public r3 i() {
        if (this.f20778b.isEmpty()) {
            return r3.f20909f;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f20778b.size(); i8++) {
            c cVar = this.f20778b.get(i8);
            cVar.f20799d = i7;
            i7 += cVar.f20796a.T().t();
        }
        return new a3(this.f20778b, this.f20786j);
    }

    public int q() {
        return this.f20778b.size();
    }

    public boolean s() {
        return this.f20787k;
    }

    public r3 v(int i7, int i8, int i9, t1.s0 s0Var) {
        o2.a.a(i7 >= 0 && i7 <= i8 && i8 <= q() && i9 >= 0);
        this.f20786j = s0Var;
        if (i7 == i8 || i7 == i9) {
            return i();
        }
        int min = Math.min(i7, i9);
        int max = Math.max(((i8 - i7) + i9) - 1, i8 - 1);
        int i10 = this.f20778b.get(min).f20799d;
        o2.m0.A0(this.f20778b, i7, i8, i9);
        while (min <= max) {
            c cVar = this.f20778b.get(min);
            cVar.f20799d = i10;
            i10 += cVar.f20796a.T().t();
            min++;
        }
        return i();
    }

    public void w(n2.p0 p0Var) {
        o2.a.f(!this.f20787k);
        this.f20788l = p0Var;
        for (int i7 = 0; i7 < this.f20778b.size(); i7++) {
            c cVar = this.f20778b.get(i7);
            x(cVar);
            this.f20785i.add(cVar);
        }
        this.f20787k = true;
    }

    public void y() {
        for (b bVar : this.f20784h.values()) {
            try {
                bVar.f20793a.p(bVar.f20794b);
            } catch (RuntimeException e7) {
                o2.r.d("MediaSourceList", "Failed to release child source.", e7);
            }
            bVar.f20793a.b(bVar.f20795c);
            bVar.f20793a.q(bVar.f20795c);
        }
        this.f20784h.clear();
        this.f20785i.clear();
        this.f20787k = false;
    }

    public void z(t1.u uVar) {
        c cVar = (c) o2.a.e(this.f20779c.remove(uVar));
        cVar.f20796a.e(uVar);
        cVar.f20798c.remove(((t1.r) uVar).f22189f);
        if (!this.f20779c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
