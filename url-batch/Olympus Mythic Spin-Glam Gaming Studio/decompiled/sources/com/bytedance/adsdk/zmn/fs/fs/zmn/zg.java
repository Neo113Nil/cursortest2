package com.bytedance.adsdk.zmn.fs.fs.zmn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zg extends olo {
    public zg() {
        super(com.bytedance.adsdk.zmn.fs.fb.zn.LT_EQ);
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        Object zmn;
        if (this.zmn.zmn(map) == null || (zmn = this.fs.zmn(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.zmn.fs.btk.zmn.zn.zmn(r0, (Number) zmn)).booleanValue());
    }
}
