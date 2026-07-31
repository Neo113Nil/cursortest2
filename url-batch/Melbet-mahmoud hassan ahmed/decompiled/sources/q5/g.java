package q5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.a;
import q5.h;

/* loaded from: classes.dex */
public final /* synthetic */ class g {
    public static m5.i<Object> g() {
        return h.b.f20355d;
    }

    public static /* synthetic */ void h(h.a aVar, Object obj, a.e eVar) {
        Map b7;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.a());
        } catch (Error | RuntimeException e7) {
            b7 = h.b(e7);
            hashMap.put("error", b7);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void i(h.a aVar, Object obj, a.e eVar) {
        Map b7;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.d());
        } catch (Error | RuntimeException e7) {
            b7 = h.b(e7);
            hashMap.put("error", b7);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void j(h.a aVar, Object obj, a.e eVar) {
        Map b7;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.b());
        } catch (Error | RuntimeException e7) {
            b7 = h.b(e7);
            hashMap.put("error", b7);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void k(h.a aVar, Object obj, a.e eVar) {
        Map b7;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.g());
        } catch (Error | RuntimeException e7) {
            b7 = h.b(e7);
            hashMap.put("error", b7);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void l(h.a aVar, Object obj, a.e eVar) {
        Map b7;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.c());
        } catch (Error | RuntimeException e7) {
            b7 = h.b(e7);
            hashMap.put("error", b7);
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void m(h.a aVar, Object obj, a.e eVar) {
        Map b7;
        h.c cVar;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            cVar = arrayList.get(0) == null ? null : h.c.values()[((Integer) arrayList.get(0)).intValue()];
        } catch (Error | RuntimeException e7) {
            b7 = h.b(e7);
            hashMap.put("error", b7);
        }
        if (cVar == null) {
            throw new NullPointerException("directoryArg unexpectedly null.");
        }
        hashMap.put("result", aVar.e(cVar));
        eVar.a(hashMap);
    }

    public static void n(m5.c cVar, final h.a aVar) {
        m5.a aVar2 = new m5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", g(), cVar.b());
        if (aVar != null) {
            aVar2.e(new a.d() { // from class: q5.c
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.h(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        m5.a aVar3 = new m5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", g(), cVar.b());
        if (aVar != null) {
            aVar3.e(new a.d() { // from class: q5.f
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.i(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        m5.a aVar4 = new m5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", g(), cVar.b());
        if (aVar != null) {
            aVar4.e(new a.d() { // from class: q5.d
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.j(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        m5.a aVar5 = new m5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", g(), cVar.b());
        if (aVar != null) {
            aVar5.e(new a.d() { // from class: q5.a
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.k(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        m5.a aVar6 = new m5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", g(), cVar.b());
        if (aVar != null) {
            aVar6.e(new a.d() { // from class: q5.e
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.l(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        m5.a aVar7 = new m5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", g(), cVar.b());
        if (aVar != null) {
            aVar7.e(new a.d() { // from class: q5.b
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.m(h.a.this, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
    }
}
