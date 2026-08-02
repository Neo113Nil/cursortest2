package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class We extends AbstractC1105yd implements Bo {

    /* renamed from: d, reason: collision with root package name */
    public static final long f11174d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11175e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final String f11176f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final String f11177g = "";

    /* renamed from: r, reason: collision with root package name */
    public static final String f11186r = "SESSION_";

    /* renamed from: h, reason: collision with root package name */
    public static final Ye f11178h = new Ye("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final Ye f11179i = new Ye("PROFILE_ID", null);

    /* renamed from: j, reason: collision with root package name */
    public static final Ye f11180j = new Ye("APP_ENVIRONMENT", null);

    /* renamed from: k, reason: collision with root package name */
    public static final Ye f11181k = new Ye("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Ye f11182l = new Ye("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m, reason: collision with root package name */
    public static final Ye f11183m = new Ye("APPLICATION_FEATURES", null);
    public static final Ye n = new Ye("CERTIFICATES_SHA1_FINGERPRINTS", null);
    public static final Ye o = new Ye("VITAL_DATA", null);

    /* renamed from: p, reason: collision with root package name */
    public static final Ye f11184p = new Ye("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q, reason: collision with root package name */
    public static final Ye f11185q = new Ye("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* renamed from: s, reason: collision with root package name */
    public static final Ye f11187s = new Ye("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public We(Ha ha) {
        super(ha);
    }

    public final We a(C0678i0 c0678i0) {
        synchronized (this) {
            b(f11180j.f11306b, c0678i0.f12011a);
            b(f11181k.f11306b, c0678i0.f12012b);
        }
        return this;
    }

    public final void b(boolean z) {
        b(f11187s.f11306b, z);
    }

    @Override // io.appmetrica.analytics.impl.Xe
    public final Set<String> c() {
        return this.f11265a.a();
    }

    public final C0678i0 d() {
        C0678i0 c0678i0;
        synchronized (this) {
            c0678i0 = new C0678i0(this.f11265a.getString(f11180j.f11306b, "{}"), this.f11265a.getLong(f11181k.f11306b, 0L));
        }
        return c0678i0;
    }

    public final String e() {
        return this.f11265a.getString(f11183m.f11306b, "");
    }

    public final Map<String, Long> f() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f11265a.getString(f11185q.f11306b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final List<String> g() {
        String str = n.f11306b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.f11265a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    strArr[i4] = jSONArray.optString(i4);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int h() {
        return this.f11265a.getInt(f11182l.f11306b, -1);
    }

    public final long i() {
        return this.f11265a.getLong(f11178h.f11306b, 0L);
    }

    public final String j() {
        return this.f11265a.getString(f11179i.f11306b, null);
    }

    public final Map<Integer, String> k() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f11265a.getString(f11184p.f11306b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final void b(Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f11184p.f11306b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.f11265a.getString(new Ye(f11186r, str).f11306b, "");
    }

    public final We i(String str) {
        return (We) b(f11183m.f11306b, str);
    }

    public final We j(String str) {
        return (We) b(f11179i.f11306b, str);
    }

    public final We e(String str, String str2) {
        return (We) b(new Ye(f11186r, str).f11306b, str2);
    }

    public final We a(long j4) {
        return (We) b(f11178h.f11306b, j4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1105yd
    public final String f(String str) {
        return new Ye(str, null).f11306b;
    }

    public final We a(int i4) {
        return (We) b(f11182l.f11306b, i4);
    }

    public final We a(List<String> list) {
        return (We) a(n.f11306b, list);
    }

    public final boolean a(boolean z) {
        return this.f11265a.getBoolean(f11187s.f11306b, z);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        return this.f11265a.getString(o.f11306b, null);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(String str) {
        b(o.f11306b, str);
    }

    public final void a(Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f11185q.f11306b, jSONObject.toString());
    }
}
