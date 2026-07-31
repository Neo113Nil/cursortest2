package s4;

import b.o;
import c5.x;
import d6.r;
import d6.u;
import d7.e0;
import d7.n0;
import d7.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f6709a = e0.b(g.f6722a);

    /* renamed from: b, reason: collision with root package name */
    public final n0 f6710b;

    /* renamed from: c, reason: collision with root package name */
    public final y f6711c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.k f6712d;

    /* renamed from: e, reason: collision with root package name */
    public final d6.k f6713e;

    /* renamed from: f, reason: collision with root package name */
    public o f6714f;

    /* renamed from: g, reason: collision with root package name */
    public int f6715g;

    /* renamed from: h, reason: collision with root package name */
    public e f6716h;
    public final LinkedHashSet i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f6717j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f6718k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6719l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6720m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6721n;

    public f() {
        n0 b8 = e0.b(new d());
        this.f6710b = b8;
        this.f6711c = new y(b8);
        this.f6712d = new d6.k();
        this.f6713e = new d6.k();
        this.i = new LinkedHashSet();
        this.f6717j = new LinkedHashSet();
        this.f6718k = new LinkedHashSet();
    }

    public final void a(x xVar, e eVar, int i) {
        q6.i.e(xVar, "dispatcher");
        if (eVar.f6707a == null) {
            (i != 0 ? i != 1 ? this.i : this.f6717j : this.f6718k).add(eVar);
            eVar.f6707a = xVar;
            q6.i.e((d) this.f6711c.f2430d.getValue(), "history");
            eVar.b(i != 0 ? i != 1 ? this.f6721n : this.f6719l : this.f6720m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + eVar + "' is already added to dispatcher " + eVar.f6707a + '.').toString());
    }

    public final void b() {
        boolean z3;
        boolean z7;
        d dVar;
        d6.k kVar = this.f6712d;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                if (((o) it.next()).f1009b) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        d6.k kVar2 = this.f6713e;
        if (kVar2 == null || !kVar2.isEmpty()) {
            Iterator it2 = kVar2.iterator();
            while (it2.hasNext()) {
                if (((o) it2.next()).f1009b) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        boolean z8 = z3 || z7;
        boolean z9 = this.f6720m != z3;
        boolean z10 = this.f6719l != z7;
        boolean z11 = this.f6721n != z8;
        LinkedHashSet linkedHashSet = this.f6718k;
        if (z9) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).b(z3);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f6717j;
        if (z10) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((e) it4.next()).b(z7);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z11) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((e) it5.next()).b(z8);
            }
        }
        this.f6720m = z3;
        this.f6719l = z7;
        this.f6721n = z8;
        o oVar = this.f6714f;
        if (oVar == null) {
            oVar = c(0);
        }
        o oVar2 = this.f6714f;
        if (oVar2 == null) {
            oVar2 = c(0);
        }
        if (q6.i.a(oVar2, oVar)) {
            if (oVar2 == null) {
                dVar = new d();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = kVar.iterator();
                while (it6.hasNext()) {
                    boolean z12 = ((o) it6.next()).f1009b;
                }
                Iterator<E> it7 = kVar2.iterator();
                while (it7.hasNext()) {
                    boolean z13 = ((o) it7.next()).f1009b;
                }
                r2.o oVar3 = oVar2.f1008a;
                e6.c cVar = new e6.c(10);
                r.O(cVar, arrayList);
                cVar.add(oVar3);
                r.O(cVar, u.f2326d);
                dVar = new d(arrayList.size(), s6.a.h(cVar));
            }
            n0 n0Var = this.f6710b;
            if (q6.i.a((d) n0Var.getValue(), dVar)) {
                return;
            }
            n0Var.j(null, dVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((e) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((e) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((e) it10.next()).getClass();
            }
        }
    }

    public final o c(int i) {
        Object obj;
        Object obj2;
        d6.k kVar = this.f6713e;
        d6.k kVar2 = this.f6712d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = kVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((o) obj).f1009b) {
                    break;
                }
            }
            o oVar = (o) obj;
            if (oVar != null) {
                return oVar;
            }
            Iterator it2 = kVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((o) next).f1009b) {
                    obj3 = next;
                    break;
                }
            }
            return (o) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = kVar2.iterator();
            while (it3.hasNext()) {
                ((o) it3.next()).getClass();
            }
            Iterator it4 = kVar.iterator();
            while (it4.hasNext()) {
                ((o) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = kVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((o) obj2).f1009b) {
                break;
            }
        }
        o oVar2 = (o) obj2;
        if (oVar2 != null) {
            return oVar2;
        }
        Iterator it6 = kVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((o) next2).f1009b) {
                obj3 = next2;
                break;
            }
        }
        return (o) obj3;
    }
}
