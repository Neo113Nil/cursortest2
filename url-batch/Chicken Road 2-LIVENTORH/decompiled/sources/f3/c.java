package f3;

import a.y;
import androidx.lifecycle.j0;
import e3.h;
import e3.i;
import e3.j;
import e3.k;
import e3.l;
import e3.m;
import e3.n;
import e3.o;
import e3.p;
import e3.q;
import e3.r;
import e3.s;
import e3.t;
import e3.u;
import e3.v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c implements k3.a, b {
    static {
        List W = a3.f.W(e3.a.class, l.class, w2.c.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, e3.b.class, e3.c.class, e3.d.class, e3.e.class, e3.f.class, e3.g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(a3.g.X(W));
        int i = 0;
        for (Object obj : W) {
            int i4 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new z2.a((Class) obj, Integer.valueOf(i)));
            i = i4;
        }
        a3.p.W(arrayList);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && y.E(this).equals(y.E((k3.a) obj));
    }

    public final int hashCode() {
        return y.E(this).hashCode();
    }

    public final String toString() {
        return j0.class.toString() + " (Kotlin reflection is not available)";
    }
}
