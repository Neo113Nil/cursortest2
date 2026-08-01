package n0;

import android.util.Log;
import com.google.android.gms.internal.measurement.se;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z1 extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final je.l0 f6873y = je.b0.b(v0.b.f9929s);

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicReference f6874z = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final d f6875a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.n f6876b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6877c;

    /* renamed from: d, reason: collision with root package name */
    public ge.c1 f6878d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f6879e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6880f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public s.i0 f6881h;

    /* renamed from: i, reason: collision with root package name */
    public final o0.e f6882i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f6883k;

    /* renamed from: l, reason: collision with root package name */
    public final s.h0 f6884l;

    /* renamed from: m, reason: collision with root package name */
    public final c6.l f6885m;

    /* renamed from: n, reason: collision with root package name */
    public final s.h0 f6886n;

    /* renamed from: o, reason: collision with root package name */
    public final s.h0 f6887o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f6888p;

    /* renamed from: q, reason: collision with root package name */
    public s.i0 f6889q;

    /* renamed from: r, reason: collision with root package name */
    public ge.h f6890r;

    /* renamed from: s, reason: collision with root package name */
    public final je.l0 f6891s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6892t;

    /* renamed from: u, reason: collision with root package name */
    public final je.l0 f6893u;

    /* renamed from: v, reason: collision with root package name */
    public final ge.e1 f6894v;

    /* renamed from: w, reason: collision with root package name */
    public final CoroutineContext f6895w;

    /* renamed from: x, reason: collision with root package name */
    public final e f6896x;

    public z1(CoroutineContext coroutineContext) {
        d dVar = new d(new t1(this, 0));
        this.f6875a = dVar;
        this.f6876b = new a1.n(new t1(this, 1));
        this.f6877c = new Object();
        this.f6880f = new ArrayList();
        this.f6881h = new s.i0();
        this.f6882i = new o0.e(new q[16]);
        this.j = new ArrayList();
        this.f6883k = new ArrayList();
        this.f6884l = new s.h0();
        this.f6885m = new c6.l(8);
        this.f6886n = new s.h0();
        this.f6887o = new s.h0();
        this.f6891s = je.b0.b(null);
        this.f6893u = je.b0.b(v1.f6826i);
        new p.e(15);
        ge.e1 e1Var = new ge.e1((ge.c1) coroutineContext.m(ge.u.f4403e));
        e1Var.o(new a1.d(9, this));
        this.f6894v = e1Var;
        this.f6895w = coroutineContext.p(dVar).p(e1Var);
        this.f6896x = new e(9);
    }

    public static final void C(ArrayList arrayList, z1 z1Var, q qVar) {
        arrayList.clear();
        synchronized (z1Var.f6877c) {
            Iterator it = z1Var.f6883k.iterator();
            if (it.hasNext()) {
                ((u0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void t(b1.d dVar) {
        try {
            if (dVar.w() instanceof b1.k) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            dVar.c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List A() {
        ?? r02 = this.g;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f6880f;
        List arrayList2 = arrayList.isEmpty() ? kotlin.collections.j0.f5574d : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void B() {
        ge.f v10;
        synchronized (this.f6877c) {
            v10 = v();
            if (((v1) this.f6893u.getValue()).compareTo(v1.f6825e) <= 0) {
                Throwable th = this.f6879e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (v10 != null) {
            hd.l lVar = hd.n.f4511e;
            ((ge.h) v10).resumeWith(Unit.f5554a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        if (r4 >= r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).f5553e == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015d, code lost:
    
        if (r8 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015f, code lost:
    
        r11 = (kotlin.Pair) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0167, code lost:
    
        if (r11.f5553e != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0169, code lost:
    
        r11 = (n0.u0) r11.f5552d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0170, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
    
        r4 = r17.f6877c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0175, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
    
        kotlin.collections.d0.l(r17.f6883k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017b, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018a, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018c, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0195, code lost:
    
        if (((kotlin.Pair) r11).f5553e == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0197, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List D(List list, s.i0 i0Var) {
        b1.d C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            ((u0) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            q qVar = (q) entry.getKey();
            List list2 = (List) entry.getValue();
            if (qVar.H.F) {
                m.a("Check failed");
            }
            a1.d dVar = new a1.d(8, qVar);
            b0.l0 l0Var = new b0.l0(10, qVar, i0Var);
            b1.i j = b1.r.j();
            b1.d dVar2 = j instanceof b1.d ? (b1.d) j : null;
            if (dVar2 == null || (C = dVar2.C(dVar, l0Var)) == null) {
                kotlin.collections.i0.l("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                b1.i j3 = C.j();
                try {
                    synchronized (this.f6877c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                u0 u0Var = (u0) list2.get(i10);
                                s.h0 h0Var = this.f6884l;
                                u0Var.getClass();
                                Object a9 = o0.a.a(h0Var);
                                arrayList.add(new Pair(u0Var, a9));
                            }
                            int size3 = arrayList.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size3) {
                                    break;
                                }
                                Pair pair = (Pair) arrayList.get(i11);
                                if (pair.f5553e == null) {
                                    c6.l lVar = this.f6885m;
                                    ((u0) pair.f5552d).getClass();
                                    if (((s.h0) lVar.f1829e).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i12 = 0; i12 < size4; i12++) {
                                            Pair pair2 = (Pair) arrayList.get(i12);
                                            if (pair2.f5553e == null) {
                                                c6.l lVar2 = this.f6885m;
                                                ((u0) pair2.f5552d).getClass();
                                                s.h0 h0Var2 = (s.h0) lVar2.f1829e;
                                                if (h0Var2.i()) {
                                                    ((s.h0) lVar2.f1830i).a();
                                                }
                                            }
                                            arrayList2.add(pair2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i11++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size5) {
                            break;
                        }
                        if (((Pair) arrayList.get(i13)).f5553e != null) {
                            break;
                        }
                        i13++;
                    }
                    qVar.q(arrayList);
                    b1.i.q(j3);
                } catch (Throwable th) {
                    b1.i.q(j3);
                    throw th;
                }
            } finally {
                t(C);
            }
        }
        return CollectionsKt.Q(hashMap.keySet());
    }

    public final q E(q qVar, s.i0 i0Var) {
        b1.d C;
        if (qVar.H.F || qVar.I == 3) {
            return null;
        }
        s.i0 i0Var2 = this.f6889q;
        if (i0Var2 == null || !i0Var2.c(qVar)) {
            a1.d dVar = new a1.d(8, qVar);
            b0.l0 l0Var = new b0.l0(10, qVar, i0Var);
            b1.i j = b1.r.j();
            b1.d dVar2 = j instanceof b1.d ? (b1.d) j : null;
            if (dVar2 == null || (C = dVar2.C(dVar, l0Var)) == null) {
                kotlin.collections.i0.l("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                b1.i j3 = C.j();
                if (i0Var != null) {
                    try {
                        if (i0Var.h()) {
                            a4.a aVar = new a4.a(6, i0Var, qVar);
                            i0 i0Var3 = qVar.H;
                            if (i0Var3.F) {
                                m.a("Preparing a composition while composing is not supported");
                            }
                            i0Var3.F = true;
                            try {
                                aVar.invoke();
                                i0Var3.F = false;
                            } catch (Throwable th) {
                                i0Var3.F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        b1.i.q(j3);
                        throw th2;
                    }
                }
                boolean v10 = qVar.v();
                b1.i.q(j3);
                if (v10) {
                    return qVar;
                }
            } finally {
                t(C);
            }
        }
        return null;
    }

    public final void F(Throwable th, q qVar) {
        if (!((Boolean) f6874z.get()).booleanValue() || (th instanceof j)) {
            synchronized (this.f6877c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                u1 u1Var = (u1) this.f6891s.getValue();
                if (u1Var != null) {
                    throw u1Var.f6819a;
                }
                je.l0 l0Var = this.f6891s;
                u1 u1Var2 = new u1(th);
                l0Var.getClass();
                l0Var.k(null, u1Var2);
            }
            throw th;
        }
        synchronized (this.f6877c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.f6882i.g();
                this.f6881h = new s.i0();
                this.f6883k.clear();
                this.f6884l.a();
                this.f6886n.a();
                je.l0 l0Var2 = this.f6891s;
                u1 u1Var3 = new u1(th);
                l0Var2.getClass();
                l0Var2.k(null, u1Var3);
                if (qVar != null) {
                    H(qVar);
                }
                if (v() != null) {
                    m.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean G() {
        boolean x10;
        synchronized (this.f6877c) {
            if (this.f6881h.g()) {
                return x();
            }
            List A = A();
            o0.h hVar = new o0.h(this.f6881h);
            this.f6881h = new s.i0();
            try {
                int size = A.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((q) A.get(i3)).w(hVar);
                    if (((v1) this.f6893u.getValue()).compareTo(v1.f6825e) <= 0) {
                        break;
                    }
                }
                synchronized (this.f6877c) {
                    if (v() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    x10 = x();
                }
                return x10;
            } catch (Throwable th) {
                synchronized (this.f6877c) {
                    s.i0 i0Var = this.f6881h;
                    i0Var.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        i0Var.i(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void H(q qVar) {
        ArrayList arrayList = this.f6888p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f6888p = arrayList;
        }
        if (!arrayList.contains(qVar)) {
            arrayList.add(qVar);
        }
        if (this.f6880f.remove(qVar)) {
            this.g = null;
        }
    }

    @Override // n0.o
    public final void a(q qVar, Function2 function2) {
        v1 v1Var;
        boolean contains;
        b1.d C;
        boolean z10 = qVar.H.F;
        synchronized (this.f6877c) {
            v1 v1Var2 = (v1) this.f6893u.getValue();
            v1Var = v1.f6825e;
            contains = v1Var2.compareTo(v1Var) > 0 ? true ^ A().contains(qVar) : true;
        }
        try {
            a1.d dVar = new a1.d(8, qVar);
            b0.l0 l0Var = new b0.l0(10, qVar, null);
            b1.i j = b1.r.j();
            b1.d dVar2 = j instanceof b1.d ? (b1.d) j : null;
            if (dVar2 == null || (C = dVar2.C(dVar, l0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                b1.i j3 = C.j();
                try {
                    qVar.j(function2);
                    synchronized (this.f6877c) {
                        if (((v1) this.f6893u.getValue()).compareTo(v1Var) > 0 && !A().contains(qVar)) {
                            this.f6880f.add(qVar);
                            this.g = null;
                        }
                    }
                    if (!z10) {
                        b1.r.j().m();
                    }
                    try {
                        synchronized (this.f6877c) {
                            ArrayList arrayList = this.f6883k;
                            if (arrayList.size() > 0) {
                                ((u0) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            qVar.d();
                            qVar.f();
                            if (z10) {
                                return;
                            }
                            b1.r.j().m();
                        } catch (Throwable th) {
                            F(th, null);
                        }
                    } catch (Throwable th2) {
                        F(th2, qVar);
                    }
                } finally {
                    b1.i.q(j3);
                }
            } finally {
                t(C);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.f6877c) {
                }
            }
            F(th3, qVar);
        }
    }

    @Override // n0.o
    public final boolean c() {
        return ((Boolean) f6874z.get()).booleanValue();
    }

    @Override // n0.o
    public final boolean d() {
        return false;
    }

    @Override // n0.o
    public final boolean e() {
        return false;
    }

    @Override // n0.o
    public final long f() {
        return 1000;
    }

    @Override // n0.o
    public final n g() {
        return null;
    }

    @Override // n0.o
    public final CoroutineContext i() {
        return this.f6895w;
    }

    @Override // n0.o
    public final boolean j() {
        return false;
    }

    @Override // n0.o
    public final void k(q qVar) {
        ge.f fVar;
        synchronized (this.f6877c) {
            if (this.f6882i.h(qVar)) {
                fVar = null;
            } else {
                this.f6882i.b(qVar);
                fVar = v();
            }
        }
        if (fVar != null) {
            hd.l lVar = hd.n.f4511e;
            ((ge.h) fVar).resumeWith(Unit.f5554a);
        }
    }

    @Override // n0.o
    public final t0 l(u0 u0Var) {
        t0 t0Var;
        synchronized (this.f6877c) {
            t0Var = (t0) this.f6886n.k(u0Var);
        }
        return t0Var;
    }

    @Override // n0.o
    public final void o(q qVar) {
        synchronized (this.f6877c) {
            try {
                s.i0 i0Var = this.f6889q;
                if (i0Var == null) {
                    int i3 = s.q0.f8360a;
                    i0Var = new s.i0();
                    this.f6889q = i0Var;
                }
                i0Var.a(qVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n0.o
    public final f p(a2.a0 a0Var) {
        a1.n nVar = this.f6876b;
        se seVar = (se) nVar.f40e;
        b1 b1Var = new b1();
        b1Var.f6641a = a0Var;
        return seVar.i(b1Var, (a4.a) nVar.f42r);
    }

    @Override // n0.o
    public final void s(q qVar) {
        synchronized (this.f6877c) {
            if (this.f6880f.remove(qVar)) {
                this.g = null;
            }
            this.f6882i.k(qVar);
            this.j.remove(qVar);
        }
    }

    public final void u() {
        synchronized (this.f6877c) {
            if (((v1) this.f6893u.getValue()).compareTo(v1.f6828s) >= 0) {
                je.l0 l0Var = this.f6893u;
                v1 v1Var = v1.f6825e;
                l0Var.getClass();
                l0Var.k(null, v1Var);
            }
        }
        this.f6894v.a(null);
    }

    public final ge.f v() {
        v1 v1Var;
        je.l0 l0Var = this.f6893u;
        int compareTo = ((v1) l0Var.getValue()).compareTo(v1.f6825e);
        je.l0 l0Var2 = this.f6891s;
        ArrayList arrayList = this.f6883k;
        ArrayList arrayList2 = this.j;
        o0.e eVar = this.f6882i;
        if (compareTo > 0) {
            if (l0Var2.getValue() != null) {
                v1Var = v1.f6826i;
            } else if (this.f6878d == null) {
                this.f6881h = new s.i0();
                eVar.g();
                v1Var = (w() || y()) ? v1.f6827r : v1.f6826i;
            } else {
                v1Var = (eVar.f7319i != 0 || this.f6881h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || w() || y() || this.f6884l.j()) ? v1.f6829t : v1.f6828s;
            }
            l0Var.k(null, v1Var);
            if (v1Var != v1.f6829t) {
                return null;
            }
            ge.h hVar = this.f6890r;
            this.f6890r = null;
            return hVar;
        }
        List A = A();
        int size = A.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
        this.f6880f.clear();
        this.g = kotlin.collections.j0.f5574d;
        this.f6881h = new s.i0();
        eVar.g();
        arrayList2.clear();
        arrayList.clear();
        this.f6888p = null;
        ge.h hVar2 = this.f6890r;
        if (hVar2 != null) {
            hVar2.n(null);
        }
        this.f6890r = null;
        l0Var2.j(null);
        return null;
    }

    public final boolean w() {
        return !this.f6892t && (((x0.a) this.f6875a.f6656e.f2800i).get() & 134217727) > 0;
    }

    public final boolean x() {
        return this.f6882i.f7319i != 0 || w() || y() || this.f6884l.j();
    }

    public final boolean y() {
        return !this.f6892t && (((x0.a) ((se) this.f6876b.f40e).f2800i).get() & 134217727) > 0;
    }

    public final boolean z() {
        boolean z10;
        synchronized (this.f6877c) {
            if (!this.f6881h.h() && this.f6882i.f7319i == 0 && !w()) {
                z10 = y();
            }
        }
        return z10;
    }

    @Override // n0.o
    public final void m(Set set) {
    }
}
