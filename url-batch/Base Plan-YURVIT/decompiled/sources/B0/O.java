package B0;

import F.InterfaceC0027i;
import W0.AbstractC0081v;
import a.AbstractC0086a;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r0.InterfaceC0225a;
import v0.InterfaceC0241f;

/* loaded from: classes.dex */
public final class O implements InterfaceC0225a, InterfaceC0007h {

    /* renamed from: e, reason: collision with root package name */
    public Context f54e;

    /* renamed from: f, reason: collision with root package name */
    public C0008i f55f;

    /* renamed from: g, reason: collision with root package name */
    public final C0000a f56g = new C0000a(1);

    public static final Object m(O o2, String str, String str2, I0.g gVar) {
        I.d dVar = new I.d(str);
        Context context = o2.f54e;
        if (context != null) {
            Object f2 = P.a(context).f(new I.h(new C0012m(dVar, str2, null), null), gVar);
            return f2 == H0.a.f511e ? f2 : D0.h.f206a;
        }
        P0.h.g("context");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bc, code lost:
    
        if (r13 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        if (r13 == r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00bc -> B:11:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(O o2, List list, I0.b bVar) {
        y yVar;
        int i2;
        Set T2;
        Map linkedHashMap;
        Set set;
        Map map;
        Set set2;
        int i3;
        Iterator it;
        Object c2;
        if (bVar instanceof y) {
            yVar = (y) bVar;
            int i4 = yVar.f144o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                yVar.f144o = i4 - Integer.MIN_VALUE;
                Object obj = yVar.f142m;
                i2 = yVar.f144o;
                H0.a aVar = H0.a.f511e;
                if (i2 != 0) {
                    AbstractC0086a.I(obj);
                    T2 = list != null ? E0.f.T(list) : null;
                    linkedHashMap = new LinkedHashMap();
                    yVar.f137h = T2;
                    yVar.f138i = linkedHashMap;
                    yVar.f144o = 1;
                    Context context = o2.f54e;
                    if (context == null) {
                        P0.h.g("context");
                        throw null;
                    }
                    obj = Z0.q.c(new E(0, ((InterfaceC0027i) P.a(context).f20f).u()), yVar);
                } else if (i2 == 1) {
                    linkedHashMap = yVar.f138i;
                    T2 = yVar.f137h;
                    AbstractC0086a.I(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = yVar.f141l;
                    I.d dVar = yVar.f140k;
                    it = yVar.f139j;
                    map = yVar.f138i;
                    set2 = yVar.f137h;
                    AbstractC0086a.I(obj);
                    if (P.b(dVar.f519a, obj, set2) && (c2 = P.c(obj, o2.f56g)) != null) {
                        map.put(dVar.f519a, c2);
                    }
                    if (it.hasNext()) {
                        return map;
                    }
                    dVar = (I.d) it.next();
                    yVar.f137h = set2;
                    yVar.f138i = map;
                    yVar.f139j = it;
                    yVar.f140k = dVar;
                    yVar.f141l = i3;
                    yVar.f144o = 2;
                    Context context2 = o2.f54e;
                    if (context2 == null) {
                        P0.h.g("context");
                        throw null;
                    }
                    obj = Z0.q.c(new C0016q(((InterfaceC0027i) P.a(context2).f20f).u(), dVar, 3), yVar);
                }
                set = (Set) obj;
                if (set != null) {
                    return linkedHashMap;
                }
                map = linkedHashMap;
                set2 = T2;
                i3 = 0;
                it = set.iterator();
                if (it.hasNext()) {
                }
            }
        }
        yVar = new y(o2, bVar);
        Object obj2 = yVar.f142m;
        i2 = yVar.f144o;
        H0.a aVar2 = H0.a.f511e;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // B0.InterfaceC0007h
    public final Double a(String str, C0009j c0009j) {
        P0.o oVar = new P0.o();
        AbstractC0081v.i(new u(str, this, oVar, null));
        return (Double) oVar.f807e;
    }

    @Override // B0.InterfaceC0007h
    public final void b(String str, boolean z2, C0009j c0009j) {
        AbstractC0081v.i(new G(str, this, z2, null));
    }

    @Override // r0.InterfaceC0225a
    public final void c(N.P p2) {
        P0.h.e(p2, "binding");
        InterfaceC0241f interfaceC0241f = (InterfaceC0241f) p2.f699g;
        P0.h.d(interfaceC0241f, "getBinaryMessenger(...)");
        Context context = (Context) p2.f698f;
        P0.h.d(context, "getApplicationContext(...)");
        this.f54e = context;
        try {
            InterfaceC0007h.f81a.getClass();
            C0006g.b(interfaceC0241f, this, "data_store");
            this.f55f = new C0008i(interfaceC0241f, context, this.f56g);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new C0001b().c(p2);
    }

    @Override // B0.InterfaceC0007h
    public final List d(List list, C0009j c0009j) {
        return E0.f.S(((Map) AbstractC0081v.i(new x(this, list, null))).keySet());
    }

    @Override // B0.InterfaceC0007h
    public final T e(String str, C0009j c0009j) {
        String p2 = p(str, c0009j);
        if (p2 != null) {
            return p2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new T(p2, Q.JSON_ENCODED) : p2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new T(null, Q.PLATFORM_ENCODED) : new T(null, Q.UNEXPECTED_STRING);
        }
        return null;
    }

    @Override // B0.InterfaceC0007h
    public final void f(List list, C0009j c0009j) {
        AbstractC0081v.i(new C0011l(this, list, null));
    }

    @Override // B0.InterfaceC0007h
    public final void g(String str, String str2, C0009j c0009j) {
        AbstractC0081v.i(new K(this, str, str2, null));
    }

    @Override // B0.InterfaceC0007h
    public final void h(String str, long j2, C0009j c0009j) {
        AbstractC0081v.i(new M(str, this, j2, null));
    }

    @Override // r0.InterfaceC0225a
    public final void i(N.P p2) {
        P0.h.e(p2, "binding");
        InterfaceC0241f interfaceC0241f = (InterfaceC0241f) p2.f699g;
        P0.h.d(interfaceC0241f, "getBinaryMessenger(...)");
        InterfaceC0007h.f81a.getClass();
        C0006g.b(interfaceC0241f, null, "data_store");
        C0008i c0008i = this.f55f;
        if (c0008i != null) {
            C0006g.b((InterfaceC0241f) c0008i.f84f, null, "shared_preferences");
        }
        this.f55f = null;
    }

    @Override // B0.InterfaceC0007h
    public final Map j(List list, C0009j c0009j) {
        return (Map) AbstractC0081v.i(new C0013n(this, list, null));
    }

    @Override // B0.InterfaceC0007h
    public final void k(String str, List list, C0009j c0009j) {
        AbstractC0081v.i(new H(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f56g.d(list)), null));
    }

    @Override // B0.InterfaceC0007h
    public final void l(String str, double d2, C0009j c0009j) {
        AbstractC0081v.i(new J(str, this, d2, null));
    }

    @Override // B0.InterfaceC0007h
    public final void n(String str, String str2, C0009j c0009j) {
        AbstractC0081v.i(new N(this, str, str2, null));
    }

    @Override // B0.InterfaceC0007h
    public final Long o(String str, C0009j c0009j) {
        P0.o oVar = new P0.o();
        AbstractC0081v.i(new w(str, this, oVar, null));
        return (Long) oVar.f807e;
    }

    @Override // B0.InterfaceC0007h
    public final String p(String str, C0009j c0009j) {
        P0.o oVar = new P0.o();
        AbstractC0081v.i(new A(str, this, oVar, null));
        return (String) oVar.f807e;
    }

    @Override // B0.InterfaceC0007h
    public final Boolean q(String str, C0009j c0009j) {
        P0.o oVar = new P0.o();
        AbstractC0081v.i(new r(str, this, oVar, null));
        return (Boolean) oVar.f807e;
    }

    @Override // B0.InterfaceC0007h
    public final ArrayList r(String str, C0009j c0009j) {
        List list;
        String p2 = p(str, c0009j);
        if (p2 == null || p2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || !p2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || (list = (List) P.c(p2, this.f56g)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
