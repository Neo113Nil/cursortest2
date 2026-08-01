package com.bykv.vk.openvk.component.video.api.vG;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.ktor.http.ContentDisposition;
import org.json.JSONObject;

/* compiled from: VideoInfo.java */
/* loaded from: classes.dex */
public class icD {
    private double Jd;
    private int Ju;
    private String Mxy;
    private String NB;
    private String Wyp;
    private int icD;
    private int kj;
    private int pvs;
    private double qh;
    private String sUS;
    private String so;
    private long vG;
    private String yiw;
    private float IP = -1.0f;
    private int bNS = 0;
    private int mnm = 0;
    private int vA = 0;
    private int cR = 0;
    private int zM = 307200;
    private int uc = 1;

    public int pvs() {
        return this.kj;
    }

    public void pvs(int i) {
        this.kj = i;
    }

    public int icD() {
        return this.pvs;
    }

    public void icD(int i) {
        this.pvs = i;
    }

    public int vG() {
        return this.icD;
    }

    public void vG(int i) {
        this.icD = i;
    }

    public int Jd() {
        return this.Ju;
    }

    public void Jd(int i) {
        this.Ju = i;
    }

    public long NB() {
        return this.vG;
    }

    public void pvs(long j) {
        this.vG = j;
    }

    public double sUS() {
        return this.Jd;
    }

    public void pvs(double d) {
        this.Jd = d;
    }

    public double yiw() {
        return this.qh;
    }

    public float so() {
        return this.IP;
    }

    public String Mxy() {
        return this.NB;
    }

    public void pvs(String str) {
        this.NB = str;
    }

    public String Wyp() {
        return this.sUS;
    }

    public void icD(String str) {
        this.sUS = str;
    }

    public String qh() {
        return this.yiw;
    }

    public void vG(String str) {
        this.yiw = str;
    }

    public String kj() {
        return this.so;
    }

    public void Jd(String str) {
        this.so = str;
    }

    public String Ju() {
        return this.Mxy;
    }

    public void NB(String str) {
        this.Mxy = str;
    }

    public String IP() {
        if (TextUtils.isEmpty(this.Wyp)) {
            this.Wyp = com.bykv.vk.openvk.component.video.api.sUS.icD.pvs(this.yiw);
        }
        return this.Wyp;
    }

    public void sUS(String str) {
        this.Wyp = str;
    }

    public int bNS() {
        if (this.zM < 0) {
            this.zM = 307200;
        }
        long j = this.zM;
        long j2 = this.vG;
        if (j > j2) {
            this.zM = (int) j2;
        }
        return this.zM;
    }

    public void NB(int i) {
        this.zM = i;
    }

    public int mnm() {
        return this.vA;
    }

    public void sUS(int i) {
        this.vA = i;
    }

    public int vA() {
        return this.cR;
    }

    public void yiw(int i) {
        this.cR = i;
    }

    public JSONObject cR() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", icD());
            jSONObject.put("cover_url", Wyp());
            jSONObject.put("cover_width", vG());
            jSONObject.put("endcard", kj());
            jSONObject.put("file_hash", IP());
            jSONObject.put("resolution", Mxy());
            jSONObject.put(ContentDisposition.Parameters.Size, NB());
            jSONObject.put("video_duration", sUS());
            jSONObject.put("video_url", qh());
            jSONObject.put("playable_download_url", Ju());
            jSONObject.put("if_playable_loading_show", zM());
            jSONObject.put("remove_loading_page_type", uc());
            jSONObject.put("fallback_endcard_judge", pvs());
            jSONObject.put("video_preload_size", bNS());
            jSONObject.put("reward_video_cached_type", mnm());
            jSONObject.put("execute_cached_type", vA());
            jSONObject.put("endcard_render", Jd());
            jSONObject.put("replay_time", OT());
            jSONObject.put("play_speed_ratio", so());
            if (yiw() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                jSONObject.put("start", yiw());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int zM() {
        return this.bNS;
    }

    public void so(int i) {
        this.bNS = i;
    }

    public int uc() {
        return this.mnm;
    }

    public void Mxy(int i) {
        this.mnm = i;
    }

    public boolean rCZ() {
        return this.vA == 0;
    }

    public void Wyp(int i) {
        this.uc = Math.min(4, Math.max(1, i));
    }

    public int OT() {
        return this.uc;
    }
}
