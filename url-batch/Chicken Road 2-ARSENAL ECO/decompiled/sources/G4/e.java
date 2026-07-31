package G4;

import D3.A;
import D4.i;
import D4.j;
import D4.n;
import D4.o;
import D4.r;
import D4.s;
import f5.C0387a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final e f859a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final A f860b;

    /* renamed from: c, reason: collision with root package name */
    public static final A f861c;

    static {
        AtomicInteger atomicInteger = i.f530n;
        f860b = new A(1, false);
        f861c = new A(1, false);
    }

    @Override // D4.o
    public final void a(n nVar, Object obj, Object obj2, i iVar) {
        Map map = (Map) obj2;
        nVar.a(L4.b.f1453a, (F4.n) iVar.c(F4.n.class));
        nVar.n(L4.b.f1454b, map, a.f838a, iVar, f860b);
        nVar.y(L4.b.f1455c, ((C0387a) obj).f4249a, iVar);
    }

    @Override // D4.o
    public final int d(Object obj, Object obj2, i iVar) {
        C0387a c0387a = (C0387a) obj;
        Map map = (Map) obj2;
        F4.n d7 = F4.n.d(c0387a);
        iVar.a(d7);
        int d8 = j.d(L4.b.f1453a, d7);
        D4.b bVar = L4.b.f1454b;
        a aVar = a.f838a;
        A a7 = s.f565a;
        int i7 = 0;
        if (!map.isEmpty()) {
            r rVar = (r) iVar.d(f861c, new C4.d(6));
            rVar.f561a = 0;
            rVar.f562b = bVar.f512c;
            rVar.f563c = aVar;
            rVar.f564d = iVar;
            map.forEach(rVar);
            i7 = rVar.f561a;
        }
        return s.d(L4.b.f1455c, c0387a.f4249a, iVar) + i7 + d8;
    }
}
