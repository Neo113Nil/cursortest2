package s;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final p0.c f8046a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.o f8047b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8048c = new LinkedHashMap();

    public p(p0.c cVar, c0.o oVar) {
        this.f8046a = cVar;
        this.f8047b = oVar;
    }

    public final q6.e a(Object obj, int i7, Object obj2) {
        LinkedHashMap linkedHashMap = this.f8048c;
        o oVar = (o) linkedHashMap.get(obj);
        if (oVar != null && oVar.f8043c == i7 && r6.k.a(oVar.f8042b, obj2)) {
            o0.a aVar = oVar.f8044d;
            if (aVar != null) {
                return aVar;
            }
            o0.a aVar2 = new o0.a(1403994769, new d0.b0(oVar.f8045e, 13, oVar), true);
            oVar.f8044d = aVar2;
            return aVar2;
        }
        o oVar2 = new o(this, i7, obj, obj2);
        linkedHashMap.put(obj, oVar2);
        o0.a aVar3 = oVar2.f8044d;
        if (aVar3 != null) {
            return aVar3;
        }
        o0.a aVar4 = new o0.a(1403994769, new d0.b0(this, 13, oVar2), true);
        oVar2.f8044d = aVar4;
        return aVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        o oVar = (o) this.f8048c.get(obj);
        if (oVar != null) {
            return oVar.f8042b;
        }
        r.h hVar = (r.h) this.f8047b.a();
        int b9 = hVar.f7607d.b(obj);
        if (b9 != -1) {
            return hVar.b(b9);
        }
        return null;
    }
}
