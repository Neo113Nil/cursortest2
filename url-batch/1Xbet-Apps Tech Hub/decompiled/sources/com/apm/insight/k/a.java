package com.apm.insight.k;

import com.apm.insight.l.p;
import com.apm.insight.l.q;
import com.apm.insight.runtime.u;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static Runnable a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public void run() {
            u b2;
            Runnable runnable;
            long j;
            if (p.b(com.apm.insight.i.g())) {
                a.i();
            }
            if (a.b > 0) {
                if (com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                    b2 = com.apm.insight.runtime.p.b();
                    runnable = a.a;
                    j = 15000;
                } else {
                    b2 = com.apm.insight.runtime.p.b();
                    runnable = a.a;
                    j = 60000;
                }
                b2.a(runnable, j);
            }
        }
    };
    private static int b = 0;

    public static void a() {
        b = 40;
        com.apm.insight.runtime.p.b().a(a);
    }

    public static void b() {
        if (!k.b()) {
            k.c();
        }
        if (p.b(com.apm.insight.i.g()) && k.a(false)) {
            i();
        }
    }

    public static boolean c() {
        return false;
    }

    public static void d() {
    }

    private static byte[] h() {
        try {
            return e.a(com.apm.insight.i.i().getConfigUrl(), (Map<String, String>) null, com.apm.insight.entity.b.a().toString().getBytes());
        } catch (Throwable th) {
            q.a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (com.apm.insight.k.k.a() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void i() {
        synchronized (a.class) {
            int i = b;
            if (i > 0) {
                b = i - 1;
            }
            q.a((Object) "try fetchApmConfig");
            if (com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                JSONArray jSONArray = null;
                try {
                    byte[] h = h();
                    if (h != null) {
                        jSONArray = new JSONObject(new String(h)).optJSONArray("data");
                    }
                } catch (Throwable th) {
                    q.a("npth", th);
                }
                q.a((Object) ("after fetchApmConfig net " + jSONArray));
                if (jSONArray != null) {
                    com.apm.insight.runtime.a.a(jSONArray, true);
                    b = 0;
                } else {
                    b -= 10;
                }
            } else {
                k.c();
            }
        }
    }
}
