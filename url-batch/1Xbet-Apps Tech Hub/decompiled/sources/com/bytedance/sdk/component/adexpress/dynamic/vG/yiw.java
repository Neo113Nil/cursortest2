package com.bytedance.sdk.component.adexpress.dynamic.vG;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.qh;
import org.json.JSONObject;

/* compiled from: DynamicLayoutNativeValue.java */
/* loaded from: classes.dex */
public class yiw {
    private sUS Jd;
    private NB NB;
    public String icD;
    public int pvs;
    private String sUS;
    public JSONObject vG;

    public yiw(NB nb) {
        this.NB = nb;
        this.pvs = nb.pvs();
        this.icD = nb.vG();
        this.vG = nb.NB().HWd();
        this.sUS = nb.Jd();
        if (com.bytedance.sdk.component.adexpress.Jd.vG() == 1) {
            this.Jd = nb.yiw();
        } else {
            this.Jd = nb.NB();
        }
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            this.Jd = nb.NB();
        }
    }

    public int pvs() {
        return (int) this.Jd.IP();
    }

    public int icD() {
        return (int) this.Jd.vA();
    }

    public int vG() {
        return (int) this.Jd.bNS();
    }

    public int Jd() {
        return (int) this.Jd.mnm();
    }

    public float NB() {
        return this.Jd.cR();
    }

    public String sUS() {
        if (this.pvs != 0) {
            return "";
        }
        if (!TextUtils.isEmpty(this.icD)) {
            return this.icD;
        }
        return this.vG.optString(com.bytedance.sdk.component.adexpress.Jd.yiw.vG(com.bytedance.sdk.component.adexpress.Jd.pvs()));
    }

    public int yiw() {
        return pvs(this.Jd.OT());
    }

    public int so() {
        String rCZ = this.Jd.rCZ();
        if ("left".equals(rCZ)) {
            return 17;
        }
        if ("center".equals(rCZ)) {
            return 4;
        }
        return "right".equals(rCZ) ? 3 : 2;
    }

    public int Mxy() {
        int so = so();
        if (so == 4) {
            return 17;
        }
        return so == 3 ? GravityCompat.END : GravityCompat.START;
    }

    public String Wyp() {
        int i = this.pvs;
        return (i == 2 || i == 13) ? this.icD : "";
    }

    public String qh() {
        return this.pvs == 1 ? this.icD : "";
    }

    public String kj() {
        return this.sUS;
    }

    public double Ju() {
        if (this.pvs == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.Jd.icD() ? (int) r0 : Double.parseDouble(this.icD);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public double IP() {
        return this.Jd.zM();
    }

    public float bNS() {
        return this.Jd.qh();
    }

    public int mnm() {
        return pvs(this.Jd.dX());
    }

    public float vA() {
        return this.Jd.kj();
    }

    public int cR() {
        return this.Jd.GcG();
    }

    public int zM() {
        return this.Jd.Lxj();
    }

    public boolean uc() {
        return this.Jd.nS();
    }

    public String rCZ() {
        return this.Jd.ZhG();
    }

    public void pvs(float f) {
        this.Jd.pvs(f);
    }

    public boolean OT() {
        return this.Jd.SE();
    }

    public int ny() {
        return this.Jd.yWX();
    }

    public String ZhG() {
        return this.Jd.qD();
    }

    public String dyT() {
        return this.Jd.mo();
    }

    public long dX() {
        return this.Jd.zn();
    }

    public int CvL() {
        String qD = this.Jd.qD();
        if ("skip-with-time-skip-btn".equals(this.NB.icD()) || "skip".equals(this.NB.icD()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.NB.icD())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.NB.icD()) && !"skip-with-time".equals(this.NB.icD())) {
            if (this.pvs == 10 && TextUtils.equals(this.Jd.od(), "click")) {
                return 5;
            }
            if (rcB() && UYh()) {
                return 0;
            }
            if (rcB()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.NB.icD())) {
                return 3;
            }
            if (!TextUtils.isEmpty(qD) && !qD.equals("none")) {
                if (qD.equals("video") || (this.NB.pvs() == 7 && TextUtils.equals(qD, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.Jd.icD() && this.NB.NB() != null && this.NB.NB().BiC()) ? 11 : 4;
                }
                if (qD.equals("normal")) {
                    return 1;
                }
                return (qD.equals("creative") || "slide".equals(this.Jd.od())) ? 2 : 0;
            }
        }
        return 0;
    }

    private boolean rcB() {
        return (com.bytedance.sdk.component.adexpress.Jd.icD() && (this.NB.icD().contains("logo-union") || this.NB.icD().contains("logounion") || this.NB.icD().contains("logoad"))) || "logo-union".equals(this.NB.icD()) || "logounion".equals(this.NB.icD()) || "logoad".equals(this.NB.icD());
    }

    public int Gp() {
        return pvs(this.Jd.ny());
    }

    public double ae() {
        return this.Jd.so();
    }

    public int gA() {
        return this.Jd.vG();
    }

    public int jlb() {
        return this.Jd.icD();
    }

    public int dx() {
        return this.Jd.NB();
    }

    public int Pj() {
        return this.Jd.Jd();
    }

    public int cRf() {
        return this.Jd.Mxy();
    }

    public String sP() {
        return this.Jd.Wyp();
    }

    public String gSd() {
        return this.Jd.od();
    }

    private boolean UYh() {
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.icD) && this.icD.contains("adx:")) || qh.icD();
    }

    public static int pvs(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (split.length == 4) {
                    return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public static float[] icD(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (split == null || split.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    public boolean pvs(int i) {
        NB nb = this.NB;
        if (nb == null) {
            return false;
        }
        if (i == 1) {
            this.Jd = nb.yiw();
        } else {
            this.Jd = nb.NB();
        }
        return this.Jd != null;
    }

    public boolean qD() {
        return this.Jd.Ayu();
    }

    public int od() {
        return this.Jd.elv();
    }

    public int OhP() {
        return this.Jd.tQ();
    }

    public String jhZ() {
        return this.Jd.gSd();
    }

    public boolean SE() {
        return this.Jd.mRq();
    }

    public int yWX() {
        return this.Jd.yiw();
    }

    public int sq() {
        return this.Jd.RGX();
    }

    public int ea() {
        return this.Jd.Irm();
    }

    public int ZsW() {
        return this.Jd.SJ();
    }

    public int CjQ() {
        return this.Jd.wjr();
    }

    public boolean BSi() {
        return this.Jd.ig();
    }

    public String cnN() {
        return this.Jd.ae();
    }

    public String OyE() {
        return this.Jd.Mnp();
    }

    public String joF() {
        return this.Jd.qVe();
    }

    public boolean thO() {
        return this.Jd.Ju();
    }

    public boolean qd() {
        return this.Jd.jlb();
    }

    public String rW() {
        return this.Jd.gA();
    }

    public int Cwg() {
        return this.Jd.dx();
    }

    public int neB() {
        return this.Jd.Pj();
    }

    public double cGU() {
        return this.Jd.cRf();
    }

    public double Ca() {
        return this.Jd.sP();
    }

    public int Zm() {
        return this.Jd.Tdd();
    }

    public String HWd() {
        return this.Jd.LHy();
    }

    public String Ye() {
        return this.Jd.pR();
    }

    public boolean Ayu() {
        return this.Jd.EFw();
    }

    public int tQ() {
        return this.Jd.FN();
    }

    public int elv() {
        return this.Jd.AEt();
    }

    public int tCd() {
        return this.Jd.sR();
    }

    public boolean Wby() {
        return this.Jd.ig();
    }

    public String MY() {
        return this.Jd.dyT();
    }
}
