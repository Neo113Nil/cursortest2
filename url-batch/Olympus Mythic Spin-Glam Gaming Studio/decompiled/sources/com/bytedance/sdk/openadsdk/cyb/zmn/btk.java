package com.bytedance.sdk.openadsdk.cyb.zmn;

import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class btk {
    public static void zmn(final String str, final String str2, final int i, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn(str, false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.cyb.zmn.btk.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("error_url", str4);
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    jSONObject.put("back_up_url", list.toString());
                }
                jSONObject.put("error_code", i);
                jSONObject.put("error_msg", str3);
                return fb.fs().zmn(str).fs(jSONObject.toString());
            }
        });
    }

    public static void fs(final String str, final String str2, final int i, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn(str, false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.cyb.zmn.btk.2
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                String str5 = str2;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("url", str5);
                String str7 = str4;
                if (str7 == null) {
                    str7 = "";
                }
                jSONObject.put("web_sence", str7);
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    str6 = new JSONArray((Collection) list).toString();
                }
                jSONObject.put("back_up_url", str6);
                jSONObject.put("error_code", i);
                jSONObject.put("error_msg", str3);
                return fb.fs().zmn(str).fs(jSONObject.toString());
            }
        });
    }
}
