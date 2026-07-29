package com.applovin.impl.mediation.a;

import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.j;
import com.applovin.sdk.AppLovinPrivacySettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f2659a;

    /* renamed from: b, reason: collision with root package name */
    protected final j f2660b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f2661c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2662d = new Object();
    private final Object e = new Object();

    public e(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No spec object specified");
        }
        this.f2660b = jVar;
        this.f2659a = jSONObject2;
        this.f2661c = jSONObject;
    }

    private List<String> a(List<String> list, Map<String, String> map) {
        this.f2660b.u().a("MediationAdapterSpec", "Replacing postback macros for postbacks: " + list);
        Map<String, String> a2 = a();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (String str : a2.keySet()) {
                next = next.replace(str, g(a2.get(str)));
            }
            for (String str2 : map.keySet()) {
                next = next.replace(str2, map.get(str2));
            }
            arrayList.add(next);
        }
        this.f2660b.u().a("MediationAdapterSpec", "Finished replacing macros for postbacks: " + arrayList);
        return arrayList;
    }

    private Map<String, String> a() {
        try {
            return com.applovin.impl.sdk.e.f.a(new JSONObject((String) this.f2660b.a(com.applovin.impl.sdk.b.a.h)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List<String> e(String str) {
        try {
            return com.applovin.impl.sdk.e.f.b(a(str, new JSONArray()));
        } catch (JSONException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private List<String> f(String str) {
        try {
            return com.applovin.impl.sdk.e.f.b(b(str, new JSONArray()));
        } catch (JSONException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private String g(String str) {
        String b2 = b(str, "");
        return i.b(b2) ? b2 : a(str, "");
    }

    public long A() {
        long b2 = b("ad_refresh_ms", -1L);
        return b2 >= 0 ? b2 : a("ad_refresh_ms", ((Long) this.f2660b.a(com.applovin.impl.sdk.b.a.u)).longValue());
    }

    public long B() {
        long b2 = b("fullscreen_display_delay_ms", -1L);
        return b2 >= 0 ? b2 : ((Long) this.f2660b.a(com.applovin.impl.sdk.b.a.C)).longValue();
    }

    public long C() {
        long b2 = b("init_completion_delay_ms", -1L);
        return b2 >= 0 ? b2 : ((Long) this.f2660b.a(com.applovin.impl.sdk.b.a.o)).longValue();
    }

    protected float a(String str, float f) {
        float a2;
        synchronized (this.f2662d) {
            a2 = com.applovin.impl.sdk.e.f.a(this.f2661c, str, f, this.f2660b);
        }
        return a2;
    }

    protected int a(String str, int i) {
        int a2;
        synchronized (this.f2662d) {
            a2 = com.applovin.impl.sdk.e.f.a(this.f2661c, str, i, this.f2660b);
        }
        return a2;
    }

    protected long a(String str, long j) {
        long a2;
        synchronized (this.e) {
            a2 = com.applovin.impl.sdk.e.f.a(this.f2659a, str, j, this.f2660b);
        }
        return a2;
    }

    protected String a(String str, String str2) {
        String a2;
        synchronized (this.e) {
            a2 = com.applovin.impl.sdk.e.f.a(this.f2659a, str, str2, this.f2660b);
        }
        return a2;
    }

    public List<String> a(String str, Map<String, String> map) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (b(str)) {
            return a(f(str), map);
        }
        return null;
    }

    protected JSONArray a(String str, JSONArray jSONArray) {
        JSONArray a2;
        synchronized (this.e) {
            a2 = com.applovin.impl.sdk.e.f.a(this.f2659a, str, jSONArray, this.f2660b);
        }
        return a2;
    }

    protected JSONObject a(String str, JSONObject jSONObject) {
        JSONObject a2;
        synchronized (this.f2662d) {
            a2 = com.applovin.impl.sdk.e.f.a(this.f2661c, str, jSONObject, this.f2660b);
        }
        return a2;
    }

    public boolean a(Context context) {
        return b("huc") ? b("huc", (Boolean) false) : a("huc", Boolean.valueOf(AppLovinPrivacySettings.hasUserConsent(context)));
    }

    protected boolean a(String str) {
        boolean has;
        synchronized (this.e) {
            has = this.f2659a.has(str);
        }
        return has;
    }

    protected boolean a(String str, Boolean bool) {
        boolean booleanValue;
        synchronized (this.e) {
            booleanValue = com.applovin.impl.sdk.e.f.a(this.f2659a, str, bool, this.f2660b).booleanValue();
        }
        return booleanValue;
    }

    protected long b(String str, long j) {
        long a2;
        synchronized (this.f2662d) {
            a2 = com.applovin.impl.sdk.e.f.a(this.f2661c, str, j, this.f2660b);
        }
        return a2;
    }

    protected String b(String str, String str2) {
        String a2;
        synchronized (this.f2662d) {
            a2 = com.applovin.impl.sdk.e.f.a(this.f2661c, str, str2, this.f2660b);
        }
        return a2;
    }

    public List<String> b(String str, Map<String, String> map) {
        List<String> f;
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        boolean a2 = a(str);
        boolean b2 = b(str);
        if (!a2 && !b2) {
            return null;
        }
        if (b2 && a2) {
            if (!d(str)) {
                List<String> f2 = f(str);
                f = e(str);
                f.addAll(f2);
            }
            f = e(str);
        } else {
            if (b2) {
                f = f(str);
            }
            f = e(str);
        }
        return a(f, map);
    }

    protected JSONArray b(String str, JSONArray jSONArray) {
        JSONArray a2;
        synchronized (this.f2662d) {
            a2 = com.applovin.impl.sdk.e.f.a(this.f2661c, str, jSONArray, this.f2660b);
        }
        return a2;
    }

    public boolean b(Context context) {
        return b("aru") ? b("aru", (Boolean) false) : a("aru", Boolean.valueOf(AppLovinPrivacySettings.isAgeRestrictedUser(context)));
    }

    protected boolean b(String str) {
        boolean has;
        synchronized (this.f2662d) {
            has = this.f2661c.has(str);
        }
        return has;
    }

    protected boolean b(String str, Boolean bool) {
        boolean booleanValue;
        synchronized (this.f2662d) {
            booleanValue = com.applovin.impl.sdk.e.f.a(this.f2661c, str, bool, this.f2660b).booleanValue();
        }
        return booleanValue;
    }

    protected Object c(String str) {
        Object opt;
        synchronized (this.f2662d) {
            opt = this.f2661c.opt(str);
        }
        return opt;
    }

    protected void c(String str, long j) {
        synchronized (this.f2662d) {
            com.applovin.impl.sdk.e.f.b(this.f2661c, str, j, this.f2660b);
        }
    }

    public boolean d(String str) {
        return a("fire_in_succession_" + str, (Boolean) true);
    }

    protected JSONObject r() {
        JSONObject jSONObject;
        synchronized (this.e) {
            jSONObject = this.f2659a;
        }
        return jSONObject;
    }

    protected JSONObject s() {
        JSONObject jSONObject;
        synchronized (this.f2662d) {
            jSONObject = this.f2661c;
        }
        return jSONObject;
    }

    public String t() {
        return b("class", (String) null);
    }

    public String toString() {
        return "[MediationAdapterSpec, specObject=" + s() + "fullResponse=" + r() + "]";
    }

    public String u() {
        return b("name", (String) null);
    }

    public boolean v() {
        return b("is_testing") ? b("is_testing", (Boolean) false) : a("is_testing", (Boolean) this.f2660b.a(com.applovin.impl.sdk.b.a.D));
    }

    public boolean w() {
        return b("run_on_ui_thread", (Boolean) this.f2660b.a(com.applovin.impl.sdk.b.a.q));
    }

    public Bundle x() {
        JSONObject a2;
        return (!(c("server_parameters") instanceof JSONObject) || (a2 = a("server_parameters", (JSONObject) null)) == null) ? Bundle.EMPTY : com.applovin.impl.sdk.e.f.b(a2);
    }

    public long y() {
        return b("adapter_timeout_ms", ((Long) this.f2660b.a(com.applovin.impl.sdk.b.a.r)).longValue());
    }

    public boolean z() {
        return A() >= 0;
    }
}
