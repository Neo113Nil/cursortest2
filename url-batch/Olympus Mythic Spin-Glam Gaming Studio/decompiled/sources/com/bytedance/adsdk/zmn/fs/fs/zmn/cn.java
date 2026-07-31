package com.bytedance.adsdk.zmn.fs.fs.zmn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cn implements com.bytedance.adsdk.zmn.fs.fs.zmn {
    private Number zmn;

    public cn(String str) {
        if (str.indexOf(46) >= 0) {
            Float valueOf = Float.valueOf(str);
            this.zmn = valueOf;
            if (Float.isInfinite(valueOf.floatValue())) {
                this.zmn = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.zmn = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.zmn = Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        return this.zmn;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public com.bytedance.adsdk.zmn.fs.fb.btk zmn() {
        return com.bytedance.adsdk.zmn.fs.fb.hhw.NUMBER;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public String fs() {
        return this.zmn.toString();
    }

    public String toString() {
        return fs();
    }
}
