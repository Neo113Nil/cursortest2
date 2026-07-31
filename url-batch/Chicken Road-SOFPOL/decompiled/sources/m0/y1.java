package m0;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y1 extends v {

    /* renamed from: y, reason: collision with root package name */
    public static final d7.n0 f5186y = d7.e0.b(s0.b.f6686g);

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicReference f5187z = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final f f5188a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5189b;

    /* renamed from: c, reason: collision with root package name */
    public a7.s0 f5190c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f5191d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5192e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5193f;

    /* renamed from: g, reason: collision with root package name */
    public o.k0 f5194g;

    /* renamed from: h, reason: collision with root package name */
    public final o0.e f5195h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f5196j;

    /* renamed from: k, reason: collision with root package name */
    public final o.j0 f5197k;

    /* renamed from: l, reason: collision with root package name */
    public final a0.a0 f5198l;

    /* renamed from: m, reason: collision with root package name */
    public final o.j0 f5199m;

    /* renamed from: n, reason: collision with root package name */
    public final o.j0 f5200n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f5201o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashSet f5202p;

    /* renamed from: q, reason: collision with root package name */
    public a7.h f5203q;

    /* renamed from: r, reason: collision with root package name */
    public b1.b f5204r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5205s;

    /* renamed from: t, reason: collision with root package name */
    public final d7.n0 f5206t;

    /* renamed from: u, reason: collision with root package name */
    public final a0.g1 f5207u;

    /* renamed from: v, reason: collision with root package name */
    public final a7.u0 f5208v;

    /* renamed from: w, reason: collision with root package name */
    public final g6.h f5209w;

    /* renamed from: x, reason: collision with root package name */
    public final v0 f5210x;

    public y1(g6.h hVar) {
        f fVar = new f(new androidx.lifecycle.m0(6, this));
        this.f5188a = fVar;
        this.f5189b = new Object();
        this.f5192e = new ArrayList();
        this.f5194g = new o.k0();
        this.f5195h = new o0.e(new y[16]);
        this.i = new ArrayList();
        this.f5196j = new ArrayList();
        this.f5197k = new o.j0();
        this.f5198l = new a0.a0(12);
        this.f5199m = new o.j0();
        this.f5200n = new o.j0();
        this.f5206t = d7.e0.b(u1.f5128f);
        this.f5207u = new a0.g1(10);
        a7.u0 u0Var = new a7.u0((a7.s0) hVar.l(a7.r.f297e));
        u0Var.w(new a0.t(14, this));
        this.f5208v = u0Var;
        this.f5209w = hVar.c(fVar).c(u0Var);
        this.f5210x = new v0(8);
    }

    public static final void B(ArrayList arrayList, y1 y1Var, y yVar) {
        arrayList.clear();
        synchronized (y1Var.f5189b) {
            Iterator it = y1Var.f5196j.iterator();
            if (it.hasNext()) {
                ((y0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void u(w0.b bVar) {
        try {
            if (bVar.w() instanceof w0.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            bVar.c();
        }
    }

    public final void A(y yVar) {
        synchronized (this.f5189b) {
            ArrayList arrayList = this.f5196j;
            if (arrayList.size() > 0) {
                ((y0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013c, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        if (((c6.f) r10.get(r4)).f1748e == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0150, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
    
        r11 = (c6.f) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        if (r11.f1748e != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016a, code lost:
    
        r11 = (m0.y0) r11.f1747d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0171, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        r4 = r17.f5189b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0177, code lost:
    
        d6.r.O(r17.f5196j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017c, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
    
        if (((c6.f) r11).f1748e == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0198, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019e, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List C(List list, o.k0 k0Var) {
        w0.b C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((y0) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            y yVar = (y) entry.getKey();
            List list2 = (List) entry.getValue();
            if (yVar.f5184y.F) {
                t.c("Check failed");
            }
            a0.t tVar = new a0.t(13, yVar);
            a0.v0 v0Var = new a0.v0(6, yVar, k0Var);
            w0.f k3 = w0.m.k();
            w0.b bVar = k3 instanceof w0.b ? (w0.b) k3 : null;
            if (bVar == null || (C = bVar.C(tVar, v0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                w0.f j7 = C.j();
                try {
                    synchronized (this.f5189b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                y0 y0Var = (y0) list2.get(i8);
                                o.j0 j0Var = this.f5197k;
                                y0Var.getClass();
                                Object a8 = o0.a.a(j0Var);
                                arrayList.add(new c6.f(y0Var, a8));
                            }
                            int size3 = arrayList.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size3) {
                                    break;
                                }
                                c6.f fVar = (c6.f) arrayList.get(i9);
                                if (fVar.f1748e == null) {
                                    a0.a0 a0Var = this.f5198l;
                                    ((y0) fVar.f1747d).getClass();
                                    if (((o.j0) a0Var.f11e).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(d6.n.M(arrayList, 10));
                                        int size4 = arrayList.size();
                                        int i10 = 0;
                                        while (i10 < size4) {
                                            Object obj3 = arrayList.get(i10);
                                            i10++;
                                            c6.f fVar2 = (c6.f) obj3;
                                            if (fVar2.f1748e == null) {
                                                a0.a0 a0Var2 = this.f5198l;
                                                ((y0) fVar2.f1747d).getClass();
                                                o.j0 j0Var2 = (o.j0) a0Var2.f11e;
                                                if (j0Var2.i()) {
                                                    ((o.j0) a0Var2.f12f).a();
                                                }
                                            }
                                            arrayList2.add(fVar2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i9++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size5) {
                            break;
                        }
                        if (((c6.f) arrayList.get(i11)).f1748e != null) {
                            break;
                        }
                        i11++;
                    }
                    yVar.r(arrayList);
                    w0.f.q(j7);
                } catch (Throwable th) {
                    w0.f.q(j7);
                    throw th;
                }
            } finally {
                u(C);
            }
        }
        return d6.m.g0(hashMap.keySet());
    }

    public final y D(y yVar, o.k0 k0Var) {
        w0.b C;
        if (yVar.f5184y.F || yVar.f5185z == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f5202p;
        if (linkedHashSet == null || !linkedHashSet.contains(yVar)) {
            a0.t tVar = new a0.t(13, yVar);
            a0.v0 v0Var = new a0.v0(6, yVar, k0Var);
            w0.f k3 = w0.m.k();
            w0.b bVar = k3 instanceof w0.b ? (w0.b) k3 : null;
            if (bVar == null || (C = bVar.C(tVar, v0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                w0.f j7 = C.j();
                if (k0Var != null) {
                    try {
                        if (k0Var.h()) {
                            a0.z0 z0Var = new a0.z0(5, k0Var, yVar);
                            s sVar = yVar.f5184y;
                            if (sVar.F) {
                                t.c("Preparing a composition while composing is not supported");
                            }
                            sVar.F = true;
                            try {
                                z0Var.b();
                                sVar.F = false;
                            } catch (Throwable th) {
                                sVar.F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        w0.f.q(j7);
                        throw th2;
                    }
                }
                boolean x7 = yVar.x();
                w0.f.q(j7);
                if (x7) {
                    return yVar;
                }
            } finally {
                u(C);
            }
        }
        return null;
    }

    public final void E(Throwable th, y yVar) {
        if (!((Boolean) f5187z.get()).booleanValue() || (th instanceof m)) {
            synchronized (this.f5189b) {
                b1.b bVar = this.f5204r;
                if (bVar != null) {
                    throw ((Throwable) bVar.f1050e);
                }
                this.f5204r = new b1.b(24, th);
            }
            throw th;
        }
        synchronized (this.f5189b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.f5195h.g();
                this.f5194g = new o.k0();
                this.f5196j.clear();
                this.f5197k.a();
                this.f5199m.a();
                this.f5204r = new b1.b(24, th);
                if (yVar != null) {
                    G(yVar);
                }
                w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean F() {
        synchronized (this.f5189b) {
            boolean z3 = true;
            if (this.f5194g.g()) {
                if (this.f5195h.f5580f == 0 && !x() && !this.f5197k.j()) {
                    z3 = false;
                }
                return z3;
            }
            List z7 = z();
            o0.g gVar = new o0.g(this.f5194g);
            this.f5194g = new o.k0();
            try {
                int size = z7.size();
                for (int i = 0; i < size; i++) {
                    ((y) z7.get(i)).y(gVar);
                    if (((u1) this.f5206t.getValue()).compareTo(u1.f5127e) <= 0) {
                        break;
                    }
                }
                synchronized (this.f5189b) {
                    if (w() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.f5195h.f5580f == 0 && !x() && !this.f5197k.j()) {
                        z3 = false;
                    }
                }
                return z3;
            } catch (Throwable th) {
                synchronized (this.f5189b) {
                    o.k0 k0Var = this.f5194g;
                    k0Var.getClass();
                    Iterator<E> it = gVar.iterator();
                    while (it.hasNext()) {
                        k0Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void G(y yVar) {
        ArrayList arrayList = this.f5201o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f5201o = arrayList;
        }
        if (!arrayList.contains(yVar)) {
            arrayList.add(yVar);
        }
        if (this.f5192e.remove(yVar)) {
            this.f5193f = null;
        }
    }

    @Override // m0.v
    public final void a(y yVar, p6.e eVar) {
        u1 u1Var;
        boolean contains;
        w0.b C;
        boolean z3 = yVar.f5184y.F;
        synchronized (this.f5189b) {
            u1 u1Var2 = (u1) this.f5206t.getValue();
            u1Var = u1.f5127e;
            contains = u1Var2.compareTo(u1Var) > 0 ? true ^ z().contains(yVar) : true;
        }
        try {
            a0.t tVar = new a0.t(13, yVar);
            a0.v0 v0Var = new a0.v0(6, yVar, null);
            w0.f k3 = w0.m.k();
            w0.b bVar = k3 instanceof w0.b ? (w0.b) k3 : null;
            if (bVar == null || (C = bVar.C(tVar, v0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                w0.f j7 = C.j();
                try {
                    yVar.j(eVar);
                    synchronized (this.f5189b) {
                        if (((u1) this.f5206t.getValue()).compareTo(u1Var) > 0 && !z().contains(yVar)) {
                            this.f5192e.add(yVar);
                            this.f5193f = null;
                        }
                    }
                    if (!z3) {
                        w0.m.k().m();
                    }
                    try {
                        A(yVar);
                        try {
                            yVar.d();
                            yVar.f();
                            if (z3) {
                                return;
                            }
                            w0.m.k().m();
                        } catch (Throwable th) {
                            E(th, null);
                        }
                    } catch (Throwable th2) {
                        E(th2, yVar);
                    }
                } finally {
                    w0.f.q(j7);
                }
            } finally {
                u(C);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.f5189b) {
                }
            }
            E(th3, yVar);
        }
    }

    @Override // m0.v
    public final o.k0 b(y yVar, c5.n nVar, p6.e eVar) {
        a0.g1 g1Var = this.f5207u;
        try {
            c5.n nVar2 = yVar.f5178s;
            yVar.f5178s = nVar;
            try {
                a(yVar, eVar);
                o.k0 k0Var = (o.k0) g1Var.l();
                if (k0Var == null) {
                    k0Var = o.s0.f5536a;
                    q6.i.c(k0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return k0Var;
            } finally {
                yVar.f5178s = nVar2;
            }
        } finally {
            g1Var.I(null);
        }
    }

    @Override // m0.v
    public final boolean d() {
        return ((Boolean) f5187z.get()).booleanValue();
    }

    @Override // m0.v
    public final boolean e() {
        return false;
    }

    @Override // m0.v
    public final boolean f() {
        return false;
    }

    @Override // m0.v
    public final long g() {
        return 1000;
    }

    @Override // m0.v
    public final u h() {
        return null;
    }

    @Override // m0.v
    public final g6.h j() {
        return this.f5209w;
    }

    @Override // m0.v
    public final void k(y yVar) {
        a7.f fVar;
        synchronized (this.f5189b) {
            if (this.f5195h.h(yVar)) {
                fVar = null;
            } else {
                this.f5195h.b(yVar);
                fVar = w();
            }
        }
        if (fVar != null) {
            ((a7.h) fVar).k(c6.m.f1757a);
        }
    }

    @Override // m0.v
    public final x0 l(y0 y0Var) {
        x0 x0Var;
        synchronized (this.f5189b) {
            x0Var = (x0) this.f5199m.k(y0Var);
        }
        return x0Var;
    }

    @Override // m0.v
    public final o.k0 m(y yVar, c5.n nVar, o.k0 k0Var) {
        a0.g1 g1Var = this.f5207u;
        try {
            F();
            yVar.y(new o0.g(k0Var));
            c5.n nVar2 = yVar.f5178s;
            yVar.f5178s = nVar;
            try {
                y D = D(yVar, null);
                if (D != null) {
                    A(yVar);
                    D.d();
                    D.f();
                }
                o.k0 k0Var2 = (o.k0) g1Var.l();
                if (k0Var2 == null) {
                    k0Var2 = o.s0.f5536a;
                    q6.i.c(k0Var2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return k0Var2;
            } finally {
                yVar.f5178s = nVar2;
            }
        } finally {
            g1Var.I(null);
        }
    }

    @Override // m0.v
    public final void p(t1 t1Var) {
        a0.g1 g1Var = this.f5207u;
        o.k0 k0Var = (o.k0) g1Var.l();
        if (k0Var == null) {
            o.k0 k0Var2 = o.s0.f5536a;
            k0Var = new o.k0();
            g1Var.I(k0Var);
        }
        k0Var.a(t1Var);
    }

    @Override // m0.v
    public final void q(y yVar) {
        synchronized (this.f5189b) {
            try {
                LinkedHashSet linkedHashSet = this.f5202p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f5202p = linkedHashSet;
                }
                linkedHashSet.add(yVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.v
    public final void t(y yVar) {
        synchronized (this.f5189b) {
            if (this.f5192e.remove(yVar)) {
                this.f5193f = null;
            }
            this.f5195h.j(yVar);
            this.i.remove(yVar);
        }
    }

    public final void v() {
        synchronized (this.f5189b) {
            if (((u1) this.f5206t.getValue()).compareTo(u1.f5130h) >= 0) {
                d7.n0 n0Var = this.f5206t;
                u1 u1Var = u1.f5127e;
                n0Var.getClass();
                n0Var.j(null, u1Var);
            }
        }
        this.f5208v.a(null);
    }

    public final a7.f w() {
        d7.n0 n0Var = this.f5206t;
        int compareTo = ((u1) n0Var.getValue()).compareTo(u1.f5127e);
        ArrayList arrayList = this.f5196j;
        ArrayList arrayList2 = this.i;
        o0.e eVar = this.f5195h;
        if (compareTo <= 0) {
            for (y yVar : z()) {
            }
            this.f5192e.clear();
            this.f5193f = d6.u.f2326d;
            this.f5194g = new o.k0();
            eVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f5201o = null;
            a7.h hVar = this.f5203q;
            if (hVar != null) {
                hVar.m(null);
            }
            this.f5203q = null;
            this.f5204r = null;
            return null;
        }
        b1.b bVar = this.f5204r;
        u1 u1Var = u1.i;
        u1 u1Var2 = u1.f5128f;
        if (bVar == null) {
            if (this.f5190c == null) {
                this.f5194g = new o.k0();
                eVar.g();
                if (x()) {
                    u1Var2 = u1.f5129g;
                }
            } else {
                u1Var2 = (eVar.f5580f == 0 && !this.f5194g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !x() && !this.f5197k.j()) ? u1.f5130h : u1Var;
            }
        }
        n0Var.getClass();
        n0Var.j(null, u1Var2);
        if (u1Var2 != u1Var) {
            return null;
        }
        a7.h hVar2 = this.f5203q;
        this.f5203q = null;
        return hVar2;
    }

    public final boolean x() {
        return !this.f5205s && (this.f5188a.f4923g.get() & 134217727) > 0;
    }

    public final boolean y() {
        boolean z3;
        synchronized (this.f5189b) {
            if (!this.f5194g.h() && this.f5195h.f5580f == 0) {
                z3 = x();
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List z() {
        ?? r02 = this.f5193f;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f5192e;
        List arrayList2 = arrayList.isEmpty() ? d6.u.f2326d : new ArrayList(arrayList);
        this.f5193f = arrayList2;
        return arrayList2;
    }

    @Override // m0.v
    public final void n(Set set) {
    }
}
