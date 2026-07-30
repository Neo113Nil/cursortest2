package defpackage;

import android.util.Log;
import defpackage.aa2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r72 extends d00 {
    public static final vo2 x = zm3.f(d12.q);
    public static final AtomicReference y = new AtomicReference(Boolean.FALSE);
    public final bq a;
    public final Object b;
    public g61 c;
    public Throwable d;
    public final ArrayList e;
    public List f;
    public un1 g;
    public final eo1 h;
    public final ArrayList i;
    public final ArrayList j;
    public final tn1 k;
    public final t21 l;
    public final tn1 m;
    public final tn1 n;
    public ArrayList o;
    public LinkedHashSet p;
    public fs q;
    public at0 r;
    public boolean s;
    public final vo2 t;
    public final i61 u;
    public final CoroutineContext v;
    public final nm1 w;

    public r72(CoroutineContext coroutineContext) {
        bq bqVar = new bq(new dj(7, this));
        this.a = bqVar;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new un1();
        this.h = new eo1(new k00[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new tn1();
        this.l = new t21();
        this.m = new tn1();
        this.n = new tn1();
        this.t = zm3.f(o72.o);
        new mh(23);
        i61 i61Var = new i61((g61) coroutineContext.m(qb2.U));
        i61Var.o(new a0(9, this));
        this.u = i61Var;
        this.v = coroutineContext.p(bqVar).p(i61Var);
        this.w = new nm1(20);
    }

    public static void r(yn1 yn1Var) {
        try {
            if (yn1Var.w() instanceof om2) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            yn1Var.c();
        }
    }

    public static final void x(ArrayList arrayList, r72 r72Var, k00 k00Var) {
        arrayList.clear();
        synchronized (r72Var.b) {
            Iterator it = r72Var.j.iterator();
            if (it.hasNext()) {
                ((lm1) it.next()).getClass();
                throw null;
            }
            Unit unit = Unit.a;
        }
    }

    public final void A(Throwable th, k00 k00Var) {
        if (!((Boolean) y.get()).booleanValue() || (th instanceof jz)) {
            synchronized (this.b) {
                at0 at0Var = this.r;
                if (at0Var != null) {
                    throw ((Throwable) at0Var.m);
                }
                this.r = new at0(th);
                Unit unit = Unit.a;
            }
            throw th;
        }
        synchronized (this.b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.h.g();
                this.g = new un1();
                this.j.clear();
                this.k.a();
                this.m.a();
                this.r = new at0(th);
                if (k00Var != null) {
                    C(k00Var);
                }
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean B() {
        synchronized (this.b) {
            boolean z = true;
            if (this.g.g()) {
                if (this.h.o == 0 && !u() && !this.k.j()) {
                    z = false;
                }
                return z;
            }
            List w = w();
            qe2 qe2Var = new qe2(this.g);
            this.g = new un1();
            try {
                int size = w.size();
                for (int i = 0; i < size; i++) {
                    ((k00) w.get(i)).x(qe2Var);
                    if (((o72) this.t.getValue()).compareTo(o72.n) <= 0) {
                        break;
                    }
                }
                synchronized (this.b) {
                    if (t() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.h.o == 0 && !u() && !this.k.j()) {
                        z = false;
                    }
                }
                return z;
            } catch (Throwable th) {
                synchronized (this.b) {
                    un1 un1Var = this.g;
                    un1Var.getClass();
                    Iterator<E> it = qe2Var.iterator();
                    while (it.hasNext()) {
                        un1Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void C(k00 k00Var) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        if (!arrayList.contains(k00Var)) {
            arrayList.add(k00Var);
        }
        if (this.e.remove(k00Var)) {
            this.f = null;
        }
    }

    @Override // defpackage.d00
    public final void a(k00 k00Var, Function2 function2) {
        o72 o72Var;
        boolean contains;
        yn1 C;
        boolean z = k00Var.F.F;
        synchronized (this.b) {
            o72 o72Var2 = (o72) this.t.getValue();
            o72Var = o72.n;
            contains = o72Var2.compareTo(o72Var) > 0 ? true ^ w().contains(k00Var) : true;
        }
        try {
            a0 a0Var = new a0(8, k00Var);
            ek ekVar = new ek(6, k00Var, null);
            nm2 k = tm2.k();
            yn1 yn1Var = k instanceof yn1 ? (yn1) k : null;
            if (yn1Var == null || (C = yn1Var.C(a0Var, ekVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                nm2 j = C.j();
                try {
                    k00Var.j(function2);
                    Unit unit = Unit.a;
                    synchronized (this.b) {
                        if (((o72) this.t.getValue()).compareTo(o72Var) > 0 && !w().contains(k00Var)) {
                            this.e.add(k00Var);
                            this.f = null;
                        }
                    }
                    if (!z) {
                        tm2.k().m();
                    }
                    try {
                        synchronized (this.b) {
                            ArrayList arrayList = this.j;
                            if (arrayList.size() > 0) {
                                ((lm1) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            k00Var.d();
                            k00Var.f();
                            if (z) {
                                return;
                            }
                            tm2.k().m();
                        } catch (Throwable th) {
                            A(th, null);
                        }
                    } catch (Throwable th2) {
                        A(th2, k00Var);
                    }
                } finally {
                    nm2.q(j);
                }
            } finally {
                r(C);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.b) {
                    Unit unit2 = Unit.a;
                }
            }
            A(th3, k00Var);
        }
    }

    @Override // defpackage.d00
    public final boolean c() {
        return ((Boolean) y.get()).booleanValue();
    }

    @Override // defpackage.d00
    public final boolean d() {
        return false;
    }

    @Override // defpackage.d00
    public final boolean e() {
        return false;
    }

    @Override // defpackage.d00
    public final long f() {
        return 1000L;
    }

    @Override // defpackage.d00
    public final c00 g() {
        return null;
    }

    @Override // defpackage.d00
    public final CoroutineContext i() {
        return this.v;
    }

    @Override // defpackage.d00
    public final void j(k00 k00Var) {
        ds dsVar;
        synchronized (this.b) {
            if (this.h.i(k00Var)) {
                dsVar = null;
            } else {
                this.h.b(k00Var);
                dsVar = t();
            }
        }
        if (dsVar != null) {
            aa2.a aVar = aa2.m;
            ((fs) dsVar).resumeWith(Unit.a);
        }
    }

    @Override // defpackage.d00
    public final km1 k(lm1 lm1Var) {
        km1 km1Var;
        synchronized (this.b) {
            km1Var = (km1) this.m.k(lm1Var);
        }
        return km1Var;
    }

    @Override // defpackage.d00
    public final void n(k00 k00Var) {
        synchronized (this.b) {
            try {
                LinkedHashSet linkedHashSet = this.p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.p = linkedHashSet;
                }
                linkedHashSet.add(k00Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.d00
    public final void q(k00 k00Var) {
        synchronized (this.b) {
            if (this.e.remove(k00Var)) {
                this.f = null;
            }
            this.h.k(k00Var);
            this.i.remove(k00Var);
            Unit unit = Unit.a;
        }
    }

    public final void s() {
        synchronized (this.b) {
            try {
                if (((o72) this.t.getValue()).compareTo(o72.q) >= 0) {
                    vo2 vo2Var = this.t;
                    o72 o72Var = o72.n;
                    vo2Var.getClass();
                    vo2Var.j(null, o72Var);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.u.f(null);
    }

    public final ds t() {
        o72 o72Var;
        vo2 vo2Var = this.t;
        int compareTo = ((o72) vo2Var.getValue()).compareTo(o72.n);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        eo1 eo1Var = this.h;
        if (compareTo > 0) {
            if (this.r != null) {
                o72Var = o72.o;
            } else if (this.c == null) {
                this.g = new un1();
                eo1Var.g();
                o72Var = u() ? o72.p : o72.o;
            } else {
                o72Var = (eo1Var.o == 0 && !this.g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !u() && !this.k.j()) ? o72.q : o72.r;
            }
            vo2Var.j(null, o72Var);
            if (o72Var != o72.r) {
                return null;
            }
            fs fsVar = this.q;
            this.q = null;
            return fsVar;
        }
        for (k00 k00Var : w()) {
        }
        this.e.clear();
        this.f = ah0.m;
        this.g = new un1();
        eo1Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.o = null;
        fs fsVar2 = this.q;
        if (fsVar2 != null) {
            fsVar2.g(null);
        }
        this.q = null;
        this.r = null;
        return null;
    }

    public final boolean u() {
        return !this.s && (this.a.p.get() & 134217727) > 0;
    }

    public final boolean v() {
        boolean z;
        synchronized (this.b) {
            if (!this.g.h() && this.h.o == 0) {
                z = u();
            }
        }
        return z;
    }

    public final List w() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.e;
        List arrayList2 = arrayList.isEmpty() ? ah0.m : new ArrayList(arrayList);
        this.f = arrayList2;
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        if (r4 >= r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
    
        if (((kotlin.Pair) r11.get(r4)).n == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014f, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015f, code lost:
    
        r12 = (kotlin.Pair) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0167, code lost:
    
        if (r12.n != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0169, code lost:
    
        r12 = (defpackage.lm1) r12.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0170, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0173, code lost:
    
        r4 = r18.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0176, code lost:
    
        defpackage.vv.o(r3, r18.j);
        r3 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        if (r9 >= r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0197, code lost:
    
        if (((kotlin.Pair) r12).n == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0199, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019c, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List y(List list, un1 un1Var) {
        yn1 C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((lm1) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            k00 k00Var = (k00) entry.getKey();
            List list2 = (List) entry.getValue();
            if (k00Var.F.F) {
                b00.c("Check failed");
            }
            a0 a0Var = new a0(8, k00Var);
            ek ekVar = new ek(6, k00Var, un1Var);
            nm2 k = tm2.k();
            yn1 yn1Var = k instanceof yn1 ? (yn1) k : null;
            if (yn1Var == null || (C = yn1Var.C(a0Var, ekVar)) == null) {
                lh.g("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                nm2 j = C.j();
                try {
                    synchronized (this.b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                lm1 lm1Var = (lm1) list2.get(i2);
                                tn1 tn1Var = this.k;
                                lm1Var.getClass();
                                Object a = um1.a(tn1Var);
                                arrayList.add(new Pair(lm1Var, a));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.n == null) {
                                    t21 t21Var = this.l;
                                    ((lm1) pair.m).getClass();
                                    if (((tn1) t21Var.n).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(rv.l(arrayList, 10));
                                        int size4 = arrayList.size();
                                        int i4 = 0;
                                        while (i4 < size4) {
                                            Object obj3 = arrayList.get(i4);
                                            i4++;
                                            Pair pair2 = (Pair) obj3;
                                            if (pair2.n == null) {
                                                t21 t21Var2 = this.l;
                                                ((lm1) pair2.m).getClass();
                                                tn1 tn1Var2 = (tn1) t21Var2.n;
                                                if (tn1Var2.i()) {
                                                    ((tn1) t21Var2.o).a();
                                                }
                                            }
                                            arrayList2.add(pair2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((Pair) arrayList.get(i5)).n != null) {
                            break;
                        }
                        i5++;
                    }
                    k00Var.q(arrayList);
                    Unit unit = Unit.a;
                    nm2.q(j);
                } catch (Throwable th) {
                    nm2.q(j);
                    throw th;
                }
            } finally {
                r(C);
            }
        }
        return zv.M(hashMap.keySet());
    }

    public final k00 z(k00 k00Var, un1 un1Var) {
        yn1 C;
        if (k00Var.F.F || k00Var.G == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.p;
        if (linkedHashSet == null || !linkedHashSet.contains(k00Var)) {
            a0 a0Var = new a0(8, k00Var);
            ek ekVar = new ek(6, k00Var, un1Var);
            nm2 k = tm2.k();
            yn1 yn1Var = k instanceof yn1 ? (yn1) k : null;
            if (yn1Var == null || (C = yn1Var.C(a0Var, ekVar)) == null) {
                lh.g("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    nm2 j = C.j();
                    if (un1Var != null) {
                        try {
                            if (un1Var.h()) {
                                h00 h00Var = new h00(5, un1Var, k00Var);
                                a00 a00Var = k00Var.F;
                                if (a00Var.F) {
                                    b00.c("Preparing a composition while composing is not supported");
                                }
                                a00Var.F = true;
                                try {
                                    h00Var.invoke();
                                    a00Var.F = false;
                                } catch (Throwable th) {
                                    a00Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            nm2.q(j);
                            throw th2;
                        }
                    }
                    boolean w = k00Var.w();
                    nm2.q(j);
                    if (w) {
                        return k00Var;
                    }
                } finally {
                    r(C);
                }
            }
        }
        return null;
    }

    @Override // defpackage.d00
    public final void l(Set set) {
    }
}
