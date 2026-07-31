package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.n7$$ExternalSyntheticBackport2;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.ww;
import com.facebook.internal.NativeProtocol;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class nqi {
    private boolean au;
    private String av;
    private uqh bjh;
    private cn bm;
    private com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs bmc;
    private olo bml;
    private JSONObject bn;
    private String bv;
    protected long bvs;
    private String cd;
    private int ch;
    private int cud;
    private int dgt;
    private long doe;
    private boolean dy;
    private boolean efd;
    private long es;
    private String eug;
    private String ev;
    private int fg;
    private boolean fkt;
    private com.bytedance.sdk.openadsdk.core.rt.zmn fu;
    private boolean ghr;
    private zg gor;
    private String gt;
    private int hgd;
    private zmn hip;
    private boolean hn;
    private int hr;
    private int hsp;
    private hhw hwg;
    private JSONObject hz;
    private String hzy;

    /* renamed from: io, reason: collision with root package name */
    private int f3743io;
    private int iqz;
    private String ir;
    private rt ji;
    private nps js;
    private btk kgc;
    private kgc kra;
    private String kw;
    private AdSlot ljl;
    private String lt;
    private String mhu;
    private boolean mig;
    private JSONObject mrt;
    public long mw;
    private int my;
    private String na;
    private ev ndq;
    private String nkt;
    private long nqi;
    private int nu;
    private boolean ob;
    private String oep;
    private am ol;
    private boolean olo;
    private boolean ouf;
    private int pa;
    private int pf;
    private String pl;
    private String pw;
    private rp qj;
    private boolean qv;
    private int qvo;
    private kw rfd;
    private phc ri;
    private mw rje;
    private Map<String, Object> rsi;
    private int sc;
    private boolean sft;
    private com.bytedance.sdk.openadsdk.core.mw.zg.zmn shl;
    private JSONObject sl;
    private String so;
    private int sxr;
    private String tdm;
    private int tev;
    private int tf;
    private volatile boolean tuj;
    private int uaq;
    private String ufa;
    private int ulq;
    private kgc uqd;
    private int utx;
    private com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs uw;
    private String ve;
    private boolean vtz;
    private String vv;
    private PAGBannerSize wbj;
    private String wd;
    private zak wir;
    private String wl;
    private com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs wq;
    private String xhx;
    private com.bytedance.sdk.openadsdk.core.mw.zg.zmn xn;
    private String xrr;
    private String xt;
    private String xup;
    private JSONObject xz;
    private yj ybo;
    private com.bytedance.sdk.openadsdk.core.model.zmn yj;
    private int ymf;
    private String yo;
    private int yof;
    private String zak;
    protected int zg;
    private int zi;
    private int zq;
    private int zt;
    public static final String fs = n7$$ExternalSyntheticBackport2.m("_", new CharSequence[]{"is", oub.yj()});
    public static final String zn = n7$$ExternalSyntheticBackport2.m("_", new CharSequence[]{"is", oub.yj(), "sample"});
    public static final String fb = n7$$ExternalSyntheticBackport2.m("_", new CharSequence[]{oub.yj(), X3.f.e});
    protected static int rc = 330;
    private long cyb = 0;
    protected boolean zmn = false;
    protected boolean btk = com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn;
    protected int hhw = com.bytedance.sdk.openadsdk.bjh.zmn.zn.fs;
    protected String nps = com.bytedance.sdk.openadsdk.bjh.zmn.zn.zn;
    private int phc = 0;
    private boolean uqh = false;
    private List<String> rp = new ArrayList();
    private int kjb = -1;
    private HashMap<String, String> am = new HashMap<>();
    protected int iv = 0;
    private final List<kgc> ww = new ArrayList();
    private final List<String> oub = new ArrayList();
    private final List<FilterWord> jy = new ArrayList();
    private final ww vlj = ww.zn();
    public boolean klz = false;
    private int gn = 0;
    private List<String> bxw = new ArrayList();
    private List<String> tet = new ArrayList();
    private String lbc = "0";
    private String mpi = "";
    private int skn = 0;
    private int ax = 2;
    private int obg = -1;
    private int nlz = 0;
    private int dey = 0;
    private int lgz = 1;
    private rc va = new rc();
    private int vpd = -200;
    private int lwz = 0;
    private int quu = 1;
    private int tj = 0;
    private int ao = 0;
    private int vgx = 0;
    private int db = 1;
    private int kh = 1;
    private float qr = 100.0f;
    private int ze = -1;
    private int ltf = 2;
    private int mf = 1;
    private int fw = 0;
    private int br = 1;
    private int ioo = -1;
    private long ba = -1;
    private int qc = 0;
    private int hqs = Integer.MIN_VALUE;
    private boolean dz = false;
    private int jf = 0;
    private int ry = -1;
    private int wu = -1;
    private long ldx = -1;
    private int htj = 50;
    private int ul = -1;
    private final fs lgd = new fs();
    private boolean dv = false;
    private int zvo = 0;
    private com.bytedance.sdk.openadsdk.bjh.zmn.fs omy = null;
    protected int rt = -1;
    protected int cn = -1;
    private float nj = -1.0f;

    public static boolean rje(int i) {
        return i == 44 || i == 43 || i == 30 || i == 40 || i == 41 || i == 39;
    }

    public boolean vp() {
        return true;
    }

    public uqh zmn() {
        return this.bjh;
    }

    public int fs() {
        nps bxw = bxw();
        if (bxw != null) {
            return bxw.zmn();
        }
        return -1;
    }

    public nqi() {
        com.bytedance.sdk.openadsdk.core.model.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.model.zmn();
        this.yj = zmnVar;
        zmnVar.zmn(this);
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        if (zmnVar != null) {
            this.yj = zmnVar;
        }
    }

    public void zmn(int i) {
        this.hgd = i;
    }

    public int zn() {
        return this.hgd;
    }

    public com.bytedance.sdk.openadsdk.core.model.zmn fb() {
        return this.yj;
    }

    public String btk() {
        int sft = sft();
        if (sft == 1) {
            return "banner_ad";
        }
        if (sft == 3) {
            return "open_ad";
        }
        if (sft == 5) {
            return "embeded_ad";
        }
        if (sft == 7) {
            return "rewarded_video";
        }
        if (sft == 8) {
            return "fullscreen_interstitial_ad";
        }
        return "unknown";
    }

    public boolean hhw() {
        rp rpVar;
        int cd = cd();
        if (dgt() && am.zn(this) && cd != 43 && cd != 44) {
            return false;
        }
        if (!dgt() && rje(cd) && (rpVar = this.qj) != null && rpVar.zmn() == 1) {
            return false;
        }
        boolean z = (cd == 33 || cd == 5 || cd == 6 || cd == 19 || cd == 12) ? false : true;
        if (ch() || nkt() == 2 || !z || !com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw.zmn(oub.zn(this.ioo))) {
            return nkt() == 2 && z;
        }
        return true;
    }

    public int nps() {
        return this.nu;
    }

    public void fs(int i) {
        this.nu = i;
    }

    public String zg() {
        bjh rc2;
        com.bytedance.sdk.openadsdk.core.model.zmn fb2 = fb();
        if (fb2 == null || (rc2 = fb2.rc()) == null) {
            return null;
        }
        return rc2.nps();
    }

    public long bvs() {
        return this.cyb;
    }

    public void zmn(long j) {
        this.cyb = j;
    }

    public void zn(int i) {
        this.iqz = i;
    }

    public int iv() {
        return this.iqz;
    }

    public static boolean zmn(nqi nqiVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (zmn(nqiVar) || z4 || nqiVar == null || nqiVar.mrt() == null || TextUtils.isEmpty(nqiVar.mrt().klz())) {
            return false;
        }
        return zn(nqiVar) ? z3 : (nqiVar.mrt() == null || nqiVar.mrt().zmn() != 1) ? z : z2;
    }

    public static boolean zmn(nqi nqiVar) {
        return (nqiVar == null || nqiVar.mrt() == null || nqiVar.mrt().fb() != 1) ? false : true;
    }

    public static boolean fs(nqi nqiVar) {
        return (zmn(nqiVar) || zn(nqiVar)) ? false : true;
    }

    public static boolean zn(nqi nqiVar) {
        return (nqiVar == null || nqiVar.mrt() == null || nqiVar.mrt().fb() != 7 || am.fs(nqiVar)) ? false : true;
    }

    public static boolean fb(nqi nqiVar) {
        return (nqiVar == null || nqiVar.mrt() == null || nqiVar.mrt().zmn() != 1) ? false : true;
    }

    public static boolean btk(nqi nqiVar) {
        if (nqiVar == null) {
            return false;
        }
        int zq = nqiVar.zq();
        return nqiVar.ch() || zq == 5 || zq == 15 || zq == 50;
    }

    public static com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn(String str, nqi nqiVar) {
        nqiVar.na(0);
        int ldx = nqiVar.ldx();
        int i = 3;
        if (ldx == 3) {
            i = 4;
        } else if (ldx == 7) {
            i = 1;
        } else if (ldx == 8) {
            i = 2;
        }
        com.bytedance.sdk.openadsdk.core.cn.zmn.fs fsVar = new com.bytedance.sdk.openadsdk.core.cn.zmn.fs(str, nqiVar.qv(), nqiVar.ghr(), nqiVar.hqs(), nqiVar.dz(), i);
        fsVar.zmn(com.bytedance.sdk.openadsdk.uqh.btk.zmn("video_error_conf", 0));
        fsVar.zn(com.bykv.vk.openvk.zmn.zmn.fs.zmn.fs(fsVar.cyb()));
        return fsVar;
    }

    public static long zmn(String str) {
        return zg(zn(str));
    }

    private static long zg(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static double fs(String str) {
        return bvs(zn(str));
    }

    private static double bvs(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static JSONObject zn(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return PangleNetworkBridge.jsonObjectInit(str);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.iqz.zn("MaterialMeta", e.getMessage());
            }
        }
        return null;
    }

    public static int fb(String str) {
        return zmn(zn(str));
    }

    public static int zmn(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static String zmn(Context context, nqi nqiVar) {
        if (context == null || nqiVar == null || !((nqiVar.ldx() == 8 || nqiVar.ldx() == 7) && nqiVar.vtz())) {
            return null;
        }
        String fs2 = fs(context, nqiVar);
        if (TextUtils.isEmpty(fs2) || com.bytedance.sdk.openadsdk.core.zmn.zmn.zmn() != 1) {
            return null;
        }
        return fs2;
    }

    public static String fs(Context context, nqi nqiVar) {
        if (context != null && nqiVar != null) {
            try {
                if (nqiVar.va() != 8) {
                    if (nqiVar.bjh().zmn()) {
                    }
                }
                String zmn2 = com.bytedance.sdk.openadsdk.core.zmn.zmn.zmn(context);
                if (TextUtils.isEmpty(zmn2)) {
                    return null;
                }
                return zmn2;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public static boolean hhw(nqi nqiVar) {
        Object obj;
        if (nqiVar == null) {
            return false;
        }
        try {
            Map<String, Object> hr = nqiVar.hr();
            if (hr == null || (obj = hr.get(TTAdConstant.SDK_BIDDING_TYPE)) == null) {
                return false;
            }
            return 2 == Integer.parseInt(obj.toString());
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public String rc() {
        return this.so;
    }

    public void btk(String str) {
        this.so = str;
    }

    public String klz() {
        return this.ev;
    }

    public void hhw(String str) {
        this.ev = str;
    }

    public int mw() {
        return this.tf;
    }

    public void fb(int i) {
        this.tf = i;
    }

    public void zmn(boolean z) {
        this.olo = z;
    }

    public boolean rt() {
        return this.olo;
    }

    public boolean cn() {
        return this.fkt;
    }

    public void fs(boolean z) {
        this.fkt = z;
    }

    public boolean cyb() {
        return this.dy;
    }

    public void zn(boolean z) {
        this.dy = z;
    }

    public void btk(int i) {
        this.wu = i;
    }

    public long olo() {
        return this.ldx;
    }

    public void fs(long j) {
        this.ldx = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nqi.class == obj.getClass()) {
            nqi nqiVar = (nqi) obj;
            if (this.lbc.equals(nqiVar.ji()) && this.tdm.equals(nqiVar.ze())) {
                return true;
            }
        }
        return false;
    }

    public void hhw(int i) {
        this.iv = i;
    }

    public int kgc() {
        return this.iv;
    }

    public boolean kw() {
        return this.vtz;
    }

    public void fb(boolean z) {
        this.vtz = z;
    }

    public boolean iqz() {
        return this.mig;
    }

    public void btk(boolean z) {
        this.mig = z;
    }

    public void hhw(boolean z) {
        this.ouf = z;
    }

    public String phc() {
        return this.xup;
    }

    public void nps(String str) {
        this.xup = str;
    }

    public String doe() {
        return this.xhx;
    }

    public void zg(String str) {
        this.xhx = str;
    }

    public boolean nqi() {
        return (TextUtils.isEmpty(phc()) || TextUtils.isEmpty(doe())) ? false : true;
    }

    public phc uqh() {
        return this.ri;
    }

    public void zmn(zg zgVar) {
        this.gor = zgVar;
    }

    public zg bjh() {
        return this.gor;
    }

    public void zmn(phc phcVar) {
        this.ri = phcVar;
    }

    public void zmn(kw kwVar) {
        this.rfd = kwVar;
    }

    public kw rp() {
        return this.rfd;
    }

    public boolean kjb() {
        return this.hn;
    }

    public void nps(boolean z) {
        this.hn = z;
    }

    public void bvs(String str) {
        this.vv = str;
    }

    public String zak() {
        return this.vv;
    }

    public void iv(String str) {
        this.xt = str;
    }

    public String am() {
        return this.xt;
    }

    public boolean yj() {
        JSONArray optJSONArray;
        List<Integer> zmn2;
        if (ouf() != null && (zmn2 = ouf().zmn()) != null && zmn2.contains(57)) {
            return true;
        }
        JSONObject tev = tev();
        if (tev != null && (optJSONArray = tev.optJSONArray("tag_ids")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (optJSONArray.optInt(i) == 57) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean so() {
        JSONArray optJSONArray;
        JSONObject tev = tev();
        if (tev != null && (optJSONArray = tev.optJSONArray("tag_ids")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (optJSONArray.optInt(i) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ev() {
        JSONArray optJSONArray;
        JSONObject tev = tev();
        if (tev == null || (optJSONArray = tev.optJSONArray("tag_ids")) == null) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (optJSONArray.optInt(i) == 186) {
                return true;
            }
        }
        return false;
    }

    public String tf() {
        return this.ufa;
    }

    public boolean fkt() {
        return this.au;
    }

    public com.bytedance.sdk.openadsdk.core.mw.zg.zmn hgd() {
        return this.xn;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.mw.zg.zmn zmnVar) {
        this.xn = zmnVar;
        com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn(zmnVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void fs(com.bytedance.sdk.openadsdk.core.mw.zg.zmn zmnVar) {
        this.shl = zmnVar;
        com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn(zmnVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public com.bytedance.sdk.openadsdk.core.mw.zg.zmn nu() {
        return this.shl;
    }

    public void nps(int i) {
        this.jf = i;
    }

    public int ww() {
        return this.jf;
    }

    public void zg(boolean z) {
        this.qv = z;
    }

    public boolean oub() {
        return this.qv;
    }

    public void bvs(boolean z) {
        this.ghr = z;
    }

    public boolean jy() {
        return this.ghr;
    }

    public int vlj() {
        try {
            JSONObject wu = wu();
            if (wu != null) {
                return wu.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean yof() {
        return this.efd;
    }

    public void iv(boolean z) {
        this.efd = z;
    }

    public boolean dgt() {
        return this.sft;
    }

    public void rc(boolean z) {
        this.sft = z;
    }

    public void zg(int i) {
        this.htj = i;
    }

    public int cud() {
        return this.htj;
    }

    public String gn() {
        JSONObject wu;
        if (this.av == null && (wu = wu()) != null) {
            this.av = wu.optString("cid", "");
        }
        return this.av;
    }

    public void rc(String str) {
        this.bv = str;
    }

    public String uqd() {
        return this.bv;
    }

    public int kra() {
        if (this.ul < 0) {
            try {
                JSONObject wu = wu();
                if (wu != null) {
                    this.ul = wu.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.ul = 0;
                }
            } catch (Throwable unused) {
                this.ul = 0;
            }
        }
        return this.ul;
    }

    public void bvs(int i) {
        this.ulq = i;
    }

    public boolean na() {
        if (this.ioo <= 0) {
            this.ioo = ldx();
        }
        int i = this.ioo;
        return (i == 7 || i == 8) && !btk(this) && lt() != 21 && this.ulq == 1;
    }

    public void mhu() {
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar = this.uw;
        if (fsVar == null || TextUtils.isEmpty(fsVar.klz())) {
            return;
        }
        try {
            if (this.uw.klz().contains("style_id")) {
                this.au = true;
                this.ufa = Uri.parse(this.uw.klz()).getQueryParameters("style_id").get(0);
            } else {
                this.au = false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn(th.getMessage(), new Object[0]);
        }
    }

    public nps bxw() {
        return this.js;
    }

    public void zmn(nps npsVar) {
        this.js = npsVar;
    }

    public int tet() {
        nps npsVar = this.js;
        if (npsVar == null) {
            return 2;
        }
        return npsVar.fs();
    }

    public int yo() {
        if (yj()) {
            return 5;
        }
        return xup() ? 4 : 1;
    }

    public long xrr() {
        nps npsVar = this.js;
        if (npsVar == null) {
            return 0L;
        }
        return npsVar.zn();
    }

    public am ve() {
        return this.ol;
    }

    public void zmn(am amVar) {
        this.ol = amVar;
    }

    public int cd() {
        return this.dgt;
    }

    public void iv(int i) {
        zmn(i, -1);
    }

    public int lt() {
        return this.cud;
    }

    public int io() {
        return this.gn;
    }

    public void rc(int i) {
        this.gn = i;
    }

    public void klz(int i) {
        this.dgt = i;
    }

    public void mw(int i) {
        this.cud = i;
    }

    public void zmn(int i, int i2) {
        this.cud = i;
        this.dgt = i;
        if (this.ljl == null) {
            this.dgt = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = ldx();
        }
        if (this.ljl.getDurationSlotType() == 3 || i2 == 3) {
            this.dgt = 14;
            return;
        }
        if (this.ljl.getDurationSlotType() == 7 || this.ljl.getDurationSlotType() == 8 || i2 == 7 || i2 == 8) {
            if (!this.sft) {
                if (am.zn(this)) {
                    this.dgt = 12;
                    return;
                } else if (am.fs(this)) {
                    this.dgt = 9;
                    return;
                }
            }
            if (this.cud == 5 && !iqz.fb(this)) {
                this.dgt = 7;
            }
            if (this.cud == 6 && !iqz.fs(this)) {
                this.dgt = 7;
            }
            if (this.cud == 8 && wq() != 100) {
                this.dgt = 7;
            }
            if (this.cud == 19 && TextUtils.isEmpty(this.na)) {
                this.dgt = 7;
            }
            if (this.cud == 20 && TextUtils.isEmpty(this.na)) {
                this.dgt = 7;
            }
            if (this.cud == 38 && !iqz.zn(this)) {
                this.dgt = 7;
            }
            if (i < 5) {
                this.dgt = 7;
                return;
            }
            return;
        }
        if (!this.sft && am.fs(this)) {
            this.dgt = 4;
            return;
        }
        if (this.cud == 4 && !am.fs(this)) {
            this.dgt = 0;
        }
        int i3 = this.cud;
        if (i3 == 41) {
            this.dgt = 41;
            return;
        }
        if (i >= 5) {
            this.dgt = 0;
            return;
        }
        if (i3 == 2 && va() != 3) {
            this.dgt = 0;
        } else if (i == 0 || (i == 1 && va() != 3)) {
            this.dgt = 0;
        }
    }

    public int lbc() {
        return this.mf;
    }

    public void zmn(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.mf = 1;
        } else {
            this.mf = (int) d;
        }
    }

    public int hwg() {
        return this.ltf;
    }

    public void fs(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.ltf = 2;
        } else {
            this.ltf = (int) d;
        }
    }

    public String rje() {
        return this.mpi;
    }

    public void klz(String str) {
        this.mpi = str;
    }

    public int zi() {
        return this.skn;
    }

    public void rt(int i) {
        this.skn = i;
    }

    public int nkt() {
        int i;
        if (this.dey == 11 && (i = this.ax) == 2) {
            return i;
        }
        int i2 = this.dgt;
        if (i2 == 5 || i2 == 6 || i2 == 33) {
            return 1;
        }
        if (wir()) {
            return 2;
        }
        return this.ax;
    }

    public void cn(int i) {
        this.obg = i;
    }

    public int oep() {
        return this.obg;
    }

    public void cyb(int i) {
        this.ax = i;
    }

    public void olo(int i) {
        this.tj = i;
    }

    public void mw(String str) {
        this.pw = str;
    }

    public boolean tdm() {
        return this.tj == 1;
    }

    public int mpi() {
        return this.vgx;
    }

    public void kgc(int i) {
        this.vgx = i;
    }

    public int skn() {
        return this.dey;
    }

    public void kw(int i) {
        this.dey = i;
    }

    public int ax() {
        return this.lgz;
    }

    public void iqz(int i) {
        this.lgz = i;
    }

    public String obg() {
        return this.gt;
    }

    public void rt(String str) {
        this.gt = str;
    }

    public int nlz() {
        return this.ao;
    }

    public void phc(int i) {
        this.ao = i;
    }

    public void doe(int i) {
        this.quu = i;
    }

    public int es() {
        if (ch()) {
            return 5;
        }
        if (fu() != 100.0f || nkt() == 2) {
            return 0;
        }
        return this.lwz;
    }

    public void nqi(int i) {
        this.lwz = i;
    }

    public rc hsp() {
        return this.va;
    }

    public void zmn(rc rcVar) {
        this.va = rcVar;
    }

    public AdSlot utx() {
        return this.ljl;
    }

    public void zmn(AdSlot adSlot) {
        this.ljl = adSlot;
    }

    public void uqh(int i) {
        this.uaq = i;
    }

    public int uw() {
        return this.vpd;
    }

    public void bjh(int i) {
        this.vpd = i;
    }

    public void rp(int i) {
        this.db = i;
    }

    public void kjb(int i) {
        this.pf = i;
    }

    public int wq() {
        return this.utx;
    }

    public void zak(int i) {
        this.utx = i;
    }

    public String bmc() {
        return this.eug;
    }

    public void cn(String str) {
        this.eug = str;
    }

    public boolean vtz() {
        return wq() == 100 || this.dgt == 20;
    }

    public int mig() {
        return this.tev;
    }

    public void am(int i) {
        this.tev = i;
    }

    public zmn ouf() {
        return this.hip;
    }

    public void zmn(zmn zmnVar) {
        this.hip = zmnVar;
        com.bytedance.sdk.component.adexpress.zmn.zn.fb hip = hip();
        if (hip != null && !sxr()) {
            com.bytedance.sdk.component.adexpress.zmn.fs.fs.zmn(hip);
        }
        if (zmnVar == null || TextUtils.isEmpty(zmnVar.mw())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn(cng(), "ad");
    }

    public void zmn(ev evVar) {
        this.ndq = evVar;
        if (evVar == null || TextUtils.isEmpty(evVar.zn())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn(on(), "adv3");
    }

    public boolean sxr() {
        zmn zmnVar = this.hip;
        if (zmnVar != null) {
            return !TextUtils.isEmpty(zmnVar.rc());
        }
        int i = this.dey;
        return i == 9 || i == 10 || i == 11;
    }

    public void fs(JSONObject jSONObject) {
        this.xz = jSONObject;
    }

    public int ob() {
        JSONObject jSONObject;
        int i = this.hqs;
        return (Integer.MIN_VALUE != i || (jSONObject = this.xz) == null) ? i : jSONObject.optInt("click_trigger_type", 0);
    }

    public JSONObject tev() {
        return this.xz;
    }

    public ev rsi() {
        return this.ndq;
    }

    private com.bytedance.sdk.openadsdk.core.mw.zg.zmn cng() {
        zmn ouf = ouf();
        if (ouf == null) {
            return null;
        }
        return zmn.fs(ouf, String.valueOf(qvo()));
    }

    private com.bytedance.sdk.openadsdk.core.mw.zg.zmn on() {
        ev rsi = rsi();
        if (rsi == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.mw.zg.zmn().zmn(rsi.zmn()).fs(rsi.fs()).zn(rsi.zn()).fb(rsi.fb()).btk(qvo() + "_v3");
    }

    public com.bytedance.sdk.component.adexpress.zmn.zn.fb hip() {
        zmn ouf = ouf();
        if (ouf == null) {
            return null;
        }
        return zmn.zmn(ouf, String.valueOf(qvo()));
    }

    public int eug() {
        rt rtVar = this.ji;
        if (rtVar == null) {
            return 0;
        }
        return rtVar.zmn();
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt() {
        return this.uw;
    }

    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar) {
        this.uw = fsVar;
    }

    public void zmn(rt rtVar) {
        this.ji = rtVar;
    }

    public String dey() {
        return this.nkt;
    }

    public void cyb(String str) {
        this.nkt = str;
    }

    public void olo(String str) {
        this.lt = str;
    }

    public String lgz() {
        return this.lt;
    }

    public int va() {
        return this.yof;
    }

    public boolean vpd() {
        return this.ymf == 1;
    }

    public void yj(int i) {
        this.ymf = i;
    }

    public void so(int i) {
        this.yof = i;
    }

    public boolean lwz() {
        return this.qvo == 1;
    }

    public void ev(int i) {
        this.qvo = i;
    }

    public void tf(int i) {
        this.sc = i;
    }

    public int ljl() {
        return this.sc;
    }

    public kgc uaq() {
        return this.uqd;
    }

    public void zmn(kgc kgcVar) {
        zmn(kgcVar, rc);
        String ww = ww(kgcVar.zmn());
        if (!TextUtils.isEmpty(ww)) {
            kgcVar.fs(ww);
        }
        this.uqd = kgcVar;
    }

    private String ww(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.cyb.zmn(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    private void zmn(kgc kgcVar, int i) {
        if (kgcVar != null) {
            try {
                if (TextUtils.isEmpty(kgcVar.zmn())) {
                    return;
                }
                if (kgcVar.fs() == 0 && kgcVar.zn() == 0) {
                    kgcVar.zmn(i);
                    kgcVar.fs(i);
                    return;
                }
                if (kgcVar.fs() == 0) {
                    if (kgcVar.zn() > i) {
                        kgcVar.fs(i);
                        kgcVar.zmn(i);
                        return;
                    } else {
                        kgcVar.zmn(kgcVar.zn());
                        return;
                    }
                }
                if (kgcVar.zn() == 0) {
                    if (kgcVar.fs() > i) {
                        kgcVar.fs(i);
                        kgcVar.zmn(i);
                        return;
                    } else {
                        kgcVar.fs(kgcVar.fs());
                        return;
                    }
                }
                if (kgcVar.fs() > kgcVar.zn()) {
                    if (kgcVar.fs() > i) {
                        kgcVar.fs((int) (i / (kgcVar.fs() / kgcVar.zn())));
                        kgcVar.zmn(i);
                        return;
                    }
                    return;
                }
                if (kgcVar.zn() > i) {
                    kgcVar.zmn((int) (i * (kgcVar.fs() / kgcVar.zn())));
                    kgcVar.fs(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void zmn(kgc kgcVar, int i, int i2) {
        try {
            if (kgcVar.zn() >= i2) {
                kgcVar.zmn((int) ((kgcVar.fs() / kgcVar.zn()) * i2));
                kgcVar.fs(i2);
            } else if (kgcVar.fs() >= i) {
                kgcVar.zmn((int) ((i / i2) * kgcVar.zn()));
            }
        } catch (Throwable unused) {
        }
    }

    public kgc quu() {
        return this.kra;
    }

    public void fs(kgc kgcVar) {
        this.kra = kgcVar;
    }

    public String pl() {
        return this.na;
    }

    public void kgc(String str) {
        this.na = str;
    }

    public List<kgc> tj() {
        return this.ww;
    }

    public void zn(kgc kgcVar) {
        PAGBannerSize rxd = rxd();
        if (rxd != null && rxd.getWidth() > 0 && rxd.getHeight() > 0) {
            zmn(kgcVar, jy.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), rxd.getWidth()), jy.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), rxd.getHeight()));
        }
        this.ww.add(kgcVar);
    }

    public String ao() {
        return this.mhu;
    }

    public void kw(String str) {
        this.mhu = str;
    }

    public List<String> vgx() {
        return this.bxw;
    }

    public List<String> hz() {
        return this.tet;
    }

    public List<String> sl() {
        return this.oub;
    }

    public String db() {
        return this.yo;
    }

    public void iqz(String str) {
        this.yo = str;
    }

    public String pf() {
        return this.xrr;
    }

    public void phc(String str) {
        this.xrr = str;
    }

    public String gt() {
        if (!TextUtils.isEmpty(this.ve)) {
            return this.ve;
        }
        Context zmn2 = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        int va = va();
        if (va != 2 && va != 3) {
            if (va == 4) {
                if (zmn2 != null) {
                    return com.bytedance.sdk.component.utils.doe.zmn(zmn2, "tt_video_download_apk");
                }
                return this.ve;
            }
            if (va != 8) {
                return this.ve;
            }
        }
        if (zmn2 != null) {
            return com.bytedance.sdk.component.utils.doe.zmn(zmn2, "tt_video_mobile_go_detail");
        }
        return this.ve;
    }

    public void doe(String str) {
        this.ve = str;
    }

    public String wd() {
        return this.ve;
    }

    public String ji() {
        return this.lbc;
    }

    public void nqi(String str) {
        this.lbc = str;
    }

    public String kh() {
        return this.oep;
    }

    public void uqh(String str) {
        this.oep = str;
    }

    public void bjh(String str) {
        this.kw = str;
    }

    public String qr() {
        return this.kw;
    }

    public hhw pw() {
        return this.hwg;
    }

    public void zmn(hhw hhwVar) {
        this.hwg = hhwVar;
    }

    public mw my() {
        return this.rje;
    }

    public void zmn(mw mwVar) {
        this.rje = mwVar;
    }

    public String ze() {
        return this.tdm;
    }

    public void rp(String str) {
        this.tdm = str;
    }

    public int zq() {
        return this.zi;
    }

    public void fkt(int i) {
        this.zi = i;
    }

    public List<FilterWord> pa() {
        return this.jy;
    }

    public void zmn(FilterWord filterWord) {
        this.jy.add(filterWord);
    }

    public String ltf() {
        return this.wd;
    }

    public void kjb(String str) {
        this.wd = str;
    }

    public long mf() {
        return this.es;
    }

    public void zn(long j) {
        this.es = j;
    }

    public void hgd(int i) {
        this.hsp = i;
    }

    public boolean fw() {
        return this.ob;
    }

    public void klz(boolean z) {
        this.ob = z;
    }

    public Map<String, Object> hr() {
        return this.rsi;
    }

    public void zmn(Map<String, Object> map) {
        this.rsi = map;
    }

    public JSONObject br() {
        return this.hz;
    }

    public void zn(JSONObject jSONObject) {
        this.hz = jSONObject;
    }

    public JSONObject ri() {
        return this.sl;
    }

    public void fb(JSONObject jSONObject) {
        this.sl = jSONObject;
    }

    public void zak(String str) {
        this.pl = str;
    }

    public int ol() {
        if (this.kh != 2) {
            this.kh = 1;
        }
        return this.kh;
    }

    public void nu(int i) {
        this.kh = i;
    }

    public float fu() {
        if (this.qr <= 0.0f) {
            this.qr = 100.0f;
        }
        return (this.qr * 1000.0f) / 1000.0f;
    }

    public void zmn(float f) {
        this.qr = f;
    }

    public boolean ir() {
        if (this.ww.isEmpty()) {
            return false;
        }
        if (this.zi == 4 && this.ww.size() < 3) {
            return false;
        }
        Iterator<kgc> it = this.ww.iterator();
        while (it.hasNext()) {
            if (!it.next().btk()) {
                return false;
            }
        }
        return true;
    }

    public boolean bn() {
        return !ch() && bml() == 1;
    }

    public int bml() {
        return this.nlz;
    }

    public void ww(int i) {
        this.nlz = i;
    }

    public void btk(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.yof = 4;
        this.lbc = jSONObject.optString("id");
        this.nkt = jSONObject.optString("source");
        hhw hhwVar = new hhw();
        this.hwg = hhwVar;
        hhwVar.zn(jSONObject.optString("pkg_name"));
        this.hwg.fs(jSONObject.optString("name"));
        this.hwg.zmn(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    public JSONObject mw(boolean z) {
        try {
            String iyj = iyj();
            if (TextUtils.isEmpty(iyj)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("raw_response_info", iyj);
            }
            JSONArray optJSONArray = PangleNetworkBridge.jsonObjectInit(iyj).optJSONArray("creatives");
            if (optJSONArray != null && zn() >= 0 && zn() < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(zn());
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, optJSONObject.get(next));
                    }
                }
                AdSlot utx = utx();
                if (utx != null) {
                    jSONObject.put("adslot", utx.toJsonObj());
                }
                if (!TextUtils.isEmpty(this.vv)) {
                    jSONObject.put("gdid_encrypted", this.vv);
                }
                jSONObject.put("hasReportShow", this.efd);
                jSONObject.put("isMrcReportFinish", this.tuj);
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zmn("MaterialMeta", "toJsonObj error", e);
            return null;
        }
    }

    public JSONObject fg() {
        JSONObject mw = mw(false);
        JSONObject kw = com.bytedance.sdk.openadsdk.core.settings.rc.fs().kw(String.valueOf(qvo()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(mw);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", kw);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zn("MaterialMeta", "toJsonObjPlus", e.getMessage());
        }
        return jSONObject;
    }

    public int tuj() {
        return this.my;
    }

    public void oub(int i) {
        this.my = i;
    }

    public int ioo() {
        int i = this.ze;
        if (i >= 0) {
            return i;
        }
        return 30;
    }

    public void jy(int i) {
        this.ze = i;
    }

    public void vlj(int i) {
        this.kjb = i;
    }

    public int ba() {
        return this.zq;
    }

    public void yof(int i) {
        this.zq = i;
    }

    public int hzy() {
        return this.pa;
    }

    public void dgt(int i) {
        this.pa = i;
    }

    public boolean ch() {
        int i = this.qc;
        return (i == 1 || i == 3) && bm() != null;
    }

    public boolean zt() {
        return ch() || this.kgc != null;
    }

    public com.bytedance.sdk.openadsdk.core.rt.zmn bm() {
        return this.fu;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar) {
        this.fu = zmnVar;
    }

    public boolean xup() {
        return this.qc == 2;
    }

    public String xhx() {
        return this.ir;
    }

    public void am(String str) {
        this.ir = str;
    }

    public int js() {
        JSONObject jSONObject = this.bn;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public JSONObject hn() {
        return this.bn;
    }

    public void hhw(JSONObject jSONObject) {
        this.bn = jSONObject;
    }

    public void zmn(olo oloVar) {
        this.bml = oloVar;
    }

    public olo vv() {
        return this.bml;
    }

    public boolean qc() {
        return this.fg == 1;
    }

    public void cud(int i) {
        this.fg = i;
    }

    public void xt() {
        this.tuj = true;
    }

    public boolean ufa() {
        return this.tuj;
    }

    public int au() {
        return this.ch;
    }

    public void gn(int i) {
        this.ch = Math.max(0, i);
    }

    public int xn() {
        return this.zt;
    }

    public void uqd(int i) {
        this.zt = i;
    }

    public void zmn(cn cnVar) {
        this.bm = cnVar;
    }

    public cn shl() {
        return this.bm;
    }

    public void kra(int i) {
        this.sxr = i;
    }

    public int ndq() {
        return this.sxr;
    }

    public com.bytedance.sdk.component.bvs.fs.zmn xz() {
        com.bytedance.sdk.component.bvs.fs.zmn zmnVar = new com.bytedance.sdk.component.bvs.fs.zmn();
        zmnVar.fs(this.tev);
        zmnVar.fs(this.lbc);
        zmnVar.zn(this.oep);
        zmnVar.zmn(ze());
        zmnVar.zmn(this.dey);
        return zmnVar;
    }

    public int hqs() {
        return this.fw;
    }

    public void na(int i) {
        this.fw = i;
    }

    public int dz() {
        return this.hr;
    }

    public void mhu(int i) {
        this.hr = i;
    }

    public int jf() {
        return this.br;
    }

    public void bxw(int i) {
        this.br = i;
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs qv() {
        return this.bmc;
    }

    public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar) {
        this.bmc = fsVar;
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs ghr() {
        return this.wq;
    }

    public void zn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar) {
        this.wq = fsVar;
    }

    public String dy() {
        return this.cd;
    }

    public void yj(String str) {
        this.cd = str;
    }

    public int efd() {
        return this.f3743io;
    }

    public void tet(int i) {
        this.f3743io = i;
    }

    public boolean ry() {
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar = this.uw;
        return fsVar == null || fsVar.kw() != 1;
    }

    public JSONObject wu() {
        if (this.mrt == null) {
            try {
                if (!TextUtils.isEmpty(this.tdm)) {
                    this.mrt = PangleNetworkBridge.jsonObjectInit(this.tdm);
                }
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.iqz.zn("MaterialMeta", e.getMessage());
            }
        }
        return this.mrt;
    }

    public int ldx() {
        if (this.ioo < 0) {
            JSONObject wu = wu();
            if (wu != null) {
                this.ioo = wu.optInt("ad_slot_type", 0);
            } else {
                this.ioo = 0;
            }
        }
        return this.ioo;
    }

    public int sft() {
        return this.ioo;
    }

    public long htj() {
        if (this.ba < 0) {
            JSONObject wu = wu();
            if (wu != null) {
                this.ba = wu.optLong(CreativeInfo.c, 0L);
            } else {
                this.ba = 0L;
            }
        }
        return this.ba;
    }

    public boolean av() {
        return ldx() == 3 || ldx() == 4;
    }

    public boolean bv() {
        return ldx() == 7;
    }

    public boolean ul() {
        return ldx() == 8;
    }

    public boolean ulq() {
        return ldx() == 1;
    }

    public boolean ymf() {
        return ldx() == 5;
    }

    public int qvo() {
        JSONObject wu = wu();
        if (wu != null) {
            return wu.optInt("rit", 0);
        }
        return 0;
    }

    public double sc() {
        return bvs(wu());
    }

    public String so(String str) {
        JSONObject wu = wu();
        return wu != null ? wu.optString("rit", str) : str;
    }

    @Nullable
    public String gor() {
        hhw pw = pw();
        if (pw == null || TextUtils.isEmpty(pw.zmn())) {
            return null;
        }
        return pw.zmn();
    }

    public String wbj() {
        JSONObject wu;
        String str = this.hzy;
        if (TextUtils.isEmpty(str) && (wu = wu()) != null) {
            str = wu.optString("req_id", "");
            ev(str);
        }
        return str == null ? "" : str;
    }

    public void ev(String str) {
        this.hzy = str;
    }

    public boolean wir() {
        return utx() != null && utx().getDurationSlotType() == 8 && xup();
    }

    public int qj() {
        return this.qc;
    }

    public void yo(int i) {
        this.qc = i;
    }

    public boolean ybo() {
        int i = this.dgt;
        return (i == 2 || i == 1) && 3 == this.yof;
    }

    public boolean lgd() {
        cn cnVar;
        return ch() && !dv() && (cnVar = this.bm) != null && cnVar.zmn() == 1;
    }

    public boolean dv() {
        return this.vlj.zmn > 0;
    }

    public ww rfd() {
        return this.vlj;
    }

    public void wl() {
        this.vlj.btk();
        nps(false);
    }

    public long zvo() {
        return this.mw;
    }

    public void fb(long j) {
        this.mw = j;
    }

    public boolean omy() {
        return this.klz;
    }

    public void rt(boolean z) {
        this.klz = z;
    }

    public void cn(boolean z) {
        this.dz = z;
    }

    public boolean nj() {
        return this.dz;
    }

    public void zmn(zak zakVar) {
        this.wir = zakVar;
    }

    public zak rvx() {
        return this.wir;
    }

    public boolean bl() {
        return this.zmn;
    }

    public void cyb(boolean z) {
        this.zmn = z;
    }

    public void zmn(PAGBannerSize pAGBannerSize) {
        this.wbj = pAGBannerSize;
    }

    public PAGBannerSize rxd() {
        return this.wbj;
    }

    public String iyj() {
        return this.wl;
    }

    public void tf(String str) {
        this.wl = str;
    }

    public int il() {
        return this.zvo;
    }

    public void xrr(int i) {
        this.zvo = i;
    }

    public void nps(JSONObject jSONObject) {
        this.lgd.zmn(jSONObject);
    }

    public fs ew() {
        return this.lgd;
    }

    public void olo(boolean z) {
        this.dv = z;
    }

    public boolean dbc() {
        return this.dv;
    }

    public boolean gu() {
        kw kwVar;
        if (this.ljl == null || (kwVar = this.rfd) == null) {
            return false;
        }
        return kwVar.zmn(!TextUtils.isEmpty(r0.getBidAdm()));
    }

    public int hw() {
        return this.zg;
    }

    public void ve(int i) {
        this.zg = i;
    }

    public long wj() {
        return this.bvs;
    }

    public void btk(long j) {
        this.bvs = j;
    }

    public void zmn(rp rpVar) {
        this.qj = rpVar;
    }

    public rp xcf() {
        return this.qj;
    }

    public int eec() {
        Map<String, Object> map = this.rsi;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void kgc(boolean z) {
        this.btk = z;
    }

    public boolean ld() {
        return this.btk;
    }

    public void cd(int i) {
        if (i < 0 || i > 30) {
            i = 6;
        }
        this.hhw = i;
    }

    public int zum() {
        return this.hhw;
    }

    public void fkt(String str) {
        if (TextUtils.isEmpty(str)) {
            this.nps = com.bytedance.sdk.openadsdk.bjh.zmn.zn.zn;
        } else {
            this.nps = str;
        }
    }

    public String aqk() {
        return this.nps;
    }

    public com.bytedance.sdk.openadsdk.bjh.zmn.fs wet() {
        return this.omy;
    }

    public void zmn(com.bytedance.sdk.openadsdk.bjh.zmn.fs fsVar) {
        this.omy = fsVar;
    }

    public int rzd() {
        String valueOf;
        com.bytedance.sdk.openadsdk.core.model.zmn fb2 = fb();
        if (fb2 != null && fb2.rc() != null) {
            return fb2.rc().bvs();
        }
        if (utx() != null) {
            valueOf = utx().getCodeId();
        } else {
            int qvo = qvo();
            valueOf = qvo != 0 ? String.valueOf(qvo) : null;
        }
        if (valueOf != null) {
            return com.bytedance.sdk.openadsdk.core.kgc.fb().iqz(valueOf);
        }
        return 5;
    }

    public int gc() {
        String valueOf;
        com.bytedance.sdk.openadsdk.core.model.zmn fb2 = fb();
        if (fb2 != null && fb2.rc() != null) {
            return fb2.rc().bvs();
        }
        if (utx() != null) {
            valueOf = utx().getCodeId();
        } else {
            int qvo = qvo();
            valueOf = qvo != 0 ? String.valueOf(qvo) : null;
        }
        if (valueOf != null) {
            return com.bytedance.sdk.openadsdk.core.kgc.fb().klz(valueOf);
        }
        return 30;
    }

    public void lt(int i) {
        this.rt = i;
    }

    public void io(int i) {
        this.cn = i;
    }

    public int ab() {
        int i = this.rt;
        return i >= 0 ? i : com.bytedance.sdk.openadsdk.core.kgc.fb().iqz(String.valueOf(qvo()));
    }

    public int nkw() {
        int i = this.cn;
        return i >= 0 ? i : com.bytedance.sdk.openadsdk.core.kgc.fb().rc(String.valueOf(qvo()));
    }

    public int ozu() {
        return this.cn;
    }

    @NonNull
    public List<nqi> tl() {
        return this.yj.btk();
    }

    public yj el() {
        return this.ybo;
    }

    public void zmn(yj yjVar) {
        this.ybo = yjVar;
    }

    public float cii() {
        float f = this.nj;
        if (f > 0.0f) {
            return f;
        }
        ev evVar = this.ndq;
        if (evVar != null) {
            String fb2 = evVar.fb();
            if (TextUtils.isEmpty(fb2)) {
                fb2 = com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn("adv3", this.ndq.zmn(), this.ndq.fs());
            }
            if (fb2 != null) {
                try {
                    JSONObject optJSONObject = PangleNetworkBridge.jsonObjectInit(fb2).optJSONObject("body");
                    if (optJSONObject != null) {
                        float optDouble = (float) optJSONObject.optDouble("ratio");
                        this.nj = optDouble;
                        return optDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.nj = 0.0f;
        return 0.0f;
    }

    public void xl() {
        if (!TextUtils.isEmpty(obg())) {
            rt("0");
        }
        Map<String, Object> hr = hr();
        if (hr == null || !hr.containsKey("price")) {
            return;
        }
        hr.put("price", "0");
    }

    public long pi() {
        Map<String, Object> hr = hr();
        if (hr == null) {
            return 0L;
        }
        try {
            Object obj = hr.get("media_share_price");
            if (obj == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public void zmn(btk btkVar) {
        this.kgc = btkVar;
    }

    @Nullable
    public btk xr() {
        return this.kgc;
    }

    @Nullable
    public fb exj() {
        fb mw;
        btk btkVar = this.kgc;
        if (btkVar != null) {
            mw = btkVar.fs();
        } else {
            com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar = this.fu;
            mw = zmnVar != null ? zmnVar.mw() : null;
        }
        if (mw != null) {
            mw.zmn(this);
        }
        return mw;
    }

    public void zmn(uqh uqhVar) {
        this.bjh = uqhVar;
    }

    public void hgd(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.rp.add(str);
    }

    public void zmn(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        this.am = hashMap;
    }

    public HashMap<String, String> faz() {
        return this.am;
    }

    public List<String> zp() {
        return this.rp;
    }

    public boolean nlo() {
        uqh uqhVar = this.bjh;
        return uqhVar != null && uqhVar.zmn() > 0;
    }

    public int ur() {
        int i = this.kjb;
        return i >= 0 ? i : bv() ? 30 : 5;
    }

    public void hhw(long j) {
        this.doe = j;
    }

    public long dg() {
        return this.doe;
    }

    public void nps(long j) {
        this.nqi = j;
    }

    public long iq() {
        return this.nqi;
    }

    public void lbc(int i) {
        this.phc = i;
    }

    public int gms() {
        return this.phc;
    }

    public void kw(boolean z) {
        this.uqh = z;
    }

    public boolean qb() {
        return this.uqh;
    }

    public void hwg(int i) {
        this.ry = i;
    }

    public int pge() {
        return this.ry;
    }

    public static class zmn {
        private String btk;
        private String bvs;
        private String fb;
        private String fs;
        private String hhw;
        private String iv;
        private String klz;
        private String mw;
        private String nps;
        private String rc;
        private String rt;
        private List<Integer> zg;
        private String zmn;
        private String zn;

        @NonNull
        public static com.bytedance.sdk.component.adexpress.zmn.zn.fb zmn(zmn zmnVar, String str) {
            return com.bytedance.sdk.component.adexpress.zmn.zn.fb.zmn().zmn(zmnVar.fb()).fs(zmnVar.btk()).zn(zmnVar.hhw()).fb(zmnVar.nps()).btk(zmnVar.zn()).hhw(str);
        }

        @NonNull
        public static com.bytedance.sdk.openadsdk.core.mw.zg.zmn fs(zmn zmnVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.mw.zg.zmn().zmn(zmnVar.fb()).fs(zmnVar.rt()).zn(zmnVar.mw()).fb(zmnVar.cn()).btk(str);
        }

        public List<Integer> zmn() {
            return this.zg;
        }

        public void zmn(List<Integer> list) {
            this.zg = list;
        }

        public String fs() {
            return this.bvs;
        }

        public void zmn(String str) {
            this.bvs = str;
        }

        public String zn() {
            return this.hhw;
        }

        public void fs(String str) {
            this.hhw = str;
        }

        public String fb() {
            return this.zmn;
        }

        public void zn(String str) {
            this.zmn = str;
        }

        public String btk() {
            return this.fs;
        }

        public void fb(String str) {
            this.fs = str;
        }

        public String hhw() {
            return this.zn;
        }

        public void btk(String str) {
            this.zn = str;
        }

        public String nps() {
            return this.fb;
        }

        public void hhw(String str) {
            this.fb = str;
        }

        public String zg() {
            return this.btk;
        }

        public void nps(String str) {
            this.btk = str;
        }

        public String bvs() {
            return this.nps;
        }

        public void zg(String str) {
            this.nps = str;
        }

        public String iv() {
            return this.rc;
        }

        public void bvs(String str) {
            this.rc = str;
        }

        public String rc() {
            return this.iv;
        }

        public void iv(String str) {
            this.iv = str;
        }

        public boolean klz() {
            return !TextUtils.isEmpty(this.iv) && this.iv.equals("v3");
        }

        public String mw() {
            return this.klz;
        }

        public void rc(String str) {
            this.klz = str;
        }

        public String rt() {
            return this.mw;
        }

        public void klz(String str) {
            this.mw = str;
        }

        public String cn() {
            return this.rt;
        }

        public void mw(String str) {
            this.rt = str;
        }
    }

    public static void zmn(nqi nqiVar, JSONObject jSONObject) throws JSONException {
        List<kgc> tj = nqiVar.tj();
        if (tj != null) {
            JSONArray jSONArray = new JSONArray();
            for (kgc kgcVar : tj) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", kgcVar.zmn());
                jSONObject2.put("height", kgcVar.zn());
                jSONObject2.put("width", kgcVar.fs());
                jSONObject2.put("image_preview", kgcVar.hhw());
                jSONObject2.put("image_key", kgcVar.nps());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }

    public static void fs(nqi nqiVar, JSONObject jSONObject) throws JSONException {
        hhw pw = nqiVar.pw();
        if (pw != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, pw.fs());
            jSONObject2.put("package_name", pw.zn());
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, pw.zmn());
            jSONObject2.put("score", pw.fb());
            jSONObject2.put("comment_num", pw.btk());
            jSONObject2.put(CampaignEx.JSON_KEY_APP_SIZE, pw.hhw());
            jSONObject2.put("app_category", pw.nps());
            jSONObject.put("app", jSONObject2);
        }
    }

    public boolean xy() {
        rp rpVar = this.qj;
        if (rpVar == null || rpVar.fs() != 1) {
            return false;
        }
        uqh uqhVar = this.bjh;
        return uqhVar == null || uqhVar.zmn() <= 0;
    }

    public boolean sv() {
        int i = this.cud;
        return i == 44 || i == 43;
    }

    public void nu(String str) {
        this.zak = str;
    }

    public String xqp() {
        return this.zak;
    }
}
