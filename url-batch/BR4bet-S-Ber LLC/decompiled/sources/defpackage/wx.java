package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class wx {
    public final y60 a = new y60(xx.r);
    public final y60 b;
    public final pw c;
    public final q6 d;
    public final q6 e;
    public cz f;
    public int g;
    public vx h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public wx() {
        y60 y60Var = new y60(new ux());
        this.b = y60Var;
        this.c = new pw(y60Var);
        this.d = new q6();
        this.e = new q6();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(rg rgVar, vx vxVar, int i) {
        rgVar.getClass();
        if (vxVar.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(vxVar);
            vxVar.a = rgVar;
            ((ux) ((y60) this.c.f).a()).getClass();
            vxVar.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(vxVar);
        rg rgVar2 = vxVar.a;
        sb.append("' is already added to dispatcher ");
        sb.append(rgVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        ux uxVar;
        q6 q6Var = this.d;
        if (q6Var == null || !q6Var.isEmpty()) {
            Iterator it = q6Var.iterator();
            while (it.hasNext()) {
                if (((cz) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        q6 q6Var2 = this.e;
        if (q6Var2 == null || !q6Var2.isEmpty()) {
            Iterator it2 = q6Var2.iterator();
            while (it2.hasNext()) {
                if (((cz) it2.next()).b) {
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
                ((vx) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((vx) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((vx) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        cz czVar = this.f;
        if (czVar == null) {
            czVar = c(0);
        }
        cz czVar2 = this.f;
        if (czVar2 == null) {
            czVar2 = c(0);
        }
        if (kr.b(czVar2, czVar)) {
            if (czVar2 == null) {
                uxVar = new ux();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = q6Var.iterator();
                while (it6.hasNext()) {
                    ((cz) it6.next()).getClass();
                }
                Iterator<E> it7 = q6Var2.iterator();
                while (it7.hasNext()) {
                    ((cz) it7.next()).getClass();
                }
                dz dzVar = czVar2.a;
                dt dtVar = new dt(10);
                cc.l0(dtVar, arrayList);
                dtVar.add(dzVar);
                cc.l0(dtVar, ik.f);
                dtVar.f();
                dtVar.h = true;
                if (dtVar.g <= 0) {
                    dtVar = dt.i;
                }
                uxVar = new ux(dtVar, arrayList.size());
            }
            y60 y60Var = this.b;
            if (kr.b((ux) y60Var.a(), uxVar)) {
                return;
            }
            y60Var.b(uxVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((vx) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((vx) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((vx) it10.next()).getClass();
            }
        }
    }

    public final cz c(int i) {
        Object obj;
        Object obj2;
        q6 q6Var = this.e;
        q6 q6Var2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = q6Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((cz) obj).b) {
                    break;
                }
            }
            cz czVar = (cz) obj;
            if (czVar != null) {
                return czVar;
            }
            Iterator it2 = q6Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((cz) next).b) {
                    obj3 = next;
                    break;
                }
            }
            return (cz) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = q6Var2.iterator();
            while (it3.hasNext()) {
                ((cz) it3.next()).getClass();
            }
            Iterator it4 = q6Var.iterator();
            while (it4.hasNext()) {
                ((cz) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = q6Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((cz) obj2).b) {
                break;
            }
        }
        cz czVar2 = (cz) obj2;
        if (czVar2 != null) {
            return czVar2;
        }
        Iterator it6 = q6Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((cz) next2).b) {
                obj3 = next2;
                break;
            }
        }
        return (cz) obj3;
    }
}
