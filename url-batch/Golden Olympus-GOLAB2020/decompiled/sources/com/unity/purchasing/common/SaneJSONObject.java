package com.unity.purchasing.common;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SaneJSONObject extends JSONObject {
    @Override // org.json.JSONObject
    public JSONObject put(String str, double d4) {
        try {
            return super.put(str, d4);
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, Object obj) {
        try {
            return super.put(str, obj);
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, boolean z4) {
        try {
            return super.put(str, z4);
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
