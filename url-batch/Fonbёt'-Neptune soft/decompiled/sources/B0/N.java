package B0;

import I.C0079n;
import I.InterfaceC0074i;
import Y0.AbstractC0127v;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s0.InterfaceC0304a;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public final class N implements InterfaceC0304a, InterfaceC0030h {

    /* renamed from: e, reason: collision with root package name */
    public Context f125e;

    /* renamed from: f, reason: collision with root package name */
    public C0031i f126f;

    /* renamed from: g, reason: collision with root package name */
    public final C0023a f127g = new C0023a(1);

    public static final Object r(N n2, String str, String str2, J0.g gVar) {
        n2.getClass();
        L.d dVar = new L.d(str);
        Context context = n2.f125e;
        if (context != null) {
            Object c2 = O.a(context).c(new L.h(new C0035m(dVar, str2, null), null), gVar);
            return c2 == I0.a.f733e ? c2 : F0.h.f469a;
        }
        Q0.h.g("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c5 -> B:11:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(N n2, List list, J0.b bVar) {
        y yVar;
        int i2;
        Set T2;
        N n3;
        Map map;
        Set set;
        Set set2;
        Iterator it;
        N n4;
        Map map2;
        Object c2;
        n2.getClass();
        if (bVar instanceof y) {
            yVar = (y) bVar;
            int i3 = yVar.f214o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yVar.f214o = i3 - Integer.MIN_VALUE;
                Object obj = yVar.f212m;
                I0.a aVar = I0.a.f733e;
                i2 = yVar.f214o;
                if (i2 != 0) {
                    i1.a.G(obj);
                    T2 = list != null ? G0.d.T(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    yVar.f207h = n2;
                    yVar.f208i = T2;
                    yVar.f209j = linkedHashMap;
                    yVar.f214o = 1;
                    Context context = n2.f125e;
                    if (context == null) {
                        Q0.h.g("context");
                        throw null;
                    }
                    Object c3 = b1.q.c(new B.m(1, ((InterfaceC0074i) O.a(context).f78f).getData()), yVar);
                    if (c3 == aVar) {
                        return aVar;
                    }
                    n3 = n2;
                    map = linkedHashMap;
                    obj = c3;
                } else if (i2 == 1) {
                    map = yVar.f209j;
                    T2 = yVar.f208i;
                    n3 = yVar.f207h;
                    i1.a.G(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    L.d dVar = yVar.f211l;
                    it = yVar.f210k;
                    map2 = yVar.f209j;
                    set2 = yVar.f208i;
                    n4 = yVar.f207h;
                    i1.a.G(obj);
                    if (O.b(dVar.f762a, obj, set2) && (c2 = O.c(obj, n4.f127g)) != null) {
                        map2.put(dVar.f762a, c2);
                    }
                    if (it.hasNext()) {
                        dVar = (L.d) it.next();
                        yVar.f207h = n4;
                        yVar.f208i = set2;
                        yVar.f209j = map2;
                        yVar.f210k = it;
                        yVar.f211l = dVar;
                        yVar.f214o = 2;
                        Context context2 = n4.f125e;
                        if (context2 == null) {
                            Q0.h.g("context");
                            throw null;
                        }
                        obj = b1.q.c(new C0039q(((InterfaceC0074i) O.a(context2).f78f).getData(), dVar, 3), yVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (O.b(dVar.f762a, obj, set2)) {
                            map2.put(dVar.f762a, c2);
                        }
                        if (it.hasNext()) {
                            return map2;
                        }
                    }
                }
                set = (Set) obj;
                if (set != null) {
                    return map;
                }
                set2 = T2;
                it = set.iterator();
                n4 = n3;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        yVar = new y(n2, bVar);
        Object obj2 = yVar.f212m;
        I0.a aVar2 = I0.a.f733e;
        i2 = yVar.f214o;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // B0.InterfaceC0030h
    public final Double a(String str, C0032j c0032j) {
        Q0.o oVar = new Q0.o();
        AbstractC0127v.j(new u(str, this, oVar, null));
        return (Double) oVar.f983e;
    }

    @Override // B0.InterfaceC0030h
    public final void b(String str, boolean z2, C0032j c0032j) {
        AbstractC0127v.j(new F(str, this, z2, null));
    }

    @Override // B0.InterfaceC0030h
    public final Map c(List list, C0032j c0032j) {
        return (Map) AbstractC0127v.j(new C0036n(this, list, null));
    }

    @Override // B0.InterfaceC0030h
    public final void d(String str, List list, C0032j c0032j) {
        AbstractC0127v.j(new G(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f127g.e(list)), null));
    }

    @Override // B0.InterfaceC0030h
    public final void e(String str, double d2, C0032j c0032j) {
        AbstractC0127v.j(new I(str, this, d2, null));
    }

    @Override // B0.InterfaceC0030h
    public final void f(String str, String str2, C0032j c0032j) {
        AbstractC0127v.j(new M(this, str, str2, null));
    }

    @Override // B0.InterfaceC0030h
    public final Long g(String str, C0032j c0032j) {
        Q0.o oVar = new Q0.o();
        AbstractC0127v.j(new w(str, this, oVar, null));
        return (Long) oVar.f983e;
    }

    @Override // B0.InterfaceC0030h
    public final List h(List list, C0032j c0032j) {
        return G0.d.S(((Map) AbstractC0127v.j(new x(this, list, null))).keySet());
    }

    @Override // B0.InterfaceC0030h
    public final S i(String str, C0032j c0032j) {
        String n2 = n(str, c0032j);
        if (n2 == null) {
            return null;
        }
        if (n2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new S(n2, P.f131g);
        }
        return n2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new S(null, P.f130f) : new S(null, P.f132h);
    }

    @Override // s0.InterfaceC0304a
    public final void j(C0079n c0079n) {
        Q0.h.e(c0079n, "binding");
        InterfaceC0320f interfaceC0320f = (InterfaceC0320f) c0079n.f690f;
        Q0.h.d(interfaceC0320f, "binding.binaryMessenger");
        Context context = (Context) c0079n.f689e;
        Q0.h.d(context, "binding.applicationContext");
        this.f125e = context;
        try {
            InterfaceC0030h.f151a.getClass();
            C0029g.b(interfaceC0320f, this, "data_store");
            this.f126f = new C0031i(interfaceC0320f, context, this.f127g);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new C0024b().j(c0079n);
    }

    @Override // s0.InterfaceC0304a
    public final void k(C0079n c0079n) {
        Q0.h.e(c0079n, "binding");
        InterfaceC0320f interfaceC0320f = (InterfaceC0320f) c0079n.f690f;
        Q0.h.d(interfaceC0320f, "binding.binaryMessenger");
        InterfaceC0030h.f151a.getClass();
        C0029g.b(interfaceC0320f, null, "data_store");
        C0031i c0031i = this.f126f;
        if (c0031i != null) {
            C0029g.b((InterfaceC0320f) c0031i.f154f, null, "shared_preferences");
        }
        this.f126f = null;
    }

    @Override // B0.InterfaceC0030h
    public final void l(List list, C0032j c0032j) {
        AbstractC0127v.j(new C0034l(this, list, null));
    }

    @Override // B0.InterfaceC0030h
    public final void m(String str, String str2, C0032j c0032j) {
        AbstractC0127v.j(new J(this, str, str2, null));
    }

    @Override // B0.InterfaceC0030h
    public final String n(String str, C0032j c0032j) {
        Q0.o oVar = new Q0.o();
        AbstractC0127v.j(new A(str, this, oVar, null));
        return (String) oVar.f983e;
    }

    @Override // B0.InterfaceC0030h
    public final void o(String str, long j2, C0032j c0032j) {
        AbstractC0127v.j(new L(str, this, j2, null));
    }

    @Override // B0.InterfaceC0030h
    public final Boolean p(String str, C0032j c0032j) {
        Q0.o oVar = new Q0.o();
        AbstractC0127v.j(new r(str, this, oVar, null));
        return (Boolean) oVar.f983e;
    }

    @Override // B0.InterfaceC0030h
    public final ArrayList q(String str, C0032j c0032j) {
        List list;
        String n2 = n(str, c0032j);
        ArrayList arrayList = null;
        if (n2 != null && !n2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && n2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) O.c(n2, this.f127g)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
