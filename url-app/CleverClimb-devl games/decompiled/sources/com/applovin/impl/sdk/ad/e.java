package com.applovin.impl.sdk.ad;

import com.applovin.impl.sdk.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f2970a;

    /* renamed from: b, reason: collision with root package name */
    private final p f2971b;
    private volatile boolean e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2973d = new Object();

    /* renamed from: c, reason: collision with root package name */
    private LinkedHashSet<d> f2972c = c();

    public e(com.applovin.impl.sdk.j jVar) {
        this.f2970a = jVar;
        this.f2971b = jVar.u();
    }

    private LinkedHashSet<d> b(JSONArray jSONArray) {
        LinkedHashSet<d> linkedHashSet = new LinkedHashSet<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject a2 = com.applovin.impl.sdk.e.f.a(jSONArray, i, (JSONObject) null, this.f2970a);
            this.f2971b.a("AdZoneManager", "Loading zone: " + com.applovin.impl.sdk.e.f.a(a2, this.f2970a) + "...");
            linkedHashSet.add(d.a(com.applovin.impl.sdk.e.f.a(a2, "id", (String) null, this.f2970a), a2, this.f2970a));
        }
        return linkedHashSet;
    }

    private LinkedHashSet<d> c() {
        LinkedHashSet<d> linkedHashSet = new LinkedHashSet<>();
        try {
            try {
                String str = (String) this.f2970a.a(com.applovin.impl.sdk.b.d.l);
                if (com.applovin.impl.sdk.e.i.b(str)) {
                    JSONArray jSONArray = new JSONArray(str);
                    if (jSONArray.length() > 0) {
                        linkedHashSet = b(jSONArray);
                    } else {
                        this.f2971b.a("AdZoneManager", "Unable to inflate json string: " + str);
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    this.f2971b.a("AdZoneManager", "Retrieved persisted zones: " + linkedHashSet);
                    Iterator<d> it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        it.next().a(this.f2970a);
                    }
                }
            } catch (Throwable th) {
                this.f2971b.b("AdZoneManager", "Encountered error retrieving persisted zones", th);
                if (!linkedHashSet.isEmpty()) {
                    this.f2971b.a("AdZoneManager", "Retrieved persisted zones: " + linkedHashSet);
                    Iterator<d> it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(this.f2970a);
                    }
                }
            }
            return linkedHashSet;
        } catch (Throwable th2) {
            if (!linkedHashSet.isEmpty()) {
                this.f2971b.a("AdZoneManager", "Retrieved persisted zones: " + linkedHashSet);
                Iterator<d> it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    it3.next().a(this.f2970a);
                }
            }
            throw th2;
        }
    }

    private void c(JSONArray jSONArray) {
        if (((Boolean) this.f2970a.a(com.applovin.impl.sdk.b.b.dY)).booleanValue()) {
            this.f2971b.a("AdZoneManager", "Persisting zones...");
            this.f2970a.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<String>>) com.applovin.impl.sdk.b.d.l, (com.applovin.impl.sdk.b.d<String>) jSONArray.toString());
        }
    }

    public LinkedHashSet<d> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new LinkedHashSet<>();
        }
        LinkedHashSet<d> linkedHashSet = new LinkedHashSet<>(jSONArray.length());
        LinkedHashSet<d> linkedHashSet2 = null;
        synchronized (this.f2973d) {
            if (!this.e) {
                this.f2971b.a("AdZoneManager", "Found " + jSONArray.length() + " zone(s)...");
                linkedHashSet2 = b(jSONArray);
                linkedHashSet = new LinkedHashSet<>(linkedHashSet2);
                linkedHashSet.removeAll(this.f2972c);
                this.f2972c = linkedHashSet2;
                this.e = true;
            }
        }
        if (linkedHashSet2 != null) {
            c(jSONArray);
            this.f2971b.a("AdZoneManager", "Finished loading zones");
        }
        return linkedHashSet;
    }

    public boolean a() {
        return this.e;
    }

    public boolean a(d dVar) {
        boolean contains;
        synchronized (this.f2973d) {
            contains = this.f2972c.contains(dVar);
        }
        return contains;
    }

    public LinkedHashSet<d> b() {
        LinkedHashSet<d> linkedHashSet;
        synchronized (this.f2973d) {
            linkedHashSet = this.f2972c;
        }
        return linkedHashSet;
    }
}
