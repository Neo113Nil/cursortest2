package d1;

import a.c0;
import a.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x2.n;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final q3.b f1287a = new q3.b(f.f1298b);

    /* renamed from: b, reason: collision with root package name */
    public final q3.b f1288b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.a f1289c;
    public final x2.f d;

    /* renamed from: e, reason: collision with root package name */
    public final x2.f f1290e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f1291f;

    /* renamed from: g, reason: collision with root package name */
    public int f1292g;
    public d h;
    public final LinkedHashSet i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f1293j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f1294k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1295l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1296m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1297n;

    public e() {
        q3.b bVar = new q3.b(new c());
        this.f1288b = bVar;
        this.f1289c = new q3.a(bVar);
        this.d = new x2.f();
        this.f1290e = new x2.f();
        this.i = new LinkedHashSet();
        this.f1293j = new LinkedHashSet();
        this.f1294k = new LinkedHashSet();
    }

    public final void a(a0.k kVar, d dVar, int i) {
        i3.d.e(kVar, "dispatcher");
        if (dVar.f1285a == null) {
            (i != 0 ? i != 1 ? this.i : this.f1293j : this.f1294k).add(dVar);
            dVar.f1285a = kVar;
            i3.d.e((c) ((q3.b) this.f1289c.f3172a).a(), "history");
            dVar.b(i != 0 ? i != 1 ? this.f1297n : this.f1295l : this.f1296m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + dVar + "' is already added to dispatcher " + dVar.f1285a + '.').toString());
    }

    public final void b() {
        boolean z4;
        boolean z5;
        c cVar;
        x2.f fVar = this.d;
        if (fVar == null || !fVar.isEmpty()) {
            Iterator it = fVar.iterator();
            while (it.hasNext()) {
                if (((c0) it.next()).f7b) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        x2.f fVar2 = this.f1290e;
        if (fVar2 == null || !fVar2.isEmpty()) {
            Iterator it2 = fVar2.iterator();
            while (it2.hasNext()) {
                if (((c0) it2.next()).f7b) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        boolean z6 = z4 || z5;
        boolean z7 = this.f1296m != z4;
        boolean z8 = this.f1295l != z5;
        boolean z9 = this.f1297n != z6;
        LinkedHashSet linkedHashSet = this.f1294k;
        if (z7) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).b(z4);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f1293j;
        if (z8) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).b(z5);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z9) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).b(z6);
            }
        }
        this.f1296m = z4;
        this.f1295l = z5;
        this.f1297n = z6;
        c0 c0Var = this.f1291f;
        if (c0Var == null) {
            c0Var = c(0);
        }
        c0 c0Var2 = this.f1291f;
        if (c0Var2 == null) {
            c0Var2 = c(0);
        }
        if (i3.d.a(c0Var2, c0Var)) {
            if (c0Var2 == null) {
                cVar = new c();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = fVar.iterator();
                while (it6.hasNext()) {
                    ((c0) it6.next()).getClass();
                }
                Iterator<E> it7 = fVar2.iterator();
                while (it7.hasNext()) {
                    ((c0) it7.next()).getClass();
                }
                d0 d0Var = c0Var2.f6a;
                y2.c cVar2 = new y2.c(10);
                n.D(cVar2, arrayList);
                cVar2.add(d0Var);
                n.D(cVar2, q.f3887f);
                cVar2.f();
                cVar2.h = true;
                if (cVar2.f4110g <= 0) {
                    cVar2 = y2.c.i;
                }
                cVar = new c(cVar2, arrayList.size());
            }
            q3.b bVar = this.f1288b;
            if (i3.d.a((c) bVar.a(), cVar)) {
                return;
            }
            bVar.b(cVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((d) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((d) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((d) it10.next()).getClass();
            }
        }
    }

    public final c0 c(int i) {
        Object obj;
        Object obj2;
        x2.f fVar = this.f1290e;
        x2.f fVar2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = fVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((c0) obj).f7b) {
                    break;
                }
            }
            c0 c0Var = (c0) obj;
            if (c0Var != null) {
                return c0Var;
            }
            Iterator it2 = fVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((c0) next).f7b) {
                    obj3 = next;
                    break;
                }
            }
            return (c0) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = fVar2.iterator();
            while (it3.hasNext()) {
                ((c0) it3.next()).getClass();
            }
            Iterator it4 = fVar.iterator();
            while (it4.hasNext()) {
                ((c0) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = fVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((c0) obj2).f7b) {
                break;
            }
        }
        c0 c0Var2 = (c0) obj2;
        if (c0Var2 != null) {
            return c0Var2;
        }
        Iterator it6 = fVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((c0) next2).f7b) {
                obj3 = next2;
                break;
            }
        }
        return (c0) obj3;
    }
}
