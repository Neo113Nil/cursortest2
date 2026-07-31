package com.bytedance.sdk.openadsdk.component.reward.zn.zmn;

import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fb {
    private float btk;
    private JSONObject bvs;
    private float fb;
    private boolean fs = true;
    private float hhw;
    private String iv;
    private float nps;
    private String zg;
    private int zmn;
    private String zn;

    public String zmn() {
        return this.iv;
    }

    public void zmn(String str) {
        this.iv = str;
    }

    public int fs() {
        return this.zmn;
    }

    public void zmn(int i) {
        this.zmn = i;
    }

    public boolean zn() {
        return this.fs;
    }

    public void zmn(boolean z) {
        this.fs = z;
    }

    public String fb() {
        return this.zn;
    }

    public void fs(String str) {
        this.zn = str;
    }

    public float btk() {
        return this.fb;
    }

    public void zmn(float f) {
        this.fb = f;
    }

    public float hhw() {
        return this.btk;
    }

    public void fs(float f) {
        this.btk = f;
    }

    public float nps() {
        return this.hhw;
    }

    public void zn(float f) {
        this.hhw = f;
    }

    public float zg() {
        return this.nps;
    }

    public void fb(float f) {
        this.nps = f;
    }

    public String bvs() {
        return this.zg;
    }

    public void zn(String str) {
        this.zg = str;
    }

    public void zmn(JSONObject jSONObject) {
        this.bvs = jSONObject;
    }

    public static fb fs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        fb fbVar = new fb();
        fbVar.fs(jSONObject.optString("url"));
        fbVar.zmn(jSONObject.optInt("showType"));
        fbVar.zmn(jSONObject.optBoolean("lpClickable", true));
        float fs = jy.fs(kgc.zmn(), (float) jSONObject.optDouble(VastAttributes.HORIZONTAL_POSITION));
        float fs2 = jy.fs(kgc.zmn(), (float) jSONObject.optDouble(VastAttributes.VERTICAL_POSITION));
        float fs3 = jy.fs(kgc.zmn(), (float) jSONObject.optDouble("width"));
        float fs4 = jy.fs(kgc.zmn(), (float) jSONObject.optDouble("height"));
        fbVar.zmn(fs);
        fbVar.fs(fs2);
        fbVar.zn(fs3);
        fbVar.fb(fs4);
        fbVar.zn(jSONObject.optString("tag"));
        fbVar.zmn(jSONObject.optString(SDKConstants.PARAM_SESSION_ID));
        JSONObject optJSONObject = jSONObject.optJSONObject("materialDict");
        if (optJSONObject != null) {
            fbVar.zmn(optJSONObject);
        }
        return fbVar;
    }

    public boolean zmn(float f, float f2) {
        return f >= btk() && f <= btk() + nps() && f2 >= hhw() && f2 <= hhw() + zg();
    }
}
