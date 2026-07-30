package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nb0 extends gl0 {
    public final gl0 b;

    public nb0(gl0 gl0Var) {
        gl0Var.getClass();
        this.b = gl0Var;
    }

    @Override // defpackage.gl0
    public final ol2 a(qz1 qz1Var) {
        qz1Var.getClass();
        return this.b.a(qz1Var);
    }

    @Override // defpackage.gl0
    public final void b(qz1 qz1Var, qz1 qz1Var2) {
        qz1Var.getClass();
        qz1Var2.getClass();
        this.b.b(qz1Var, qz1Var2);
    }

    @Override // defpackage.gl0
    public final void c(qz1 qz1Var) {
        this.b.c(qz1Var);
    }

    @Override // defpackage.gl0
    public final void d(qz1 qz1Var) {
        qz1Var.getClass();
        this.b.d(qz1Var);
    }

    @Override // defpackage.gl0
    public final List g(qz1 qz1Var) {
        List<qz1> g = this.b.g(qz1Var);
        ArrayList arrayList = new ArrayList();
        for (qz1 qz1Var2 : g) {
            qz1Var2.getClass();
            arrayList.add(qz1Var2);
        }
        uv.m(arrayList);
        return arrayList;
    }

    @Override // defpackage.gl0
    public final yk0 i(qz1 qz1Var) {
        qz1Var.getClass();
        yk0 i = this.b.i(qz1Var);
        if (i == null) {
            return null;
        }
        qz1 qz1Var2 = i.c;
        if (qz1Var2 == null) {
            return i;
        }
        boolean z = i.a;
        boolean z2 = i.b;
        Long l = i.d;
        Long l2 = i.e;
        Long l3 = i.f;
        Long l4 = i.g;
        Map map = i.h;
        map.getClass();
        return new yk0(z, z2, qz1Var2, l, l2, l3, l4, map);
    }

    @Override // defpackage.gl0
    public final d71 j(qz1 qz1Var) {
        return this.b.j(qz1Var);
    }

    @Override // defpackage.gl0
    public final ol2 k(qz1 qz1Var) {
        qz1 b = qz1Var.b();
        gl0 gl0Var = this.b;
        if (b != null) {
            bi biVar = new bi();
            while (b != null && !f(b)) {
                biVar.addFirst(b);
                b = b.b();
            }
            Iterator<E> it = biVar.iterator();
            while (it.hasNext()) {
                qz1 qz1Var2 = (qz1) it.next();
                qz1Var2.getClass();
                gl0Var.c(qz1Var2);
            }
        }
        return gl0Var.k(qz1Var);
    }

    @Override // defpackage.gl0
    public final pn2 l(qz1 qz1Var) {
        qz1Var.getClass();
        return this.b.l(qz1Var);
    }

    public final String toString() {
        return d82.a(nb0.class).c() + '(' + this.b + ')';
    }
}
