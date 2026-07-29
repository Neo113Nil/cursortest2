package com.applovin.impl.sdk.c;

import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f3044c;

    /* renamed from: d, reason: collision with root package name */
    private final p f3045d;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3043b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f3042a = new ArrayList();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Long f3046a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3047b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3048c;

        /* renamed from: d, reason: collision with root package name */
        private final String f3049d;

        private a(String str, Throwable th) {
            this.f3047b = str;
            this.f3046a = Long.valueOf(System.currentTimeMillis());
            this.f3048c = th != null ? th.getClass().getName() : null;
            this.f3049d = th != null ? th.getMessage() : null;
        }

        private a(JSONObject jSONObject) throws JSONException {
            this.f3047b = jSONObject.getString("ms");
            this.f3046a = Long.valueOf(jSONObject.getLong("ts"));
            JSONObject optJSONObject = jSONObject.optJSONObject("ex");
            this.f3048c = optJSONObject != null ? optJSONObject.getString("nm") : null;
            this.f3049d = optJSONObject != null ? optJSONObject.getString("rn") : null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", this.f3047b);
            jSONObject.put("ts", this.f3046a);
            if (!TextUtils.isEmpty(this.f3048c)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("nm", this.f3048c);
                if (!TextUtils.isEmpty(this.f3049d)) {
                    jSONObject2.put("rn", this.f3049d);
                }
                jSONObject.put("ex", jSONObject2);
            }
            return jSONObject;
        }

        public String toString() {
            return "ErrorLog{timestampMillis=" + this.f3046a + ",message='" + this.f3047b + "',throwableName='" + this.f3048c + "',throwableReason='" + this.f3049d + "'}";
        }
    }

    public f(com.applovin.impl.sdk.j jVar) {
        this.f3044c = jVar;
        this.f3045d = jVar.u();
    }

    private void d() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f3043b) {
            for (a aVar : this.f3042a) {
                try {
                    jSONArray.put(aVar.a());
                } catch (JSONException e) {
                    this.f3045d.a("ErrorManager", false, "Failed to convert error log into json.", e);
                    this.f3042a.remove(aVar);
                }
            }
        }
        this.f3044c.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<String>>) com.applovin.impl.sdk.b.d.i, (com.applovin.impl.sdk.b.d<String>) jSONArray.toString());
    }

    public JSONArray a() {
        JSONArray jSONArray;
        synchronized (this.f3043b) {
            jSONArray = new JSONArray();
            Iterator<a> it = this.f3042a.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(it.next().a());
                } catch (JSONException e) {
                    this.f3045d.a("ErrorManager", false, "Failed to convert error log into json.", e);
                }
            }
        }
        return jSONArray;
    }

    public void a(String str, Throwable th) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f3043b) {
            if (this.f3042a.size() >= ((Integer) this.f3044c.a(com.applovin.impl.sdk.b.b.eH)).intValue()) {
                return;
            }
            this.f3042a.add(new a(str, th));
            d();
        }
    }

    public void b() {
        String str = (String) this.f3044c.b(com.applovin.impl.sdk.b.d.i, null);
        if (str != null) {
            synchronized (this.f3043b) {
                try {
                    this.f3042a.clear();
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            this.f3042a.add(new a(jSONArray.getJSONObject(i)));
                        } catch (JSONException e) {
                            this.f3045d.a("ErrorManager", false, "Failed to convert error json into a log.", e);
                        }
                    }
                } catch (JSONException e2) {
                    this.f3045d.b("ErrorManager", "Unable to convert String to json.", e2);
                }
            }
        }
    }

    public void c() {
        synchronized (this.f3043b) {
            this.f3042a.clear();
            this.f3044c.b(com.applovin.impl.sdk.b.d.i);
        }
    }
}
