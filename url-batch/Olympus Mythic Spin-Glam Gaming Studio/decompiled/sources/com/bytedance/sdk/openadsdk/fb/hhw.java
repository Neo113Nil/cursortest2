package com.bytedance.sdk.openadsdk.fb;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class hhw extends zmn {
    public static final SimpleDateFormat zn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public hhw(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.fb.zmn
    public JSONObject fb() {
        return this.fs;
    }
}
