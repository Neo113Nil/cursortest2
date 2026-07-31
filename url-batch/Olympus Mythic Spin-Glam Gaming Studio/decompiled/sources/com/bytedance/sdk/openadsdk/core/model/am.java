package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class am {
    private String btk;
    private int bvs;
    private int cn;
    private String cyb;
    private int fb;
    private int fs;
    private String hhw;
    private boolean iv;
    private String kgc;
    private int klz;
    private int mw;
    private int nps;
    private String olo;
    private int rc;
    private int rt;
    private int zg;
    private int zmn;
    private boolean zn;

    public static boolean cyb(nqi nqiVar) {
        return false;
    }

    public static boolean mw(nqi nqiVar) {
        return true;
    }

    private static int zmn(int i) {
        return i == 1 ? 10 : 5;
    }

    public int zmn() {
        return this.klz;
    }

    public int fs() {
        return this.mw;
    }

    public int zn() {
        return this.rt;
    }

    public int fb() {
        return this.cn;
    }

    public String btk() {
        return this.cyb;
    }

    public String hhw() {
        return this.olo;
    }

    public String nps() {
        return this.kgc;
    }

    public am(JSONObject jSONObject) {
        this.klz = 5;
        this.mw = 5;
        this.rt = 10;
        this.cn = 20;
        this.cyb = "Next Ad";
        this.olo = "Next ad in %1$ds";
        this.kgc = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.zn = jSONObject.optBoolean("is_playable");
        this.fb = jSONObject.optInt("playable_type", 0);
        this.btk = jSONObject.optString("playable_style");
        JSONObject optJSONObject = jSONObject.optJSONObject("playable");
        if (optJSONObject != null) {
            this.hhw = optJSONObject.optString("playable_url", "");
            this.nps = optJSONObject.optInt("playable_orientation", 0);
            this.fs = optJSONObject.optInt("new_style", 0);
            this.zmn = optJSONObject.optInt("close_2_app", 0);
            int zmn = zmn(this.fb);
            this.zg = optJSONObject.optInt("playable_webview_timeout", zmn);
            this.bvs = optJSONObject.optInt("playable_js_timeout", zmn);
            this.iv = optJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.klz = optJSONObject.optInt("wait_tips_time", 5);
            this.mw = optJSONObject.optInt("auto_to_next_time", 5);
            this.rt = optJSONObject.optInt("next_ad_tips_show_time", 10);
            this.cn = optJSONObject.optInt("max_show_time", 20);
            this.olo = optJSONObject.optString("next_ad_in_xs");
            this.cyb = optJSONObject.optString("next_ad_text");
            this.kgc = optJSONObject.optString("play_now_text");
            int optInt = optJSONObject.optInt("countdown_show_type", 0);
            this.rc = optInt;
            if (optInt == 0 || optInt == 1 || optInt == 2) {
                return;
            }
            this.rc = 0;
        }
    }

    public static int zmn(nqi nqiVar) {
        int i;
        am ve = nqiVar.ve();
        if (ve != null && (i = ve.zmn) >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    private static am zak(nqi nqiVar) {
        if (nqiVar == null) {
            return null;
        }
        return nqiVar.ve();
    }

    public static boolean fs(nqi nqiVar) {
        am zak = zak(nqiVar);
        return (zak == null || !zak.zn || TextUtils.isEmpty(klz(nqiVar))) ? false : true;
    }

    public static boolean zn(nqi nqiVar) {
        return fs(nqiVar) && am(nqiVar) == 1;
    }

    public static boolean fb(nqi nqiVar) {
        return zn(nqiVar) && !nps(nqiVar);
    }

    public static boolean btk(nqi nqiVar) {
        am zak = zak(nqiVar);
        return zak != null && nqiVar.vp() && zak.zn && !TextUtils.isEmpty(klz(nqiVar));
    }

    public static boolean hhw(nqi nqiVar) {
        return btk(nqiVar) && am(nqiVar) == 1;
    }

    public static boolean nps(nqi nqiVar) {
        am ve = nqiVar.ve();
        return ve != null && ve.zn && ve.fs == 1;
    }

    public static boolean zg(nqi nqiVar) {
        am ve = nqiVar.ve();
        return ve != null && nqiVar.vp() && ve.zn && ve.fs == 1;
    }

    private static int am(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return 0;
        }
        return zak.fb;
    }

    public static int bvs(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return 0;
        }
        return zak.rc;
    }

    public static String iv(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return null;
        }
        return zak.btk;
    }

    public static String rc(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return null;
        }
        return zak.hhw;
    }

    public static String klz(nqi nqiVar) {
        if (nqiVar == null) {
            return null;
        }
        am ve = nqiVar.ve();
        if (ve != null && ve.zn) {
            String str = ve.hhw;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (nqiVar.cd() == 20) {
            return nqiVar.pl();
        }
        if (nqiVar.mrt() != null) {
            return nqiVar.mrt().klz();
        }
        return null;
    }

    public static boolean rt(nqi nqiVar) {
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = nqiVar.mrt();
        return mrt != null && mrt.iqz() == 1;
    }

    public static int cn(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return 0;
        }
        return zak.nps;
    }

    public int zg() {
        return this.zg;
    }

    public int bvs() {
        return this.bvs;
    }

    public boolean iv() {
        return this.iv;
    }

    public static long olo(nqi nqiVar) {
        return Math.max(kgc(nqiVar), kw(nqiVar));
    }

    public static long kgc(nqi nqiVar) {
        if (zak(nqiVar) == null) {
            return 5L;
        }
        return r2.zg();
    }

    public static long kw(nqi nqiVar) {
        if (zak(nqiVar) == null) {
            return 5L;
        }
        return r2.bvs();
    }

    public static boolean iqz(nqi nqiVar) {
        am zak = zak(nqiVar);
        return zak != null && zak.iv();
    }

    public static int phc(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return 0;
        }
        return zak.zmn();
    }

    public static String doe(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return null;
        }
        return zak.btk();
    }

    public static String nqi(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return null;
        }
        return zak.nps();
    }

    public static String uqh(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return null;
        }
        return zak.hhw();
    }

    public static int bjh(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return 0;
        }
        return zak.fs();
    }

    public static int rp(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return 0;
        }
        return zak.zn();
    }

    public static int kjb(nqi nqiVar) {
        am zak = zak(nqiVar);
        if (zak == null) {
            return 0;
        }
        return zak.fb();
    }
}
