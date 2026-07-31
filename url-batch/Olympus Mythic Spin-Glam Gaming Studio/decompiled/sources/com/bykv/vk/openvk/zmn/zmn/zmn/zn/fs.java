package com.bykv.vk.openvk.zmn.zmn.zmn.zn;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class fs {
    private String btk;
    private String bvs;
    private double fb;
    private int fs;
    private String hhw;
    private String iv;
    private int klz;
    private int mw;
    private String nps;
    private double rc;
    private String zg;
    private int zmn;
    private long zn;
    private float rt = -1.0f;
    private int cn = 0;
    private int cyb = 0;
    private int olo = 0;
    private int kgc = 0;
    private int kw = 307200;
    private int iqz = 1;

    public int zmn() {
        return this.klz;
    }

    public void zmn(int i) {
        this.klz = i;
    }

    public int fs() {
        return this.zmn;
    }

    public void fs(int i) {
        this.zmn = i;
    }

    public int zn() {
        return this.fs;
    }

    public void zn(int i) {
        this.fs = i;
    }

    public int fb() {
        return this.mw;
    }

    public void fb(int i) {
        this.mw = i;
    }

    public long btk() {
        return this.zn;
    }

    public void zmn(long j) {
        this.zn = j;
    }

    public double hhw() {
        return this.fb;
    }

    public void zmn(double d) {
        this.fb = d;
    }

    public double nps() {
        return this.rc;
    }

    public float zg() {
        return this.rt;
    }

    public String bvs() {
        return this.btk;
    }

    public void zmn(String str) {
        this.btk = str;
    }

    public String iv() {
        return this.hhw;
    }

    public void fs(String str) {
        this.hhw = str;
    }

    public String rc() {
        return this.nps;
    }

    public void zn(String str) {
        this.nps = str;
    }

    public String klz() {
        return this.zg;
    }

    public void fb(String str) {
        this.zg = str;
    }

    public String mw() {
        return this.bvs;
    }

    public void btk(String str) {
        this.bvs = str;
    }

    public String rt() {
        if (TextUtils.isEmpty(this.iv)) {
            this.iv = com.bykv.vk.openvk.zmn.zmn.zmn.nps.fs.zmn(this.nps);
        }
        return this.iv;
    }

    public void hhw(String str) {
        this.iv = str;
    }

    public int cn() {
        if (this.kw < 0) {
            this.kw = 307200;
        }
        long j = this.kw;
        long j2 = this.zn;
        if (j > j2) {
            this.kw = (int) j2;
        }
        return this.kw;
    }

    public void btk(int i) {
        this.kw = i;
    }

    public int cyb() {
        return this.olo;
    }

    public void hhw(int i) {
        this.olo = i;
    }

    public int olo() {
        return this.kgc;
    }

    public void nps(int i) {
        this.kgc = i;
    }

    public JSONObject kgc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", fs());
            jSONObject.put("cover_url", iv());
            jSONObject.put("cover_width", zn());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, klz());
            jSONObject.put("file_hash", rt());
            jSONObject.put("resolution", bvs());
            jSONObject.put("size", btk());
            jSONObject.put("video_duration", hhw());
            jSONObject.put("video_url", rc());
            jSONObject.put("playable_download_url", mw());
            jSONObject.put("if_playable_loading_show", kw());
            jSONObject.put("remove_loading_page_type", iqz());
            jSONObject.put("fallback_endcard_judge", zmn());
            jSONObject.put("video_preload_size", cn());
            jSONObject.put("reward_video_cached_type", cyb());
            jSONObject.put("execute_cached_type", olo());
            jSONObject.put("endcard_render", fb());
            jSONObject.put("replay_time", doe());
            jSONObject.put("play_speed_ratio", zg());
            if (nps() > 0.0d) {
                jSONObject.put("start", nps());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int kw() {
        return this.cn;
    }

    public void zg(int i) {
        this.cn = i;
    }

    public int iqz() {
        return this.cyb;
    }

    public void bvs(int i) {
        this.cyb = i;
    }

    public boolean phc() {
        return this.olo == 0;
    }

    public void iv(int i) {
        this.iqz = Math.min(4, Math.max(1, i));
    }

    public int doe() {
        return this.iqz;
    }
}
