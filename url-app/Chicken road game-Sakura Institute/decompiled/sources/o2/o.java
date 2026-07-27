package o2;

import A.AbstractC0017m;
import j2.AbstractC0720j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public abstract class o implements s {

    /* renamed from: d, reason: collision with root package name */
    public final s f8945d;

    /* renamed from: e, reason: collision with root package name */
    public String f8946e;

    public o(s sVar) {
        this.f8945d = sVar;
    }

    @Override // o2.s
    public final String A() {
        if (this.f8946e == null) {
            this.f8946e = AbstractC0720j.e(u(1));
        }
        return this.f8946e;
    }

    @Override // o2.s
    public final s b(C0924c c0924c) {
        return c0924c.equals(C0924c.f8919j) ? this.f8945d : k.f8939k;
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
        AbstractC0720j.b("Node is not leaf node!", sVar.y());
        if ((this instanceof p) && (sVar instanceof j)) {
            return Double.valueOf(((p) this).f8947i).compareTo(((j) sVar).f8938i);
        }
        if ((this instanceof j) && (sVar instanceof p)) {
            return Double.valueOf(((p) sVar).f8947i).compareTo(((j) this).f8938i) * (-1);
        }
        o oVar = (o) sVar;
        int h4 = h();
        int h5 = oVar.h();
        return AbstractC0784j.b(h4, h5) ? e(oVar) : AbstractC0784j.a(h4, h5);
    }

    @Override // o2.s
    public final s d(g2.e eVar, s sVar) {
        C0924c C3 = eVar.C();
        if (C3 == null) {
            return sVar;
        }
        boolean isEmpty = sVar.isEmpty();
        C0924c c0924c = C0924c.f8919j;
        if (isEmpty && !C3.equals(c0924c)) {
            return this;
        }
        boolean equals = eVar.C().equals(c0924c);
        boolean z4 = true;
        if (equals && eVar.size() != 1) {
            z4 = false;
        }
        AbstractC0720j.c(z4);
        return m(C3, k.f8939k.d(eVar.F(), sVar));
    }

    public abstract int e(o oVar);

    @Override // o2.s
    public final C0924c g(C0924c c0924c) {
        return null;
    }

    public abstract int h();

    @Override // o2.s
    public final boolean i(C0924c c0924c) {
        return false;
    }

    @Override // o2.s
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    public final String j(int i2) {
        int d4 = AbstractC0784j.d(i2);
        if (d4 != 0 && d4 != 1) {
            throw new IllegalArgumentException("Unknown hash version: ".concat(AbstractC0017m.w(i2)));
        }
        s sVar = this.f8945d;
        if (sVar.isEmpty()) {
            return "";
        }
        return "priority:" + sVar.u(i2) + ":";
    }

    @Override // o2.s
    public final s k() {
        return this.f8945d;
    }

    @Override // o2.s
    public final s m(C0924c c0924c, s sVar) {
        return c0924c.equals(C0924c.f8919j) ? f(sVar) : sVar.isEmpty() ? this : k.f8939k.m(c0924c, sVar).f(this.f8945d);
    }

    @Override // o2.s
    public final s p(g2.e eVar) {
        return eVar.isEmpty() ? this : eVar.C().equals(C0924c.f8919j) ? this.f8945d : k.f8939k;
    }

    @Override // o2.s
    public final Object t(boolean z4) {
        if (z4) {
            s sVar = this.f8945d;
            if (!sVar.isEmpty()) {
                HashMap hashMap = new HashMap();
                hashMap.put(".value", getValue());
                hashMap.put(".priority", sVar.getValue());
                return hashMap;
            }
        }
        return getValue();
    }

    public final String toString() {
        String obj = t(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }

    @Override // o2.s
    public final Iterator x() {
        return Collections.emptyList().iterator();
    }

    @Override // o2.s
    public final boolean y() {
        return true;
    }

    @Override // o2.s
    public final int z() {
        return 0;
    }
}
