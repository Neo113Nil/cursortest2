package com.bytedance.adsdk.zmn.fs.fs.zmn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class hhw extends olo {
    public hhw() {
        super(com.bytedance.adsdk.zmn.fs.fb.zn.GT);
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        Object zmn;
        Object zmn2 = this.zmn.zmn(map);
        if (zmn2 == null || (zmn = this.fs.zmn(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.zmn.fs.btk.zmn.zn.zmn(zmn2, (Number) zmn);
    }
}
