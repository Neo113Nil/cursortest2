package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class zak {
    private String btk;
    private String bvs;
    private int fb;
    private String fs;
    private String hhw;
    private String iv;
    private String nps;
    private int rc;
    private int zg;
    private String zmn;
    private int zn;

    public String zmn() {
        return this.nps;
    }

    public void zmn(String str) {
        this.nps = str;
    }

    public void zmn(int i) {
        this.rc = i;
    }

    public int fs() {
        return this.zg;
    }

    public void fs(int i) {
        this.zg = i;
    }

    public String zn() {
        return this.bvs;
    }

    public void fs(String str) {
        this.bvs = str;
    }

    public void zn(String str) {
        this.iv = str;
    }

    public String fb() {
        return this.btk;
    }

    public void fb(String str) {
        this.btk = str;
    }

    public String btk() {
        return this.hhw;
    }

    public void btk(String str) {
        this.hhw = str;
    }

    public void hhw(String str) {
        this.zmn = str;
    }

    public void nps(String str) {
        this.fs = str;
    }

    public void zn(int i) {
        this.zn = i;
    }

    public int hhw() {
        return this.fb;
    }

    public void fb(int i) {
        this.fb = i;
    }

    public boolean nps() {
        return this.fb == 1;
    }

    public boolean zg() {
        return this.fb == 2;
    }

    public boolean bvs() {
        return this.rc == 1;
    }

    public static zak zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zak zakVar = new zak();
        try {
            zakVar.hhw(jSONObject.optString("market_dpl", ""));
            zakVar.nps(jSONObject.optString("market_dpl_auto", ""));
            zakVar.zn(jSONObject.optInt("exec_type", 0));
            zakVar.fb(jSONObject.optInt("oem_vendor_type", 0));
            zakVar.fb(jSONObject.optString("market_pkg", ""));
            zakVar.btk(jSONObject.optString("regex", ""));
            zakVar.fs(jSONObject.optInt("overlay", 1));
            zakVar.fs(jSONObject.optString("caller_id", ""));
            zakVar.zn(jSONObject.optString("ext_map", null));
            zakVar.zmn(jSONObject.optInt("gp_card", 0));
            zakVar.zmn(jSONObject.optString("app_pkg", ""));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("OemModel", th.getMessage());
        }
        return zakVar;
    }

    public String iv() {
        if (this.zn == 2) {
            return this.fs;
        }
        return this.zmn;
    }

    public JSONObject rc() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.zmn)) {
                jSONObject.put("market_dpl", this.zmn);
            }
            if (!TextUtils.isEmpty(this.fs)) {
                jSONObject.put("market_dpl_auto", this.fs);
            }
            if (!TextUtils.isEmpty(this.btk)) {
                jSONObject.put("market_pkg", this.btk);
            }
            if (!TextUtils.isEmpty(this.nps)) {
                jSONObject.put("app_pkg", this.nps);
            }
            if (!TextUtils.isEmpty(this.hhw)) {
                jSONObject.put("regex", this.hhw);
            }
            jSONObject.put("exec_type", this.zn);
            jSONObject.put("oem_vendor_type", this.fb);
            jSONObject.put("overlay", this.zg);
            jSONObject.put("gp_card", this.rc);
            if (!TextUtils.isEmpty(this.bvs)) {
                jSONObject.put("caller_id", this.bvs);
            }
            if (!TextUtils.isEmpty(this.iv)) {
                jSONObject.put("ext_map", this.iv);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("OemModel", th.getMessage());
            return null;
        }
    }

    public void zmn(Intent intent) {
        if (TextUtils.isEmpty(this.iv)) {
            return;
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(this.iv);
            Iterator<String> keys = jsonObjectInit.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jsonObjectInit.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
