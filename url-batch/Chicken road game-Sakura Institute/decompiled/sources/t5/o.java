package t5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class o implements s {

    /* renamed from: f, reason: collision with root package name */
    public final s f8914f;

    /* renamed from: g, reason: collision with root package name */
    public String f8915g;

    public o(s sVar) {
        this.f8914f = sVar;
    }

    public abstract int a(o oVar);

    @Override // t5.s
    public final s b(l5.f fVar) {
        return fVar.isEmpty() ? this : fVar.z().equals(c.f8888i) ? this.f8914f : k.f8908j;
    }

    @Override // t5.s
    public final s c() {
        return this.f8914f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        if (sVar.isEmpty()) {
            return 1;
        }
        if (sVar instanceof f) {
            return -1;
        }
        o5.j.b("Node is not leaf node!", sVar.i());
        if ((this instanceof p) && (sVar instanceof j)) {
            return Double.valueOf(((p) this).f8916h).compareTo(((j) sVar).f8907h);
        }
        if ((this instanceof j) && (sVar instanceof p)) {
            return Double.valueOf(((p) sVar).f8916h).compareTo(((j) this).f8907h) * (-1);
        }
        o oVar = (o) sVar;
        int g9 = g();
        int g10 = oVar.g();
        return l.h.b(g9, g10) ? a(oVar) : l.h.a(g9, g10);
    }

    @Override // t5.s
    public final s d(c cVar) {
        return cVar.equals(c.f8888i) ? this.f8914f : k.f8908j;
    }

    public abstract int g();

    @Override // t5.s
    public final boolean i() {
        return true;
    }

    @Override // t5.s
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // t5.s
    public final int j() {
        return 0;
    }

    @Override // t5.s
    public final c k(c cVar) {
        return null;
    }

    public final String m(int i7) {
        int d8 = l.h.d(i7);
        if (d8 != 0 && d8 != 1) {
            throw new IllegalArgumentException("Unknown hash version: ".concat(r6.i.g(i7)));
        }
        s sVar = this.f8914f;
        if (sVar.isEmpty()) {
            return "";
        }
        return "priority:" + sVar.f(i7) + ":";
    }

    @Override // t5.s
    public final s o(c cVar, s sVar) {
        return cVar.equals(c.f8888i) ? n(sVar) : sVar.isEmpty() ? this : k.f8908j.o(cVar, sVar).n(this.f8914f);
    }

    @Override // t5.s
    public final Object r(boolean z8) {
        if (z8) {
            s sVar = this.f8914f;
            if (!sVar.isEmpty()) {
                HashMap hashMap = new HashMap();
                hashMap.put(".value", getValue());
                hashMap.put(".priority", sVar.getValue());
                return hashMap;
            }
        }
        return getValue();
    }

    @Override // t5.s
    public final boolean s(c cVar) {
        return false;
    }

    @Override // t5.s
    public final Iterator t() {
        return Collections.EMPTY_LIST.iterator();
    }

    public final String toString() {
        String obj = r(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }

    @Override // t5.s
    public final s u(l5.f fVar, s sVar) {
        c z8 = fVar.z();
        if (z8 == null) {
            return sVar;
        }
        boolean isEmpty = sVar.isEmpty();
        c cVar = c.f8888i;
        if (isEmpty && !z8.equals(cVar)) {
            return this;
        }
        boolean equals = fVar.z().equals(cVar);
        boolean z9 = true;
        if (equals && fVar.size() != 1) {
            z9 = false;
        }
        o5.j.c(z9);
        return o(z8, k.f8908j.u(fVar.C(), sVar));
    }

    @Override // t5.s
    public final String v() {
        if (this.f8915g == null) {
            this.f8915g = o5.j.e(f(1));
        }
        return this.f8915g;
    }
}
