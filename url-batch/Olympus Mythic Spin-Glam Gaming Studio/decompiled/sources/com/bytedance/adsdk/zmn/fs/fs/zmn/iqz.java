package com.bytedance.adsdk.zmn.fs.fs.zmn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class iqz implements com.bytedance.adsdk.zmn.fs.fs.zmn {
    private final String zmn;

    public iqz(String str) {
        this.zmn = str;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        return this.zmn;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public com.bytedance.adsdk.zmn.fs.fb.btk zmn() {
        return com.bytedance.adsdk.zmn.fs.fb.hhw.STRING;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public String fs() {
        return "'" + this.zmn + "'";
    }

    public String toString() {
        return fs();
    }
}
