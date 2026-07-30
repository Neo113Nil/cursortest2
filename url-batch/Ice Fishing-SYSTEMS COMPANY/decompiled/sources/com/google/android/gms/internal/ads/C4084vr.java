package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4084vr {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f34874a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f34875b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f34876c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f34877d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f34878e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final SD f34879f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f34880g;

    public C4084vr(SD sd) {
        this.f34879f = sd;
    }

    public static final Bundle j(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized C3944tC a(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(p2.j.f39798C.f39808h.g().n().f28423e) && (map = (Map) this.f34876c.get(str)) != null) {
                List<C4138wr> list = (List) map.get(str2);
                if (list == null) {
                    String j9 = PA.j(this.f34880g, str2, str);
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.oc)).booleanValue()) {
                        j9 = j9.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(j9);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (C4138wr c4138wr : list) {
                        String str3 = c4138wr.f35073a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(c4138wr.f35074b);
                    }
                    return C3944tC.a(hashMap);
                }
            }
            return C3944tC.f34377z;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = this.f34874a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new C4138wr(str, new Bundle()));
            }
        }
    }

    public final synchronized void c() {
        this.f34875b.clear();
        this.f34874a.clear();
        this.f34878e.clear();
        this.f34877d.clear();
        f();
        d();
        e();
    }

    public final synchronized void d() {
        JSONObject jSONObject;
        if (!((Boolean) AbstractC2751Ra.f27379g.r()).booleanValue()) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31782s2)).booleanValue() && (jSONObject = p2.j.f39798C.f39808h.g().n().f28425g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle j9 = j(jSONObject2.optJSONObject("data"));
                        String optString = jSONObject2.optString("adapter_class_name");
                        boolean optBoolean = jSONObject2.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f34875b.put(optString, new C4246yr(optString, optBoolean2, optBoolean, true, j9));
                        }
                    }
                } catch (JSONException e6) {
                    t2.C.l("Malformed config loading JSON.", e6);
                }
            }
        }
    }

    public final synchronized void e() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) AbstractC2751Ra.f27374b.r()).booleanValue()) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31790t2)).booleanValue() && (jSONObject = p2.j.f39798C.f39808h.g().n().f28425g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                                JSONObject jSONObject3 = optJSONArray.getJSONObject(i4);
                                boolean optBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject3.optString("platform");
                                C4246yr c4246yr = new C4246yr(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.f34877d.put(optString, c4246yr);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.f34878e.put(optString, c4246yr);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e6) {
            t2.C.l("Malformed config loading JSON.", e6);
        } finally {
        }
    }

    public final synchronized void f() {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = p2.j.f39798C.f39808h.g().n().f28425g;
            if (jSONObject != null) {
                try {
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f34880g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.oc)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String optString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                                    arrayList.addAll(g(optJSONArray.getJSONObject(i4)));
                                }
                            }
                            h(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e6) {
                    t2.C.l("Malformed config loading JSON.", e6);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList g(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle j9 = j(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = (String) arrayList2.get(i4);
                        b(str);
                        if (((C4138wr) this.f34874a.get(str)) != null) {
                            arrayList.add(new C4138wr(str, j9));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void h(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap hashMap = this.f34876c;
            Map map = (Map) hashMap.get(str);
            if (map == null) {
                map = new HashMap();
            }
            hashMap.put(str, map);
            List list = (List) map.get(str2);
            if (list == null) {
                list = new ArrayList();
            }
            list.addAll(arrayList);
            map.put(str2, list);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C3944tC i(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(p2.j.f39798C.f39808h.g().n().f28423e)) {
                C3151ea c3151ea = AbstractC3368ia.f31645d4;
                q2.r rVar = q2.r.f40116e;
                boolean matches = Pattern.matches((String) rVar.f40119c.a(c3151ea), str);
                boolean matches2 = Pattern.matches((String) rVar.f40119c.a(AbstractC3368ia.f31655e4), str);
                if (matches) {
                    hashMap = new HashMap(this.f34878e);
                } else if (matches2) {
                    hashMap = new HashMap(this.f34877d);
                }
                return C3944tC.a(hashMap);
            }
            return C3944tC.f34377z;
        } catch (Throwable th) {
            throw th;
        }
    }
}
