package t;

import F.C0087c;
import e2.InterfaceC0426e;
import java.util.LinkedHashMap;
import s.C0939h;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final R.c f8502a;

    /* renamed from: b, reason: collision with root package name */
    public final E.v f8503b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8504c = new LinkedHashMap();

    public r(R.c cVar, E.v vVar) {
        this.f8502a = cVar;
        this.f8503b = vVar;
    }

    public final InterfaceC0426e a(Object obj, int i3, Object obj2) {
        Q.a aVar;
        LinkedHashMap linkedHashMap = this.f8504c;
        q qVar = (q) linkedHashMap.get(obj);
        if (qVar != null && qVar.f8499c == i3 && f2.j.a(qVar.f8498b, obj2)) {
            Q.a aVar2 = qVar.f8500d;
            if (aVar2 != null) {
                return aVar2;
            }
            aVar = new Q.a(1403994769, new C0087c(qVar.f8501e, 9, qVar), true);
            qVar.f8500d = aVar;
        } else {
            q qVar2 = new q(this, i3, obj, obj2);
            linkedHashMap.put(obj, qVar2);
            Q.a aVar3 = qVar2.f8500d;
            if (aVar3 != null) {
                return aVar3;
            }
            aVar = new Q.a(1403994769, new C0087c(this, 9, qVar2), true);
            qVar2.f8500d = aVar;
        }
        return aVar;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = (q) this.f8504c.get(obj);
        if (qVar != null) {
            return qVar.f8498b;
        }
        C0939h c0939h = (C0939h) this.f8503b.b();
        int b3 = c0939h.f8237d.b(obj);
        if (b3 != -1) {
            return c0939h.b(b3);
        }
        return null;
    }
}
