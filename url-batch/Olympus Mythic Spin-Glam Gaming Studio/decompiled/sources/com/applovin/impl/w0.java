package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class w0 extends v0 {
    public w0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public List f() {
        x0 a;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject != null && (a = x0.a(jSONObject, this.a)) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public String g() {
        return b("message");
    }

    public String h() {
        return b("title");
    }

    @Override // com.applovin.impl.v0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", title=" + h() + ", message=" + g() + ", actions=" + f() + "}";
    }
}
