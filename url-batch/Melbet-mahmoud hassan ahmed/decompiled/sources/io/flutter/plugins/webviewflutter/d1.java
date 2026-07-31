package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.a;

/* loaded from: classes.dex */
public final /* synthetic */ class d1 {
    public static m5.i<Object> b() {
        return k.b0.f17685d;
    }

    public static /* synthetic */ void c(k.a0 a0Var, Object obj, a.e eVar) {
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
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("shouldOverrideUrlLoadingArg unexpectedly null.");
        }
        a0Var.b(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void d(m5.c cVar, final k.a0 a0Var) {
        new m5.a(cVar, "dev.flutter.pigeon.WebViewClientHostApi.create", b()).e(a0Var != null ? new a.d() { // from class: io.flutter.plugins.webviewflutter.c1
            @Override // m5.a.d
            public final void a(Object obj, a.e eVar) {
                d1.c(k.a0.this, obj, eVar);
            }
        } : null);
    }
}
