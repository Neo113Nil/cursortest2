package s;

import D.C0120c;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1113q {

    /* renamed from: a, reason: collision with root package name */
    public final P.c f9954a;

    /* renamed from: b, reason: collision with root package name */
    public final C.v f9955b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9956c = new LinkedHashMap();

    public C1113q(P.c cVar, C.v vVar) {
        this.f9954a = cVar;
        this.f9955b = vVar;
    }

    public final Function2 a(Object obj, int i2, Object obj2) {
        O.a aVar;
        LinkedHashMap linkedHashMap = this.f9956c;
        C1112p c1112p = (C1112p) linkedHashMap.get(obj);
        if (c1112p != null && c1112p.f9951c == i2 && Intrinsics.a(c1112p.f9950b, obj2)) {
            O.a aVar2 = c1112p.f9952d;
            if (aVar2 != null) {
                return aVar2;
            }
            aVar = new O.a(1403994769, true, new C0120c(c1112p.f9953e, 10, c1112p));
            c1112p.f9952d = aVar;
        } else {
            C1112p c1112p2 = new C1112p(this, i2, obj, obj2);
            linkedHashMap.put(obj, c1112p2);
            O.a aVar3 = c1112p2.f9952d;
            if (aVar3 != null) {
                return aVar3;
            }
            aVar = new O.a(1403994769, true, new C0120c(this, 10, c1112p2));
            c1112p2.f9952d = aVar;
        }
        return aVar;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        C1112p c1112p = (C1112p) this.f9956c.get(obj);
        if (c1112p != null) {
            return c1112p.f9950b;
        }
        r.h hVar = (r.h) this.f9955b.invoke();
        int b4 = hVar.f9457d.b(obj);
        if (b4 != -1) {
            return hVar.b(b4);
        }
        return null;
    }
}
