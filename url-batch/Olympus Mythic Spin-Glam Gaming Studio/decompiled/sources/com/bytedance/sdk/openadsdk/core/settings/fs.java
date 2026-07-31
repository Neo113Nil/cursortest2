package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fs {
    public boolean am;
    public int bjh;
    public int btk;
    public int bvs;
    public int cn;
    public int cyb;
    public int doe;
    public JSONObject ev;
    public int fb;
    public int fs;
    public int hhw;
    public int iqz;
    public int iv;
    public int kgc;
    public int kjb;
    public int klz;
    public int kw;
    public int mw;
    public int nps;
    public List<String> nqi;
    public int olo;
    public boolean phc;
    public int rc;
    public int rp;
    public int rt;
    public int so;
    public int uqh;
    public boolean yj;
    public boolean zak;
    public int zg;
    public String zmn;
    public int zn;

    private static boolean zmn(int i) {
        return i == 1 || i == 2;
    }

    public fs(JSONObject jSONObject) {
        this.fs = 1;
        this.zn = 1;
        this.fb = 2;
        this.btk = 1;
        this.hhw = 100;
        this.nps = 0;
        this.zg = 2;
        this.bvs = 1;
        this.iv = 3;
        this.rc = 30;
        this.klz = 30;
        this.mw = 1;
        this.rt = 1;
        this.cn = 2;
        this.cyb = 5000;
        this.olo = 2;
        this.kgc = 3500;
        this.kw = 0;
        this.iqz = 5;
        this.phc = false;
        this.doe = 0;
        this.uqh = 2;
        this.bjh = 0;
        this.rp = 0;
        this.kjb = 5;
        this.zak = true;
        this.am = false;
        this.yj = false;
        this.so = -1;
        new JSONObject();
        this.ev = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.zmn = jSONObject.optString("code_id");
        this.fs = jSONObject.optInt("auto_play", 1);
        this.so = jSONObject.optInt("endcard_close_time", -1);
        this.zn = jSONObject.optInt("voice_control", 1);
        this.fb = jSONObject.optInt("rv_preload", 2);
        this.btk = jSONObject.optInt("nv_preload", 1);
        this.hhw = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.nps = jSONObject.optInt("skip_time_displayed", 0);
        this.zg = jSONObject.optInt("video_skip_result", 2);
        this.bvs = jSONObject.optInt("reg_creative_control", 1);
        this.iv = jSONObject.optInt("play_bar_show_time", 3);
        int optInt = jSONObject.optInt("rv_skip_time", 30);
        this.rc = optInt;
        if (optInt < 0) {
            this.rc = 30;
        }
        this.mw = jSONObject.optInt("voice_control", 1);
        this.rt = jSONObject.optInt("if_show_win", 1);
        this.cn = jSONObject.optInt("sp_preload", 2);
        this.cyb = jSONObject.optInt("stop_time", 5000);
        this.olo = jSONObject.optInt("native_playable_delay", 2);
        this.kgc = jSONObject.optInt("time_out_control", -1);
        this.kw = jSONObject.optInt("playable_reward_type", 0);
        this.doe = jSONObject.optInt("reward_is_callback", 0);
        int optInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.iqz = optInt2;
        if (optInt2 < 0) {
            this.iqz = 5;
        }
        zmn(jSONObject.optJSONArray("parent_tpl_ids"));
        this.uqh = jSONObject.optInt("slot_type", 2);
        this.phc = jSONObject.optBoolean("close_on_click", false);
        this.bjh = jSONObject.optInt("allow_system_back", 0);
        this.rp = jSONObject.optInt("splash_skip_time", 0);
        this.kjb = jSONObject.optInt("splash_image_count_down_time", 5);
        this.am = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.yj = jSONObject.optBoolean("splash_close_on_click", false);
        this.zak = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!zmn(this.zn)) {
            this.zn = 1;
        }
        if (!zmn(this.mw)) {
            this.mw = 1;
        }
        this.klz = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    public fs(String str, int i) {
        this.fs = 1;
        this.zn = 1;
        this.fb = 2;
        this.btk = 1;
        this.hhw = 100;
        this.nps = 0;
        this.zg = 2;
        this.bvs = 1;
        this.iv = 3;
        this.rc = 30;
        this.klz = 30;
        this.mw = 1;
        this.rt = 1;
        this.cn = 2;
        this.cyb = 5000;
        this.olo = 2;
        this.kgc = 3500;
        this.kw = 0;
        this.iqz = 5;
        this.phc = false;
        this.doe = 0;
        this.uqh = 2;
        this.bjh = 0;
        this.rp = 0;
        this.kjb = 5;
        this.zak = true;
        this.am = false;
        this.yj = false;
        this.so = -1;
        this.ev = new JSONObject();
        this.zmn = str;
        this.zn = i;
    }

    public void zmn(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.nqi = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.nqi.add(jSONArray.get(i).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }
}
