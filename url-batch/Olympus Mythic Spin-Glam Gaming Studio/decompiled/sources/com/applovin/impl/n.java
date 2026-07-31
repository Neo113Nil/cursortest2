package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class n implements Comparable {
    private final String a;
    private final String b;
    private final MaxAdFormat c;
    private final o d;
    private final List e;

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getString(jSONObject, "display_name", "");
        this.c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, POBConstants.KEY_FORMAT, null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.e = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                this.e.add(new o(jSONObject2, map, this.c, kVar));
            }
        }
        this.d = this.e.isEmpty() ? null : (o) this.e.get(0);
    }

    public MaxAdFormat a() {
        return this.c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return "\n---------- " + this.b + " ----------\nIdentifier - " + this.a + "\nFormat     - " + b();
    }

    public o f() {
        return this.d;
    }

    public List g() {
        return this.e;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.b.compareToIgnoreCase(nVar.b);
    }
}
