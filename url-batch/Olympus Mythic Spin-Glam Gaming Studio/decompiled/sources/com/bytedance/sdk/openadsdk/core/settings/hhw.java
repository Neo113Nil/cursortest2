package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class hhw {
    public boolean btk;
    public boolean fb;
    public boolean hhw;
    public String zn;
    public static final hhw zmn = new hhw(null);
    public static String fs = "";

    public hhw(String str) {
        this.zn = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.fb = true;
        this.btk = true;
        this.hhw = true;
        try {
            JSONObject optJSONObject = PangleNetworkBridge.jsonObjectInit(str).optJSONObject("performance_js");
            String optString = optJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(optString)) {
                this.zn = optString;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
            this.fb = arrayList.contains("load_finish");
            this.hhw = arrayList.contains("load_fail");
            this.btk = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
