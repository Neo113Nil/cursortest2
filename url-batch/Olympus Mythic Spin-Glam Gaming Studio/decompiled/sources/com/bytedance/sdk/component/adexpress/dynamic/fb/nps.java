package com.bytedance.sdk.component.adexpress.dynamic.fb;

import android.graphics.Color;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.btk.rc;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class nps {
    private btk btk;
    private hhw fb;
    public String fs;
    private String hhw;
    public int zmn;
    public JSONObject zn;

    public nps(btk btkVar) {
        this.btk = btkVar;
        this.zmn = btkVar.zmn();
        this.fs = btkVar.zn();
        this.zn = btkVar.btk().rje();
        this.hhw = btkVar.fb();
        if (com.bytedance.sdk.component.adexpress.fb.zn() == 1) {
            this.fb = btkVar.nps();
        } else {
            this.fb = btkVar.btk();
        }
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            this.fb = btkVar.btk();
        }
    }

    public int zmn() {
        return (int) this.fb.rt();
    }

    public int fs() {
        return (int) this.fb.olo();
    }

    public int zn() {
        return (int) this.fb.cn();
    }

    public int fb() {
        return (int) this.fb.cyb();
    }

    public float btk() {
        return this.fb.kgc();
    }

    public String hhw() {
        if (this.zmn == 0) {
            if (!TextUtils.isEmpty(this.fs)) {
                return this.fs;
            }
            return this.zn.optString(com.bytedance.sdk.component.adexpress.fb.nps.zn(com.bytedance.sdk.component.adexpress.fb.zmn()));
        }
        return "";
    }

    public int nps() {
        return zmn(this.fb.doe());
    }

    public int zg() {
        String phc = this.fb.phc();
        if ("left".equals(phc)) {
            return 17;
        }
        if ("center".equals(phc)) {
            return 4;
        }
        return "right".equals(phc) ? 3 : 2;
    }

    public int bvs() {
        int zg = zg();
        if (zg == 4) {
            return 17;
        }
        return zg == 3 ? 8388613 : 8388611;
    }

    public String iv() {
        int i = this.zmn;
        if (i == 2 || i == 13) {
            return this.fs;
        }
        return "";
    }

    public String rc() {
        if (this.zmn == 1) {
            return this.fs;
        }
        return "";
    }

    public String klz() {
        return this.hhw;
    }

    public double mw() {
        if (this.zmn == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.fb.fs() ? (int) r0 : Double.parseDouble(this.fs);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public double rt() {
        return this.fb.kw();
    }

    public float cn() {
        return this.fb.rc();
    }

    public int cyb() {
        return zmn(this.fb.rp());
    }

    public float olo() {
        return this.fb.klz();
    }

    public int kgc() {
        return this.fb.lgz();
    }

    public int kw() {
        return this.fb.vpd();
    }

    public boolean iqz() {
        return this.fb.va();
    }

    public String phc() {
        return this.fb.uqh();
    }

    public void zmn(float f) {
        this.fb.zmn(f);
    }

    public boolean doe() {
        return this.fb.yof();
    }

    public int nqi() {
        return this.fb.dgt();
    }

    public String uqh() {
        return this.fb.ww();
    }

    public String bjh() {
        return this.fb.sl();
    }

    public long rp() {
        return this.fb.db();
    }

    public int kjb() {
        String ww = this.fb.ww();
        if ("skip-with-time-skip-btn".equals(this.btk.fs()) || "skip".equals(this.btk.fs()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.btk.fs())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.btk.fs()) && !"skip-with-time".equals(this.btk.fs())) {
            if (this.zmn == 10 && TextUtils.equals(this.fb.oub(), "click")) {
                return 5;
            }
            if (obg() && nlz()) {
                return 0;
            }
            if (obg()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.btk.fs())) {
                return 3;
            }
            if (!TextUtils.isEmpty(ww) && !ww.equals("none")) {
                if (ww.equals("video") || (this.btk.zmn() == 7 && TextUtils.equals(ww, Constants.NORMAL))) {
                    return (com.bytedance.sdk.component.adexpress.fb.fs() && this.btk.btk() != null && this.btk.btk().ljl()) ? 11 : 4;
                }
                if (ww.equals(Constants.NORMAL)) {
                    return 1;
                }
                return (ww.equals("creative") || "slide".equals(this.fb.oub())) ? 2 : 0;
            }
        }
        return 0;
    }

    private boolean obg() {
        return (com.bytedance.sdk.component.adexpress.fb.fs() && (this.btk.fs().contains("logo-union") || this.btk.fs().contains("logounion") || this.btk.fs().contains("logoad"))) || "logo-union".equals(this.btk.fs()) || "logounion".equals(this.btk.fs()) || "logoad".equals(this.btk.fs());
    }

    public int zak() {
        return zmn(this.fb.nqi());
    }

    public double am() {
        return this.fb.zg();
    }

    public int yj() {
        return this.fb.zn();
    }

    public int so() {
        return this.fb.fs();
    }

    public int ev() {
        return this.fb.btk();
    }

    public int tf() {
        return this.fb.fb();
    }

    public int fkt() {
        return this.fb.bvs();
    }

    public String hgd() {
        return this.fb.iv();
    }

    public String nu() {
        return this.fb.oub();
    }

    private boolean nlz() {
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.fs) && this.fs.contains("adx:")) || rc.fs();
    }

    public static int zmn(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals(X3.i.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(StringUtils.COMMA)) != null) {
            try {
                if (split.length == 4) {
                    return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public static float[] fs(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(StringUtils.COMMA);
        if (split != null && split.length == 4) {
            return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
        }
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    public boolean ww() {
        return this.fb.nkt();
    }

    public int oub() {
        return this.fb.tdm();
    }

    public int jy() {
        return this.fb.oep();
    }

    public String vlj() {
        return this.fb.nu();
    }

    public boolean yof() {
        return this.fb.ouf();
    }

    public int dgt() {
        return this.fb.nps();
    }

    public int cud() {
        return this.fb.dey();
    }

    public int gn() {
        return this.fb.uaq();
    }

    public int uqd() {
        return this.fb.sxr();
    }

    public int kra() {
        return this.fb.utx();
    }

    public boolean na() {
        return this.fb.ob();
    }

    public String mhu() {
        return this.fb.am();
    }

    public String bxw() {
        return this.fb.tev();
    }

    public String tet() {
        return this.fb.quu();
    }

    public boolean yo() {
        return this.fb.mw();
    }

    public boolean xrr() {
        return this.fb.so();
    }

    public String ve() {
        return this.fb.yj();
    }

    public int cd() {
        return this.fb.ev();
    }

    public int lt() {
        return this.fb.tf();
    }

    public double io() {
        return this.fb.fkt();
    }

    public double lbc() {
        return this.fb.hgd();
    }

    public int hwg() {
        return this.fb.rsi();
    }

    public String rje() {
        return this.fb.ao();
    }

    public String zi() {
        return this.fb.uw();
    }

    public boolean nkt() {
        return this.fb.wq();
    }

    public int oep() {
        return this.fb.mig();
    }

    public int tdm() {
        return this.fb.vtz();
    }

    public int mpi() {
        return this.fb.bmc();
    }

    public boolean skn() {
        return this.fb.ob();
    }

    public String ax() {
        return this.fb.bjh();
    }
}
