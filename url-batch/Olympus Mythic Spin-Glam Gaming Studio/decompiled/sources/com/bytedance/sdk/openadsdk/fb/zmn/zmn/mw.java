package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import com.bytedance.sdk.openadsdk.utils.kjb;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class mw extends iv<JSONObject> {
    public mw(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static mw zmn(String str, boolean z, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("track_url", str);
            jSONObject.putOpt("replace_holder", Boolean.valueOf(z));
            jSONObject.putOpt("track_type", Integer.valueOf(i));
            jSONObject.putOpt(CreativeInfo.c, str2);
            mw mwVar = new mw(kjb.zmn(), jSONObject);
            mwVar.zmn(1);
            return mwVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int zg() {
        JSONObject zn = zn();
        if (zn != null) {
            return zn.optInt("track_type");
        }
        return 0;
    }

    public boolean bvs() {
        JSONObject zn = zn();
        if (zn != null) {
            return zn.optBoolean("replace_holder");
        }
        return false;
    }

    public String iv() {
        JSONObject zn = zn();
        if (zn != null) {
            return zn.optString("track_url");
        }
        return null;
    }

    public String rc() {
        JSONObject zn = zn();
        if (zn != null) {
            return zn.optString(CreativeInfo.c);
        }
        return null;
    }

    @Override // com.bytedance.zmn.zmn
    public byte[] fb() {
        String jSONObject;
        JSONObject zn = zn();
        if (zn == null || (jSONObject = zn.toString()) == null) {
            return null;
        }
        return jSONObject.getBytes(StandardCharsets.UTF_8);
    }
}
