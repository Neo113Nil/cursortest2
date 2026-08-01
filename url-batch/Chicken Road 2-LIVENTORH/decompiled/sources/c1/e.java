package c1;

import a.c0;
import a.d0;
import a3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final n3.a f765a = new n3.a(f.f777n);

    /* renamed from: b, reason: collision with root package name */
    public final n3.a f766b;

    /* renamed from: c, reason: collision with root package name */
    public final a0.a f767c;
    public final a3.c d;

    /* renamed from: e, reason: collision with root package name */
    public final a3.c f768e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f769f;

    /* renamed from: g, reason: collision with root package name */
    public int f770g;

    /* renamed from: h, reason: collision with root package name */
    public d f771h;
    public final LinkedHashSet i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f772j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f773k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f774l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f775m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f776n;

    public e() {
        n3.a aVar = new n3.a(new c());
        this.f766b = aVar;
        this.f767c = new a0.a(23, aVar);
        this.d = new a3.c();
        this.f768e = new a3.c();
        this.i = new LinkedHashSet();
        this.f772j = new LinkedHashSet();
        this.f773k = new LinkedHashSet();
    }

    public final void a(a0.j jVar, d dVar, int i) {
        f3.d.e(jVar, "dispatcher");
        if (dVar.f763a == null) {
            (i != 0 ? i != 1 ? this.i : this.f772j : this.f773k).add(dVar);
            dVar.f763a = jVar;
            f3.d.e((c) ((n3.a) this.f767c.f81g).a(), "history");
            dVar.b(i != 0 ? i != 1 ? this.f776n : this.f774l : this.f775m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + dVar + "' is already added to dispatcher " + dVar.f763a + '.').toString());
    }

    public final void b() {
        boolean z3;
        boolean z4;
        c cVar;
        a3.c cVar2 = this.d;
        if (cVar2 == null || !cVar2.isEmpty()) {
            Iterator it = cVar2.iterator();
            while (it.hasNext()) {
                if (((c0) it.next()).f8b) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        a3.c cVar3 = this.f768e;
        if (cVar3 == null || !cVar3.isEmpty()) {
            Iterator it2 = cVar3.iterator();
            while (it2.hasNext()) {
                if (((c0) it2.next()).f8b) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        boolean z5 = z3 || z4;
        boolean z6 = this.f775m != z3;
        boolean z7 = this.f774l != z4;
        boolean z8 = this.f776n != z5;
        LinkedHashSet linkedHashSet = this.f773k;
        if (z6) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).b(z3);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f772j;
        if (z7) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).b(z4);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z8) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).b(z5);
            }
        }
        this.f775m = z3;
        this.f774l = z4;
        this.f776n = z5;
        c0 c0Var = this.f769f;
        if (c0Var == null) {
            c0Var = c(0);
        }
        c0 c0Var2 = this.f769f;
        if (c0Var2 == null) {
            c0Var2 = c(0);
        }
        if (f3.d.a(c0Var2, c0Var)) {
            if (c0Var2 == null) {
                cVar = new c();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = cVar2.iterator();
                while (it6.hasNext()) {
                    ((c0) it6.next()).getClass();
                }
                Iterator<E> it7 = cVar3.iterator();
                while (it7.hasNext()) {
                    ((c0) it7.next()).getClass();
                }
                d0 d0Var = c0Var2.f7a;
                b3.c cVar4 = new b3.c(10);
                cVar4.addAll(arrayList);
                cVar4.add(d0Var);
                cVar4.addAll(m.f113f);
                cVar4.f();
                cVar4.f737h = true;
                if (cVar4.f736g <= 0) {
                    cVar4 = b3.c.i;
                }
                cVar = new c(cVar4, arrayList.size());
            }
            n3.a aVar = this.f766b;
            if (f3.d.a((c) aVar.a(), cVar)) {
                return;
            }
            aVar.b(cVar);
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
        a3.c cVar = this.f768e;
        a3.c cVar2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = cVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((c0) obj).f8b) {
                    break;
                }
            }
            c0 c0Var = (c0) obj;
            if (c0Var != null) {
                return c0Var;
            }
            Iterator it2 = cVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((c0) next).f8b) {
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
            Iterator it3 = cVar2.iterator();
            while (it3.hasNext()) {
                ((c0) it3.next()).getClass();
            }
            Iterator it4 = cVar.iterator();
            while (it4.hasNext()) {
                ((c0) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = cVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((c0) obj2).f8b) {
                break;
            }
        }
        c0 c0Var2 = (c0) obj2;
        if (c0Var2 != null) {
            return c0Var2;
        }
        Iterator it6 = cVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((c0) next2).f8b) {
                obj3 = next2;
                break;
            }
        }
        return (c0) obj3;
    }
}
