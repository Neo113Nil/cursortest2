package com.ironsource.sdk.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SSAObj.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f7174a;

    public g() {
        this.f7174a = new JSONObject();
    }

    public g(String str) {
        a(str);
    }

    private void a(String str) {
        try {
            this.f7174a = new JSONObject(str);
        } catch (Exception unused) {
            this.f7174a = new JSONObject();
        }
    }

    public JSONObject e() {
        return this.f7174a;
    }

    public boolean f(String str) {
        return e().has(str);
    }

    public boolean g(String str) {
        return e().isNull(str);
    }

    public Object h(String str) {
        try {
            return e().get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String i(String str) {
        try {
            return this.f7174a.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean j(String str) {
        try {
            return this.f7174a.getBoolean(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public void a(String str, String str2) {
        try {
            this.f7174a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.f7174a.put(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    public String toString() {
        return this.f7174a == null ? "" : this.f7174a.toString();
    }

    private Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }

    private Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }
}
