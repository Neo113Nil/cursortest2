package n5;

import h4.v;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k5.C0602b;
import k5.g;
import k5.h;
import k5.l;
import k5.m;
import k5.p;
import k5.q;
import m5.n;
import s5.AbstractC0895b;

/* renamed from: n5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762d implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final C0762d f7003a = new C0762d();

    /* renamed from: b, reason: collision with root package name */
    public static final v f7004b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f7005c;

    static {
        AtomicInteger atomicInteger = g.f6069n;
        f7004b = new v(1);
        f7005c = new v(1);
    }

    @Override // k5.m
    public final void b(l lVar, Object obj, Object obj2, g gVar) {
        Map map = (Map) obj2;
        lVar.a(AbstractC0895b.f7788a, (n) gVar.c(n.class));
        lVar.t(AbstractC0895b.f7789b, map, C0759a.f6986a, gVar, f7004b);
        lVar.E(AbstractC0895b.f7790c, ((M5.a) obj).f1770a, gVar);
    }

    @Override // k5.m
    public final int d(Object obj, Object obj2, g gVar) {
        M5.a aVar = (M5.a) obj;
        Map map = (Map) obj2;
        n d7 = n.d(aVar);
        gVar.a(d7);
        int d8 = h.d(AbstractC0895b.f7788a, d7);
        C0602b c0602b = AbstractC0895b.f7789b;
        C0759a c0759a = C0759a.f6986a;
        v vVar = q.f6103a;
        int i2 = 0;
        if (!map.isEmpty()) {
            p pVar = (p) gVar.d(f7005c, new G3.a(8));
            pVar.f6099a = 0;
            pVar.f6100b = c0602b.f6058c;
            pVar.f6101c = c0759a;
            pVar.f6102d = gVar;
            map.forEach(pVar);
            i2 = pVar.f6099a;
        }
        return q.d(AbstractC0895b.f7790c, aVar.f1770a, gVar) + i2 + d8;
    }
}
