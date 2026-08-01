package com.bytedance.sdk.openadsdk.core.settings;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdSlotSetter.java */
/* loaded from: classes2.dex */
public class icD {
    public int CvL;
    public int Gp;
    public int IP;
    public int Jd;
    public int Ju;
    public int Mxy;
    public int NB;
    public int OT;
    public long OhP;
    public int Pj;
    public String SE;
    public int Wyp;
    public int ZhG;
    public boolean ae;
    public int bNS;
    public int cR;
    public boolean cRf;
    public int dX;
    public int dx;
    public int dyT;
    public JSONObject ea;
    public boolean gA;
    public int gSd;
    public int icD;
    public String jhZ;
    public boolean jlb;
    public int kj;
    public int mnm;
    public List<String> ny;
    public int od;
    public String pvs;
    public int qD;
    public int qh;
    public boolean rCZ;
    public int sP;
    public int sUS;
    public int so;
    public List<so> sq;
    public int uc;
    public int vA;
    public int vG;
    public List<so> yWX;
    public int yiw;
    public int zM;

    private static boolean pvs(int i) {
        return i == 1 || i == 2;
    }

    public icD(JSONObject jSONObject) {
        this.icD = 1;
        this.vG = 1;
        this.Jd = 2;
        this.NB = 1;
        this.sUS = 100;
        this.yiw = 0;
        this.so = 2;
        this.Mxy = 1;
        this.Wyp = 3;
        this.qh = 30;
        this.kj = 30;
        this.Ju = 1;
        this.IP = 1;
        this.bNS = 2;
        this.mnm = 1500;
        this.vA = 2;
        this.cR = 3500;
        this.zM = 0;
        this.uc = 5;
        this.rCZ = false;
        this.OT = 0;
        this.ZhG = 2;
        this.dyT = -1;
        this.dX = 0;
        this.CvL = 0;
        this.Gp = 5;
        this.ae = true;
        this.gA = false;
        this.jlb = false;
        this.dx = 0;
        this.Pj = -1;
        this.cRf = false;
        this.sP = 60000;
        this.gSd = 2;
        this.qD = 1000;
        this.od = 1;
        this.yWX = new ArrayList();
        this.sq = new ArrayList();
        new JSONObject();
        this.ea = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.pvs = jSONObject.optString("code_id");
        this.icD = jSONObject.optInt("auto_play", 1);
        this.Pj = jSONObject.optInt("endcard_close_time", -1);
        this.vG = jSONObject.optInt("voice_control", 1);
        this.Jd = jSONObject.optInt("rv_preload", 2);
        this.NB = jSONObject.optInt("nv_preload", 1);
        this.sUS = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.yiw = jSONObject.optInt("skip_time_displayed", 0);
        this.so = jSONObject.optInt("video_skip_result", 2);
        this.Mxy = jSONObject.optInt("reg_creative_control", 1);
        this.Wyp = jSONObject.optInt("play_bar_show_time", 3);
        int optInt = jSONObject.optInt("rv_skip_time", 30);
        this.qh = optInt;
        if (optInt < 0) {
            this.qh = 30;
        }
        this.Ju = jSONObject.optInt("voice_control", 2);
        this.IP = jSONObject.optInt("if_show_win", 1);
        this.bNS = jSONObject.optInt("sp_preload", 2);
        this.mnm = jSONObject.optInt("stop_time", 1500);
        this.vA = jSONObject.optInt("native_playable_delay", 2);
        this.cR = jSONObject.optInt("time_out_control", -1);
        this.dyT = jSONObject.optInt("playable_close_time", -1);
        this.zM = jSONObject.optInt("playable_reward_type", 0);
        this.OT = jSONObject.optInt("reward_is_callback", 0);
        int optInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.uc = optInt2;
        if (optInt2 < 0) {
            this.uc = 5;
        }
        pvs(jSONObject.optJSONArray("parent_tpl_ids"));
        this.ZhG = jSONObject.optInt("slot_type", 2);
        this.rCZ = jSONObject.optBoolean("close_on_click", false);
        this.dX = jSONObject.optInt("allow_system_back", 0);
        this.CvL = jSONObject.optInt("splash_skip_time", 0);
        this.Gp = jSONObject.optInt("splash_image_count_down_time", 5);
        this.gA = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.jlb = jSONObject.optBoolean("splash_close_on_click", false);
        int optInt3 = jSONObject.optInt("splash_load_strategy", 0);
        this.dx = optInt3;
        if (optInt3 < 0 || optInt3 > 1) {
            this.dx = 0;
        }
        this.ae = jSONObject.optBoolean("allow_mediaview_click", true);
        int optInt4 = jSONObject.optInt("total_time_out", 60000);
        this.sP = optInt4;
        if (optInt4 <= 0 || optInt4 > 1800000) {
            this.sP = 60000;
        }
        int optInt5 = jSONObject.optInt("req_parallel_num", 2);
        this.gSd = optInt5;
        if (optInt5 <= 0 || optInt5 > 4) {
            this.gSd = 2;
        }
        this.qD = jSONObject.optInt("bidding_token_tmax", 1000);
        int optInt6 = jSONObject.optInt("ad_load_type", 1);
        this.od = optInt6;
        if (optInt6 <= 0 || optInt6 > 2) {
            this.od = 1;
        }
        boolean optBoolean = jSONObject.optBoolean("is_mediation", false);
        this.cRf = optBoolean;
        if (optBoolean) {
            mnm.Lxj().Zm();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("mediation_config");
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("adn_name");
                String optString2 = optJSONObject.optString("adn_slot_id");
                int optInt7 = optJSONObject.optInt("ad_expired_time", 3600000);
                int optInt8 = optJSONObject.optInt("req_bidding_type", 2);
                String optString3 = optJSONObject.optString("rit_cpm");
                int optInt9 = optJSONObject.optInt("show_sort");
                int optInt10 = optJSONObject.optInt("layer_time_out", AdError.SERVER_ERROR_CODE);
                int i2 = (optInt10 <= 0 || optInt10 > 60000) ? 2000 : optInt10;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("server_params");
                if (optInt8 == 2) {
                    arrayList.add(new so(optString, optString2, optInt7, optInt8, optString3, optInt9, i2, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                } else if (optInt8 == 0) {
                    arrayList2.add(new so(optString, optString2, optInt7, optInt8, optString3, optInt9, i2, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                }
            }
            this.yWX = arrayList;
            this.sq = arrayList2;
            Collections.sort(arrayList);
            Collections.sort(this.sq);
        }
        if (!pvs(this.vG)) {
            this.vG = 1;
        }
        if (!pvs(this.Ju)) {
            this.Ju = 1;
        }
        this.OhP = jSONObject.optLong("waterfall_id");
        String optString4 = jSONObject.optString("waterfall_version");
        this.jhZ = optString4;
        this.SE = optString4;
        this.kj = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    public icD(String str, int i) {
        this.icD = 1;
        this.vG = 1;
        this.Jd = 2;
        this.NB = 1;
        this.sUS = 100;
        this.yiw = 0;
        this.so = 2;
        this.Mxy = 1;
        this.Wyp = 3;
        this.qh = 30;
        this.kj = 30;
        this.Ju = 1;
        this.IP = 1;
        this.bNS = 2;
        this.mnm = 1500;
        this.vA = 2;
        this.cR = 3500;
        this.zM = 0;
        this.uc = 5;
        this.rCZ = false;
        this.OT = 0;
        this.ZhG = 2;
        this.dyT = -1;
        this.dX = 0;
        this.CvL = 0;
        this.Gp = 5;
        this.ae = true;
        this.gA = false;
        this.jlb = false;
        this.dx = 0;
        this.Pj = -1;
        this.cRf = false;
        this.sP = 60000;
        this.gSd = 2;
        this.qD = 1000;
        this.od = 1;
        this.yWX = new ArrayList();
        this.sq = new ArrayList();
        this.ea = new JSONObject();
        this.pvs = str;
        this.vG = i;
    }

    public void pvs(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.ny = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.ny.add(jSONArray.get(i).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }
}
