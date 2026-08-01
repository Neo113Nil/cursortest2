package com.bytedance.sdk.openadsdk.icD;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: AdEventV3.java */
/* loaded from: classes2.dex */
public class sUS extends pvs {
    public static final SimpleDateFormat vG = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public sUS(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.icD.pvs
    public JSONObject vG() {
        return this.icD;
    }
}
