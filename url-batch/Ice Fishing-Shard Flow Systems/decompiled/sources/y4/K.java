package y4;

import P.InterfaceC0144i;
import a.AbstractC0169a;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;

@Metadata
/* loaded from: classes.dex */
public final class K implements o4.c, InterfaceC1039h {

    /* renamed from: d, reason: collision with root package name */
    public Context f8566d;

    /* renamed from: e, reason: collision with root package name */
    public D0.j f8567e;

    /* renamed from: i, reason: collision with root package name */
    public final r4.d f8568i = new r4.d();

    public static final Object a(K k7, String str, String str2, X5.j jVar) {
        T.d E7 = AbstractC0169a.E(str);
        Context context = k7.f8566d;
        if (context != null) {
            Object m2 = d4.c.m(L.a(context), new C1043l(E7, str2, null), jVar);
            return m2 == W5.a.f2787d ? m2 : Unit.f6114a;
        }
        Intrinsics.h("context");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c2, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c2 -> B:11:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(K k7, List list, X5.c cVar) {
        w wVar;
        int i2;
        Set C7;
        Map linkedHashMap;
        Set set;
        Map map;
        Set set2;
        int i5;
        Iterator it;
        Object c7;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i7 = wVar.f8644p;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                wVar.f8644p = i7 - Integer.MIN_VALUE;
                Object obj = wVar.f8642n;
                W5.a aVar = W5.a.f2787d;
                i2 = wVar.f8644p;
                if (i2 != 0) {
                    V6.b.P(obj);
                    C7 = list != null ? CollectionsKt.C(list) : null;
                    linkedHashMap = new LinkedHashMap();
                    wVar.f8637d = C7;
                    wVar.f8638e = linkedHashMap;
                    wVar.f8644p = 1;
                    Context context = k7.f8566d;
                    if (context == null) {
                        Intrinsics.h("context");
                        throw null;
                    }
                    obj = q6.w.d(new l4.b(25, ((InterfaceC0144i) ((l2.c) L.a(context)).f6269d).getData()), wVar);
                } else if (i2 == 1) {
                    linkedHashMap = wVar.f8638e;
                    C7 = wVar.f8637d;
                    V6.b.P(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = wVar.f8641m;
                    T.d dVar = wVar.f8640l;
                    it = wVar.f8639i;
                    map = wVar.f8638e;
                    set2 = wVar.f8637d;
                    V6.b.P(obj);
                    if (L.b(dVar.f2555a, obj, set2) && (c7 = L.c(obj, k7.f8568i)) != null) {
                        map.put(dVar.f2555a, c7);
                    }
                    if (it.hasNext()) {
                        return map;
                    }
                    dVar = (T.d) it.next();
                    wVar.f8637d = set2;
                    wVar.f8638e = map;
                    wVar.f8639i = it;
                    wVar.f8640l = dVar;
                    wVar.f8641m = i5;
                    wVar.f8644p = 2;
                    Context context2 = k7.f8566d;
                    if (context2 == null) {
                        Intrinsics.h("context");
                        throw null;
                    }
                    obj = q6.w.d(new P0.c(((InterfaceC0144i) ((l2.c) L.a(context2)).f6269d).getData(), 17, dVar), wVar);
                }
                set = (Set) obj;
                if (set != null) {
                    return linkedHashMap;
                }
                map = linkedHashMap;
                set2 = C7;
                i5 = 0;
                it = set.iterator();
                if (it.hasNext()) {
                }
            }
        }
        wVar = new w(k7, cVar);
        Object obj2 = wVar.f8642n;
        W5.a aVar2 = W5.a.f2787d;
        i2 = wVar.f8644p;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // y4.InterfaceC1039h
    public final void b(String key, double d7, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new F(key, this, d7, null));
    }

    @Override // y4.InterfaceC1039h
    public final void c(String key, String value, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new G(this, key, value, null));
    }

    @Override // y4.InterfaceC1039h
    public final String d(String key, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.D d7 = new kotlin.jvm.internal.D();
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new y(key, this, d7, null));
        return (String) d7.f6152d;
    }

    @Override // y4.InterfaceC1039h
    public final Boolean e(String key, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.D d7 = new kotlin.jvm.internal.D();
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new p(key, this, d7, null));
        return (Boolean) d7.f6152d;
    }

    @Override // y4.InterfaceC1039h
    public final O f(String key, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        String d7 = d(key, options);
        if (d7 != null) {
            return kotlin.text.p.l(d7, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new O(d7, M.f8573l) : kotlin.text.p.l(d7, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new O(null, M.f8572i) : new O(null, M.f8574m);
        }
        return null;
    }

    @Override // y4.InterfaceC1039h
    public final Long h(String key, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.D d7 = new kotlin.jvm.internal.D();
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new u(key, this, d7, null));
        return (Long) d7.f6152d;
    }

    @Override // y4.InterfaceC1039h
    public final Map i(List list, C1040i options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return (Map) AbstractC0792z.o(kotlin.coroutines.g.f6146d, new C1044m(this, list, null));
    }

    @Override // y4.InterfaceC1039h
    public final void j(String key, long j, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new I(key, this, j, null));
    }

    @Override // y4.InterfaceC1039h
    public final void k(List list, C1040i options) {
        Intrinsics.checkNotNullParameter(options, "options");
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new C1042k(this, list, null));
    }

    @Override // y4.InterfaceC1039h
    public final void o(String key, boolean z7, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new C(key, this, z7, null));
    }

    @Override // o4.c
    public final void onAttachedToEngine(o4.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        s4.f fVar = binding.f7122c;
        Intrinsics.checkNotNullExpressionValue(fVar, "getBinaryMessenger(...)");
        Context context = binding.f7120a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        this.f8566d = context;
        try {
            InterfaceC1039h.j.getClass();
            C1038g.b(fVar, this, "data_store");
            this.f8567e = new D0.j(fVar, context, this.f8568i);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
        new C1032a().onAttachedToEngine(binding);
    }

    @Override // o4.c
    public final void onDetachedFromEngine(o4.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        s4.f fVar = binding.f7122c;
        Intrinsics.checkNotNullExpressionValue(fVar, "getBinaryMessenger(...)");
        InterfaceC1039h.j.getClass();
        C1038g.b(fVar, null, "data_store");
        D0.j jVar = this.f8567e;
        if (jVar != null) {
            C1038g.b((s4.f) jVar.f330e, null, "shared_preferences");
        }
        this.f8567e = null;
    }

    @Override // y4.InterfaceC1039h
    public final Double q(String key, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.D d7 = new kotlin.jvm.internal.D();
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new s(key, this, d7, null));
        return (Double) d7.f6152d;
    }

    @Override // y4.InterfaceC1039h
    public final List s(List list, C1040i options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return CollectionsKt.z(((Map) AbstractC0792z.o(kotlin.coroutines.g.f6146d, new v(this, list, null))).keySet());
    }

    @Override // y4.InterfaceC1039h
    public final void t(String key, String value, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new J(this, key, value, null));
    }

    @Override // y4.InterfaceC1039h
    public final void v(String key, List value, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new D(this, key, r4.f.i("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", this.f8568i.a(value)), null));
    }

    @Override // y4.InterfaceC1039h
    public final ArrayList w(String key, C1040i options) {
        List list;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        String d7 = d(key, options);
        if (d7 == null || kotlin.text.p.l(d7, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || !kotlin.text.p.l(d7, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || (list = (List) L.c(d7, this.f8568i)) == null) {
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
