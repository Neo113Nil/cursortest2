package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2756kf extends Nd implements InterfaceC3128yo {

    /* renamed from: d, reason: collision with root package name */
    public static final long f39336d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f39337e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final String f39338f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final String f39339g = "";

    /* renamed from: q, reason: collision with root package name */
    public static final String f39349q = "SESSION_";

    /* renamed from: h, reason: collision with root package name */
    public static final C2808mf f39340h = new C2808mf("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C2808mf f39341i = new C2808mf("PROFILE_ID", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C2808mf f39342j = new C2808mf("APP_ENVIRONMENT", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C2808mf f39343k = new C2808mf("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C2808mf f39344l = new C2808mf("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C2808mf f39345m = new C2808mf("APPLICATION_FEATURES", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C2808mf f39346n = new C2808mf("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C2808mf f39347o = new C2808mf("VITAL_DATA", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C2808mf f39348p = new C2808mf("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C2808mf f39350r = new C2808mf("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public C2756kf(InterfaceC2542cb interfaceC2542cb) {
        super(interfaceC2542cb);
    }

    public final C2756kf a(C2638g0 c2638g0) {
        synchronized (this) {
            b(f39342j.f39447b, c2638g0.f39022a);
            b(f39343k.f39447b, c2638g0.f39023b);
        }
        return this;
    }

    public final void b(boolean z4) {
        b(f39350r.f39447b, z4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2782lf
    @NonNull
    public final Set<String> c() {
        return this.f39400a.a();
    }

    public final C2638g0 d() {
        C2638g0 c2638g0;
        synchronized (this) {
            c2638g0 = new C2638g0(this.f39400a.getString(f39342j.f39447b, "{}"), this.f39400a.getLong(f39343k.f39447b, 0L));
        }
        return c2638g0;
    }

    public final String e() {
        return this.f39400a.getString(f39345m.f39447b, "");
    }

    @NonNull
    public final List<String> f() {
        String str = f39346n.f39447b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.f39400a.getString(str, null);
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

    public final int g() {
        return this.f39400a.getInt(f39344l.f39447b, -1);
    }

    public final long h() {
        return this.f39400a.getLong(f39340h.f39447b, 0L);
    }

    public final C2756kf i(String str) {
        return (C2756kf) b(f39345m.f39447b, str);
    }

    public final C2756kf j(String str) {
        return (C2756kf) b(f39341i.f39447b, str);
    }

    public final String h(String str) {
        return this.f39400a.getString(new C2808mf(f39349q, str).f39447b, "");
    }

    public final String i() {
        return this.f39400a.getString(f39341i.f39447b, null);
    }

    @NonNull
    public final Map<Integer, String> j() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f39400a.getString(f39348p.f39447b, null);
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

    public final C2756kf e(String str, String str2) {
        return (C2756kf) b(new C2808mf(f39349q, str).f39447b, str2);
    }

    public final C2756kf a(long j4) {
        return (C2756kf) b(f39340h.f39447b, j4);
    }

    @Override // io.appmetrica.analytics.impl.Nd
    @NonNull
    public final String f(@NonNull String str) {
        return new C2808mf(str, null).f39447b;
    }

    public final C2756kf a(int i4) {
        return (C2756kf) b(f39344l.f39447b, i4);
    }

    public final C2756kf a(List<String> list) {
        return (C2756kf) a(f39346n.f39447b, list);
    }

    public final boolean a(boolean z4) {
        return this.f39400a.getBoolean(f39350r.f39447b, z4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3128yo
    public final String a() {
        return this.f39400a.getString(f39347o.f39447b, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3128yo
    public final void a(@NonNull String str) {
        b(f39347o.f39447b, str);
    }

    public final void a(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f39348p.f39447b, jSONObject.toString());
    }
}
