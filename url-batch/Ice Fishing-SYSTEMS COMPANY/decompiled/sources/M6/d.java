package M6;

import J6.i;
import J6.j;
import J6.k;
import J6.o;
import J6.p;
import J6.s;
import J6.t;
import L6.n;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l7.C4707a;

/* loaded from: classes2.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1913a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final i f1914b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f1915c;

    static {
        AtomicInteger atomicInteger = j.f1422n;
        f1914b = new i();
        f1915c = new i();
    }

    @Override // J6.p
    public final int a(Object obj, Object obj2, j jVar) {
        C4707a c4707a = (C4707a) obj;
        Map map = (Map) obj2;
        n d2 = n.d(c4707a);
        jVar.a(d2);
        int d3 = k.d(R6.b.f2809a, d2);
        J6.b bVar = R6.b.f2810b;
        a aVar = a.f1896a;
        i iVar = t.f1456a;
        int i = 0;
        if (!map.isEmpty()) {
            s sVar = (s) jVar.d(f1915c, new D5.a(7));
            sVar.f1452a = 0;
            sVar.f1453b = bVar.f1402c;
            sVar.f1454c = aVar;
            sVar.f1455d = jVar;
            map.forEach(sVar);
            i = sVar.f1452a;
        }
        return t.d(R6.b.f2811c, c4707a.f39081a, jVar) + i + d3;
    }

    @Override // J6.p
    public final void d(o oVar, Object obj, Object obj2, j jVar) {
        Map map = (Map) obj2;
        oVar.a(R6.b.f2809a, (n) jVar.c(n.class));
        oVar.m(R6.b.f2810b, map, a.f1896a, jVar, f1914b);
        oVar.p(R6.b.f2811c, ((C4707a) obj).f39081a, jVar);
    }
}
