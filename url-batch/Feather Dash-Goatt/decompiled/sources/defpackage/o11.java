package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o11 extends ml {
    public final qe a;
    public final i8 b;
    public final Object c;
    public jb0 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public wn0 h;
    public final eo0 i;
    public final ArrayList j;
    public final ArrayList k;
    public final vn0 l;
    public final yw m;
    public final vn0 n;
    public final vn0 o;
    public ArrayList p;
    public LinkedHashSet q;
    public tf r;
    public nq0 s;
    public boolean t;
    public final be1 u;
    public final i8 v;
    public final lb0 w;
    public final CoroutineContext x;
    public final j50 y;
    public static final be1 z = m90.c(sw0.i);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public o11(CoroutineContext coroutineContext) {
        qe qeVar = new qe(new j11(this, 0));
        this.a = qeVar;
        this.b = new i8(new j11(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new wn0();
        this.i = new eo0(new tl[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new vn0();
        this.m = new yw(21);
        this.n = new vn0();
        this.o = new vn0();
        this.u = m90.c(k11.g);
        this.v = new i8(21);
        lb0 lb0Var = new lb0((jb0) coroutineContext.d(j41.m));
        lb0Var.h(new l(17, this));
        this.w = lb0Var;
        this.x = coroutineContext.i(qeVar).i(lb0Var);
        this.y = new j50(28);
    }

    public static final void G(ArrayList arrayList, o11 o11Var, tl tlVar) {
        arrayList.clear();
        synchronized (o11Var.c) {
            Iterator it = o11Var.k.iterator();
            if (it.hasNext()) {
                ((xm0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(zn0 zn0Var) {
        try {
            if (zn0Var.w() instanceof jb1) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            zn0Var.c();
        }
    }

    public final boolean A() {
        return this.i.g != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((ha) ((mc) this.b.g).g).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.h() && this.i.g == 0 && !z()) {
                z2 = B();
            }
        }
        return z2;
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? nv.d : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        sf y;
        synchronized (this.c) {
            y = y();
            if (((k11) this.u.getValue()).compareTo(k11.e) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (y != null) {
            i31 i31Var = k31.d;
            ((tf) y).l(Unit.a);
        }
    }

    public final void F(tl tlVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((xm0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        if (r4 >= r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        if (((kotlin.Pair) r11.get(r4)).e == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015c, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
    
        r12 = (kotlin.Pair) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        if (r12.e != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        r12 = (defpackage.xm0) r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        r4 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        defpackage.ei.j(r18.k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0189, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0194, code lost:
    
        if (((kotlin.Pair) r12).e == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0199, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019c, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List H(List list, wn0 wn0Var) {
        zn0 C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((xm0) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            tl tlVar = (tl) entry.getKey();
            List list2 = (List) entry.getValue();
            if (tlVar.z.F) {
                kl.a("Check failed");
            }
            l lVar = new l(16, tlVar);
            c cVar = new c(tlVar, 15, wn0Var);
            ib1 j = pb1.j();
            zn0 zn0Var = j instanceof zn0 ? (zn0) j : null;
            if (zn0Var == null || (C = zn0Var.C(lVar, cVar)) == null) {
                dd0.j("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                ib1 j2 = C.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                xm0 xm0Var = (xm0) list2.get(i2);
                                vn0 vn0Var = this.l;
                                xm0Var.getClass();
                                Object a = zm0.a(vn0Var);
                                arrayList.add(new Pair(xm0Var, a));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.e == null) {
                                    yw ywVar = this.m;
                                    ((xm0) pair.d).getClass();
                                    if (((vn0) ywVar.e).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            Pair pair2 = (Pair) arrayList.get(i4);
                                            if (pair2.e == null) {
                                                yw ywVar2 = this.m;
                                                ((xm0) pair2.d).getClass();
                                                vn0 vn0Var2 = (vn0) ywVar2.e;
                                                if (vn0Var2.i()) {
                                                    ((vn0) ywVar2.g).a();
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
                        if (((Pair) arrayList.get(i5)).e != null) {
                            break;
                        }
                        i5++;
                    }
                    tlVar.r(arrayList);
                    ib1.q(j2);
                } catch (Throwable th) {
                    ib1.q(j2);
                    throw th;
                }
            } finally {
                w(C);
            }
        }
        return CollectionsKt.y(hashMap.keySet());
    }

    public final tl I(tl tlVar, wn0 wn0Var) {
        zn0 C;
        if (tlVar.z.F || tlVar.A == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.q;
        if (linkedHashSet == null || !linkedHashSet.contains(tlVar)) {
            l lVar = new l(16, tlVar);
            c cVar = new c(tlVar, 15, wn0Var);
            ib1 j = pb1.j();
            zn0 zn0Var = j instanceof zn0 ? (zn0) j : null;
            if (zn0Var == null || (C = zn0Var.C(lVar, cVar)) == null) {
                dd0.j("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    ib1 j2 = C.j();
                    if (wn0Var != null) {
                        try {
                            if (wn0Var.h()) {
                                vc vcVar = new vc(wn0Var, 7, tlVar);
                                hl hlVar = tlVar.z;
                                if (hlVar.F) {
                                    kl.a("Preparing a composition while composing is not supported");
                                }
                                hlVar.F = true;
                                try {
                                    vcVar.invoke();
                                    hlVar.F = false;
                                } catch (Throwable th) {
                                    hlVar.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            ib1.q(j2);
                            throw th2;
                        }
                    }
                    boolean x = tlVar.x();
                    ib1.q(j2);
                    if (x) {
                        return tlVar;
                    }
                } finally {
                    w(C);
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, tl tlVar) {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof pk)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                nq0 nq0Var = this.s;
                if (nq0Var != null) {
                    throw ((Throwable) nq0Var.e);
                }
                this.s = new nq0(6, th);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new wn0();
                this.k.clear();
                this.l.a();
                this.n.a();
                this.s = new nq0(6, th);
                if (tlVar != null) {
                    L(tlVar);
                }
                y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean A2;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List D = D();
            s61 s61Var = new s61(this.h);
            this.h = new wn0();
            try {
                int size = D.size();
                for (int i = 0; i < size; i++) {
                    ((tl) D.get(i)).y(s61Var);
                    if (((k11) this.u.getValue()).compareTo(k11.e) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    A2 = A();
                }
                return A2;
            } catch (Throwable th) {
                synchronized (this.c) {
                    wn0 wn0Var = this.h;
                    wn0Var.getClass();
                    Iterator<E> it = s61Var.iterator();
                    while (it.hasNext()) {
                        wn0Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(tl tlVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(tlVar)) {
            arrayList.add(tlVar);
        }
        if (this.f.remove(tlVar)) {
            this.g = null;
        }
    }

    @Override // defpackage.ml
    public final void a(tl tlVar, Function2 function2) {
        k11 k11Var;
        boolean contains;
        zn0 C;
        boolean z2 = tlVar.z.F;
        synchronized (this.c) {
            k11 k11Var2 = (k11) this.u.getValue();
            k11Var = k11.e;
            contains = k11Var2.compareTo(k11Var) > 0 ? true ^ D().contains(tlVar) : true;
        }
        try {
            l lVar = new l(16, tlVar);
            c cVar = new c(tlVar, 15, null);
            ib1 j = pb1.j();
            zn0 zn0Var = j instanceof zn0 ? (zn0) j : null;
            if (zn0Var == null || (C = zn0Var.C(lVar, cVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                ib1 j2 = C.j();
                try {
                    tlVar.j(function2);
                    synchronized (this.c) {
                        if (((k11) this.u.getValue()).compareTo(k11Var) > 0 && !D().contains(tlVar)) {
                            this.f.add(tlVar);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        pb1.j().m();
                    }
                    try {
                        F(tlVar);
                        try {
                            tlVar.d();
                            tlVar.f();
                            if (z2) {
                                return;
                            }
                            pb1.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, tlVar);
                    }
                } finally {
                    ib1.q(j2);
                }
            } finally {
                w(C);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.c) {
                }
            }
            J(th3, tlVar);
        }
    }

    @Override // defpackage.ml
    public final wn0 b(tl tlVar, na1 na1Var, Function2 function2) {
        i8 i8Var = this.v;
        try {
            na1 na1Var2 = tlVar.t;
            tlVar.t = na1Var;
            try {
                a(tlVar, function2);
                wn0 wn0Var = (wn0) i8Var.get();
                if (wn0Var == null) {
                    wn0Var = r61.a;
                    wn0Var.getClass();
                }
                return wn0Var;
            } finally {
                tlVar.t = na1Var2;
            }
        } finally {
            i8Var.q(null);
        }
    }

    @Override // defpackage.ml
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.ml
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ml
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ml
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.ml
    public final ll h() {
        return null;
    }

    @Override // defpackage.ml
    public final CoroutineContext j() {
        return this.x;
    }

    @Override // defpackage.ml
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ml
    public final void l(tl tlVar) {
        sf sfVar;
        synchronized (this.c) {
            if (this.i.h(tlVar)) {
                sfVar = null;
            } else {
                this.i.b(tlVar);
                sfVar = y();
            }
        }
        if (sfVar != null) {
            i31 i31Var = k31.d;
            ((tf) sfVar).l(Unit.a);
        }
    }

    @Override // defpackage.ml
    public final wm0 m(xm0 xm0Var) {
        wm0 wm0Var;
        synchronized (this.c) {
            wm0Var = (wm0) this.n.k(xm0Var);
        }
        return wm0Var;
    }

    @Override // defpackage.ml
    public final wn0 n(tl tlVar, na1 na1Var, wn0 wn0Var) {
        i8 i8Var = this.v;
        try {
            K();
            tlVar.y(new s61(wn0Var));
            na1 na1Var2 = tlVar.t;
            tlVar.t = na1Var;
            try {
                tl I = I(tlVar, null);
                if (I != null) {
                    F(tlVar);
                    I.d();
                    I.f();
                }
                wn0 wn0Var2 = (wn0) i8Var.get();
                if (wn0Var2 == null) {
                    wn0Var2 = r61.a;
                    wn0Var2.getClass();
                }
                return wn0Var2;
            } finally {
                tlVar.t = na1Var2;
            }
        } finally {
            i8Var.q(null);
        }
    }

    @Override // defpackage.ml
    public final void q(i11 i11Var) {
        i8 i8Var = this.v;
        wn0 wn0Var = (wn0) i8Var.get();
        if (wn0Var == null) {
            wn0 wn0Var2 = r61.a;
            wn0Var = new wn0();
            i8Var.q(wn0Var);
        }
        wn0Var.a(i11Var);
    }

    @Override // defpackage.ml
    public final void r(tl tlVar) {
        synchronized (this.c) {
            try {
                LinkedHashSet linkedHashSet = this.q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.q = linkedHashSet;
                }
                linkedHashSet.add(tlVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ml
    public final uf s(ce ceVar) {
        i8 i8Var = this.b;
        mc mcVar = (mc) i8Var.g;
        gp0 gp0Var = new gp0();
        gp0Var.a = ceVar;
        return mcVar.g(gp0Var, (vc) i8Var.h);
    }

    @Override // defpackage.ml
    public final void v(tl tlVar) {
        synchronized (this.c) {
            if (this.f.remove(tlVar)) {
                this.g = null;
            }
            this.i.j(tlVar);
            this.j.remove(tlVar);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((k11) this.u.getValue()).compareTo(k11.i) >= 0) {
                be1 be1Var = this.u;
                k11 k11Var = k11.e;
                be1Var.getClass();
                be1Var.j(null, k11Var);
            }
        }
        this.w.a(null);
    }

    public final sf y() {
        k11 k11Var;
        be1 be1Var = this.u;
        int compareTo = ((k11) be1Var.getValue()).compareTo(k11.e);
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        eo0 eo0Var = this.i;
        if (compareTo > 0) {
            if (this.s != null) {
                k11Var = k11.g;
            } else if (this.d == null) {
                this.h = new wn0();
                eo0Var.g();
                k11Var = (z() || B()) ? k11.h : k11.g;
            } else {
                k11Var = (eo0Var.g != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? k11.j : k11.i;
            }
            be1Var.j(null, k11Var);
            if (k11Var != k11.j) {
                return null;
            }
            tf tfVar = this.r;
            this.r = null;
            return tfVar;
        }
        List D = D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = nv.d;
        this.h = new wn0();
        eo0Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        tf tfVar2 = this.r;
        if (tfVar2 != null) {
            tfVar2.t(null);
        }
        this.r = null;
        this.s = null;
        return null;
    }

    public final boolean z() {
        return !this.t && (((ha) this.a.e.g).get() & 134217727) > 0;
    }

    @Override // defpackage.ml
    public final void o(Set set) {
    }
}
