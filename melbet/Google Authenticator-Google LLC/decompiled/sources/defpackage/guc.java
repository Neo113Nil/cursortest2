package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class guc {
    public static final hoq e = new hoq();
    private final guc a;
    public final qy c;
    public boolean d = false;

    public guc(guc gucVar, qy qyVar) {
        if (gucVar != null) {
            hoq.x(gucVar.d);
        }
        this.a = gucVar;
        this.c = qyVar;
    }

    public static gua b() {
        return gub.a.c();
    }

    public static guc d(Set set) {
        if (set.isEmpty()) {
            return gub.a;
        }
        if (set.size() == 1) {
            return (guc) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            guc gucVar = (guc) it.next();
            do {
                i += gucVar.c.d;
                gucVar = gucVar.a;
            } while (gucVar != null);
        }
        if (i == 0) {
            return gub.a;
        }
        qy qyVar = new qy(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            guc gucVar2 = (guc) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    qy qyVar2 = gucVar2.c;
                    if (i2 >= qyVar2.d) {
                        break;
                    }
                    hoq.C(qyVar.put((hoq) qyVar2.c(i2), qyVar2.f(i2)) == null, "Duplicate bindings: %s", qyVar2.c(i2));
                    i2++;
                }
                gucVar2 = gucVar2.a;
            } while (gucVar2 != null);
        }
        return new gub(null, qyVar).f();
    }

    public static guc e(guc gucVar, guc gucVar2) {
        return gucVar.g() ? gucVar2 : gucVar2.g() ? gucVar : d(hfm.p(gucVar, gucVar2));
    }

    public static gtz j(hoq hoqVar, guc gucVar) {
        Object h = gucVar.h(hoqVar);
        if (h == null) {
            return gtz.d(true != gucVar.c.containsKey(e) ? 3 : 2);
        }
        return new gtz(1, h, false);
    }

    public final gua c() {
        return new gub(this, new qy(0));
    }

    public final guc f() {
        if (this.d) {
            throw new IllegalStateException("Already frozen");
        }
        this.d = true;
        guc gucVar = this.a;
        return (gucVar == null || !this.c.isEmpty()) ? this : gucVar;
    }

    public final boolean g() {
        return this == gub.a;
    }

    final Object h(hoq hoqVar) {
        guc gucVar;
        hoq.H(this.d);
        Object obj = this.c.get(hoqVar);
        return (obj != null || (gucVar = this.a) == null) ? obj : gucVar.h(hoqVar);
    }

    final boolean i(hoq hoqVar) {
        if (this.c.containsKey(hoqVar)) {
            return true;
        }
        guc gucVar = this.a;
        return gucVar != null && gucVar.i(hoqVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (guc gucVar = this; gucVar != null; gucVar = gucVar.a) {
            for (int i = 0; i < gucVar.c.d; i++) {
                sb.append("[");
                sb.append(this.c.f(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
