package com.bytedance.adsdk.zmn.fs.fs.zmn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class fb extends olo {
    public fb() {
        super(com.bytedance.adsdk.zmn.fs.fb.zn.EQ);
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        Object zmn = this.zmn.zmn(map);
        Object zmn2 = this.fs.zmn(map);
        if (zmn == null && zmn2 == null) {
            return Boolean.TRUE;
        }
        if (zmn == null && zmn2 != null) {
            return Boolean.FALSE;
        }
        if (zmn != null && zmn2 == null) {
            return Boolean.FALSE;
        }
        if ((zmn instanceof Number) && (zmn2 instanceof Number)) {
            return Boolean.valueOf(com.bytedance.adsdk.zmn.fs.btk.zmn.fs.zmn((Number) zmn, (Number) zmn2));
        }
        return Boolean.valueOf(zmn.equals(zmn2));
    }
}
