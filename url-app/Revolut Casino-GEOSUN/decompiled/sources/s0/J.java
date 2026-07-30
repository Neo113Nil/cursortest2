package s0;

import D.InterfaceC0008i;
import L.C0026b;
import M0.AbstractC0063v;
import android.content.Context;
import android.util.Log;
import j0.C0177a;
import j0.InterfaceC0178b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m0.C0193c;
import u0.C0247g;

/* loaded from: classes.dex */
public final class J implements InterfaceC0178b, InterfaceC0228g {

    /* renamed from: e, reason: collision with root package name */
    public Context f2872e;

    /* renamed from: f, reason: collision with root package name */
    public C0026b f2873f;

    /* renamed from: g, reason: collision with root package name */
    public final E.a f2874g = new E.a(25);

    public static final Object d(J j2, String str, String str2, y0.f fVar) {
        j2.getClass();
        G.d dVar = new G.d(str);
        Context context = j2.f2872e;
        if (context != null) {
            Object e2 = K.a(context).e(new G.h(new C0232k(dVar, str2, null), null), fVar);
            return e2 == x0.a.f3094e ? e2 : C0247g.f3005a;
        }
        F0.i.g("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c6 -> B:11:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(J j2, List list, y0.b bVar) {
        v vVar;
        int i2;
        Set G2;
        J j3;
        Map map;
        Set set;
        Set set2;
        Iterator it;
        J j4;
        Map map2;
        Object c2;
        j2.getClass();
        if (bVar instanceof v) {
            vVar = (v) bVar;
            int i3 = vVar.f2949o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vVar.f2949o = i3 - Integer.MIN_VALUE;
                Object obj = vVar.f2947m;
                x0.a aVar = x0.a.f3094e;
                i2 = vVar.f2949o;
                if (i2 != 0) {
                    o.g.z(obj);
                    G2 = list != null ? v0.d.G(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    vVar.f2942h = j2;
                    vVar.f2943i = G2;
                    vVar.f2944j = linkedHashMap;
                    vVar.f2949o = 1;
                    Context context = j2.f2872e;
                    if (context == null) {
                        F0.i.g("context");
                        throw null;
                    }
                    Object c3 = P0.r.c(new C0193c(21, ((InterfaceC0008i) K.a(context).f30f).j()), vVar);
                    if (c3 == aVar) {
                        return aVar;
                    }
                    j3 = j2;
                    map = linkedHashMap;
                    obj = c3;
                } else if (i2 == 1) {
                    map = vVar.f2944j;
                    G2 = vVar.f2943i;
                    j3 = vVar.f2942h;
                    o.g.z(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G.d dVar = vVar.f2946l;
                    it = vVar.f2945k;
                    map2 = vVar.f2944j;
                    set2 = vVar.f2943i;
                    j4 = vVar.f2942h;
                    o.g.z(obj);
                    if (K.b(dVar.f332a, obj, set2) && (c2 = K.c(obj, j4.f2874g)) != null) {
                        map2.put(dVar.f332a, c2);
                    }
                    if (it.hasNext()) {
                        dVar = (G.d) it.next();
                        vVar.f2942h = j4;
                        vVar.f2943i = set2;
                        vVar.f2944j = map2;
                        vVar.f2945k = it;
                        vVar.f2946l = dVar;
                        vVar.f2949o = 2;
                        Context context2 = j4.f2872e;
                        if (context2 == null) {
                            F0.i.g("context");
                            throw null;
                        }
                        obj = P0.r.c(new o(((InterfaceC0008i) K.a(context2).f30f).j(), dVar, 3), vVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (K.b(dVar.f332a, obj, set2)) {
                            map2.put(dVar.f332a, c2);
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
                set2 = G2;
                it = set.iterator();
                j4 = j3;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        vVar = new v(j2, bVar);
        Object obj2 = vVar.f2947m;
        x0.a aVar2 = x0.a.f3094e;
        i2 = vVar.f2949o;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // s0.InterfaceC0228g
    public final List a(List list, C0229h c0229h) {
        return v0.d.F(((Map) AbstractC0063v.j(new u(this, list, null))).keySet());
    }

    @Override // s0.InterfaceC0228g
    public final void b(String str, String str2, C0229h c0229h) {
        AbstractC0063v.j(new F(this, str, str2, null));
    }

    @Override // s0.InterfaceC0228g
    public final String c(String str, C0229h c0229h) {
        F0.p pVar = new F0.p();
        AbstractC0063v.j(new x(str, this, pVar, null));
        return (String) pVar.f324e;
    }

    @Override // s0.InterfaceC0228g
    public final Double e(String str, C0229h c0229h) {
        F0.p pVar = new F0.p();
        AbstractC0063v.j(new r(str, this, pVar, null));
        return (Double) pVar.f324e;
    }

    @Override // s0.InterfaceC0228g
    public final N f(String str, C0229h c0229h) {
        String c2 = c(str, c0229h);
        if (c2 == null) {
            return null;
        }
        if (c2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new N(c2, L.JSON_ENCODED);
        }
        return c2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new N(null, L.PLATFORM_ENCODED) : new N(null, L.UNEXPECTED_STRING);
    }

    @Override // s0.InterfaceC0228g
    public final Boolean g(String str, C0229h c0229h) {
        F0.p pVar = new F0.p();
        AbstractC0063v.j(new p(str, this, pVar, null));
        return (Boolean) pVar.f324e;
    }

    @Override // s0.InterfaceC0228g
    public final ArrayList h(String str, C0229h c0229h) {
        List list;
        String c2 = c(str, c0229h);
        ArrayList arrayList = null;
        if (c2 != null && !c2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && c2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) K.c(c2, this.f2874g)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // s0.InterfaceC0228g
    public final void i(String str, boolean z2, C0229h c0229h) {
        AbstractC0063v.j(new B(str, this, z2, null));
    }

    @Override // s0.InterfaceC0228g
    public final void j(List list, C0229h c0229h) {
        AbstractC0063v.j(new C0231j(this, list, null));
    }

    @Override // s0.InterfaceC0228g
    public final void l(String str, long j2, C0229h c0229h) {
        AbstractC0063v.j(new H(str, this, j2, null));
    }

    @Override // s0.InterfaceC0228g
    public final void m(String str, List list, C0229h c0229h) {
        AbstractC0063v.j(new C(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f2874g.d(list)), null));
    }

    @Override // s0.InterfaceC0228g
    public final void n(String str, double d2, C0229h c0229h) {
        AbstractC0063v.j(new E(str, this, d2, null));
    }

    @Override // s0.InterfaceC0228g
    public final Map o(List list, C0229h c0229h) {
        return (Map) AbstractC0063v.j(new C0233l(this, list, null));
    }

    @Override // j0.InterfaceC0178b
    public final void onAttachedToEngine(C0177a c0177a) {
        F0.i.e(c0177a, "binding");
        n0.f fVar = c0177a.f2644c;
        F0.i.d(fVar, "getBinaryMessenger(...)");
        Context context = c0177a.f2642a;
        F0.i.d(context, "getApplicationContext(...)");
        this.f2872e = context;
        try {
            InterfaceC0228g.f2895d.getClass();
            C0227f.b(fVar, this, "data_store");
            this.f2873f = new C0026b(fVar, context, this.f2874g);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new C0222a().onAttachedToEngine(c0177a);
    }

    @Override // j0.InterfaceC0178b
    public final void onDetachedFromEngine(C0177a c0177a) {
        F0.i.e(c0177a, "binding");
        n0.f fVar = c0177a.f2644c;
        F0.i.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0228g.f2895d.getClass();
        C0227f.b(fVar, null, "data_store");
        C0026b c0026b = this.f2873f;
        if (c0026b != null) {
            C0227f.b((n0.f) c0026b.f521g, null, "shared_preferences");
        }
        this.f2873f = null;
    }

    @Override // s0.InterfaceC0228g
    public final void p(String str, String str2, C0229h c0229h) {
        AbstractC0063v.j(new I(this, str, str2, null));
    }

    @Override // s0.InterfaceC0228g
    public final Long q(String str, C0229h c0229h) {
        F0.p pVar = new F0.p();
        AbstractC0063v.j(new t(str, this, pVar, null));
        return (Long) pVar.f324e;
    }
}
