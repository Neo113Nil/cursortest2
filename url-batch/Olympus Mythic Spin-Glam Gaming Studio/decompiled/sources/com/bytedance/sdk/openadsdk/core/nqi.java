package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.uqh;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public interface nqi<T> {

    public interface fs {
        void zmn(int i, String str);

        void zmn(uqh.fs fsVar);
    }

    public interface zmn {
        void zmn(int i, String str);

        void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar);
    }

    com.bytedance.sdk.openadsdk.fb.btk fs(JSONObject jSONObject);

    com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmn();

    com.bytedance.sdk.openadsdk.fb.btk zmn(JSONObject jSONObject, String str, List<String> list);

    JSONObject zmn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, int i) throws JSONException;

    JSONObject zmn(JSONObject jSONObject);

    void zmn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, int i, phc phcVar);

    void zmn(String str);

    void zmn(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void zmn(JSONObject jSONObject, fs fsVar);

    void zmn(JSONObject jSONObject, String str);
}
