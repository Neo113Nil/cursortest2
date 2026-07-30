package com.anythink.expressad.mbbanner.a.d;

import android.content.Context;
import android.os.Handler;
import com.anythink.core.common.d.t;
import com.anythink.expressad.mbbanner.a.b.e;
import com.anythink.expressad.mbbanner.a.c.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20043a = "a";

    /* renamed from: h, reason: collision with root package name */
    private static volatile a f20044h;

    /* renamed from: b, reason: collision with root package name */
    private Context f20045b = t.b().g();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.e.a f20046c = new com.anythink.expressad.mbbanner.a.e.a();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, e> f20047d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Boolean> f20048e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Handler> f20049f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Integer> f20050g = new ConcurrentHashMap();

    private a() {
    }

    private e b(String str) {
        if (this.f20047d.containsKey(str)) {
            return this.f20047d.get(str);
        }
        String f6 = com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(f6, str);
        if (c4 == null) {
            c4 = com.anythink.expressad.f.c.c(str);
        }
        e eVar = new e(str, "", c4.t());
        this.f20047d.put(str, eVar);
        return eVar;
    }

    public static a a() {
        if (f20044h == null) {
            synchronized (a.class) {
                try {
                    if (f20044h == null) {
                        f20044h = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20044h;
    }

    public final void a(String str, String str2, com.anythink.expressad.foundation.d.e eVar, com.anythink.expressad.mbbanner.a.c.b bVar) {
        e eVar2;
        Boolean bool;
        synchronized (a()) {
            try {
                if (this.f20045b == null) {
                    com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19160y);
                    cVar.c(str);
                    cVar.b(str2);
                    this.f20046c.a(bVar, cVar);
                    return;
                }
                if (eVar != null && bVar != null) {
                    Map<String, Boolean> map = this.f20048e;
                    if (map != null && map.containsKey(str2) && (bool = this.f20048e.get(str2)) != null && bool.booleanValue()) {
                        com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19151p, "Current unit is loading!");
                        cVar2.c(str);
                        cVar2.b(str2);
                        this.f20046c.a(bVar, cVar2);
                        return;
                    }
                    this.f20048e.put(str2, Boolean.TRUE);
                    if (this.f20047d.containsKey(str2)) {
                        eVar2 = this.f20047d.get(str2);
                    } else {
                        String f6 = com.anythink.expressad.foundation.b.a.c().f();
                        com.anythink.expressad.f.b.a();
                        com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(f6, str2);
                        if (c4 == null) {
                            c4 = com.anythink.expressad.f.c.c(str2);
                        }
                        e eVar3 = new e(str2, "", c4.t());
                        this.f20047d.put(str2, eVar3);
                        eVar2 = eVar3;
                    }
                    new b(this.f20045b, eVar2, bVar, this.f20046c).a(str2, eVar, new d() { // from class: com.anythink.expressad.mbbanner.a.d.a.1
                        @Override // com.anythink.expressad.mbbanner.a.c.d
                        public final void a(String str3) {
                            synchronized (a.a()) {
                                a.this.f20048e.put(str3, Boolean.FALSE);
                            }
                        }
                    });
                    return;
                }
                com.anythink.expressad.foundation.e.c cVar3 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19138b);
                cVar3.c(str);
                cVar3.b(str2);
                this.f20046c.a(bVar, cVar3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        Map<String, e> map = this.f20047d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f20048e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f20049f;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f20049f.clear();
        }
        Map<String, Integer> map4 = this.f20050g;
        if (map4 != null) {
            map4.clear();
        }
    }

    public final void a(String str) {
        if (this.f20049f.containsKey(str)) {
            Handler handler = this.f20049f.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f20049f.remove(str);
        }
    }

    public final void a(int i, String str) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        int intValue = this.f20050g.containsKey(str) ? this.f20050g.get(str).intValue() : 0;
        if (i == 1) {
            if (this.f20049f.containsKey(str) && (handler = this.f20049f.get(str)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f20050g.put(str, Integer.valueOf(i));
            return;
        }
        if (i == 2) {
            if (intValue == 1) {
                if (this.f20049f.containsKey(str) && (handler2 = this.f20049f.get(str)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f20050g.put(str, Integer.valueOf(i));
                return;
            }
            return;
        }
        if (i == 3) {
            if (intValue == 2 || intValue == 4) {
                this.f20050g.put(str, 1);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        if (intValue == 0) {
            this.f20050g.put(str, 0);
            return;
        }
        if (this.f20049f.containsKey(str) && (handler3 = this.f20049f.get(str)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f20050g.put(str, Integer.valueOf(i));
    }
}
