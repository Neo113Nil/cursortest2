package u;

import F.C0060q;
import java.util.LinkedHashMap;

/* renamed from: u.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951t {

    /* renamed from: a, reason: collision with root package name */
    public final R.c f8090a;

    /* renamed from: b, reason: collision with root package name */
    public final E.w f8091b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8092c = new LinkedHashMap();

    public C0951t(R.c cVar, E.w wVar) {
        this.f8090a = cVar;
        this.f8091b = wVar;
    }

    public final Y1.e a(Object obj, int i3, Object obj2) {
        Q.a aVar;
        LinkedHashMap linkedHashMap = this.f8092c;
        C0950s c0950s = (C0950s) linkedHashMap.get(obj);
        if (c0950s != null && c0950s.f8087c == i3 && Z1.i.a(c0950s.f8086b, obj2)) {
            Q.a aVar2 = c0950s.f8088d;
            if (aVar2 != null) {
                return aVar2;
            }
            aVar = new Q.a(1403994769, new C0060q(c0950s.f8089e, 10, c0950s), true);
            c0950s.f8088d = aVar;
        } else {
            C0950s c0950s2 = new C0950s(this, i3, obj, obj2);
            linkedHashMap.put(obj, c0950s2);
            Q.a aVar3 = c0950s2.f8088d;
            if (aVar3 != null) {
                return aVar3;
            }
            aVar = new Q.a(1403994769, new C0060q(this, 10, c0950s2), true);
            c0950s2.f8088d = aVar;
        }
        return aVar;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        C0950s c0950s = (C0950s) this.f8092c.get(obj);
        if (c0950s != null) {
            return c0950s.f8086b;
        }
        InterfaceC0953v interfaceC0953v = (InterfaceC0953v) this.f8091b.b();
        int b2 = interfaceC0953v.b(obj);
        if (b2 != -1) {
            return interfaceC0953v.d(b2);
        }
        return null;
    }
}
