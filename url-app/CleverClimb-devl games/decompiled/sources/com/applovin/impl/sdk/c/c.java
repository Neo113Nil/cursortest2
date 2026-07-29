package com.applovin.impl.sdk.c;

import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.d.w;
import com.applovin.impl.sdk.p;
import com.google.android.gms.common.stats.LoggingConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f3024a;

    /* renamed from: b, reason: collision with root package name */
    private final p f3025b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3026c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final b f3027d = new b();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3029a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3030b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3031c;

        /* renamed from: d, reason: collision with root package name */
        private final long f3032d;
        private final Map<String, Long> e;

        private a(String str, String str2, String str3) {
            this.e = new HashMap();
            this.f3029a = str;
            this.f3030b = str2;
            this.f3031c = str3;
            this.f3032d = System.currentTimeMillis();
        }

        private JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pk", this.f3029a);
            jSONObject.put("ts", this.f3032d);
            if (!TextUtils.isEmpty(this.f3030b)) {
                jSONObject.put("sk1", this.f3030b);
            }
            if (!TextUtils.isEmpty(this.f3031c)) {
                jSONObject.put("sk2", this.f3031c);
            }
            for (Map.Entry<String, Long> entry : this.e.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() throws JSONException {
            return a().toString();
        }

        void a(String str, long j) {
            this.e.put(str, Long.valueOf(j));
        }

        public String toString() {
            return "[AdEventStats pk: " + this.f3029a + ", size: " + this.e.size() + "]";
        }
    }

    private class b extends LinkedHashMap<String, a> {
        private b() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, a> entry) {
            return size() > ((Integer) c.this.f3024a.a(com.applovin.impl.sdk.b.b.eE)).intValue();
        }
    }

    public c(com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3024a = jVar;
        this.f3025b = jVar.u();
    }

    private a a(AppLovinAdBase appLovinAdBase) {
        a aVar;
        synchronized (this.f3026c) {
            String primaryKey = appLovinAdBase.getPrimaryKey();
            aVar = this.f3027d.get(primaryKey);
            if (aVar == null) {
                aVar = new a(primaryKey, appLovinAdBase.getSecondaryKey1(), appLovinAdBase.getSecondaryKey2());
                this.f3027d.put(primaryKey, aVar);
            }
        }
        return aVar;
    }

    private void a(JSONObject jSONObject) {
        w<JSONObject> wVar = new w<JSONObject>(com.applovin.impl.sdk.network.b.a(this.f3024a).a(c()).c(d()).a(com.applovin.impl.sdk.e.e.c(this.f3024a)).b("POST").a(jSONObject).b(((Integer) this.f3024a.a(com.applovin.impl.sdk.b.b.eC)).intValue()).a(((Integer) this.f3024a.a(com.applovin.impl.sdk.b.b.eD)).intValue()).a(), this.f3024a) { // from class: com.applovin.impl.sdk.c.c.1
            @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
            public void a(int i) {
                c.this.f3025b.d("AdEventStatsManager", "Failed to submitted ad stats: " + i);
            }

            @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
            public void a(JSONObject jSONObject2, int i) {
                c.this.f3025b.a("AdEventStatsManager", "Ad stats submitted: " + i);
            }
        };
        wVar.a(com.applovin.impl.sdk.b.b.ay);
        wVar.b(com.applovin.impl.sdk.b.b.az);
        this.f3024a.C().a(wVar, q.a.BACKGROUND);
    }

    private String c() {
        return com.applovin.impl.sdk.e.e.a("2.0/s", this.f3024a);
    }

    private String d() {
        return com.applovin.impl.sdk.e.e.b("2.0/s", this.f3024a);
    }

    private void e() {
        HashSet hashSet;
        synchronized (this.f3026c) {
            hashSet = new HashSet(this.f3027d.size());
            for (a aVar : this.f3027d.values()) {
                try {
                    String b2 = aVar.b();
                    if (b2 != null) {
                        hashSet.add(b2);
                    }
                } catch (JSONException e) {
                    this.f3025b.b("AdEventStatsManager", "Failed to serialize " + aVar, e);
                }
            }
        }
        this.f3024a.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<HashSet>>) com.applovin.impl.sdk.b.d.m, (com.applovin.impl.sdk.b.d<HashSet>) hashSet);
    }

    public void a() {
        if (((Boolean) this.f3024a.a(com.applovin.impl.sdk.b.b.eB)).booleanValue()) {
            Set<String> set = (Set) this.f3024a.b(com.applovin.impl.sdk.b.d.m, new HashSet(0));
            this.f3024a.b(com.applovin.impl.sdk.b.d.m);
            if (set == null || set.isEmpty()) {
                this.f3025b.a("AdEventStatsManager", "No serialized ad events found");
                return;
            }
            this.f3025b.a("AdEventStatsManager", "De-serializing " + set.size() + " stat ad events");
            JSONArray jSONArray = new JSONArray();
            for (String str : set) {
                try {
                    jSONArray.put(new JSONObject(str));
                } catch (JSONException e) {
                    this.f3025b.b("AdEventStatsManager", "Failed to parse: " + str, e);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LoggingConstants.LOG_FILE_PREFIX, jSONArray);
                a(jSONObject);
            } catch (JSONException e2) {
                this.f3025b.b("AdEventStatsManager", "Failed to create stats to submit", e2);
            }
        }
    }

    public void a(com.applovin.impl.sdk.c.b bVar, long j, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (((Boolean) this.f3024a.a(com.applovin.impl.sdk.b.b.eB)).booleanValue()) {
            synchronized (this.f3026c) {
                a(appLovinAdBase).a(bVar.a(), j);
            }
            e();
        }
    }

    public void b() {
        synchronized (this.f3026c) {
            this.f3027d.clear();
        }
    }
}
