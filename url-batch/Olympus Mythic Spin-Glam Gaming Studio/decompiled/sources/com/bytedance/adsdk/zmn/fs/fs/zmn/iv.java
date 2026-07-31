package com.bytedance.adsdk.zmn.fs.fs.zmn;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class iv implements com.bytedance.adsdk.zmn.fs.fs.zmn {
    private boolean fb;
    private String fs;
    private com.bytedance.adsdk.zmn.fs.fs.zmn[] zmn;
    private com.bytedance.adsdk.zmn.fs.zmn.zmn zn;

    public iv(String str) {
        this.fs = str;
    }

    public void zmn(com.bytedance.adsdk.zmn.fs.fs.zmn[] zmnVarArr) {
        this.zmn = zmnVarArr;
    }

    public void zmn(boolean z) {
        this.fb = z;
    }

    public boolean zn() {
        return this.fb;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        com.bytedance.adsdk.zmn.fs.zmn.zmn zmnVar = new com.bytedance.adsdk.zmn.fs.zmn.zmn();
        this.zn = zmnVar;
        zmnVar.zmn(this.fs);
        Object[] objArr = new Object[this.zmn.length];
        int i = 0;
        while (true) {
            com.bytedance.adsdk.zmn.fs.fs.zmn[] zmnVarArr = this.zmn;
            if (i < zmnVarArr.length) {
                com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar2 = zmnVarArr[i];
                if (zmnVar2 != null) {
                    objArr[i] = zmnVar2.zmn(map);
                }
                i++;
            } else {
                this.zn.zmn(objArr);
                return com.bytedance.adsdk.zmn.olo.zmn(this.fs).zmn(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public com.bytedance.adsdk.zmn.fs.fb.btk zmn() {
        return com.bytedance.adsdk.zmn.fs.fb.fs.METHOD;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public String fs() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.fs);
        sb.append("(");
        com.bytedance.adsdk.zmn.fs.fs.zmn[] zmnVarArr = this.zmn;
        if (zmnVarArr != null && zmnVarArr.length > 0) {
            int i = 0;
            while (true) {
                com.bytedance.adsdk.zmn.fs.fs.zmn[] zmnVarArr2 = this.zmn;
                if (i >= zmnVarArr2.length) {
                    break;
                }
                sb.append(zmnVarArr2[i].fs());
                sb.append(StringUtils.COMMA);
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
