package B1;

import W2.C0286h;
import W2.InterfaceC0302y;
import b2.C0519c;
import j2.AbstractC0720j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;

/* renamed from: B1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100g extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f992k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f993l;

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0100g) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0100g c0100g = new C0100g(2, aVar);
        c0100g.f993l = obj;
        return c0100g;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object a4;
        int i2 = 1;
        D2.a aVar = D2.a.f2163d;
        int i4 = this.f992k;
        if (i4 == 0) {
            AbstractC1343r.b(obj);
            this.f993l = (InterfaceC0302y) this.f993l;
            this.f992k = 1;
            C0286h c0286h = new C0286h(1, D2.f.b(this));
            c0286h.s();
            try {
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                a4 = b2.e.a().b();
            } catch (Throwable th) {
                AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                a4 = AbstractC1343r.a(th);
            }
            if (a4 instanceof C1342q) {
                a4 = null;
            }
            C0519c c0519c = (C0519c) a4;
            if (c0519c != null) {
                C1294c c1294c = new C1294c(c0286h);
                g2.w wVar = new g2.w(c0519c.f5633a, new y.t(17, c0519c, c1294c, r0), new l2.i(c0519c.f5634b, c0519c.f5635c));
                g2.y yVar = g2.y.f6774b;
                synchronized (yVar.f6775a) {
                    try {
                        List list = (List) yVar.f6775a.get(wVar);
                        if (list == null) {
                            list = new ArrayList();
                            yVar.f6775a.put(wVar, list);
                        }
                        list.add(wVar);
                        if (!wVar.f6769f.b()) {
                            g2.w wVar2 = new g2.w(wVar.f6767d, wVar.f6768e, l2.i.a(wVar.f6769f.f7984a));
                            List list2 = (List) yVar.f6775a.get(wVar2);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                yVar.f6775a.put(wVar2, list2);
                            }
                            list2.add(wVar);
                        }
                        wVar.f6766c = true;
                        AbstractC0720j.c(!wVar.f6764a.get());
                        AbstractC0720j.c(wVar.f6765b == null);
                        wVar.f6765b = yVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c0519c.f5633a.e(new b2.i(c0519c, wVar, i2));
                c0286h.v(new C0099f(c0519c, c1294c));
            } else if (c0286h.x()) {
                c0286h.u(null);
            }
            obj = c0286h.r();
            if (obj == D2.a.f2163d) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return obj;
    }
}
