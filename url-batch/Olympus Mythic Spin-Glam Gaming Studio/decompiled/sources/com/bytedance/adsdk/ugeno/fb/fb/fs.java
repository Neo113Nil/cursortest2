package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public class fs extends zn implements com.bytedance.adsdk.ugeno.zmn.fs {
    private String rc;

    public fs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        Object obj;
        com.bytedance.adsdk.ugeno.fs.zn zg;
        com.bytedance.adsdk.ugeno.zmn.zmn klz;
        Map<String, Object> map = this.btk;
        if (map == null || map.size() <= 0 || (obj = this.btk.get("name")) == null) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf)) {
            return false;
        }
        Object obj2 = this.btk.get("state");
        if (obj2 != null) {
            this.rc = String.valueOf(obj2);
        }
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.fs;
        com.bytedance.adsdk.ugeno.fs.zn fs = znVar.fs(znVar);
        if (fs != null && (zg = fs.zg(valueOf)) != null && (klz = zg.klz(valueOf)) != null) {
            klz.zmn(this);
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs
    public void zmn() {
        com.bytedance.adsdk.ugeno.fb.rc rcVar;
        if ((TextUtils.equals(this.rc, "start") || TextUtils.isEmpty(this.rc)) && (rcVar = this.zmn) != null) {
            rcVar.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs
    public void fs() {
        com.bytedance.adsdk.ugeno.fb.rc rcVar;
        if ((TextUtils.equals(this.rc, "complete") || TextUtils.isEmpty(this.rc)) && (rcVar = this.zmn) != null) {
            rcVar.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
        }
    }
}
