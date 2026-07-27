package j2;

import G.W0;
import d2.AbstractC0546c;
import d2.C0545b;
import d2.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o2.C0924c;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715e implements Iterable {

    /* renamed from: i, reason: collision with root package name */
    public static final C0545b f7157i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0715e f7158j;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7159d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0546c f7160e;

    static {
        C0545b c0545b = new C0545b(o.f6089a);
        f7157i = c0545b;
        f7158j = new C0715e(null, c0545b);
    }

    public C0715e(Object obj, AbstractC0546c abstractC0546c) {
        this.f7159d = obj;
        this.f7160e = abstractC0546c;
    }

    public final C0715e B(g2.e eVar, Object obj) {
        boolean isEmpty = eVar.isEmpty();
        AbstractC0546c abstractC0546c = this.f7160e;
        if (isEmpty) {
            return new C0715e(obj, abstractC0546c);
        }
        C0924c C3 = eVar.C();
        C0715e c0715e = (C0715e) abstractC0546c.h(C3);
        if (c0715e == null) {
            c0715e = f7158j;
        }
        return new C0715e(this.f7159d, abstractC0546c.D(c0715e.B(eVar.F(), obj), C3));
    }

    public final C0715e C(g2.e eVar, C0715e c0715e) {
        if (eVar.isEmpty()) {
            return c0715e;
        }
        C0924c C3 = eVar.C();
        AbstractC0546c abstractC0546c = this.f7160e;
        C0715e c0715e2 = (C0715e) abstractC0546c.h(C3);
        if (c0715e2 == null) {
            c0715e2 = f7158j;
        }
        C0715e C4 = c0715e2.C(eVar.F(), c0715e);
        return new C0715e(this.f7159d, C4.isEmpty() ? abstractC0546c.E(C3) : abstractC0546c.D(C4, C3));
    }

    public final C0715e D(g2.e eVar) {
        if (eVar.isEmpty()) {
            return this;
        }
        C0715e c0715e = (C0715e) this.f7160e.h(eVar.C());
        return c0715e != null ? c0715e.D(eVar.F()) : f7158j;
    }

    public final g2.e e(g2.e eVar, InterfaceC0718h interfaceC0718h) {
        g2.e e4;
        Object obj = this.f7159d;
        if (obj != null && interfaceC0718h.f(obj)) {
            return g2.e.f6694j;
        }
        if (eVar.isEmpty()) {
            return null;
        }
        C0924c C3 = eVar.C();
        C0715e c0715e = (C0715e) this.f7160e.h(C3);
        if (c0715e == null || (e4 = c0715e.e(eVar.F(), interfaceC0718h)) == null) {
            return null;
        }
        return new g2.e(C3).h(e4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0715e.class != obj.getClass()) {
            return false;
        }
        C0715e c0715e = (C0715e) obj;
        AbstractC0546c abstractC0546c = c0715e.f7160e;
        AbstractC0546c abstractC0546c2 = this.f7160e;
        if (abstractC0546c2 == null ? abstractC0546c != null : !abstractC0546c2.equals(abstractC0546c)) {
            return false;
        }
        Object obj2 = c0715e.f7159d;
        Object obj3 = this.f7159d;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final Object h(g2.e eVar, InterfaceC0714d interfaceC0714d, Object obj) {
        for (Map.Entry entry : this.f7160e) {
            obj = ((C0715e) entry.getValue()).h(eVar.j((C0924c) entry.getKey()), interfaceC0714d, obj);
        }
        Object obj2 = this.f7159d;
        return obj2 != null ? interfaceC0714d.k(eVar, obj2, obj) : obj;
    }

    public final int hashCode() {
        Object obj = this.f7159d;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        AbstractC0546c abstractC0546c = this.f7160e;
        return hashCode + (abstractC0546c != null ? abstractC0546c.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.f7159d == null && this.f7160e.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        h(g2.e.f6694j, new W0(arrayList), null);
        return arrayList.iterator();
    }

    public final Object j(g2.e eVar) {
        if (eVar.isEmpty()) {
            return this.f7159d;
        }
        C0715e c0715e = (C0715e) this.f7160e.h(eVar.C());
        if (c0715e != null) {
            return c0715e.j(eVar.F());
        }
        return null;
    }

    public final C0715e s(C0924c c0924c) {
        C0715e c0715e = (C0715e) this.f7160e.h(c0924c);
        return c0715e != null ? c0715e : f7158j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableTree { value=");
        sb.append(this.f7159d);
        sb.append(", children={");
        for (Map.Entry entry : this.f7160e) {
            sb.append(((C0924c) entry.getKey()).f8920d);
            sb.append("=");
            sb.append(entry.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    public final C0715e w(g2.e eVar) {
        boolean isEmpty = eVar.isEmpty();
        C0715e c0715e = f7158j;
        AbstractC0546c abstractC0546c = this.f7160e;
        if (isEmpty) {
            return abstractC0546c.isEmpty() ? c0715e : new C0715e(null, abstractC0546c);
        }
        C0924c C3 = eVar.C();
        C0715e c0715e2 = (C0715e) abstractC0546c.h(C3);
        if (c0715e2 == null) {
            return this;
        }
        C0715e w4 = c0715e2.w(eVar.F());
        AbstractC0546c E3 = w4.isEmpty() ? abstractC0546c.E(C3) : abstractC0546c.D(w4, C3);
        Object obj = this.f7159d;
        return (obj == null && E3.isEmpty()) ? c0715e : new C0715e(obj, E3);
    }

    public C0715e(Comparable comparable) {
        this(comparable, f7157i);
    }
}
