package t1;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r0.a2;
import r0.r3;
import t1.s0;
import t1.x;

/* loaded from: classes.dex */
public final class k extends g<e> {
    private static final a2 B = new a2.c().f(Uri.EMPTY).a();
    private s0 A;

    /* renamed from: p, reason: collision with root package name */
    private final List<e> f22028p;

    /* renamed from: q, reason: collision with root package name */
    private final Set<d> f22029q;

    /* renamed from: r, reason: collision with root package name */
    private Handler f22030r;

    /* renamed from: s, reason: collision with root package name */
    private final List<e> f22031s;

    /* renamed from: t, reason: collision with root package name */
    private final IdentityHashMap<u, e> f22032t;

    /* renamed from: u, reason: collision with root package name */
    private final Map<Object, e> f22033u;

    /* renamed from: v, reason: collision with root package name */
    private final Set<e> f22034v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f22035w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f22036x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f22037y;

    /* renamed from: z, reason: collision with root package name */
    private Set<d> f22038z;

    private static final class b extends r0.a {

        /* renamed from: k, reason: collision with root package name */
        private final int f22039k;

        /* renamed from: l, reason: collision with root package name */
        private final int f22040l;

        /* renamed from: m, reason: collision with root package name */
        private final int[] f22041m;

        /* renamed from: n, reason: collision with root package name */
        private final int[] f22042n;

        /* renamed from: o, reason: collision with root package name */
        private final r3[] f22043o;

        /* renamed from: p, reason: collision with root package name */
        private final Object[] f22044p;

        /* renamed from: q, reason: collision with root package name */
        private final HashMap<Object, Integer> f22045q;

        public b(Collection<e> collection, s0 s0Var, boolean z6) {
            super(z6, s0Var);
            int size = collection.size();
            this.f22041m = new int[size];
            this.f22042n = new int[size];
            this.f22043o = new r3[size];
            this.f22044p = new Object[size];
            this.f22045q = new HashMap<>();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (e eVar : collection) {
                this.f22043o[i9] = eVar.f22048a.T();
                this.f22042n[i9] = i7;
                this.f22041m[i9] = i8;
                i7 += this.f22043o[i9].t();
                i8 += this.f22043o[i9].m();
                Object[] objArr = this.f22044p;
                objArr[i9] = eVar.f22049b;
                this.f22045q.put(objArr[i9], Integer.valueOf(i9));
                i9++;
            }
            this.f22039k = i7;
            this.f22040l = i8;
        }

        @Override // r0.a
        protected Object C(int i7) {
            return this.f22044p[i7];
        }

        @Override // r0.a
        protected int E(int i7) {
            return this.f22041m[i7];
        }

        @Override // r0.a
        protected int F(int i7) {
            return this.f22042n[i7];
        }

        @Override // r0.a
        protected r3 I(int i7) {
            return this.f22043o[i7];
        }

        @Override // r0.r3
        public int m() {
            return this.f22040l;
        }

        @Override // r0.r3
        public int t() {
            return this.f22039k;
        }

        @Override // r0.a
        protected int x(Object obj) {
            Integer num = this.f22045q.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // r0.a
        protected int y(int i7) {
            return o2.m0.h(this.f22041m, i7 + 1, false, false);
        }

        @Override // r0.a
        protected int z(int i7) {
            return o2.m0.h(this.f22042n, i7 + 1, false, false);
        }
    }

    private static final class c extends t1.a {
        private c() {
        }

        @Override // t1.a
        protected void C(n2.p0 p0Var) {
        }

        @Override // t1.a
        protected void E() {
        }

        @Override // t1.x
        public a2 a() {
            return k.B;
        }

        @Override // t1.x
        public void c() {
        }

        @Override // t1.x
        public void e(u uVar) {
        }

        @Override // t1.x
        public u j(x.b bVar, n2.b bVar2, long j7) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f22046a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f22047b;

        public d(Handler handler, Runnable runnable) {
            this.f22046a = handler;
            this.f22047b = runnable;
        }

        public void a() {
            this.f22046a.post(this.f22047b);
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final s f22048a;

        /* renamed from: d, reason: collision with root package name */
        public int f22051d;

        /* renamed from: e, reason: collision with root package name */
        public int f22052e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22053f;

        /* renamed from: c, reason: collision with root package name */
        public final List<x.b> f22050c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f22049b = new Object();

        public e(x xVar, boolean z6) {
            this.f22048a = new s(xVar, z6);
        }

        public void a(int i7, int i8) {
            this.f22051d = i7;
            this.f22052e = i8;
            this.f22053f = false;
            this.f22050c.clear();
        }
    }

    private static final class f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f22054a;

        /* renamed from: b, reason: collision with root package name */
        public final T f22055b;

        /* renamed from: c, reason: collision with root package name */
        public final d f22056c;

        public f(int i7, T t6, d dVar) {
            this.f22054a = i7;
            this.f22055b = t6;
            this.f22056c = dVar;
        }
    }

    public k(boolean z6, s0 s0Var, x... xVarArr) {
        this(z6, false, s0Var, xVarArr);
    }

    public k(boolean z6, boolean z7, s0 s0Var, x... xVarArr) {
        for (x xVar : xVarArr) {
            o2.a.e(xVar);
        }
        this.A = s0Var.a() > 0 ? s0Var.h() : s0Var;
        this.f22032t = new IdentityHashMap<>();
        this.f22033u = new HashMap();
        this.f22028p = new ArrayList();
        this.f22031s = new ArrayList();
        this.f22038z = new HashSet();
        this.f22029q = new HashSet();
        this.f22034v = new HashSet();
        this.f22035w = z6;
        this.f22036x = z7;
        T(Arrays.asList(xVarArr));
    }

    public k(boolean z6, x... xVarArr) {
        this(z6, new s0.a(0), xVarArr);
    }

    public k(x... xVarArr) {
        this(false, xVarArr);
    }

    private void R(int i7, e eVar) {
        int i8;
        if (i7 > 0) {
            e eVar2 = this.f22031s.get(i7 - 1);
            i8 = eVar2.f22052e + eVar2.f22048a.T().t();
        } else {
            i8 = 0;
        }
        eVar.a(i7, i8);
        W(i7, 1, eVar.f22048a.T().t());
        this.f22031s.add(i7, eVar);
        this.f22033u.put(eVar.f22049b, eVar);
        N(eVar, eVar.f22048a);
        if (B() && this.f22032t.isEmpty()) {
            this.f22034v.add(eVar);
        } else {
            G(eVar);
        }
    }

    private void U(int i7, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            R(i7, it.next());
            i7++;
        }
    }

    private void V(int i7, Collection<x> collection, Handler handler, Runnable runnable) {
        o2.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f22030r;
        Iterator<x> it = collection.iterator();
        while (it.hasNext()) {
            o2.a.e(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<x> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next(), this.f22036x));
        }
        this.f22028p.addAll(i7, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new f(i7, arrayList, X(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void W(int i7, int i8, int i9) {
        while (i7 < this.f22031s.size()) {
            e eVar = this.f22031s.get(i7);
            eVar.f22051d += i8;
            eVar.f22052e += i9;
            i7++;
        }
    }

    private d X(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.f22029q.add(dVar);
        return dVar;
    }

    private void Y() {
        Iterator<e> it = this.f22034v.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f22050c.isEmpty()) {
                G(next);
                it.remove();
            }
        }
    }

    private synchronized void Z(Set<d> set) {
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f22029q.removeAll(set);
    }

    private void a0(e eVar) {
        this.f22034v.add(eVar);
        H(eVar);
    }

    private static Object b0(Object obj) {
        return r0.a.A(obj);
    }

    private static Object d0(Object obj) {
        return r0.a.B(obj);
    }

    private static Object e0(e eVar, Object obj) {
        return r0.a.D(eVar.f22049b, obj);
    }

    private Handler f0() {
        return (Handler) o2.a.e(this.f22030r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean i0(Message message) {
        f fVar;
        int i7 = message.what;
        if (i7 == 0) {
            fVar = (f) o2.m0.j(message.obj);
            this.A = this.A.d(fVar.f22054a, ((Collection) fVar.f22055b).size());
            U(fVar.f22054a, (Collection) fVar.f22055b);
        } else if (i7 == 1) {
            fVar = (f) o2.m0.j(message.obj);
            int i8 = fVar.f22054a;
            int intValue = ((Integer) fVar.f22055b).intValue();
            this.A = (i8 == 0 && intValue == this.A.a()) ? this.A.h() : this.A.b(i8, intValue);
            for (int i9 = intValue - 1; i9 >= i8; i9--) {
                o0(i9);
            }
        } else if (i7 == 2) {
            fVar = (f) o2.m0.j(message.obj);
            s0 s0Var = this.A;
            int i10 = fVar.f22054a;
            s0 b7 = s0Var.b(i10, i10 + 1);
            this.A = b7;
            this.A = b7.d(((Integer) fVar.f22055b).intValue(), 1);
            l0(fVar.f22054a, ((Integer) fVar.f22055b).intValue());
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    w0();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException();
                    }
                    Z((Set) o2.m0.j(message.obj));
                }
                return true;
            }
            fVar = (f) o2.m0.j(message.obj);
            this.A = (s0) fVar.f22055b;
        }
        s0(fVar.f22056c);
        return true;
    }

    private void j0(e eVar) {
        if (eVar.f22053f && eVar.f22050c.isEmpty()) {
            this.f22034v.remove(eVar);
            O(eVar);
        }
    }

    private void l0(int i7, int i8) {
        int min = Math.min(i7, i8);
        int max = Math.max(i7, i8);
        int i9 = this.f22031s.get(min).f22052e;
        List<e> list = this.f22031s;
        list.add(i8, list.remove(i7));
        while (min <= max) {
            e eVar = this.f22031s.get(min);
            eVar.f22051d = min;
            eVar.f22052e = i9;
            i9 += eVar.f22048a.T().t();
            min++;
        }
    }

    private void m0(int i7, int i8, Handler handler, Runnable runnable) {
        o2.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f22030r;
        List<e> list = this.f22028p;
        list.add(i8, list.remove(i7));
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(i7, Integer.valueOf(i8), X(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void o0(int i7) {
        e remove = this.f22031s.remove(i7);
        this.f22033u.remove(remove.f22049b);
        W(i7, -1, -remove.f22048a.T().t());
        remove.f22053f = true;
        j0(remove);
    }

    private void q0(int i7, int i8, Handler handler, Runnable runnable) {
        o2.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f22030r;
        o2.m0.M0(this.f22028p, i7, i8);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(i7, Integer.valueOf(i8), X(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void r0() {
        s0(null);
    }

    private void s0(d dVar) {
        if (!this.f22037y) {
            f0().obtainMessage(4).sendToTarget();
            this.f22037y = true;
        }
        if (dVar != null) {
            this.f22038z.add(dVar);
        }
    }

    private void t0(s0 s0Var, Handler handler, Runnable runnable) {
        o2.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f22030r;
        if (handler2 != null) {
            int g02 = g0();
            if (s0Var.a() != g02) {
                s0Var = s0Var.h().d(0, g02);
            }
            handler2.obtainMessage(3, new f(0, s0Var, X(handler, runnable))).sendToTarget();
            return;
        }
        if (s0Var.a() > 0) {
            s0Var = s0Var.h();
        }
        this.A = s0Var;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void v0(e eVar, r3 r3Var) {
        if (eVar.f22051d + 1 < this.f22031s.size()) {
            int t6 = r3Var.t() - (this.f22031s.get(eVar.f22051d + 1).f22052e - eVar.f22052e);
            if (t6 != 0) {
                W(eVar.f22051d + 1, 0, t6);
            }
        }
        r0();
    }

    private void w0() {
        this.f22037y = false;
        Set<d> set = this.f22038z;
        this.f22038z = new HashSet();
        D(new b(this.f22031s, this.A, this.f22035w));
        f0().obtainMessage(5, set).sendToTarget();
    }

    @Override // t1.g, t1.a
    protected synchronized void C(n2.p0 p0Var) {
        super.C(p0Var);
        this.f22030r = new Handler(new Handler.Callback() { // from class: t1.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean i02;
                i02 = k.this.i0(message);
                return i02;
            }
        });
        if (this.f22028p.isEmpty()) {
            w0();
        } else {
            this.A = this.A.d(0, this.f22028p.size());
            U(0, this.f22028p);
            r0();
        }
    }

    @Override // t1.g, t1.a
    protected synchronized void E() {
        super.E();
        this.f22031s.clear();
        this.f22034v.clear();
        this.f22033u.clear();
        this.A = this.A.h();
        Handler handler = this.f22030r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f22030r = null;
        }
        this.f22037y = false;
        this.f22038z.clear();
        Z(this.f22029q);
    }

    public synchronized void S(int i7, Collection<x> collection, Handler handler, Runnable runnable) {
        V(i7, collection, handler, runnable);
    }

    public synchronized void T(Collection<x> collection) {
        V(this.f22028p.size(), collection, null, null);
    }

    @Override // t1.x
    public a2 a() {
        return B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t1.g
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public x.b I(e eVar, x.b bVar) {
        for (int i7 = 0; i7 < eVar.f22050c.size(); i7++) {
            if (eVar.f22050c.get(i7).f22252d == bVar.f22252d) {
                return bVar.c(e0(eVar, bVar.f22249a));
            }
        }
        return null;
    }

    @Override // t1.x
    public void e(u uVar) {
        e eVar = (e) o2.a.e(this.f22032t.remove(uVar));
        eVar.f22048a.e(uVar);
        eVar.f22050c.remove(((r) uVar).f22189f);
        if (!this.f22032t.isEmpty()) {
            Y();
        }
        j0(eVar);
    }

    @Override // t1.a, t1.x
    public boolean f() {
        return false;
    }

    @Override // t1.a, t1.x
    public synchronized r3 g() {
        return new b(this.f22028p, this.A.a() != this.f22028p.size() ? this.A.h().d(0, this.f22028p.size()) : this.A, this.f22035w);
    }

    public synchronized int g0() {
        return this.f22028p.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t1.g
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public int K(e eVar, int i7) {
        return i7 + eVar.f22052e;
    }

    @Override // t1.x
    public u j(x.b bVar, n2.b bVar2, long j7) {
        Object d02 = d0(bVar.f22249a);
        x.b c7 = bVar.c(b0(bVar.f22249a));
        e eVar = this.f22033u.get(d02);
        if (eVar == null) {
            eVar = new e(new c(), this.f22036x);
            eVar.f22053f = true;
            N(eVar, eVar.f22048a);
        }
        a0(eVar);
        eVar.f22050c.add(c7);
        r j8 = eVar.f22048a.j(c7, bVar2, j7);
        this.f22032t.put(j8, eVar);
        Y();
        return j8;
    }

    public synchronized void k0(int i7, int i8, Handler handler, Runnable runnable) {
        m0(i7, i8, handler, runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t1.g
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void L(e eVar, x xVar, r3 r3Var) {
        v0(eVar, r3Var);
    }

    public synchronized void p0(int i7, int i8, Handler handler, Runnable runnable) {
        q0(i7, i8, handler, runnable);
    }

    public synchronized void u0(s0 s0Var) {
        t0(s0Var, null, null);
    }

    @Override // t1.g, t1.a
    protected void y() {
        super.y();
        this.f22034v.clear();
    }

    @Override // t1.g, t1.a
    protected void z() {
    }
}
