package com.facebook.ads.internal.h;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5129a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f5130b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<e, List<String>> f5131c = new HashMap();

    public a(String str, JSONObject jSONObject, JSONArray jSONArray) {
        this.f5129a = str;
        this.f5130b = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (e eVar : e.values()) {
            this.f5131c.put(eVar, new LinkedList());
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("type");
                String string2 = jSONObject2.getString("url");
                e valueOf = e.valueOf(string.toUpperCase(Locale.US));
                if (valueOf != null && !TextUtils.isEmpty(string2)) {
                    this.f5131c.get(valueOf).add(string2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public String a() {
        return this.f5129a;
    }

    public List<String> a(e eVar) {
        return this.f5131c.get(eVar);
    }

    public JSONObject b() {
        return this.f5130b;
    }
}
