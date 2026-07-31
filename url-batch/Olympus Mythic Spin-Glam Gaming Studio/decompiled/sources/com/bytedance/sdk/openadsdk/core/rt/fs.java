package com.bytedance.sdk.openadsdk.core.rt;

import com.bytedance.sdk.openadsdk.core.rt.zn.zmn;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class fs extends zn {
    private long iv;
    private long rc;

    public fs(int i, int i2, long j, long j2, zmn.EnumC0182zmn enumC0182zmn, zmn.fs fsVar, String str, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list2, String str2) {
        super(i, i2, enumC0182zmn, fsVar, str, list, list2, str2);
        this.iv = j;
        this.rc = j2;
        this.bvs = "icon_click";
    }

    public static fs zmn(JSONObject jSONObject) {
        zn fs = zn.fs(jSONObject);
        if (fs == null) {
            return null;
        }
        return new fs(fs.zmn, fs.fs, jSONObject.optLong("offset", -1L), jSONObject.optLong(IronSourceConstants.EVENTS_DURATION, -1L), fs.zn, fs.fb, fs.btk, fs.hhw, fs.nps, fs.zg);
    }
}
