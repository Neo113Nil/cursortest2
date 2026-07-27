package o2;

import d2.AbstractC0546c;
import d2.C0545b;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: k, reason: collision with root package name */
    public static final k f8939k = new k();

    @Override // o2.f, o2.s
    public final String A() {
        return "";
    }

    @Override // o2.f, o2.s
    public final s b(C0924c c0924c) {
        return this;
    }

    @Override // o2.f, o2.s
    public final s d(g2.e eVar, s sVar) {
        return eVar.isEmpty() ? sVar : m(eVar.C(), d(eVar.F(), sVar));
    }

    @Override // o2.f, java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        return sVar.isEmpty() ? 0 : -1;
    }

    @Override // o2.f
    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.isEmpty() && equals(sVar.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // o2.f, o2.s
    public final s f(s sVar) {
        return this;
    }

    @Override // o2.f, o2.s
    public final C0924c g(C0924c c0924c) {
        return null;
    }

    @Override // o2.f, o2.s
    public final Object getValue() {
        return null;
    }

    @Override // o2.f
    public final int hashCode() {
        return 0;
    }

    @Override // o2.f, o2.s
    public final boolean i(C0924c c0924c) {
        return false;
    }

    @Override // o2.f, o2.s
    public final boolean isEmpty() {
        return true;
    }

    @Override // o2.f, java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // o2.f, o2.s
    public final s k() {
        return this;
    }

    @Override // o2.f, o2.s
    public final s m(C0924c c0924c, s sVar) {
        if (sVar.isEmpty()) {
            return this;
        }
        C0924c c0924c2 = C0924c.f8919j;
        if (c0924c.equals(c0924c2)) {
            return this;
        }
        AbstractC0546c c0545b = new C0545b(f.f8924j);
        boolean equals = c0924c.equals(c0924c2);
        k kVar = f8939k;
        if (equals) {
            return c0545b.isEmpty() ? kVar : new f(c0545b, sVar);
        }
        if (c0545b.e(c0924c)) {
            c0545b = c0545b.E(c0924c);
        }
        if (!sVar.isEmpty()) {
            c0545b = c0545b.D(sVar, c0924c);
        }
        return c0545b.isEmpty() ? kVar : new f(c0545b, kVar);
    }

    @Override // o2.f, o2.s
    public final s p(g2.e eVar) {
        return this;
    }

    @Override // o2.f, o2.s
    public final Object t(boolean z4) {
        return null;
    }

    @Override // o2.f
    public final String toString() {
        return "<Empty Node>";
    }

    @Override // o2.f, o2.s
    public final String u(int i2) {
        return "";
    }

    @Override // o2.f, o2.s
    public final Iterator x() {
        return Collections.emptyList().iterator();
    }

    @Override // o2.f, o2.s
    public final int z() {
        return 0;
    }
}
