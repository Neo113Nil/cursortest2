package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.a;

/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public static m5.i<Object> b() {
        return k.g.f17694d;
    }

    public static /* synthetic */ void c(k.f fVar, Object obj, a.e eVar) {
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
        fVar.a(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void d(m5.c cVar, final k.f fVar) {
        new m5.a(cVar, "dev.flutter.pigeon.DownloadListenerHostApi.create", b()).e(fVar != null ? new a.d() { // from class: io.flutter.plugins.webviewflutter.q
            @Override // m5.a.d
            public final void a(Object obj, a.e eVar) {
                r.c(k.f.this, obj, eVar);
            }
        } : null);
    }
}
