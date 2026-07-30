package n5;

import h4.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import k5.AbstractC0605e;
import k5.C0602b;
import k5.g;
import k5.l;
import k5.o;
import k5.p;
import k5.q;
import q5.AbstractC0835a;

/* renamed from: n5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761c extends AbstractC0605e {

    /* renamed from: d, reason: collision with root package name */
    public static final v f6998d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f6999e;

    /* renamed from: a, reason: collision with root package name */
    public final g f7000a = new g();

    /* renamed from: b, reason: collision with root package name */
    public Map f7001b;

    /* renamed from: c, reason: collision with root package name */
    public int f7002c;

    static {
        AtomicInteger atomicInteger = g.f6069n;
        f6998d = new v(1);
        f6999e = new v(1);
    }

    @Override // k5.AbstractC0605e
    public final int a() {
        return this.f7002c;
    }

    @Override // k5.AbstractC0605e
    public final void c(l lVar) {
        g gVar = this.f7000a;
        gVar.f6073d = 0;
        gVar.f6076g = 0;
        lVar.t(AbstractC0835a.f7351a, this.f7001b, C0762d.f7003a, gVar, f6999e);
    }

    public final void d(Collection collection) {
        Map map;
        boolean isEmpty = collection.isEmpty();
        g gVar = this.f7000a;
        if (isEmpty) {
            map = Collections.EMPTY_MAP;
        } else {
            C4.a aVar = new C4.a(25);
            C4.a aVar2 = new C4.a(26);
            v vVar = q.f6103a;
            Map map2 = (Map) gVar.f6079k.a();
            o oVar = (o) gVar.d(q.f6103a, new G3.a(10));
            oVar.f6095a = map2;
            oVar.f6096b = aVar;
            oVar.f6097c = aVar2;
            oVar.f6098d = gVar;
            collection.forEach(oVar);
            map = map2;
        }
        this.f7001b = map;
        C0602b c0602b = AbstractC0835a.f7351a;
        C0762d c0762d = C0762d.f7003a;
        v vVar2 = q.f6103a;
        int i2 = 0;
        if (!map.isEmpty()) {
            p pVar = (p) gVar.d(f6998d, new G3.a(8));
            pVar.f6099a = 0;
            pVar.f6100b = c0602b.f6058c;
            pVar.f6101c = c0762d;
            pVar.f6102d = gVar;
            map.forEach(pVar);
            i2 = pVar.f6099a;
        }
        this.f7002c = i2;
    }

    public final void e() {
        g gVar = this.f7000a;
        gVar.f6073d = 0;
        gVar.f6074e = 0;
        for (int i2 = 0; i2 < gVar.f6077h; i2++) {
            gVar.f6075f[i2] = null;
        }
        gVar.f6076g = 0;
        gVar.f6077h = 0;
        gVar.f6078i.f1480a = 0;
        gVar.j.f1480a = 0;
        p1.l lVar = gVar.f6079k;
        for (int i5 = 0; i5 < lVar.f7191a; i5++) {
            ((Consumer) lVar.f7194d).accept(((ArrayList) lVar.f7192b).get(i5));
        }
        lVar.f7191a = 0;
        p1.l lVar2 = gVar.f6080l;
        for (int i7 = 0; i7 < lVar2.f7191a; i7++) {
            ((Consumer) lVar2.f7194d).accept(((ArrayList) lVar2.f7192b).get(i7));
        }
        lVar2.f7191a = 0;
    }
}
