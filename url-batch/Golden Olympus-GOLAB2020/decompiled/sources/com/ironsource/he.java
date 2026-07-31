package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class he {

    /* renamed from: a, reason: collision with root package name */
    private final of f16586a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f16587b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f16588c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f16589d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16590a;

        a(Context context) {
            this.f16590a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                he.this.e(this.f16590a);
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
            he.this.f16588c.set(false);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static volatile he f16592a = new he(null);

        private b() {
        }
    }

    private he() {
        this.f16588c = new AtomicBoolean(false);
        this.f16589d = new AtomicBoolean(false);
        this.f16586a = nm.S().f();
        this.f16587b = new ConcurrentHashMap<>();
    }

    static he b() {
        return b.f16592a;
    }

    private void d(Context context) {
        if (context == null || this.f16589d.getAndSet(true)) {
            return;
        }
        a(ge.f16408K0, this.f16586a.t(context));
        a("model", this.f16586a.e());
        a(ge.f16496t, this.f16586a.g());
        a(ge.f16395E, this.f16586a.m());
        a(ge.f16484p, this.f16586a.r(context));
        String p4 = this.f16586a.p();
        if (p4 != null) {
            a(ge.f16397F, p4.replaceAll("[^0-9/.]", ""));
            a(ge.f16403I, p4);
        }
        a(ge.f16439a, String.valueOf(this.f16586a.l()));
        String j4 = this.f16586a.j(context);
        if (!TextUtils.isEmpty(j4)) {
            a(ge.f16414N0, j4);
        }
        String e4 = C1442c4.e(context);
        if (!TextUtils.isEmpty(e4)) {
            a(ge.f16481o, e4);
        }
        String i4 = this.f16586a.i(context);
        if (!TextUtils.isEmpty(i4)) {
            a(ge.f16497t0, i4);
        }
        a(ge.f16454f, context.getPackageName());
        a(ge.f16502v, String.valueOf(this.f16586a.h(context)));
        a(ge.f16440a0, ge.f16461h0);
        a(ge.f16443b0, Long.valueOf(C1442c4.f(context)));
        a(ge.f16437Z, Long.valueOf(C1442c4.d(context)));
        a(ge.f16448d, C1442c4.b(context));
        a(ge.f16413N, Integer.valueOf(x8.f(context)));
        a(ge.f16433X, x8.g(context));
        a("stid", ep.c(context));
        a(ge.f16399G, "android");
        a(ge.f16514z, this.f16586a.i());
        a(ge.f16511y, this.f16586a.a(this.f16586a.z(context)));
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String p4 = this.f16586a.p(context);
            if (!TextUtils.isEmpty(p4)) {
                a(ge.f16424S0, p4);
            }
            String a4 = this.f16586a.a(context);
            if (TextUtils.isEmpty(a4)) {
                return;
            }
            a(ge.f16493s, Boolean.valueOf(Boolean.parseBoolean(a4)));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String G3 = this.f16586a.G(context);
        if (!TextUtils.isEmpty(G3)) {
            a(ge.f16404I0, G3);
        } else if (a(ge.f16404I0)) {
            b(ge.f16404I0);
        }
        a(ge.f16410L0, this.f16586a.w(context));
        String b4 = this.f16586a.b(context);
        if (!TextUtils.isEmpty(b4)) {
            a(ge.f16487q, b4.toUpperCase(Locale.getDefault()));
        }
        a(ge.f16490r, this.f16586a.I(context));
        String b5 = this.f16586a.b();
        if (!TextUtils.isEmpty(b5)) {
            a("tz", b5);
        }
        String b6 = y8.b(context);
        if (!TextUtils.isEmpty(b6) && !b6.equals("none")) {
            a(ge.f16466j, b6);
        }
        String d4 = y8.d(context);
        if (!TextUtils.isEmpty(d4)) {
            a(ge.f16469k, d4);
        }
        a("vpn", Boolean.valueOf(y8.e(context)));
        String n4 = this.f16586a.n(context);
        if (!TextUtils.isEmpty(n4)) {
            a("icc", n4);
        }
        int B4 = this.f16586a.B(context);
        if (B4 >= 0) {
            a(ge.f16462h1, Integer.valueOf(B4));
        }
        a(ge.f16465i1, this.f16586a.D(context));
        a(ge.f16468j1, this.f16586a.K(context));
        a(ge.f16455f0, Float.valueOf(this.f16586a.m(context)));
        a(ge.f16475m, String.valueOf(this.f16586a.o()));
        a(ge.f16419Q, Integer.valueOf(this.f16586a.d()));
        a(ge.f16417P, Integer.valueOf(this.f16586a.k()));
        a(ge.f16430V0, String.valueOf(this.f16586a.j()));
        a(ge.f16453e1, String.valueOf(this.f16586a.q()));
        a("mcc", Integer.valueOf(x8.b(context)));
        a("mnc", Integer.valueOf(x8.c(context)));
        a(ge.f16423S, Boolean.valueOf(this.f16586a.c()));
        a(ge.f16457g, Boolean.valueOf(this.f16586a.J(context)));
        a(ge.f16460h, Integer.valueOf(this.f16586a.l(context)));
        a(ge.f16442b, Boolean.valueOf(this.f16586a.c(context)));
        a(ge.f16405J, Boolean.valueOf(this.f16586a.d(context)));
        a("rt", Boolean.valueOf(this.f16586a.f()));
        a(ge.f16435Y, String.valueOf(this.f16586a.h()));
        a(ge.f16451e, Integer.valueOf(this.f16586a.y(context)));
        a(ge.f16432W0, Boolean.valueOf(this.f16586a.q(context)));
        a(ge.f16445c, this.f16586a.f(context));
        a(ge.f16446c0, this.f16586a.t());
        C1600z c1600z = new C1600z(nm.S().k());
        HashMap hashMap = new HashMap();
        c1600z.a(hashMap);
        a(ge.f16388B0, hashMap);
        a(ge.f16407K, ConfigFile.getConfigFile().getPluginType());
        a(ge.f16409L, ConfigFile.getConfigFile().getPluginVersion());
        a(ge.f16411M, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    protected void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    /* synthetic */ he(a aVar) {
        this();
    }

    private void a() {
        String a4 = jv.f16879a.a();
        if (a4 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ge.f16386A1, a4);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(ge.f16392C1, hashMap);
            Map<String, Object> hashMap3 = new HashMap<>();
            hashMap3.put(ge.f16516z1, hashMap2);
            a(hashMap3);
        }
    }

    protected JSONObject b(Context context) {
        f(context);
        return new JSONObject(je.a(this.f16587b));
    }

    private void a(Context context) {
        if (this.f16588c.get()) {
            return;
        }
        try {
            this.f16588c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            this.f16588c.set(false);
        }
    }

    protected void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f16587b.remove(str);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    protected void b(String str, Object obj) {
        a(str, obj);
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f16587b.put(str, obj);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    protected void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f16587b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    protected void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.f16587b.containsKey(str);
    }
}
