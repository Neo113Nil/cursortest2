package M6;

import J6.f;
import J6.i;
import J6.j;
import J6.o;
import J6.r;
import J6.s;
import J6.t;
import K2.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final i f1908d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f1909e;

    /* renamed from: a, reason: collision with root package name */
    public final j f1910a = new j();

    /* renamed from: b, reason: collision with root package name */
    public Map f1911b;

    /* renamed from: c, reason: collision with root package name */
    public int f1912c;

    static {
        AtomicInteger atomicInteger = j.f1422n;
        f1908d = new i();
        f1909e = new i();
    }

    @Override // J6.f
    public final int a() {
        return this.f1912c;
    }

    @Override // J6.f
    public final void c(o oVar) {
        j jVar = this.f1910a;
        jVar.f1426d = 0;
        jVar.f1429g = 0;
        oVar.m(P6.a.f2685a, this.f1911b, d.f1913a, jVar, f1909e);
    }

    public final void d(Collection collection) {
        Map map;
        boolean isEmpty = collection.isEmpty();
        j jVar = this.f1910a;
        if (isEmpty) {
            map = Collections.EMPTY_MAP;
        } else {
            G6.b bVar = new G6.b(11);
            G6.b bVar2 = new G6.b(12);
            i iVar = t.f1456a;
            Map map2 = (Map) jVar.f1432k.a();
            r rVar = (r) jVar.d(t.f1456a, new D5.a(9));
            rVar.f1448a = map2;
            rVar.f1449b = bVar;
            rVar.f1450c = bVar2;
            rVar.f1451d = jVar;
            collection.forEach(rVar);
            map = map2;
        }
        this.f1911b = map;
        J6.b bVar3 = P6.a.f2685a;
        d dVar = d.f1913a;
        i iVar2 = t.f1456a;
        int i = 0;
        if (!map.isEmpty()) {
            s sVar = (s) jVar.d(f1908d, new D5.a(7));
            sVar.f1452a = 0;
            sVar.f1453b = bVar3.f1402c;
            sVar.f1454c = dVar;
            sVar.f1455d = jVar;
            map.forEach(sVar);
            i = sVar.f1452a;
        }
        this.f1912c = i;
    }

    public final void e() {
        n nVar;
        j jVar = this.f1910a;
        jVar.f1426d = 0;
        jVar.f1427e = 0;
        for (int i = 0; i < jVar.f1430h; i++) {
            jVar.f1428f[i] = null;
        }
        jVar.f1429g = 0;
        jVar.f1430h = 0;
        jVar.i.f1417a = 0;
        jVar.f1431j.f1417a = 0;
        int i4 = 0;
        while (true) {
            nVar = jVar.f1432k;
            if (i4 >= nVar.f1604a) {
                break;
            }
            ((Consumer) nVar.f1607d).accept(((ArrayList) nVar.f1605b).get(i4));
            i4++;
        }
        nVar.f1604a = 0;
        int i9 = 0;
        while (true) {
            n nVar2 = jVar.f1433l;
            if (i9 >= nVar2.f1604a) {
                nVar2.f1604a = 0;
                return;
            } else {
                ((Consumer) nVar2.f1607d).accept(((ArrayList) nVar2.f1605b).get(i9));
                i9++;
            }
        }
    }
}
