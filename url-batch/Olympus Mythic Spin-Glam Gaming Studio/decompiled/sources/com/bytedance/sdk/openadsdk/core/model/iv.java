package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class iv {
    private List<String> fs;
    private String zmn;

    public iv(String str) {
        this.zmn = "";
        this.fs = new ArrayList();
        HashMap<String, Object> hashMap = TextUtils.isEmpty(str) ? new HashMap<>() : zmn(str);
        try {
            this.zmn = (String) hashMap.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) hashMap.get("auto_test_hosts"));
            this.fs = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.fs.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn("AutoTestModel", e.getMessage());
        }
    }

    public String zmn() {
        return this.zmn;
    }

    public List<String> fs() {
        return this.fs;
    }

    private static final HashMap<String, Object> zmn(String str) {
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
