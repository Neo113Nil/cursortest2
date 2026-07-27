package g2;

import f1.C0607a;
import j2.AbstractC0720j;
import j2.C0715e;
import j2.InterfaceC0718h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o2.C0924c;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639b implements Iterable {

    /* renamed from: e, reason: collision with root package name */
    public static final C0639b f6677e = new C0639b(new C0715e(null));

    /* renamed from: d, reason: collision with root package name */
    public final C0715e f6678d;

    public C0639b(C0715e c0715e) {
        this.f6678d = c0715e;
    }

    public static C0639b B(HashMap hashMap) {
        C0715e c0715e = C0715e.f7158j;
        for (Map.Entry entry : hashMap.entrySet()) {
            c0715e = c0715e.C((e) entry.getKey(), new C0715e((o2.s) entry.getValue()));
        }
        return new C0639b(c0715e);
    }

    public static o2.s s(e eVar, C0715e c0715e, o2.s sVar) {
        C0924c c0924c;
        Object obj = c0715e.f7159d;
        if (obj != null) {
            return sVar.d(eVar, (o2.s) obj);
        }
        Iterator it = c0715e.f7160e.iterator();
        o2.s sVar2 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            c0924c = C0924c.f8919j;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C0715e c0715e2 = (C0715e) entry.getValue();
            C0924c c0924c2 = (C0924c) entry.getKey();
            if (c0924c2.equals(c0924c)) {
                AbstractC0720j.b("Priority writes must always be leaf nodes", c0715e2.f7159d != null);
                sVar2 = (o2.s) c0715e2.f7159d;
            } else {
                sVar = s(eVar.j(c0924c2), c0715e2, sVar);
            }
        }
        return (sVar.p(eVar).isEmpty() || sVar2 == null) ? sVar : sVar.d(eVar.j(c0924c), sVar2);
    }

    public final o2.s C(e eVar) {
        H1.f fVar = InterfaceC0718h.f7164c;
        C0715e c0715e = this.f6678d;
        e e4 = c0715e.e(eVar, fVar);
        if (e4 != null) {
            return ((o2.s) c0715e.j(e4)).p(e.E(e4, eVar));
        }
        return null;
    }

    public final HashMap D() {
        HashMap hashMap = new HashMap();
        C0638a c0638a = new C0638a(hashMap);
        C0715e c0715e = this.f6678d;
        c0715e.getClass();
        c0715e.h(e.f6694j, c0638a, null);
        return hashMap;
    }

    public final C0639b e(e eVar, o2.s sVar) {
        if (eVar.isEmpty()) {
            return new C0639b(new C0715e(sVar));
        }
        H1.f fVar = InterfaceC0718h.f7164c;
        C0715e c0715e = this.f6678d;
        e e4 = c0715e.e(eVar, fVar);
        if (e4 == null) {
            return new C0639b(c0715e.C(eVar, new C0715e(sVar)));
        }
        e E3 = e.E(e4, eVar);
        o2.s sVar2 = (o2.s) c0715e.j(e4);
        C0924c B = E3.B();
        return (B != null && B.equals(C0924c.f8919j) && sVar2.p(E3.D()).isEmpty()) ? this : new C0639b(c0715e.B(e4, sVar2.d(E3, sVar)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C0639b.class) {
            return false;
        }
        return ((C0639b) obj).D().equals(D());
    }

    public final C0639b h(e eVar, C0639b c0639b) {
        C0715e c0715e = c0639b.f6678d;
        C0607a c0607a = new C0607a(2, eVar);
        c0715e.getClass();
        return (C0639b) c0715e.h(e.f6694j, c0607a, this);
    }

    public final int hashCode() {
        return D().hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f6678d.iterator();
    }

    public final o2.s j(o2.s sVar) {
        return s(e.f6694j, this.f6678d, sVar);
    }

    public final String toString() {
        return "CompoundWrite{" + D().toString() + "}";
    }

    public final C0639b w(e eVar) {
        if (eVar.isEmpty()) {
            return this;
        }
        o2.s C3 = C(eVar);
        return C3 != null ? new C0639b(new C0715e(C3)) : new C0639b(this.f6678d.D(eVar));
    }
}
