package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.a;

/* loaded from: classes.dex */
public final /* synthetic */ class n {

    class a implements k.n<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f17739a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f17740b;

        a(Map map, a.e eVar) {
            this.f17739a = map;
            this.f17740b = eVar;
        }

        @Override // io.flutter.plugins.webviewflutter.k.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            this.f17739a.put("result", bool);
            this.f17740b.a(this.f17739a);
        }
    }

    public static m5.i<Object> c() {
        return k.c.f17686d;
    }

    public static /* synthetic */ void d(k.b bVar, Object obj, a.e eVar) {
        Map b7;
        HashMap hashMap = new HashMap();
        try {
            bVar.a(new a(hashMap, eVar));
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void e(k.b bVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        String str;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            str = (String) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (str == null) {
            throw new NullPointerException("urlArg unexpectedly null.");
        }
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new NullPointerException("valueArg unexpectedly null.");
        }
        bVar.b(str, str2);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void f(m5.c cVar, final k.b bVar) {
        m5.a aVar = new m5.a(cVar, "dev.flutter.pigeon.CookieManagerHostApi.clearCookies", c());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.l
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    n.d(k.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        m5.a aVar2 = new m5.a(cVar, "dev.flutter.pigeon.CookieManagerHostApi.setCookie", c());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.m
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    n.e(k.b.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
    }
}
