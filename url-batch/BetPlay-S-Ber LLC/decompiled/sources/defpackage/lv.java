package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class lv {
    public final e40 a = new e40(mv.k);
    public final e40 b;
    public final tx c;
    public final x6 d;
    public final x6 e;
    public gw f;
    public int g;
    public kv h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public lv() {
        e40 e40Var = new e40(new jv());
        this.b = e40Var;
        this.c = new tx(e40Var);
        this.d = new x6();
        this.e = new x6();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(iv ivVar, kv kvVar, int i) {
        ivVar.getClass();
        if (kvVar.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(kvVar);
            kvVar.a = ivVar;
            ((jv) ((e40) this.c.f).a()).getClass();
            kvVar.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(kvVar);
        iv ivVar2 = kvVar.a;
        sb.append("' is already added to dispatcher ");
        sb.append(ivVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        jv jvVar;
        x6 x6Var = this.d;
        if (x6Var == null || !x6Var.isEmpty()) {
            Iterator it = x6Var.iterator();
            while (it.hasNext()) {
                if (((gw) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        x6 x6Var2 = this.e;
        if (x6Var2 == null || !x6Var2.isEmpty()) {
            Iterator it2 = x6Var2.iterator();
            while (it2.hasNext()) {
                if (((gw) it2.next()).b) {
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
                ((kv) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((kv) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((kv) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        gw gwVar = this.f;
        if (gwVar == null) {
            gwVar = c(0);
        }
        gw gwVar2 = this.f;
        if (gwVar2 == null) {
            gwVar2 = c(0);
        }
        if (op.d(gwVar2, gwVar)) {
            if (gwVar2 == null) {
                jvVar = new jv();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = x6Var.iterator();
                while (it6.hasNext()) {
                    ((gw) it6.next()).getClass();
                }
                Iterator<E> it7 = x6Var2.iterator();
                while (it7.hasNext()) {
                    ((gw) it7.next()).getClass();
                }
                hw hwVar = gwVar2.a;
                br brVar = new br(10);
                jb.c0(brVar, arrayList);
                brVar.add(hwVar);
                jb.c0(brVar, vh.f);
                brVar.f();
                brVar.h = true;
                if (brVar.g <= 0) {
                    brVar = br.i;
                }
                jvVar = new jv(brVar, arrayList.size());
            }
            e40 e40Var = this.b;
            if (op.d((jv) e40Var.a(), jvVar)) {
                return;
            }
            e40Var.b(jvVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((kv) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((kv) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((kv) it10.next()).getClass();
            }
        }
    }

    public final gw c(int i) {
        Object obj;
        Object obj2;
        x6 x6Var = this.e;
        x6 x6Var2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = x6Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((gw) obj).b) {
                    break;
                }
            }
            gw gwVar = (gw) obj;
            if (gwVar != null) {
                return gwVar;
            }
            Iterator it2 = x6Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((gw) next).b) {
                    obj3 = next;
                    break;
                }
            }
            return (gw) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = x6Var2.iterator();
            while (it3.hasNext()) {
                ((gw) it3.next()).getClass();
            }
            Iterator it4 = x6Var.iterator();
            while (it4.hasNext()) {
                ((gw) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = x6Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((gw) obj2).b) {
                break;
            }
        }
        gw gwVar2 = (gw) obj2;
        if (gwVar2 != null) {
            return gwVar2;
        }
        Iterator it6 = x6Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((gw) next2).b) {
                obj3 = next2;
                break;
            }
        }
        return (gw) obj3;
    }
}
