package q0;

import a.AbstractC0124a;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: q0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1370l extends AbstractC1359a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f15041h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f15042i;

    /* renamed from: j, reason: collision with root package name */
    public Y.A f15043j;

    public abstract void A(Object obj, AbstractC1359a abstractC1359a, T.T t4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [q0.C, q0.i] */
    public final void B(final Object obj, AbstractC1359a abstractC1359a) {
        HashMap hashMap = this.f15041h;
        AbstractC0124a.h(!hashMap.containsKey(obj));
        ?? r12 = new InterfaceC1354C() { // from class: q0.i
            @Override // q0.InterfaceC1354C
            public final void a(AbstractC1359a abstractC1359a2, T.T t4) {
                AbstractC1370l.this.A(obj, abstractC1359a2, t4);
            }
        };
        C1368j c1368j = new C1368j(this, obj);
        hashMap.put(obj, new C1369k(abstractC1359a, r12, c1368j));
        Handler handler = this.f15042i;
        handler.getClass();
        abstractC1359a.getClass();
        f0.e eVar = abstractC1359a.f14947c;
        eVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = eVar.f8493c;
        C1358G c1358g = new C1358G();
        c1358g.f14830a = handler;
        c1358g.f14831b = c1368j;
        copyOnWriteArrayList.add(c1358g);
        this.f15042i.getClass();
        f0.e eVar2 = abstractC1359a.f14948d;
        eVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = eVar2.f8493c;
        f0.d dVar = new f0.d();
        dVar.f8490a = c1368j;
        copyOnWriteArrayList2.add(dVar);
        Y.A a3 = this.f15043j;
        b0.i iVar = this.f14951g;
        iVar.getClass();
        abstractC1359a.l(r12, a3, iVar);
        if (this.f14946b.isEmpty()) {
            abstractC1359a.c(r12);
        }
    }

    @Override // q0.AbstractC1359a
    public final void d() {
        for (C1369k c1369k : this.f15041h.values()) {
            c1369k.f15037a.c(c1369k.f15038b);
        }
    }

    @Override // q0.AbstractC1359a
    public final void f() {
        for (C1369k c1369k : this.f15041h.values()) {
            c1369k.f15037a.e(c1369k.f15038b);
        }
    }

    @Override // q0.AbstractC1359a
    public void k() {
        Iterator it = this.f15041h.values().iterator();
        while (it.hasNext()) {
            ((C1369k) it.next()).f15037a.k();
        }
    }

    @Override // q0.AbstractC1359a
    public void t() {
        HashMap hashMap = this.f15041h;
        for (C1369k c1369k : hashMap.values()) {
            AbstractC1359a abstractC1359a = c1369k.f15037a;
            C1368j c1368j = c1369k.f15039c;
            abstractC1359a.s(c1369k.f15038b);
            abstractC1359a.v(c1368j);
            abstractC1359a.u(c1368j);
        }
        hashMap.clear();
    }

    public abstract C1353B x(Object obj, C1353B c1353b);

    public long y(long j4, Object obj) {
        return j4;
    }

    public int z(int i4, Object obj) {
        return i4;
    }
}
