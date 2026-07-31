package com.bytedance.adsdk.zmn.fs.fs.zmn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class cyb implements com.bytedance.adsdk.zmn.fs.fs.zmn {
    private final com.bytedance.adsdk.zmn.fs.fb.zn zmn;

    public cyb(com.bytedance.adsdk.zmn.fs.fb.zn znVar) {
        this.zmn = znVar;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public com.bytedance.adsdk.zmn.fs.fb.btk zmn() {
        return this.zmn;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public String fs() {
        return this.zmn.zmn();
    }

    public String toString() {
        return fs();
    }
}
