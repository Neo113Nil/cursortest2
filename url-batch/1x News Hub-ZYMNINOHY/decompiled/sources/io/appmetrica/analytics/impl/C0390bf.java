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

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390bf extends Fd implements Do {

    /* renamed from: d, reason: collision with root package name */
    public static final long f7077d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7078e = -1;
    public static final String f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final String f7079g = "";

    /* renamed from: r, reason: collision with root package name */
    public static final String f7089r = "SESSION_";

    /* renamed from: h, reason: collision with root package name */
    public static final C0442df f7080h = new C0442df("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0442df f7081i = new C0442df("PROFILE_ID", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C0442df f7082j = new C0442df("APP_ENVIRONMENT", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C0442df f7083k = new C0442df("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C0442df f7084l = new C0442df("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C0442df f7085m = new C0442df("APPLICATION_FEATURES", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C0442df f7086n = new C0442df("CERTIFICATES_SHA1_FINGERPRINTS", null);
    public static final C0442df o = new C0442df("VITAL_DATA", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C0442df f7087p = new C0442df("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C0442df f7088q = new C0442df("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C0442df f7090s = new C0442df("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public C0390bf(Oa oa) {
        super(oa);
    }

    public final C0390bf a(C0556i0 c0556i0) {
        synchronized (this) {
            b(f7082j.f7185b, c0556i0.f7491a);
            b(f7083k.f7185b, c0556i0.f7492b);
        }
        return this;
    }

    public final void b(boolean z) {
        b(f7090s.f7185b, z);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0416cf
    public final Set<String> c() {
        return this.f7142a.a();
    }

    public final C0556i0 d() {
        C0556i0 c0556i0;
        synchronized (this) {
            c0556i0 = new C0556i0(this.f7142a.getString(f7082j.f7185b, "{}"), this.f7142a.getLong(f7083k.f7185b, 0L));
        }
        return c0556i0;
    }

    public final String e() {
        return this.f7142a.getString(f7085m.f7185b, "");
    }

    public final Map<String, Long> f() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f7142a.getString(f7088q.f7185b, null);
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
        String str = f7086n.f7185b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.f7142a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    strArr[i3] = jSONArray.optString(i3);
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
        return this.f7142a.getInt(f7084l.f7185b, -1);
    }

    public final long i() {
        return this.f7142a.getLong(f7080h.f7185b, 0L);
    }

    public final String j() {
        return this.f7142a.getString(f7081i.f7185b, null);
    }

    public final Map<Integer, String> k() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f7142a.getString(f7087p.f7185b, null);
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
        b(f7087p.f7185b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.f7142a.getString(new C0442df(f7089r, str).f7185b, "");
    }

    public final C0390bf i(String str) {
        return (C0390bf) b(f7085m.f7185b, str);
    }

    public final C0390bf j(String str) {
        return (C0390bf) b(f7081i.f7185b, str);
    }

    public final C0390bf e(String str, String str2) {
        return (C0390bf) b(new C0442df(f7089r, str).f7185b, str2);
    }

    public final C0390bf a(long j3) {
        return (C0390bf) b(f7080h.f7185b, j3);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    public final String f(String str) {
        return new C0442df(str, null).f7185b;
    }

    public final C0390bf a(int i3) {
        return (C0390bf) b(f7084l.f7185b, i3);
    }

    public final C0390bf a(List<String> list) {
        return (C0390bf) a(f7086n.f7185b, list);
    }

    public final boolean a(boolean z) {
        return this.f7142a.getBoolean(f7090s.f7185b, z);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        return this.f7142a.getString(o.f7185b, null);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String str) {
        b(o.f7185b, str);
    }

    public final void a(Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f7088q.f7185b, jSONObject.toString());
    }
}
