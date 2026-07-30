package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Un, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2815Un {

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f28080b;

    /* renamed from: c, reason: collision with root package name */
    public final SD f28081c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28082d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f28083e;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f28079a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f28084f = new AtomicBoolean(false);

    public C2815Un(SD sd) {
        this.f28081c = sd;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f28082d = true;
            C2841Wf n9 = p2.j.f39798C.f39808h.g().n();
            if (n9 != null && (jSONObject = n9.f28425g) != null) {
                this.f28080b = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31583W4)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f28083e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                ConcurrentHashMap concurrentHashMap = this.f28079a;
                                if (concurrentHashMap.containsKey(optString2)) {
                                    map = (Map) concurrentHashMap.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                    concurrentHashMap.put(optString2, concurrentHashMap2);
                                    map = concurrentHashMap2;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}
