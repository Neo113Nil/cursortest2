package com.apm.insight.k;

import android.util.Log;
import androidx.annotation.Nullable;
import com.apm.insight.runtime.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ApmConfigFetcher.java */
/* loaded from: classes13.dex */
public final class a {
    private static Runnable a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (com.apm.insight.l.k.b(com.apm.insight.e.g())) {
                a.i();
            }
            if (a.b > 0) {
                if (com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                    m.a().a(a.a, 15000L);
                } else {
                    m.a().a(a.a, 60000L);
                }
            }
        }
    };
    private static int b = 0;

    public static boolean c() {
        return false;
    }

    public static void d() {
    }

    public static void a() {
        b = 40;
        m.a().a(a);
    }

    public static void b() {
        if (!j.b()) {
            j.c();
        }
        if (com.apm.insight.l.k.b(com.apm.insight.e.g()) && j.g()) {
            i();
        }
    }

    @Nullable
    private static byte[] h() {
        try {
            return e.a(com.apm.insight.e.i().getConfigUrl(), com.apm.insight.entity.b.a().toString().getBytes());
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i() {
        synchronized (a.class) {
            try {
                int i = b;
                if (i > 0) {
                    b = i - 1;
                }
                com.apm.insight.a.a((Object) "try fetchApmConfig");
                if (com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                    JSONArray jSONArray = null;
                    try {
                        byte[] h = h();
                        if (h != null) {
                            jSONArray = new JSONObject(new String(h)).optJSONArray("data");
                        }
                    } catch (Throwable th) {
                        if (com.apm.insight.e.i().isDebugMode()) {
                            Log.e("npth", "npth NPTH Catch Error", th);
                        }
                    }
                    com.apm.insight.a.a((Object) "after fetchApmConfig net ".concat(String.valueOf(jSONArray)));
                    if (jSONArray != null) {
                        com.apm.insight.runtime.a.a(jSONArray, true);
                        b = 0;
                        return;
                    } else {
                        b -= 10;
                        return;
                    }
                }
                j.c();
                if (j.a()) {
                    b = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
