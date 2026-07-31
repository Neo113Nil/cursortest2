package com.ironsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class gr {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f16544a;

    public gr() {
        this.f16544a = new JSONObject();
    }

    public static Object b(Object obj) {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Iterable)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray;
        }
        JSONObject jSONObject = new JSONObject();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            if (obj2 != null) {
                jSONObject.put(obj2.toString(), b(map.get(obj2)));
            }
        }
        return jSONObject;
    }

    private void f(String str) {
        try {
            this.f16544a = new JSONObject(str);
        } catch (Exception e4) {
            o9.d().a(e4);
            this.f16544a = new JSONObject();
        }
    }

    public int a(String str, int i4) {
        return this.f16544a.optInt(str, i4);
    }

    public boolean c(String str) {
        return this.f16544a.optBoolean(str);
    }

    public String d(String str) {
        return this.f16544a.optString(str, null);
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.f16544a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public gr(String str) {
        f(str);
    }

    private Object a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? b((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e4) {
            o9.d().a(e4);
            return null;
        }
    }

    private Map<String, Object> b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }

    public String a(String str, String str2) {
        return this.f16544a.optString(str, str2);
    }

    public List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(a(jSONArray.get(i4)));
        }
        return arrayList;
    }

    public void b(String str, String str2) {
        try {
            this.f16544a.put(str, str2);
        } catch (Exception e4) {
            o9.d().a(e4);
        }
    }

    public JSONObject a() {
        return this.f16544a;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.f16544a.put(str, jSONObject);
        } catch (Exception e4) {
            o9.d().a(e4);
        }
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }
}
