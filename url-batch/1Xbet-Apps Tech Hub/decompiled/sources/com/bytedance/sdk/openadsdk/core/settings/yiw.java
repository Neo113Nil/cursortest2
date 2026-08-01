package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsConfiglInfo.java */
/* loaded from: classes2.dex */
public class yiw {
    public boolean Jd;
    public boolean NB;
    public boolean sUS;
    public String vG;
    public static final yiw pvs = new yiw(null);
    public static String icD = "";

    public yiw(String str) {
        this.vG = "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js";
        this.Jd = true;
        this.NB = true;
        this.sUS = true;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String optString = optJSONObject.optString(ImagesContract.URL, "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(optString)) {
                this.vG = optString;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
            this.Jd = arrayList.contains("load_finish");
            this.sUS = arrayList.contains("load_fail");
            this.NB = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
