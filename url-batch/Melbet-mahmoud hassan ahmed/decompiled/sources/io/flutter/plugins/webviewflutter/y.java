package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.a;

/* loaded from: classes.dex */
public final /* synthetic */ class y {
    public static m5.i<Object> b() {
        return k.m.f17698d;
    }

    public static /* synthetic */ void c(k.l lVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        String str = (String) arrayList.get(1);
        if (str == null) {
            throw new NullPointerException("channelNameArg unexpectedly null.");
        }
        lVar.a(Long.valueOf(number.longValue()), str);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void d(m5.c cVar, final k.l lVar) {
        new m5.a(cVar, "dev.flutter.pigeon.JavaScriptChannelHostApi.create", b()).e(lVar != null ? new a.d() { // from class: io.flutter.plugins.webviewflutter.x
            @Override // m5.a.d
            public final void a(Object obj, a.e eVar) {
                y.c(k.l.this, obj, eVar);
            }
        } : null);
    }
}
