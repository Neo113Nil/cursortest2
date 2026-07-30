package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yq1 {
    public final vo2 a = zm3.f(zq1.s);
    public final vo2 b;
    public final m62 c;
    public final bi d;
    public final bi e;
    public vq1 f;
    public int g;
    public xq1 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public yq1() {
        vo2 f = zm3.f(new wq1());
        this.b = f;
        this.c = new m62(f);
        this.d = new bi();
        this.e = new bi();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(tq1 tq1Var, xq1 xq1Var, int i) {
        tq1Var.getClass();
        if (xq1Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(xq1Var);
            xq1Var.a = tq1Var;
            ((wq1) this.c.m.getValue()).getClass();
            xq1Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(xq1Var);
        tq1 tq1Var2 = xq1Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(tq1Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        wq1 wq1Var;
        bi biVar = this.d;
        if (biVar == null || !biVar.isEmpty()) {
            Iterator it = biVar.iterator();
            while (it.hasNext()) {
                if (((vq1) it.next()).d) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        bi biVar2 = this.e;
        if (biVar2 == null || !biVar2.isEmpty()) {
            Iterator it2 = biVar2.iterator();
            while (it2.hasNext()) {
                if (((vq1) it2.next()).d) {
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
                ((xq1) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((xq1) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((xq1) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        vq1 vq1Var = this.f;
        if (vq1Var == null) {
            vq1Var = c(0);
        }
        vq1 vq1Var2 = this.f;
        if (vq1Var2 == null) {
            vq1Var2 = c(0);
        }
        if (Intrinsics.b(vq1Var2, vq1Var)) {
            if (vq1Var2 == null) {
                wq1Var = new wq1();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = biVar.iterator();
                while (it6.hasNext()) {
                    vq1 vq1Var3 = (vq1) it6.next();
                    if (vq1Var3.d) {
                        vq1Var3.b.getClass();
                    }
                }
                Iterator<E> it7 = biVar2.iterator();
                while (it7.hasNext()) {
                    vq1 vq1Var4 = (vq1) it7.next();
                    if (vq1Var4.d) {
                        vq1Var4.b.getClass();
                    }
                }
                s03 s03Var = vq1Var2.a;
                ah0 ah0Var = vq1Var2.c;
                ah0Var.getClass();
                le1 b = pv.b();
                vv.o(arrayList, b);
                b.add(s03Var);
                vv.o(ah0Var, b);
                wq1Var = new wq1(arrayList.size(), pv.a(b));
            }
            vo2 vo2Var = this.b;
            if (Intrinsics.b((wq1) vo2Var.getValue(), wq1Var)) {
                return;
            }
            vo2Var.j(null, wq1Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((xq1) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((xq1) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((xq1) it10.next()).getClass();
            }
        }
    }

    public final vq1 c(int i) {
        Object obj;
        Object obj2;
        bi biVar = this.e;
        bi biVar2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = biVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((vq1) obj).d) {
                    break;
                }
            }
            vq1 vq1Var = (vq1) obj;
            if (vq1Var != null) {
                return vq1Var;
            }
            Iterator it2 = biVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((vq1) next).d) {
                    obj3 = next;
                    break;
                }
            }
            return (vq1) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = biVar2.iterator();
            while (it3.hasNext()) {
                ((vq1) it3.next()).getClass();
            }
            Iterator it4 = biVar.iterator();
            while (it4.hasNext()) {
                ((vq1) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = biVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((vq1) obj2).d) {
                break;
            }
        }
        vq1 vq1Var2 = (vq1) obj2;
        if (vq1Var2 != null) {
            return vq1Var2;
        }
        Iterator it6 = biVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((vq1) next2).d) {
                obj3 = next2;
                break;
            }
        }
        return (vq1) obj3;
    }
}
