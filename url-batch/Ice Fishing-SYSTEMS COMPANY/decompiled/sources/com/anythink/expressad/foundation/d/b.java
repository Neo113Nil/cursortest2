package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.g.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18691a = "https://img.toponad.com/sdk/app-permissions.html?key=";

    /* renamed from: b, reason: collision with root package name */
    private static String f18692b = "app_name";

    /* renamed from: c, reason: collision with root package name */
    private static String f18693c = "perm_desc";

    /* renamed from: d, reason: collision with root package name */
    private static String f18694d = "ori_perm_desc";

    /* renamed from: e, reason: collision with root package name */
    private static String f18695e = "ori_perm_all";

    /* renamed from: f, reason: collision with root package name */
    private static String f18696f = "pri_url";

    /* renamed from: g, reason: collision with root package name */
    private static String f18697g = "upd_time";

    /* renamed from: h, reason: collision with root package name */
    private static String f18698h = "app_ver";
    private static String i = "dev_name";

    /* renamed from: j, reason: collision with root package name */
    private String f18699j;

    /* renamed from: k, reason: collision with root package name */
    private String f18700k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<String> f18701l = new ArrayList<>(3);

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<String> f18702m = new ArrayList<>(3);

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<String> f18703n = new ArrayList<>(3);

    /* renamed from: o, reason: collision with root package name */
    private String f18704o;

    /* renamed from: p, reason: collision with root package name */
    private String f18705p;

    /* renamed from: q, reason: collision with root package name */
    private String f18706q;

    /* renamed from: r, reason: collision with root package name */
    private String f18707r;

    /* renamed from: s, reason: collision with root package name */
    private String f18708s;

    private void b(String str) {
        this.f18699j = str;
    }

    private void c(String str) {
        this.f18704o = str;
    }

    private void d(String str) {
        this.f18700k = str;
    }

    private void e(String str) {
        this.f18705p = str;
    }

    private void f(String str) {
        this.f18706q = str;
    }

    private void g(String str) {
        this.f18707r = str;
    }

    private String h() {
        return this.f18699j;
    }

    private ArrayList<String> i() {
        return this.f18701l;
    }

    private ArrayList<String> j() {
        return this.f18702m;
    }

    private ArrayList<String> k() {
        return this.f18703n;
    }

    public final String a() {
        return this.f18704o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApkDisplayInfo{appName='");
        sb.append(this.f18700k);
        sb.append("', permDescJArray=");
        sb.append(this.f18701l);
        sb.append(", permDescOriJArray=");
        sb.append(this.f18702m);
        sb.append(", permDescAll=");
        sb.append(this.f18703n);
        sb.append(", priUrl='");
        sb.append(this.f18705p);
        sb.append("', updateTime='");
        sb.append(this.f18706q);
        sb.append("', appVersion='");
        sb.append(this.f18707r);
        sb.append("', devName='");
        return AbstractC5051n.g(sb, this.f18708s, "'}");
    }

    private void a(ArrayList<String> arrayList) {
        this.f18701l = arrayList;
    }

    private void c(ArrayList<String> arrayList) {
        this.f18703n = arrayList;
    }

    private void h(String str) {
        this.f18708s = str;
    }

    public final String b() {
        return this.f18700k;
    }

    public final String d() {
        return this.f18706q;
    }

    public final String e() {
        return this.f18707r;
    }

    public final String f() {
        return this.f18708s;
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject(this.f18699j);
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (JSONException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    private static b a(b bVar) {
        return bVar == null ? new b() : bVar;
    }

    private void b(ArrayList<String> arrayList) {
        this.f18702m = arrayList;
    }

    private static JSONArray d(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            jSONArray.put(arrayList.get(i4));
        }
        return jSONArray;
    }

    public final String c() {
        return this.f18705p;
    }

    public static b a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return a(new JSONObject(str));
        } catch (JSONException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    private static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.optString(i4));
        }
        return arrayList;
    }

    private static b a(JSONObject jSONObject) {
        b bVar = null;
        if (jSONObject.has(f18692b)) {
            bVar = a((b) null);
            bVar.f18700k = jSONObject.optString(f18692b);
        }
        if (jSONObject.has(f18693c)) {
            bVar = a(bVar);
            JSONArray optJSONArray = jSONObject.optJSONArray(f18693c);
            if (optJSONArray != null) {
                bVar.f18701l = a(optJSONArray);
                ArrayList<String> arrayList = bVar.f18703n;
                String str = f18691a;
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    try {
                        if (optJSONArray.get(i4) instanceof String) {
                            str = i4 == 0 ? str + optJSONArray.optString(i4) : str + "," + optJSONArray.optString(i4);
                        }
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                }
                bVar.f18704o = str;
                bVar.f18703n = arrayList;
            }
        }
        if (jSONObject.has(f18694d)) {
            bVar = a(bVar);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(f18694d);
            if (optJSONArray2 != null) {
                bVar.f18702m = a(optJSONArray2);
                ArrayList<String> arrayList2 = bVar.f18703n;
                for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                    try {
                        Object obj = optJSONArray2.get(i9);
                        if (obj instanceof String) {
                            arrayList2.add((String) obj);
                        }
                    } catch (JSONException e9) {
                        e9.printStackTrace();
                    }
                }
                bVar.f18703n = arrayList2;
            }
        }
        if (jSONObject.has(f18696f)) {
            bVar = a(bVar);
            bVar.f18705p = jSONObject.optString(f18696f);
        }
        if (jSONObject.has(f18697g)) {
            bVar = a(bVar);
            bVar.f18706q = jSONObject.optString(f18697g);
        }
        if (jSONObject.has(f18698h)) {
            bVar = a(bVar);
            bVar.f18707r = jSONObject.optString(f18698h);
        }
        if (jSONObject.has(i)) {
            bVar = a(bVar);
            bVar.f18708s = jSONObject.optString(i);
        }
        if (bVar != null) {
            bVar.f18699j = jSONObject.toString();
        }
        return bVar;
    }
}
