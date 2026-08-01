package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AutoTestModel.java */
/* loaded from: classes2.dex */
public class yiw {
    private List<String> icD;
    private String pvs;

    public yiw(String str) {
        this.pvs = "";
        this.icD = new ArrayList();
        HashMap<String, Object> hashMap = TextUtils.isEmpty(str) ? new HashMap<>() : pvs(str);
        try {
            this.pvs = (String) hashMap.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) hashMap.get("auto_test_hosts"));
            this.icD = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.icD.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("AutoTestModel", e.getMessage());
        }
    }

    public String pvs() {
        return this.pvs;
    }

    public List<String> icD() {
        return this.icD;
    }

    private static final HashMap<String, Object> pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("name"), optJSONObject.optString("value"));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
