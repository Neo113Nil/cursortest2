package com.applovin.impl.sdk.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f3054a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f3055b = new HashMap();

    public h(com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3054a = jVar;
    }

    private void e() {
        try {
            this.f3054a.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<String>>) com.applovin.impl.sdk.b.d.h, (com.applovin.impl.sdk.b.d<String>) c().toString());
        } catch (Throwable th) {
            this.f3054a.u().b("GlobalStatsManager", "Unable to save stats", th);
        }
    }

    public long a(g gVar) {
        return a(gVar, 1L);
    }

    long a(g gVar, long j) {
        long longValue;
        synchronized (this.f3055b) {
            Long l = this.f3055b.get(gVar.a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue() + j;
            this.f3055b.put(gVar.a(), Long.valueOf(longValue));
        }
        e();
        return longValue;
    }

    public void a() {
        synchronized (this.f3055b) {
            this.f3055b.clear();
        }
        e();
    }

    public long b(g gVar) {
        long longValue;
        synchronized (this.f3055b) {
            Long l = this.f3055b.get(gVar.a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue();
        }
        return longValue;
    }

    public void b() {
        synchronized (this.f3055b) {
            Iterator<g> it = g.b().iterator();
            while (it.hasNext()) {
                this.f3055b.remove(it.next().a());
            }
            e();
        }
    }

    public void b(g gVar, long j) {
        synchronized (this.f3055b) {
            this.f3055b.put(gVar.a(), Long.valueOf(j));
        }
        e();
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject;
        synchronized (this.f3055b) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, Long> entry : this.f3055b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public void c(g gVar) {
        synchronized (this.f3055b) {
            this.f3055b.remove(gVar.a());
        }
        e();
    }

    public void d() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f3054a.b(com.applovin.impl.sdk.b.d.h, "{}"));
            synchronized (this.f3055b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f3055b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f3054a.u().b("GlobalStatsManager", "Unable to load stats", th);
        }
    }
}
