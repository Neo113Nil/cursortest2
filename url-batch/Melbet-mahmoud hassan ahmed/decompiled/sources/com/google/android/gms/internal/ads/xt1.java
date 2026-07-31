package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xt1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, JSONObject>> f14348a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f14349b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f14350c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14351d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f14352e;

    public xt1(Executor executor) {
        this.f14350c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void f() {
        Map<String, JSONObject> map;
        this.f14351d = true;
        on0 e7 = y2.t.p().h().e();
        if (e7 == null) {
            return;
        }
        JSONObject f7 = e7.f();
        if (f7 == null) {
            return;
        }
        this.f14349b = ((Boolean) sw.c().b(m10.C2)).booleanValue() ? f7.optJSONObject("common_settings") : null;
        this.f14352e = f7.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = f7.optJSONArray("ad_unit_id_settings");
        if (optJSONArray != null) {
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("ad_unit_id");
                    String optString2 = optJSONObject.optString("format");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                    if (optString != null && optJSONObject2 != null && optString2 != null) {
                        if (this.f14348a.containsKey(optString2)) {
                            map = this.f14348a.get(optString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.f14348a.put(optString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(optString, optJSONObject2);
                    }
                }
            }
        }
    }

    public final JSONObject a() {
        if (((Boolean) sw.c().b(m10.C2)).booleanValue()) {
            return this.f14349b;
        }
        return null;
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) sw.c().b(m10.B2)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f14351d) {
            f();
        }
        Map<String, JSONObject> map = this.f14348a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a7 = zt1.a(this.f14352e, str, str2);
        if (a7 == null) {
            return null;
        }
        return map.get(a7);
    }

    public final void c() {
        y2.t.p().h().Z(new Runnable() { // from class: com.google.android.gms.internal.ads.ut1
            @Override // java.lang.Runnable
            public final void run() {
                xt1.this.e();
            }
        });
        this.f14350c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wt1
            @Override // java.lang.Runnable
            public final void run() {
                xt1.this.f();
            }
        });
    }

    final /* synthetic */ void e() {
        this.f14350c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tt1
            @Override // java.lang.Runnable
            public final void run() {
                xt1.this.d();
            }
        });
    }
}
