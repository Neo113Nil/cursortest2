package com.bytedance.adsdk.zmn.fs.fs.zmn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class phc implements com.bytedance.adsdk.zmn.fs.fs.zmn {
    private com.bytedance.adsdk.zmn.fs.fb.fb zmn;

    public phc(com.bytedance.adsdk.zmn.fs.fb.fb fbVar) {
        this.zmn = fbVar;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public com.bytedance.adsdk.zmn.fs.fb.btk zmn() {
        return this.zmn;
    }

    public String toString() {
        return fs();
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public String fs() {
        return this.zmn.zmn();
    }
}
