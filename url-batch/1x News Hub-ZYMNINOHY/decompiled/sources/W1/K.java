package W1;

import K.InterfaceC0044h;
import U1.C0080a;
import android.content.Context;
import android.util.Log;
import b0.C0178i;
import b2.C0195i;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t2.AbstractC1212w;

/* loaded from: classes.dex */
public final class K implements L1.b, InterfaceC0095g {

    /* renamed from: a, reason: collision with root package name */
    public Context f1649a;

    /* renamed from: b, reason: collision with root package name */
    public A0.f f1650b;

    /* renamed from: c, reason: collision with root package name */
    public final C0080a f1651c = new C0080a(6);

    public static final Object d(K k3, String str, String str2, f2.i iVar) {
        k3.getClass();
        N.d dVar = new N.d(str);
        Context context = k3.f1649a;
        if (context != null) {
            Object a3 = L.a(context).a(new N.h(new C0099k(dVar, str2, null), null), iVar);
            return a3 == EnumC0317a.f4969a ? a3 : C0195i.f2555a;
        }
        kotlin.jvm.internal.j.g("context");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
    
        if (r13 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00cc -> B:11:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(K k3, List list, AbstractC0326c abstractC0326c) {
        w wVar;
        int i3;
        Set a02;
        K k4;
        Map map;
        Set set;
        Set set2;
        Iterator it;
        K k5;
        Map map2;
        Object c3;
        k3.getClass();
        if (abstractC0326c instanceof w) {
            wVar = (w) abstractC0326c;
            int i4 = wVar.f1718k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                wVar.f1718k = i4 - Integer.MIN_VALUE;
                Object obj = wVar.f1716i;
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                i3 = wVar.f1718k;
                if (i3 != 0) {
                    android.support.v4.media.session.a.T(obj);
                    a02 = list != null ? c2.e.a0(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    wVar.f1712d = k3;
                    wVar.f1713e = a02;
                    wVar.f = linkedHashMap;
                    wVar.f1718k = 1;
                    Context context = k3.f1649a;
                    if (context == null) {
                        kotlin.jvm.internal.j.g("context");
                        throw null;
                    }
                    Object c4 = w2.q.c(new C0178i(28, ((InterfaceC0044h) L.a(context).f201b).getData()), wVar);
                    if (c4 != enumC0317a) {
                        k4 = k3;
                        map = linkedHashMap;
                        obj = c4;
                    }
                    return enumC0317a;
                }
                if (i3 == 1) {
                    map = wVar.f;
                    a02 = wVar.f1713e;
                    k4 = wVar.f1712d;
                    android.support.v4.media.session.a.T(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.d dVar = wVar.f1715h;
                    it = wVar.f1714g;
                    map2 = wVar.f;
                    set2 = wVar.f1713e;
                    k5 = wVar.f1712d;
                    android.support.v4.media.session.a.T(obj);
                    if (L.b(dVar.f981a, obj, set2) && (c3 = L.c(obj, k5.f1651c)) != null) {
                        map2.put(dVar.f981a, c3);
                    }
                    if (it.hasNext()) {
                        return map2;
                    }
                    dVar = (N.d) it.next();
                    wVar.f1712d = k5;
                    wVar.f1713e = set2;
                    wVar.f = map2;
                    wVar.f1714g = it;
                    wVar.f1715h = dVar;
                    wVar.f1718k = 2;
                    Context context2 = k5.f1649a;
                    if (context2 == null) {
                        kotlin.jvm.internal.j.g("context");
                        throw null;
                    }
                    obj = w2.q.c(new C0103o(((InterfaceC0044h) L.a(context2).f201b).getData(), dVar, 3), wVar);
                }
                set = (Set) obj;
                if (set != null) {
                    return map;
                }
                set2 = a02;
                it = set.iterator();
                k5 = k4;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        wVar = new w(k3, abstractC0326c);
        Object obj2 = wVar.f1716i;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = wVar.f1718k;
        if (i3 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // W1.InterfaceC0095g
    public final void a(String str, long j3, C0096h c0096h) {
        AbstractC1212w.k(new I(str, this, j3, null));
    }

    @Override // W1.InterfaceC0095g
    public final void b(List list, C0096h c0096h) {
        AbstractC1212w.k(new C0098j(this, list, null));
    }

    @Override // W1.InterfaceC0095g
    public final O c(String str, C0096h c0096h) {
        String k3 = k(str, c0096h);
        if (k3 != null) {
            return s2.n.X(k3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new O(k3, M.JSON_ENCODED) : s2.n.X(k3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new O(null, M.PLATFORM_ENCODED) : new O(null, M.UNEXPECTED_STRING);
        }
        return null;
    }

    @Override // W1.InterfaceC0095g
    public final void e(String str, List list, C0096h c0096h) {
        AbstractC1212w.k(new D(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f1651c.e(list)), null));
    }

    @Override // W1.InterfaceC0095g
    public final Map f(List list, C0096h c0096h) {
        return (Map) AbstractC1212w.k(new C0100l(this, list, null));
    }

    @Override // W1.InterfaceC0095g
    public final ArrayList g(String str, C0096h c0096h) {
        List list;
        String k3 = k(str, c0096h);
        if (k3 == null || s2.n.X(k3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || !s2.n.X(k3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || (list = (List) L.c(k3, this.f1651c)) == null) {
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

    @Override // W1.InterfaceC0095g
    public final void h(String str, double d3, C0096h c0096h) {
        AbstractC1212w.k(new F(str, this, d3, null));
    }

    @Override // W1.InterfaceC0095g
    public final void j(String str, String str2, C0096h c0096h) {
        AbstractC1212w.k(new G(this, str, str2, null));
    }

    @Override // W1.InterfaceC0095g
    public final String k(String str, C0096h c0096h) {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        AbstractC1212w.k(new y(str, this, qVar, null));
        return (String) qVar.f9692a;
    }

    @Override // W1.InterfaceC0095g
    public final Boolean l(String str, C0096h c0096h) {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        AbstractC1212w.k(new p(str, this, qVar, null));
        return (Boolean) qVar.f9692a;
    }

    @Override // W1.InterfaceC0095g
    public final void m(String str, boolean z, C0096h c0096h) {
        AbstractC1212w.k(new C(str, this, z, null));
    }

    @Override // W1.InterfaceC0095g
    public final Double o(String str, C0096h c0096h) {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        AbstractC1212w.k(new s(str, this, qVar, null));
        return (Double) qVar.f9692a;
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a binding) {
        kotlin.jvm.internal.j.e(binding, "binding");
        P1.f fVar = binding.f888b;
        kotlin.jvm.internal.j.d(fVar, "getBinaryMessenger(...)");
        Context context = binding.f887a;
        kotlin.jvm.internal.j.d(context, "getApplicationContext(...)");
        this.f1649a = context;
        try {
            InterfaceC0095g.f1672u0.getClass();
            C0094f.b(fVar, this, "data_store");
            this.f1650b = new A0.f(fVar, context, this.f1651c);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
        new C0089a().onAttachedToEngine(binding);
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a binding) {
        kotlin.jvm.internal.j.e(binding, "binding");
        P1.f fVar = binding.f888b;
        kotlin.jvm.internal.j.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0095g.f1672u0.getClass();
        C0094f.b(fVar, null, "data_store");
        A0.f fVar2 = this.f1650b;
        if (fVar2 != null) {
            C0094f.b((P1.f) fVar2.f23b, null, "shared_preferences");
        }
        this.f1650b = null;
    }

    @Override // W1.InterfaceC0095g
    public final void p(String str, String str2, C0096h c0096h) {
        AbstractC1212w.k(new J(this, str, str2, null));
    }

    @Override // W1.InterfaceC0095g
    public final Long q(String str, C0096h c0096h) {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        AbstractC1212w.k(new u(str, this, qVar, null));
        return (Long) qVar.f9692a;
    }

    @Override // W1.InterfaceC0095g
    public final List r(List list, C0096h c0096h) {
        return c2.e.Y(((Map) AbstractC1212w.k(new v(this, list, null))).keySet());
    }
}
