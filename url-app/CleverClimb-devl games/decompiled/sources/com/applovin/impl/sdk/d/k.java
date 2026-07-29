package com.applovin.impl.sdk.d;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.mediation.c.c;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.b;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends com.applovin.impl.sdk.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static int f3100a;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f3101c;

    private class a extends com.applovin.impl.sdk.d.a {
        public a(com.applovin.impl.sdk.j jVar) {
            super("TaskTimeoutFetchBasicSettings", jVar, true);
        }

        @Override // com.applovin.impl.sdk.d.a
        public com.applovin.impl.sdk.c.i a() {
            return com.applovin.impl.sdk.c.i.g;
        }

        @Override // java.lang.Runnable
        public void run() {
            d("Timing out fetch basic settings...");
            k.this.a(new JSONObject());
        }
    }

    public k(com.applovin.impl.sdk.j jVar) {
        super("TaskFetchBasicSettings", jVar, true);
        this.f3101c = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        if (this.f3101c.compareAndSet(false, true)) {
            com.applovin.impl.sdk.e.e.d(jSONObject, this.f3073b);
            com.applovin.impl.sdk.e.e.c(jSONObject, this.f3073b);
            com.applovin.impl.mediation.c.b.a(jSONObject, this.f3073b);
            com.applovin.impl.mediation.c.b.b(jSONObject, this.f3073b);
            b("Executing initialize SDK...");
            this.f3073b.C().a(new p(this.f3073b));
            com.applovin.impl.sdk.e.e.e(jSONObject, this.f3073b);
            com.applovin.impl.sdk.e.e.f(jSONObject, this.f3073b);
            b("Finished executing initialize SDK");
        }
    }

    private String g() {
        return com.applovin.impl.sdk.e.e.a((String) this.f3073b.a(com.applovin.impl.sdk.b.b.au), "4.0/i", b());
    }

    private String h() {
        return com.applovin.impl.sdk.e.e.a((String) this.f3073b.a(com.applovin.impl.sdk.b.b.av), "4.0/i", b());
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.f3059d;
    }

    protected Map<String, String> f() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("build", String.valueOf(109));
        int i = f3100a + 1;
        f3100a = i;
        hashMap.put("init_count", String.valueOf(i));
        hashMap.put("server_installed_at", com.applovin.impl.sdk.e.i.e((String) this.f3073b.a(com.applovin.impl.sdk.b.b.S)));
        com.applovin.impl.sdk.e.l.a("first_install", Boolean.valueOf(this.f3073b.A()), hashMap);
        if (!((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.eU)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3073b.s());
        }
        Boolean a2 = com.applovin.impl.sdk.g.a(d());
        if (a2 != null) {
            hashMap.put("huc", a2.toString());
        }
        Boolean b2 = com.applovin.impl.sdk.g.b(d());
        if (b2 != null) {
            hashMap.put("aru", b2.toString());
        }
        String str = (String) this.f3073b.a(com.applovin.impl.sdk.b.b.ei);
        if (com.applovin.impl.sdk.e.i.b(str)) {
            hashMap.put("plugin_version", com.applovin.impl.sdk.e.i.e(str));
        }
        String m = this.f3073b.m();
        if (com.applovin.impl.sdk.e.i.b(m)) {
            hashMap.put("mediation_provider", com.applovin.impl.sdk.e.i.e(m));
        }
        c.a a3 = com.applovin.impl.mediation.c.c.a();
        hashMap.put("installed_mediation_adapter_classnames", com.applovin.impl.sdk.e.i.e(TextUtils.join(",", a3.a())));
        hashMap.put("uninstalled_mediation_adapter_classnames", com.applovin.impl.sdk.e.i.e(TextUtils.join(",", a3.b())));
        k.b c2 = this.f3073b.G().c();
        hashMap.put(com.umeng.commonsdk.proguard.d.n, com.applovin.impl.sdk.e.i.e(c2.f3307c));
        hashMap.put("app_version", com.applovin.impl.sdk.e.i.e(c2.f3306b));
        hashMap.put(TapjoyConstants.TJC_PLATFORM, com.applovin.impl.sdk.e.i.e(this.f3073b.G().b()));
        hashMap.put(com.umeng.commonsdk.proguard.d.w, com.applovin.impl.sdk.e.i.e(Build.VERSION.RELEASE));
        hashMap.put("tg", this.f3073b.a(com.applovin.impl.sdk.b.d.f3009c));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.network.b a2 = com.applovin.impl.sdk.network.b.a(this.f3073b).a(g()).c(h()).a(f()).b("GET").a((b.a) new JSONObject()).a(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.dV)).intValue()).c(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.dW)).intValue()).b(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.dU)).intValue()).a();
        this.f3073b.C().a(new a(this.f3073b), q.a.TIMEOUT, ((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.dU)).intValue() + 250);
        w<JSONObject> wVar = new w<JSONObject>(a2, this.f3073b, e()) { // from class: com.applovin.impl.sdk.d.k.1
            @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
            public void a(int i) {
                d("Unable to fetch basic SDK settings: server returned " + i);
                k.this.a(new JSONObject());
            }

            @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
            public void a(JSONObject jSONObject, int i) {
                k.this.a(jSONObject);
            }
        };
        wVar.a(com.applovin.impl.sdk.b.b.aw);
        wVar.b(com.applovin.impl.sdk.b.b.ax);
        this.f3073b.C().a(wVar);
    }
}
