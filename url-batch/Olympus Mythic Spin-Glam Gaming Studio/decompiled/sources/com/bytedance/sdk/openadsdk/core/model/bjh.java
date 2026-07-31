package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class bjh {
    private int btk;
    private String bvs;
    private int fb;
    private int hhw;
    private ev kgc;
    private JSONObject klz;
    private fs kw;
    private int mw;
    private JSONObject nps;
    private boolean rc;
    private int rt;
    private int zmn;
    private int zn;
    private int fs = 10;
    private int zg = 1;
    private zmn iv = new zmn();
    private int cn = 1;
    private String cyb = "Next Ad";
    private String olo = "Next ad in %1$ds";

    public static bjh zmn(String str) {
        bjh bjhVar = new bjh();
        if (str == null) {
            return bjhVar;
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            bjhVar.zmn = jsonObjectInit.optInt("auto_switch");
            bjhVar.fs = jsonObjectInit.optInt("playable_preload_count");
            bjhVar.zn = jsonObjectInit.optInt("disable_on_interaction");
            bjhVar.fb = jsonObjectInit.optInt("ceiling_type");
            bjhVar.btk = jsonObjectInit.optInt("can_loop");
            bjhVar.hhw = jsonObjectInit.optInt("multi_skip_time", -1);
            bjhVar.zg = jsonObjectInit.optInt("load_more_strategy");
            bjhVar.cn = jsonObjectInit.optInt("report_show_by_percent", 1);
            JSONObject optJSONObject = jsonObjectInit.optJSONObject("gesture_tpl_info");
            bjhVar.nps = optJSONObject;
            if (optJSONObject != null) {
                ev zmn2 = ev.zmn(optJSONObject);
                bjhVar.kgc = zmn2;
                if (zmn2 != null && !TextUtils.isEmpty(zmn2.zn())) {
                    com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn(new com.bytedance.sdk.openadsdk.core.mw.zg.zmn().zmn(bjhVar.kgc.zmn()).fs(bjhVar.kgc.fs()).zn(bjhVar.kgc.zn()).fb(bjhVar.kgc.fb()), "guide");
                }
                int optInt = bjhVar.nps.optInt("delay_show_time", 5);
                bjhVar.mw = optInt;
                if (optInt < 0) {
                    bjhVar.mw = 5;
                }
                int optInt2 = bjhVar.nps.optInt("dismiss_after_idle_time", 3);
                bjhVar.rt = optInt2;
                if (optInt2 <= 0) {
                    bjhVar.rt = 3;
                }
            }
            bjhVar.bvs = jsonObjectInit.optString("agg_endcard_url");
            bjhVar.rc = jsonObjectInit.optBoolean("has_more");
            bjhVar.klz = jsonObjectInit.optJSONObject("session_params");
            bjhVar.iv = zmn.zmn(jsonObjectInit.optJSONObject("layout_config"));
            bjhVar.kw = fs.zmn(jsonObjectInit.optJSONObject("progress_config"));
        } catch (JSONException unused) {
        }
        return bjhVar;
    }

    public boolean zmn() {
        return this.cn == 1;
    }

    public JSONObject fs() {
        ev evVar = this.kgc;
        if (evVar == null) {
            return null;
        }
        try {
            String fb = evVar.fb();
            if (!TextUtils.isEmpty(fb)) {
                return PangleNetworkBridge.jsonObjectInit(fb);
            }
            String zmn2 = com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn("guide", this.kgc.zmn(), this.kgc.fs());
            if (TextUtils.isEmpty(zmn2)) {
                return null;
            }
            return PangleNetworkBridge.jsonObjectInit(zmn2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject zn() {
        ev evVar = this.kgc;
        if (evVar == null) {
            return null;
        }
        return evVar.btk();
    }

    public int fb() {
        return this.mw;
    }

    public int btk() {
        return this.rt;
    }

    public zmn hhw() {
        return this.iv;
    }

    public String nps() {
        return this.bvs;
    }

    public int zg() {
        return this.zg;
    }

    public int bvs() {
        return this.hhw;
    }

    public boolean iv() {
        return this.btk == 1;
    }

    public boolean rc() {
        return this.fb == 1;
    }

    public JSONObject klz() {
        return this.klz;
    }

    public boolean mw() {
        return this.rc;
    }

    public boolean rt() {
        return this.zn == 1;
    }

    public boolean cn() {
        return this.zmn == 1;
    }

    public int cyb() {
        return this.fs;
    }

    public fs olo() {
        return this.kw;
    }

    public static class zmn {
        private int btk;
        private int fb;
        private int fs;
        private int zmn;
        private int zn;

        public static zmn zmn(JSONObject jSONObject) {
            zmn zmnVar = new zmn();
            if (jSONObject == null) {
                return zmnVar;
            }
            zmnVar.zmn = Math.max(0, jSONObject.optInt("padding_left", 0));
            zmnVar.fs = Math.max(0, jSONObject.optInt("padding_right", 0));
            zmnVar.zn = Math.max(0, jSONObject.optInt("padding_top", 0));
            zmnVar.fb = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            zmnVar.btk = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return zmnVar;
        }

        public int zmn() {
            return this.fb;
        }

        public int fs() {
            return this.zn;
        }

        public int zn() {
            return this.zmn;
        }

        public int fb() {
            return this.fs;
        }

        public int btk() {
            return this.btk;
        }
    }

    public static class fs {
        private float btk;
        private float fb;
        private String fs;
        private int zmn;
        private String zn;

        public static fs zmn(JSONObject jSONObject) {
            fs fsVar = new fs();
            if (jSONObject == null) {
                return fsVar;
            }
            fsVar.zmn = jSONObject.optInt("progress_type", 0);
            fsVar.fs = jSONObject.optString("progress_color");
            fsVar.zn = jSONObject.optString("progress_background_color");
            fsVar.fb = jSONObject.optInt("progress_size", 0);
            fsVar.btk = jSONObject.optInt("bar_radius", 0);
            return fsVar;
        }

        public int zmn() {
            return this.zmn;
        }

        public String fs() {
            return this.fs;
        }

        public String zn() {
            return this.zn;
        }

        public float fb() {
            return this.fb;
        }

        public float btk() {
            return this.btk;
        }
    }
}
