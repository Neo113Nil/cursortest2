package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.a;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 {
    public static m5.i<Object> c() {
        return k.x.f17719d;
    }

    public static /* synthetic */ void d(k.w wVar, Object obj, a.e eVar) {
        Map b7;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            number = (Number) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        wVar.a(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void e(k.w wVar, Object obj, a.e eVar) {
        Map b7;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            number = (Number) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        wVar.b(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void f(m5.c cVar, final k.w wVar) {
        m5.a aVar = new m5.a(cVar, "dev.flutter.pigeon.WebStorageHostApi.create", c());
        if (wVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.t0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    u0.d(k.w.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        m5.a aVar2 = new m5.a(cVar, "dev.flutter.pigeon.WebStorageHostApi.deleteAllData", c());
        if (wVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.s0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    u0.e(k.w.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
