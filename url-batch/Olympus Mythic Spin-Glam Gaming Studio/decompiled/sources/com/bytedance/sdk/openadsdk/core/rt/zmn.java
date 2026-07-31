package com.bytedance.sdk.openadsdk.core.rt;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class zmn {
    private String btk;
    private int bvs;
    private String fb;
    fs fs;
    private String hhw;
    private int iv;
    private String klz;
    private String nps;
    private double zg;
    zn zn;
    final com.bytedance.sdk.openadsdk.core.model.fb zmn = new com.bytedance.sdk.openadsdk.core.model.fb();
    private String rc = "VAST_ACTION_BUTTON";

    public fb zmn() {
        return this.zmn.zmn();
    }

    public fs fs() {
        return this.fs;
    }

    public zn zn() {
        return this.zn;
    }

    public String fb() {
        return this.fb;
    }

    public String btk() {
        return this.btk;
    }

    public String hhw() {
        return this.hhw;
    }

    public String nps() {
        return this.nps;
    }

    public void zmn(fs fsVar) {
        if (fsVar != null) {
            fsVar.zmn(this.nps);
        }
        this.fs = fsVar;
    }

    public void zmn(zn znVar) {
        if (znVar != null) {
            znVar.zmn(this.nps);
        }
        this.zn = znVar;
    }

    public void zmn(String str) {
        this.fb = str;
    }

    public void fs(String str) {
        this.btk = str;
    }

    public void zn(String str) {
        this.hhw = str;
    }

    public void fb(String str) {
        this.nps = str;
    }

    public double zg() {
        return this.zg;
    }

    public void zmn(double d) {
        this.zg = d;
    }

    public String bvs() {
        zn znVar;
        String str = this.hhw;
        if (!TextUtils.isEmpty(this.klz)) {
            String str2 = this.klz;
            this.klz = null;
            return str2;
        }
        String str3 = this.rc;
        str3.hashCode();
        if (str3.equals("VAST_ICON")) {
            fs fsVar = this.fs;
            if (fsVar != null && !TextUtils.isEmpty(fsVar.zg)) {
                str = this.fs.zg;
            }
        } else if (str3.equals("VAST_END_CARD") && (znVar = this.zn) != null && !TextUtils.isEmpty(znVar.zg)) {
            str = this.zn.zg;
        }
        this.rc = "VAST_ACTION_BUTTON";
        return str;
    }

    public void btk(String str) {
        this.rc = str;
    }

    public static zmn zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zmn zmnVar = new zmn();
        fb zmn = zmnVar.zmn.zmn();
        if (zmn == null) {
            zmn = new fb();
            zmnVar.zmn.zmn(zmn);
        }
        zmn.zmn(jSONObject.optJSONObject("videoTrackers"));
        zmnVar.fs = fs.zmn(jSONObject.optJSONObject("vastIcon"));
        zmnVar.zn = zn.fs(jSONObject.optJSONObject("endCard"));
        zmnVar.fb = jSONObject.optString("title");
        zmnVar.btk = jSONObject.optString("description");
        zmnVar.hhw = jSONObject.optString("clickThroughUrl");
        zmnVar.nps = jSONObject.optString(UnifiedMediationParams.KEY_VIDEO_URL);
        zmnVar.zg = jSONObject.optDouble("videDuration");
        zmnVar.bvs = jSONObject.optInt("videoWidth");
        zmnVar.bvs = jSONObject.optInt("videoHeight");
        Set<iv> fs = zmnVar.zmn.fs();
        if (fs == null) {
            fs = new HashSet<>();
            zmnVar.zmn.zmn(fs);
        }
        fs.addAll(iv.zmn(jSONObject.optJSONArray("viewabilityVendor")));
        return zmnVar;
    }

    public void zmn(nqi nqiVar) {
        this.zmn.zmn(nqiVar);
        fs fsVar = this.fs;
        if (fsVar != null) {
            fsVar.zmn(nqiVar);
        }
        zn znVar = this.zn;
        if (znVar != null) {
            znVar.zmn(nqiVar);
        }
    }

    public void zmn(int i) {
        this.bvs = i;
    }

    public void fs(int i) {
        this.iv = i;
    }

    public int iv() {
        return this.bvs;
    }

    public int rc() {
        return this.iv;
    }

    public void zmn(Set<iv> set) {
        this.zmn.fs(set);
    }

    public Set<iv> klz() {
        return this.zmn.fs();
    }

    public void hhw(String str) {
        this.klz = str;
    }

    public com.bytedance.sdk.openadsdk.core.model.fb mw() {
        return this.zmn;
    }
}
