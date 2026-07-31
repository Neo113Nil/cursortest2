package x4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.a;
import m5.i;
import x4.a;

/* loaded from: classes.dex */
public final /* synthetic */ class d {
    public static i<Object> c() {
        return a.d.f23191d;
    }

    public static /* synthetic */ void d(a.c cVar, Object obj, a.e eVar) {
        Map b7;
        a.b bVar;
        HashMap hashMap = new HashMap();
        try {
            bVar = (a.b) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e7) {
            b7 = a.b(e7);
            hashMap.put("error", b7);
        }
        if (bVar == null) {
            throw new NullPointerException("msgArg unexpectedly null.");
        }
        cVar.g(bVar);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void e(a.c cVar, Object obj, a.e eVar) {
        Map b7;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", cVar.d());
        } catch (Error | RuntimeException e7) {
            b7 = a.b(e7);
            hashMap.put("error", b7);
        }
        eVar.a(hashMap);
    }

    public static void f(m5.c cVar, final a.c cVar2) {
        m5.a aVar = new m5.a(cVar, "dev.flutter.pigeon.WakelockApi.toggle", c());
        if (cVar2 != null) {
            aVar.e(new a.d() { // from class: x4.c
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    d.d(a.c.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        m5.a aVar2 = new m5.a(cVar, "dev.flutter.pigeon.WakelockApi.isEnabled", c());
        if (cVar2 != null) {
            aVar2.e(new a.d() { // from class: x4.b
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    d.e(a.c.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
