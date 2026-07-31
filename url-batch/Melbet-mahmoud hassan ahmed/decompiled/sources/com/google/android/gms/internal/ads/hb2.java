package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hb2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, jb2> f6170a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, lb2> f6171b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Map<String, List<jb2>>> f6172c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Executor f6173d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f6174e;

    hb2(Executor executor) {
        this.f6173d = executor;
    }

    private final synchronized List<jb2> g(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle l7 = l(jSONObject.optJSONObject("data"));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
            String optString = optJSONArray.optString(i7, "");
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            String str2 = (String) arrayList2.get(i8);
            f(str2);
            if (this.f6170a.get(str2) != null) {
                arrayList.add(new jb2(str2, str, l7));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        this.f6171b.clear();
        this.f6170a.clear();
        j();
        k();
    }

    private final synchronized void i(String str, String str2, List<jb2> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map<String, List<jb2>> map = this.f6172c.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        this.f6172c.put(str, map);
        List<jb2> list2 = map.get(str2);
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        list2.addAll(list);
        map.put(str2, list2);
    }

    private final synchronized void j() {
        JSONArray optJSONArray;
        JSONObject f7 = y2.t.p().h().e().f();
        if (f7 != null) {
            try {
                JSONArray optJSONArray2 = f7.optJSONArray("ad_unit_id_settings");
                this.f6174e = f7.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i7 = 0; i7 < optJSONArray2.length(); i7++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i7);
                        String lowerCase = ((Boolean) sw.c().b(m10.p7)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        String optString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                                arrayList.addAll(g(optJSONArray.getJSONObject(i8), optString));
                            }
                        }
                        i(optString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e7) {
                a3.r1.l("Malformed config loading JSON.", e7);
            }
        }
    }

    private final synchronized void k() {
        if (!g30.f5441e.e().booleanValue()) {
            if (((Boolean) sw.c().b(m10.f8258n1)).booleanValue()) {
                JSONObject f7 = y2.t.p().h().e().f();
                if (f7 == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = f7.getJSONArray("signal_adapters");
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i7);
                        Bundle l7 = l(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f6171b.put(optString, new lb2(optString, optBoolean2, optBoolean, l7));
                        }
                    }
                } catch (JSONException e7) {
                    a3.r1.l("Malformed config loading JSON.", e7);
                }
            }
        }
    }

    private static final Bundle l(JSONObject jSONObject) {
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

    public final synchronized Map<String, List<Bundle>> a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, List<jb2>> map = this.f6172c.get(str);
            if (map == null) {
                return i73.d();
            }
            List<jb2> list = map.get(str2);
            if (list == null) {
                String a7 = zt1.a(this.f6174e, str2, str);
                if (((Boolean) sw.c().b(m10.p7)).booleanValue()) {
                    a7 = a7.toLowerCase(Locale.ROOT);
                }
                list = map.get(a7);
            }
            if (list == null) {
                return i73.d();
            }
            HashMap hashMap = new HashMap();
            for (jb2 jb2Var : list) {
                String str3 = jb2Var.f7068a;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, new ArrayList());
                }
                ((List) hashMap.get(str3)).add(jb2Var.f7070c);
            }
            return i73.c(hashMap);
        }
        return i73.d();
    }

    public final synchronized Map<String, lb2> b() {
        return i73.c(this.f6171b);
    }

    public final void d() {
        y2.t.p().h().Z(new Runnable() { // from class: com.google.android.gms.internal.ads.fb2
            @Override // java.lang.Runnable
            public final void run() {
                hb2.this.e();
            }
        });
        this.f6173d.execute(new gb2(this));
    }

    final /* synthetic */ void e() {
        this.f6173d.execute(new gb2(this));
    }

    public final synchronized void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f6170a.containsKey(str)) {
            return;
        }
        this.f6170a.put(str, new jb2(str, "", new Bundle()));
    }
}
