package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class j30 {
    public final ef0 a = new ef0(k30.s);
    public final ef0 b;
    public final j40 c;
    public final z6 d;
    public final z6 e;
    public t40 f;
    public int g;
    public i30 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public j30() {
        ef0 ef0Var = new ef0(new h30());
        this.b = ef0Var;
        this.c = new j40(ef0Var);
        this.d = new z6();
        this.e = new z6();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(wi wiVar, i30 i30Var, int i) {
        wiVar.getClass();
        if (i30Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(i30Var);
            i30Var.a = wiVar;
            ((h30) this.c.a.h0()).getClass();
            i30Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(i30Var);
        wi wiVar2 = i30Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(wiVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        h30 h30Var;
        z6 z6Var = this.d;
        if (z6Var == null || !z6Var.isEmpty()) {
            Iterator it = z6Var.iterator();
            while (it.hasNext()) {
                if (((t40) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        z6 z6Var2 = this.e;
        if (z6Var2 == null || !z6Var2.isEmpty()) {
            Iterator it2 = z6Var2.iterator();
            while (it2.hasNext()) {
                if (((t40) it2.next()).b) {
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
                ((i30) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((i30) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((i30) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        t40 t40Var = this.f;
        if (t40Var == null) {
            t40Var = c(0);
        }
        t40 t40Var2 = this.f;
        if (t40Var2 == null) {
            t40Var2 = c(0);
        }
        if (mv.c(t40Var2, t40Var)) {
            if (t40Var2 == null) {
                h30Var = new h30();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = z6Var.iterator();
                while (it6.hasNext()) {
                    ((t40) it6.next()).getClass();
                }
                Iterator<E> it7 = z6Var2.iterator();
                while (it7.hasNext()) {
                    ((t40) it7.next()).getClass();
                }
                u40 u40Var = t40Var2.a;
                dy u = bi.u();
                ad.h0(u, arrayList);
                u.add(u40Var);
                ad.h0(u, wm.f);
                h30Var = new h30(bi.i(u), arrayList.size());
            }
            ef0 ef0Var = this.b;
            if (mv.c((h30) ef0Var.h0(), h30Var)) {
                return;
            }
            ef0Var.i0(null, h30Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((i30) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((i30) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((i30) it10.next()).getClass();
            }
        }
    }

    public final t40 c(int i) {
        Object obj;
        Object obj2;
        z6 z6Var = this.e;
        z6 z6Var2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = z6Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((t40) obj).b) {
                    break;
                }
            }
            t40 t40Var = (t40) obj;
            if (t40Var != null) {
                return t40Var;
            }
            Iterator it2 = z6Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((t40) next).b) {
                    obj3 = next;
                    break;
                }
            }
            return (t40) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = z6Var2.iterator();
            while (it3.hasNext()) {
                ((t40) it3.next()).getClass();
            }
            Iterator it4 = z6Var.iterator();
            while (it4.hasNext()) {
                ((t40) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = z6Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((t40) obj2).b) {
                break;
            }
        }
        t40 t40Var2 = (t40) obj2;
        if (t40Var2 != null) {
            return t40Var2;
        }
        Iterator it6 = z6Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((t40) next2).b) {
                obj3 = next2;
                break;
            }
        }
        return (t40) obj3;
    }
}
