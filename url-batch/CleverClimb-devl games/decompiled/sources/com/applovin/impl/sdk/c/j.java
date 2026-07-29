package com.applovin.impl.sdk.c;

import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f3060a;

    /* renamed from: b, reason: collision with root package name */
    private final p f3061b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3062c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, b> f3063d = new HashMap();

    private static class a {
        private static final Set<String> h = new HashSet(7);

        /* renamed from: a, reason: collision with root package name */
        static final String f3064a = a("tk");

        /* renamed from: b, reason: collision with root package name */
        static final String f3065b = a("tc");

        /* renamed from: c, reason: collision with root package name */
        static final String f3066c = a("ec");

        /* renamed from: d, reason: collision with root package name */
        static final String f3067d = a("dm");
        static final String e = a("dv");
        static final String f = a("dh");
        static final String g = a("dl");

        private static String a(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("No key name specified");
            }
            if (!h.contains(str)) {
                h.add(str);
                return str;
            }
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f3068a;

        /* renamed from: b, reason: collision with root package name */
        private int f3069b;

        /* renamed from: c, reason: collision with root package name */
        private int f3070c;

        /* renamed from: d, reason: collision with root package name */
        private double f3071d;
        private double e;
        private Long f;
        private Long g;

        b(String str) {
            this.f3069b = 0;
            this.f3070c = 0;
            this.f3071d = 0.0d;
            this.e = 0.0d;
            this.f = null;
            this.g = null;
            this.f3068a = str;
        }

        b(JSONObject jSONObject) throws JSONException {
            this.f3069b = 0;
            this.f3070c = 0;
            this.f3071d = 0.0d;
            this.e = 0.0d;
            this.f = null;
            this.g = null;
            this.f3068a = jSONObject.getString(a.f3064a);
            this.f3069b = jSONObject.getInt(a.f3065b);
            this.f3070c = jSONObject.getInt(a.f3066c);
            this.f3071d = jSONObject.getDouble(a.f3067d);
            this.e = jSONObject.getDouble(a.e);
            this.f = Long.valueOf(jSONObject.optLong(a.f));
            this.g = Long.valueOf(jSONObject.optLong(a.g));
        }

        String a() {
            return this.f3068a;
        }

        void a(long j) {
            int i = this.f3069b;
            double d2 = this.f3071d;
            double d3 = this.e;
            this.f3069b++;
            double d4 = i;
            Double.isNaN(d4);
            double d5 = j;
            Double.isNaN(d5);
            double d6 = this.f3069b;
            Double.isNaN(d6);
            this.f3071d = ((d2 * d4) + d5) / d6;
            double d7 = this.f3069b;
            Double.isNaN(d4);
            Double.isNaN(d7);
            double d8 = d4 / d7;
            Double.isNaN(d5);
            double pow = Math.pow(d2 - d5, 2.0d);
            double d9 = this.f3069b;
            Double.isNaN(d9);
            this.e = d8 * (d3 + (pow / d9));
            if (this.f == null || j > this.f.longValue()) {
                this.f = Long.valueOf(j);
            }
            if (this.g == null || j < this.g.longValue()) {
                this.g = Long.valueOf(j);
            }
        }

        void b() {
            this.f3070c++;
        }

        JSONObject c() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(a.f3064a, this.f3068a);
            jSONObject.put(a.f3065b, this.f3069b);
            jSONObject.put(a.f3066c, this.f3070c);
            jSONObject.put(a.f3067d, this.f3071d);
            jSONObject.put(a.e, this.e);
            jSONObject.put(a.f, this.f);
            jSONObject.put(a.g, this.g);
            return jSONObject;
        }

        public String toString() {
            try {
                return "[TaskStats n=" + this.f3068a + ", stats=" + c().toString() + "]";
            } catch (JSONException unused) {
                return "[TaskStats n=" + this.f3068a + ", count=" + this.f3069b + "]";
            }
        }
    }

    public j(com.applovin.impl.sdk.j jVar) {
        this.f3060a = jVar;
        this.f3061b = jVar.u();
        c();
    }

    private b b(i iVar) {
        b bVar;
        synchronized (this.f3062c) {
            String a2 = iVar.a();
            bVar = this.f3063d.get(a2);
            if (bVar == null) {
                bVar = new b(a2);
                this.f3063d.put(a2, bVar);
            }
        }
        return bVar;
    }

    private void c() {
        Set set = (Set) this.f3060a.a(com.applovin.impl.sdk.b.d.j);
        if (set != null) {
            synchronized (this.f3062c) {
                try {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        b bVar = new b(new JSONObject((String) it.next()));
                        this.f3063d.put(bVar.a(), bVar);
                    }
                } catch (JSONException e) {
                    this.f3061b.b("TaskStatsManager", "Failed to convert stats json.", e);
                }
            }
        }
    }

    private void d() {
        HashSet hashSet;
        synchronized (this.f3062c) {
            hashSet = new HashSet(this.f3063d.size());
            for (b bVar : this.f3063d.values()) {
                try {
                    hashSet.add(bVar.c().toString());
                } catch (JSONException e) {
                    this.f3061b.b("TaskStatsManager", "Failed to serialize " + bVar, e);
                }
            }
        }
        this.f3060a.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<HashSet>>) com.applovin.impl.sdk.b.d.j, (com.applovin.impl.sdk.b.d<HashSet>) hashSet);
    }

    public JSONArray a() {
        JSONArray jSONArray;
        synchronized (this.f3062c) {
            jSONArray = new JSONArray();
            for (b bVar : this.f3063d.values()) {
                try {
                    jSONArray.put(bVar.c());
                } catch (JSONException e) {
                    this.f3061b.b("TaskStatsManager", "Failed to serialize " + bVar, e);
                }
            }
        }
        return jSONArray;
    }

    public void a(i iVar) {
        a(iVar, false, 0L);
    }

    public void a(i iVar, long j) {
        if (iVar == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (((Boolean) this.f3060a.a(com.applovin.impl.sdk.b.b.eF)).booleanValue()) {
            synchronized (this.f3062c) {
                b(iVar).a(j);
                d();
            }
        }
    }

    public void a(i iVar, boolean z, long j) {
        if (iVar == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (((Boolean) this.f3060a.a(com.applovin.impl.sdk.b.b.eF)).booleanValue()) {
            synchronized (this.f3062c) {
                b b2 = b(iVar);
                b2.b();
                if (z) {
                    b2.a(j);
                }
                d();
            }
        }
    }

    public void b() {
        synchronized (this.f3062c) {
            this.f3063d.clear();
            this.f3060a.b(com.applovin.impl.sdk.b.d.j);
        }
    }
}
