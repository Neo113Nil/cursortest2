package com.bytedance.adsdk.ugeno.fb.fs;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fb.hhw;
import java.util.Map;

/* loaded from: classes9.dex */
public class btk extends zmn {
    public btk(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
        super(znVar, str, zmnVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fs.zmn
    public void zmn() {
        Map<String, Object> map = this.hhw;
        if (map == null || map.size() <= 0) {
            return;
        }
        Object obj = this.hhw.get("id");
        if (obj == null) {
            zmn(this.zn);
            return;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf)) {
            zmn(this.zn);
            return;
        }
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.zn;
        com.bytedance.adsdk.ugeno.fs.zn fs = znVar.fs(znVar);
        if (fs == null) {
            return;
        }
        zmn(fs.btk(valueOf));
    }

    private void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        Object obj;
        if (znVar == null) {
            return;
        }
        for (String str : this.hhw.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id") && (obj = this.hhw.get(str)) != null) {
                znVar.zmn(str, String.valueOf(obj));
            }
        }
        znVar.zmn(this.hhw.containsKey("width"), this.hhw.containsKey("height"));
        znVar.fs();
    }
}
