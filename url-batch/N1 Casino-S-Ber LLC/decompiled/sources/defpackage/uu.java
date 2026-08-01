package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class uu {
    public final v30 a = new v30(vu.o);
    public final v30 b;
    public final mr c;
    public final g6 d;
    public final g6 e;
    public zv f;
    public int g;
    public tu h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public uu() {
        v30 v30Var = new v30(new su());
        this.b = v30Var;
        this.c = new mr(v30Var);
        this.d = new g6();
        this.e = new g6();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(we weVar, tu tuVar, int i) {
        weVar.getClass();
        if (tuVar.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(tuVar);
            tuVar.a = weVar;
            ((su) ((v30) this.c.f).a()).getClass();
            tuVar.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(tuVar);
        we weVar2 = tuVar.a;
        sb.append("' is already added to dispatcher ");
        sb.append(weVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        su suVar;
        g6 g6Var = this.d;
        if (g6Var == null || !g6Var.isEmpty()) {
            Iterator it = g6Var.iterator();
            while (it.hasNext()) {
                if (((zv) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        g6 g6Var2 = this.e;
        if (g6Var2 == null || !g6Var2.isEmpty()) {
            Iterator it2 = g6Var2.iterator();
            while (it2.hasNext()) {
                if (((zv) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((tu) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((tu) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((tu) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        zv zvVar = this.f;
        if (zvVar == null) {
            zvVar = c(0);
        }
        zv zvVar2 = this.f;
        if (zvVar2 == null) {
            zvVar2 = c(0);
        }
        if (zo.b(zvVar2, zvVar)) {
            if (zvVar2 == null) {
                suVar = new su();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = g6Var.iterator();
                while (it6.hasNext()) {
                    ((zv) it6.next()).getClass();
                }
                Iterator<E> it7 = g6Var2.iterator();
                while (it7.hasNext()) {
                    ((zv) it7.next()).getClass();
                }
                aw awVar = zvVar2.a;
                pq pqVar = new pq(10);
                hb.H0(pqVar, arrayList);
                pqVar.add(awVar);
                hb.H0(pqVar, di.f);
                pqVar.f();
                pqVar.h = true;
                if (pqVar.g <= 0) {
                    pqVar = pq.i;
                }
                suVar = new su(pqVar, arrayList.size());
            }
            v30 v30Var = this.b;
            if (zo.b((su) v30Var.a(), suVar)) {
                return;
            }
            v30Var.b(suVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((tu) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((tu) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((tu) it10.next()).getClass();
            }
        }
    }

    public final zv c(int i) {
        Object obj;
        Object obj2;
        g6 g6Var = this.e;
        g6 g6Var2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = g6Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((zv) obj).b) {
                    break;
                }
            }
            zv zvVar = (zv) obj;
            if (zvVar != null) {
                return zvVar;
            }
            Iterator it2 = g6Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((zv) next).b) {
                    obj3 = next;
                    break;
                }
            }
            return (zv) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = g6Var2.iterator();
            while (it3.hasNext()) {
                ((zv) it3.next()).getClass();
            }
            Iterator it4 = g6Var.iterator();
            while (it4.hasNext()) {
                ((zv) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = g6Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((zv) obj2).b) {
                break;
            }
        }
        zv zvVar2 = (zv) obj2;
        if (zvVar2 != null) {
            return zvVar2;
        }
        Iterator it6 = g6Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((zv) next2).b) {
                obj3 = next2;
                break;
            }
        }
        return (zv) obj3;
    }
}
