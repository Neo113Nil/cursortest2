package com.bytedance.adsdk.zmn.fs.fs.zmn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kw implements com.bytedance.adsdk.zmn.fs.fs.fs {
    private com.bytedance.adsdk.zmn.fs.fs.zmn fs;
    private com.bytedance.adsdk.zmn.fs.fs.zmn zmn;
    private com.bytedance.adsdk.zmn.fs.fs.zmn zn;

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        Object zmn = this.zmn.zmn(map);
        if (zmn == null) {
            return null;
        }
        if (((Boolean) zmn).booleanValue()) {
            return this.fs.zmn(map);
        }
        return this.zn.zmn(map);
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public com.bytedance.adsdk.zmn.fs.fb.btk zmn() {
        return com.bytedance.adsdk.zmn.fs.fb.hhw.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.fs
    public void zmn(com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar) {
        this.zmn = zmnVar;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.fs
    public void fs(com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar) {
        this.fs = zmnVar;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.fs
    public void zn(com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar) {
        this.zn = zmnVar;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public String fs() {
        return this.zmn.fs() + "?" + this.fs.fs() + ":" + this.zn.fs();
    }

    public String toString() {
        return fs();
    }
}
