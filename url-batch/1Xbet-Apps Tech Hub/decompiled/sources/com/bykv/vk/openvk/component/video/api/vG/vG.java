package com.bykv.vk.openvk.component.video.api.vG;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: VideoUrlModel.java */
/* loaded from: classes.dex */
public class vG implements Serializable {
    private String IP;
    public int Jd;
    private int Ju;
    private icD NB;
    private long bNS;
    private int cR;
    public int icD;
    private int kj;
    private boolean mnm;
    public String pvs;
    private String qh;
    private icD sUS;
    private boolean vA;
    private String yiw;
    private int zM;
    private int so = 204800;
    private int Mxy = 0;
    private int Wyp = 0;
    public final HashMap<String, Object> vG = new HashMap<>();
    private int uc = 10000;
    private int rCZ = 10000;
    private int OT = 10000;
    private int ny = 0;
    private JSONObject ZhG = new JSONObject();

    public vG(String str, icD icd, icD icd2, int i, int i2) {
        this.cR = 0;
        this.zM = 0;
        this.yiw = str;
        this.NB = icd;
        this.sUS = icd2;
        this.cR = i;
        this.zM = i2;
    }

    public int pvs() {
        return this.ZhG.optInt("pitaya_cache_size", 0);
    }

    public String icD() {
        return this.yiw;
    }

    public void pvs(String str) {
        this.yiw = str;
    }

    public int vG() {
        if (qh()) {
            return this.sUS.bNS();
        }
        icD icd = this.NB;
        if (icd != null) {
            return icd.bNS();
        }
        return 0;
    }

    public boolean Jd() {
        return this.vA;
    }

    public void icD(String str) {
        this.qh = str;
    }

    public int NB() {
        return this.kj;
    }

    public void pvs(int i) {
        this.kj = i;
    }

    public int sUS() {
        return this.Ju;
    }

    public void icD(int i) {
        this.Ju = i;
    }

    public void vG(String str) {
        this.IP = str;
    }

    public long yiw() {
        return this.bNS;
    }

    public void pvs(long j) {
        this.bNS = j;
    }

    public boolean so() {
        return this.mnm;
    }

    public void pvs(boolean z) {
        this.mnm = z;
    }

    public long Mxy() {
        if (qh()) {
            return this.sUS.NB();
        }
        icD icd = this.NB;
        if (icd != null) {
            return icd.NB();
        }
        return 0L;
    }

    public boolean Wyp() {
        if (qh()) {
            return this.sUS.rCZ();
        }
        icD icd = this.NB;
        if (icd != null) {
            return icd.rCZ();
        }
        return true;
    }

    public void Jd(String str) {
        this.pvs = str;
    }

    public void vG(int i) {
        this.icD = i;
    }

    public boolean qh() {
        icD icd;
        if (this.zM == 1 && (icd = this.sUS) != null && !TextUtils.isEmpty(icd.qh())) {
            if (com.bykv.vk.openvk.component.video.api.vG.sUS() == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.cR == 1) {
                return true;
            }
        }
        return false;
    }

    public float kj() {
        if (qh()) {
            return this.sUS.so();
        }
        icD icd = this.NB;
        if (icd != null) {
            return icd.so();
        }
        return -1.0f;
    }

    public String Ju() {
        if (qh()) {
            return this.sUS.qh();
        }
        icD icd = this.NB;
        if (icd != null) {
            return icd.qh();
        }
        return null;
    }

    public String IP() {
        if (qh()) {
            return this.sUS.IP();
        }
        icD icd = this.NB;
        if (icd != null) {
            return icd.IP();
        }
        return null;
    }

    public int bNS() {
        return this.cR;
    }

    public synchronized void pvs(String str, Object obj) {
        this.vG.put(str, obj);
    }

    public synchronized Object NB(String str) {
        return this.vG.get(str);
    }

    public int mnm() {
        return this.uc;
    }

    public void Jd(int i) {
        this.uc = i;
    }

    public int vA() {
        return this.rCZ;
    }

    public void NB(int i) {
        this.rCZ = i;
    }

    public int cR() {
        return this.OT;
    }

    public void sUS(int i) {
        this.OT = i;
    }

    public int zM() {
        return this.ny;
    }

    public void yiw(int i) {
        this.ny = i;
    }

    public icD uc() {
        return this.NB;
    }

    public icD rCZ() {
        return this.sUS;
    }
}
