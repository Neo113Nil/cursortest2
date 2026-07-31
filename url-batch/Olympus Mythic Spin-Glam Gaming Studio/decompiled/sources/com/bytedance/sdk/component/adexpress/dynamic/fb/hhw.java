package com.bytedance.sdk.component.adexpress.dynamic.fb;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.B5;
import com.ironsource.X3;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class hhw {
    private double am;
    private int ao;
    private int ax;
    private boolean bjh;
    private boolean bmc;
    private boolean btk;
    private float bvs;
    private boolean bxw;
    private int cd;
    private String cn;
    private boolean cud;
    private String cyb;
    private String db;
    private int dey;
    private int dgt;
    private String doe;
    private int es;
    private boolean eug;
    private String ev;
    private float fb;
    private String fkt;
    private float fs;
    private int gn;
    private String gt;
    private boolean hgd;
    private float hhw;
    private String hip;
    private int hsp;
    private int hwg;
    private int hz;

    /* renamed from: io, reason: collision with root package name */
    private int f3735io;
    private String iqz;
    private float iv;
    private int jy;
    private String kgc;
    private int kjb;
    private double klz;
    private int kra;
    private String kw;
    private int lbc;
    private int lgz;
    private String ljl;
    private boolean lt;
    private int lwz;
    private boolean mhu;
    private int mig;
    private boolean mpi;
    private JSONObject mrt;
    private String mw;
    private String na;
    private int nkt;
    private List<zmn> nlz;
    private float nps;
    private String nqi;
    private int nu;
    private JSONObject ob;
    private int obg;
    private String oep;
    private String olo;
    private int oub;
    private boolean ouf;
    private long pf = -1;
    private String phc;
    private String pl;
    private boolean quu;
    private double rc;
    private int rje;
    private int rp;
    private int rsi;
    private String rt;
    private int skn;
    private String sl;
    private String so;
    private double sxr;
    private String tdm;
    private boolean tet;
    private JSONObject tev;
    private String tf;
    private boolean tj;
    private int uaq;
    private boolean uqd;
    private String uqh;
    private int utx;
    private int uw;
    private int va;
    private JSONObject ve;
    private int vgx;
    private int vlj;
    private int vpd;
    private boolean vtz;
    private String wd;
    private boolean wq;
    private int ww;
    private String xrr;
    private String yj;
    private boolean yo;
    private double yof;
    private double zak;
    private float zg;
    private int zi;
    private float zmn;
    private float zn;

    public static hhw zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        hhw hhwVar = new hhw();
        hhwVar.fs(jSONObject.optString("adType", "embeded"));
        hhwVar.cn(jSONObject.optString("clickArea", "creative"));
        hhwVar.cyb(jSONObject.optString("clickTigger", "click"));
        hhwVar.zn(jSONObject.optString("fontFamily", "PingFangSC"));
        hhwVar.fb(jSONObject.optString("textAlign", "left"));
        hhwVar.btk(jSONObject.optString("color", "#999999"));
        hhwVar.hhw(jSONObject.optString("bgColor", X3.i.T));
        hhwVar.nps(jSONObject.optString("bgImgUrl", ""));
        hhwVar.kjb(jSONObject.optString("bgImgData", ""));
        hhwVar.zg(jSONObject.optString("borderColor", POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
        hhwVar.bvs(jSONObject.optString("borderStyle", "solid"));
        hhwVar.iv(jSONObject.optString("heightMode", "auto"));
        hhwVar.rc(jSONObject.optString("widthMode", "fixed"));
        hhwVar.klz(jSONObject.optString("interactText", ""));
        hhwVar.zn(jSONObject.optBoolean("isShowBgControl", false));
        hhwVar.mw(jSONObject.optString("interactBgColor", ""));
        JSONObject optJSONObject = jSONObject.optJSONObject("interactPosition");
        if (optJSONObject != null) {
            hhwVar.nps(optJSONObject.optInt("translateY", 0));
            hhwVar.zg(optJSONObject.optInt("translateX", 0));
            hhwVar.fb(optJSONObject.optDouble("scaleX", 0.0d));
            hhwVar.btk(optJSONObject.optDouble("scaleY", 0.0d));
        }
        hhwVar.rt(jSONObject.optString("interactType", ""));
        hhwVar.btk(jSONObject.optInt("interactSlideDirection", -1));
        hhwVar.olo(jSONObject.optString("justifyHorizontal", "space-around"));
        hhwVar.kgc(jSONObject.optString("justifyVertical", "flex-start"));
        hhwVar.fs(jSONObject.optDouble("timingStart"));
        hhwVar.zn(jSONObject.optDouble("timingEnd"));
        hhwVar.fb((float) jSONObject.optDouble("width", 0.0d));
        hhwVar.zn((float) jSONObject.optDouble("height", 0.0d));
        hhwVar.zmn((float) jSONObject.optDouble("borderRadius", 0.0d));
        hhwVar.fs((float) jSONObject.optDouble("borderSize", 0.0d));
        hhwVar.fs(jSONObject.optBoolean("interactValidate", false));
        hhwVar.bvs((float) jSONObject.optDouble("fontSize", 0.0d));
        hhwVar.btk((float) jSONObject.optDouble("paddingBottom", 0.0d));
        hhwVar.hhw((float) jSONObject.optDouble("paddingLeft", 0.0d));
        hhwVar.nps((float) jSONObject.optDouble("paddingRight", 0.0d));
        hhwVar.zg((float) jSONObject.optDouble("paddingTop", 0.0d));
        hhwVar.fb(jSONObject.optBoolean("lineFeed", false));
        hhwVar.bvs(jSONObject.optInt("lineCount", 0));
        hhwVar.hhw(jSONObject.optDouble("lineHeight", 1.2d));
        hhwVar.rt(jSONObject.optInt("letterSpacing", 0));
        hhwVar.btk(jSONObject.optBoolean("isDataFixed", false));
        hhwVar.cn(jSONObject.optInt("fontWeight"));
        hhwVar.hhw(jSONObject.optBoolean("lineLimit"));
        hhwVar.cyb(jSONObject.optInt(X3.i.L));
        hhwVar.kw(jSONObject.optString("align"));
        hhwVar.nps(jSONObject.optBoolean("useLeft"));
        hhwVar.zg(jSONObject.optBoolean("useRight"));
        hhwVar.bvs(jSONObject.optBoolean("useTop"));
        hhwVar.iv(jSONObject.optBoolean("useBottom"));
        hhwVar.iqz(jSONObject.optString("data"));
        hhwVar.fs(jSONObject.optJSONObject("i18n"));
        hhwVar.klz(jSONObject.optInt("marginLeft"));
        hhwVar.mw(jSONObject.optInt("marginRight"));
        hhwVar.iv(jSONObject.optInt("marginTop"));
        hhwVar.rc(jSONObject.optInt("marginBottom"));
        hhwVar.olo(jSONObject.optInt("tagMaxCount"));
        hhwVar.rc(jSONObject.optBoolean("allowTextFlow"));
        hhwVar.kgc(jSONObject.optInt("textFlowType"));
        hhwVar.kw(jSONObject.optInt("textFlowDuration"));
        hhwVar.iqz(jSONObject.optInt("left"));
        hhwVar.phc(jSONObject.optInt("right"));
        hhwVar.doe(jSONObject.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY));
        hhwVar.nqi(jSONObject.optInt("bottom"));
        hhwVar.phc(jSONObject.optString("alignItems", "flex-start"));
        hhwVar.doe(jSONObject.optString("direction", ""));
        hhwVar.zmn(jSONObject.optBoolean("loop", false));
        hhwVar.uqh(jSONObject.optInt("zIndex"));
        hhwVar.am(jSONObject.optInt("interactVisibleTime"));
        hhwVar.bjh(jSONObject.optInt("interactHiddenTime"));
        hhwVar.mw(jSONObject.optBoolean("interactEnableMask"));
        hhwVar.rt(jSONObject.optBoolean("interactWontHide"));
        hhwVar.zmn(jSONObject.optString("bgGradient"));
        hhwVar.so(jSONObject.optInt("areaType"));
        hhwVar.ev(jSONObject.optInt("interactSlideThreshold", 0));
        hhwVar.hgd(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.fb.fs() ? 0 : 120));
        hhwVar.kgc(jSONObject.optBoolean("openPlayableLandingPage", false));
        hhwVar.zn(jSONObject.optJSONObject("video"));
        hhwVar.fb(jSONObject.optJSONObject("image"));
        hhwVar.tf(jSONObject.optInt("borderShadowExtent"));
        hhwVar.cn(jSONObject.optBoolean("bgGauseBlur"));
        hhwVar.fkt(jSONObject.optInt("bgGauseBlurRadius"));
        hhwVar.cyb(jSONObject.optBoolean("showTimeProgress", false));
        hhwVar.olo(jSONObject.optBoolean("showPlayButton", false));
        hhwVar.zmn(jSONObject.optDouble("bgColorCg", 0.0d));
        hhwVar.hhw(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        hhwVar.fs(jSONObject.optInt("borderTopLeftRadius", 0));
        hhwVar.zmn(jSONObject.optInt("borderTopRightRadius", 0));
        hhwVar.fb(jSONObject.optInt("borderBottomLeftRadius", 0));
        hhwVar.zn(jSONObject.optInt("borderBottomRightRadius", 0));
        hhwVar.btk(jSONObject.optJSONObject("interactI18n"));
        hhwVar.uqh(jSONObject.optString("imageObjectFit"));
        hhwVar.bjh(jSONObject.optString("interactTitle"));
        hhwVar.yj(jSONObject.optInt("interactTextPositionTop"));
        hhwVar.nqi(jSONObject.optString("imageLottieTosPath"));
        hhwVar.klz(jSONObject.optBoolean("animationsLoop"));
        hhwVar.rp(jSONObject.optInt("lottieAppNameMaxLength"));
        hhwVar.zak(jSONObject.optInt("lottieAdDescMaxLength"));
        hhwVar.kjb(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("animations");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    zmn zmnVar = new zmn();
                    zmnVar.zn(jSONObject2.optString("animationType"));
                    zmnVar.zmn(jSONObject2.optDouble("animationDuration"));
                    zmnVar.fs(jSONObject2.optDouble("animationScaleX"));
                    zmnVar.zn(jSONObject2.optDouble("animationScaleY"));
                    zmnVar.fb(jSONObject2.optString("animationTimeFunction"));
                    zmnVar.fb(jSONObject2.optDouble("animationDelay"));
                    zmnVar.hhw(jSONObject2.optInt("animationIterationCount"));
                    zmnVar.btk(jSONObject2.optString("animationDirection"));
                    zmnVar.btk(jSONObject2.optDouble("animationInterval"));
                    zmnVar.zmn(jSONObject2.optInt("animationBorderWidth"));
                    zmnVar.zmn(jSONObject2.optLong("key"));
                    zmnVar.fs(jSONObject2.optInt("animationEffectWidth"));
                    zmnVar.zn(jSONObject2.optInt("animationSwing", 1));
                    zmnVar.fb(jSONObject2.optInt("animationTranslateX"));
                    zmnVar.btk(jSONObject2.optInt("animationTranslateY"));
                    zmnVar.fs(jSONObject2.optString("animationRippleBackgroundColor"));
                    zmnVar.zmn(jSONObject2.optString("animationScaleDirection"));
                    zmnVar.nps(jSONObject2.optInt("animationFadeStart"));
                    zmnVar.zg(jSONObject2.optInt("animationFadeEnd"));
                    zmnVar.hhw(jSONObject2.optString("animationFillMode"));
                    zmnVar.bvs(jSONObject2.optInt("animationBounceHeight"));
                    if (hhwVar.kw() > 0.0d) {
                        zmnVar.fb(zmnVar.rt() + hhwVar.kw());
                    }
                    arrayList.add(zmnVar);
                }
                hhwVar.zmn(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                hhwVar.rp(jSONObject.optString("triggerSlideDirection", "0"));
                hhwVar.zmn(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return hhwVar;
    }

    public boolean zmn() {
        return this.mpi;
    }

    public void zmn(boolean z) {
        this.mpi = z;
    }

    public int fs() {
        return this.lgz;
    }

    public void zmn(int i) {
        this.lgz = i;
    }

    public int zn() {
        return this.va;
    }

    public void fs(int i) {
        this.va = i;
    }

    public int fb() {
        return this.vpd;
    }

    public void zn(int i) {
        this.vpd = i;
    }

    public int btk() {
        return this.lwz;
    }

    public void fb(int i) {
        this.lwz = i;
    }

    public JSONObject hhw() {
        return this.mrt;
    }

    public int nps() {
        return this.rsi;
    }

    public void btk(int i) {
        this.rsi = i;
    }

    public double zg() {
        return this.sxr;
    }

    public void zmn(double d) {
        this.sxr = d;
    }

    public int bvs() {
        return this.dey;
    }

    public void hhw(int i) {
        this.dey = i;
    }

    public String iv() {
        return this.wd;
    }

    public void zmn(String str) {
        this.wd = str;
    }

    public float rc() {
        return this.zmn;
    }

    public void zmn(float f) {
        this.zmn = f;
    }

    public float klz() {
        return this.fs;
    }

    public void fs(float f) {
        this.fs = f;
    }

    public void zn(float f) {
        this.zn = f;
    }

    public void fb(float f) {
        this.fb = f;
    }

    public boolean mw() {
        return this.btk;
    }

    public void fs(boolean z) {
        this.btk = z;
    }

    public float rt() {
        return this.hhw;
    }

    public void btk(float f) {
        this.hhw = f;
    }

    public float cn() {
        return this.nps;
    }

    public void hhw(float f) {
        this.nps = f;
    }

    public float cyb() {
        return this.zg;
    }

    public void nps(float f) {
        this.zg = f;
    }

    public float olo() {
        return this.bvs;
    }

    public void zg(float f) {
        this.bvs = f;
    }

    public float kgc() {
        return this.iv;
    }

    public void bvs(float f) {
        this.iv = f;
    }

    public double kw() {
        return this.rc;
    }

    public void fs(double d) {
        this.rc = d;
    }

    public double iqz() {
        return this.klz;
    }

    public void zn(double d) {
        this.klz = d;
    }

    public void fs(String str) {
        this.mw = str;
    }

    public void zn(String str) {
        this.rt = str;
    }

    public String phc() {
        return this.cn;
    }

    public void fb(String str) {
        this.cn = str;
    }

    public String doe() {
        return this.cyb;
    }

    public void btk(String str) {
        this.cyb = str;
    }

    public String nqi() {
        return this.olo;
    }

    public void hhw(String str) {
        this.olo = str;
    }

    public void nps(String str) {
        this.kgc = str;
    }

    public String uqh() {
        return this.kgc;
    }

    private void kjb(String str) {
        this.gt = str;
    }

    public String bjh() {
        return this.gt;
    }

    public String rp() {
        return this.kw;
    }

    public void zg(String str) {
        this.kw = str;
    }

    public void bvs(String str) {
        this.iqz = str;
    }

    public String kjb() {
        return this.phc;
    }

    public void iv(String str) {
        this.phc = str;
    }

    public String zak() {
        return this.doe;
    }

    public void rc(String str) {
        this.doe = str;
    }

    public String am() {
        return this.nqi;
    }

    public void klz(String str) {
        this.nqi = str;
    }

    public String yj() {
        return this.uqh;
    }

    public void mw(String str) {
        this.uqh = str;
    }

    public boolean so() {
        return this.bjh;
    }

    public void zn(boolean z) {
        this.bjh = z;
    }

    public int ev() {
        return this.rp;
    }

    public void nps(int i) {
        this.rp = i;
    }

    public int tf() {
        return this.kjb;
    }

    public void zg(int i) {
        this.kjb = i;
    }

    public double fkt() {
        return this.zak;
    }

    public void fb(double d) {
        this.zak = d;
    }

    public double hgd() {
        return this.am;
    }

    public void btk(double d) {
        this.am = d;
    }

    public String nu() {
        return this.yj;
    }

    public void rt(String str) {
        this.yj = str;
    }

    public String ww() {
        return this.so;
    }

    public void cn(String str) {
        this.so = str;
    }

    public String oub() {
        return this.ev;
    }

    public void cyb(String str) {
        this.ev = str;
    }

    public String jy() {
        return this.tf;
    }

    public void olo(String str) {
        this.tf = str;
    }

    public String vlj() {
        return this.fkt;
    }

    public void kgc(String str) {
        this.fkt = str;
    }

    public boolean yof() {
        return this.hgd;
    }

    public void fb(boolean z) {
        this.hgd = z;
    }

    public void bvs(int i) {
        this.nu = i;
    }

    public int dgt() {
        return this.nu;
    }

    public int cud() {
        return this.ww;
    }

    public void iv(int i) {
        this.ww = i;
    }

    public int gn() {
        return this.oub;
    }

    public void rc(int i) {
        this.oub = i;
    }

    public int uqd() {
        return this.jy;
    }

    public void klz(int i) {
        this.jy = i;
    }

    public int kra() {
        return this.vlj;
    }

    public void mw(int i) {
        this.vlj = i;
    }

    public double na() {
        return this.yof;
    }

    public void hhw(double d) {
        this.yof = d;
    }

    public int mhu() {
        return this.dgt;
    }

    public void rt(int i) {
        this.dgt = i;
    }

    public boolean bxw() {
        return this.cud;
    }

    public void btk(boolean z) {
        this.cud = z;
    }

    public int tet() {
        return this.gn;
    }

    public void cn(int i) {
        this.gn = i;
    }

    public boolean yo() {
        return this.uqd;
    }

    public void hhw(boolean z) {
        this.uqd = z;
    }

    public int xrr() {
        return this.kra;
    }

    public void cyb(int i) {
        this.kra = i;
    }

    public String ve() {
        return this.na;
    }

    public void kw(String str) {
        this.na = str;
    }

    public boolean cd() {
        return this.mhu;
    }

    public void nps(boolean z) {
        this.mhu = z;
    }

    public boolean lt() {
        return this.bxw;
    }

    public void zg(boolean z) {
        this.bxw = z;
    }

    public boolean io() {
        return this.tet;
    }

    public void bvs(boolean z) {
        this.tet = z;
    }

    public boolean lbc() {
        return this.yo;
    }

    public void iv(boolean z) {
        this.yo = z;
    }

    public String hwg() {
        return this.xrr;
    }

    public void iqz(String str) {
        this.xrr = str;
    }

    public void fs(JSONObject jSONObject) {
        this.ve = jSONObject;
    }

    public JSONObject rje() {
        return this.ve;
    }

    public int zi() {
        return this.cd;
    }

    public void olo(int i) {
        this.cd = i;
    }

    public boolean nkt() {
        return this.lt;
    }

    public void rc(boolean z) {
        this.lt = z;
    }

    public int oep() {
        return this.f3735io;
    }

    public void kgc(int i) {
        this.f3735io = i;
    }

    public int tdm() {
        return this.lbc;
    }

    public void kw(int i) {
        this.lbc = i;
    }

    public int mpi() {
        return this.hwg;
    }

    public void iqz(int i) {
        this.hwg = i;
    }

    public int skn() {
        return this.rje;
    }

    public void phc(int i) {
        this.rje = i;
    }

    public int ax() {
        return this.zi;
    }

    public void doe(int i) {
        this.zi = i;
    }

    public int obg() {
        return this.nkt;
    }

    public void nqi(int i) {
        this.nkt = i;
    }

    public String nlz() {
        return this.oep;
    }

    public void phc(String str) {
        this.oep = str;
    }

    public String es() {
        return this.tdm;
    }

    public void doe(String str) {
        this.tdm = str;
    }

    public int hsp() {
        return this.skn;
    }

    public void uqh(int i) {
        this.skn = i;
    }

    public int utx() {
        return this.ax;
    }

    public void bjh(int i) {
        this.ax = i;
    }

    public String uw() {
        return this.pl;
    }

    public void nqi(String str) {
        this.pl = str;
    }

    public boolean wq() {
        return this.tj;
    }

    public void klz(boolean z) {
        this.tj = z;
    }

    public int bmc() {
        return this.ao;
    }

    public void rp(int i) {
        this.ao = i;
    }

    public int vtz() {
        return this.vgx;
    }

    public void kjb(int i) {
        this.vgx = i;
    }

    public int mig() {
        return this.hz;
    }

    public void zak(int i) {
        this.hz = i;
    }

    public boolean ouf() {
        return this.quu;
    }

    public void mw(boolean z) {
        this.quu = z;
    }

    public int sxr() {
        return this.obg;
    }

    public void am(int i) {
        this.obg = i;
    }

    public void rt(boolean z) {
        this.eug = z;
    }

    public boolean ob() {
        return this.eug;
    }

    public void uqh(String str) {
        this.ljl = str;
    }

    public String tev() {
        return this.ljl;
    }

    public void yj(int i) {
        this.uaq = i;
    }

    public int rsi() {
        return this.uaq;
    }

    public List<zmn> hip() {
        return this.nlz;
    }

    public int eug() {
        List<zmn> list = this.nlz;
        if (list == null) {
            return 0;
        }
        for (zmn zmnVar : list) {
            if ("translate".equals(zmnVar.bvs()) && zmnVar.nps() < 0) {
                return -zmnVar.nps();
            }
        }
        return 0;
    }

    public void zmn(List<zmn> list) {
        this.nlz = list;
    }

    public int mrt() {
        return this.es;
    }

    public void so(int i) {
        this.es = i;
    }

    public int dey() {
        return this.hsp;
    }

    public void ev(int i) {
        this.hsp = i;
    }

    public int lgz() {
        return this.utx;
    }

    public void tf(int i) {
        this.utx = i;
    }

    public boolean va() {
        return this.wq;
    }

    public void cn(boolean z) {
        this.wq = z;
    }

    public int vpd() {
        return this.uw;
    }

    public void fkt(int i) {
        this.uw = i;
    }

    public boolean lwz() {
        return this.bmc;
    }

    public void cyb(boolean z) {
        this.bmc = z;
    }

    public boolean ljl() {
        return this.vtz;
    }

    public void olo(boolean z) {
        this.vtz = z;
    }

    public int uaq() {
        return this.mig;
    }

    public void hgd(int i) {
        this.mig = i;
    }

    public String quu() {
        return this.hip;
    }

    public boolean pl() {
        return this.ouf;
    }

    public void kgc(boolean z) {
        this.ouf = z;
    }

    public void zn(JSONObject jSONObject) {
        this.ob = jSONObject;
    }

    public JSONObject tj() {
        return this.tev;
    }

    public void fb(JSONObject jSONObject) {
        this.tev = jSONObject;
    }

    public void btk(JSONObject jSONObject) {
        this.mrt = jSONObject;
    }

    public String ao() {
        return this.sl;
    }

    public void bjh(String str) {
        this.sl = str;
    }

    public void vgx() {
        zmn(this, this.ob);
    }

    public void hz() {
        zmn(this, this.tev);
    }

    public String sl() {
        return this.db;
    }

    public void rp(String str) {
        this.db = str;
    }

    public long db() {
        return this.pf;
    }

    public void zmn(long j) {
        this.pf = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void zmn(hhw hhwVar, JSONObject jSONObject) {
        if (hhwVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        c = 16;
                        break;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        c = 18;
                        break;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        c = 19;
                        break;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        c = 20;
                        break;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        c = 21;
                        break;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        c = 22;
                        break;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        c = 23;
                        break;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        c = 24;
                        break;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        c = 25;
                        break;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        c = 26;
                        break;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        c = 27;
                        break;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        c = 28;
                        break;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        c = 29;
                        break;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        c = 30;
                        break;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        c = 31;
                        break;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 115029:
                    if (next.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        c = '!';
                        break;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        c = '#';
                        break;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        c = '$';
                        break;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        c = '%';
                        break;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        c = '&';
                        break;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        c = '(';
                        break;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        c = ')';
                        break;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        c = '*';
                        break;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        c = '+';
                        break;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        c = ',';
                        break;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        c = '-';
                        break;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        c = '.';
                        break;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        c = '/';
                        break;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        c = '0';
                        break;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        c = '1';
                        break;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        c = '2';
                        break;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        c = '3';
                        break;
                    }
                    break;
                case 747804969:
                    if (next.equals(X3.i.L)) {
                        c = '4';
                        break;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        c = '5';
                        break;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        c = '6';
                        break;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        c = '7';
                        break;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        c = '8';
                        break;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        c = '9';
                        break;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        c = ':';
                        break;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        c = ';';
                        break;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        c = '<';
                        break;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        c = B5.U;
                        break;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        c = '>';
                        break;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        c = '?';
                        break;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        c = '@';
                        break;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        c = 'A';
                        break;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        c = 'B';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    hhwVar.zn(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    hhwVar.cn(jSONObject.optString(next));
                    break;
                case 2:
                    hhwVar.rp(jSONObject.optString(next));
                    break;
                case 3:
                    hhwVar.nps(jSONObject.optString(next));
                    break;
                case 4:
                    hhwVar.bvs(jSONObject.optInt(next));
                    break;
                case 5:
                    hhwVar.kgc(jSONObject.optBoolean(next));
                    break;
                case 6:
                    hhwVar.hhw(jSONObject.optBoolean(next));
                    break;
                case 7:
                    hhwVar.mw(jSONObject.optString(next));
                    break;
                case '\b':
                    hhwVar.hhw((float) jSONObject.optDouble(next));
                    break;
                case '\t':
                    hhwVar.fs(jSONObject.optString(next));
                    break;
                case '\n':
                    hhwVar.nqi(jSONObject.optInt(next));
                    break;
                case 11:
                    hhwVar.zn(jSONObject.optString(next));
                    break;
                case '\f':
                    hhwVar.zn((float) jSONObject.optDouble(next));
                    break;
                case '\r':
                    hhwVar.fb(jSONObject.optString(next));
                    break;
                case 14:
                    hhwVar.phc(jSONObject.optString(next));
                    break;
                case 15:
                    hhwVar.fs(jSONObject.optBoolean(next));
                    break;
                case 16:
                    hhwVar.iv(jSONObject.optInt(next));
                    break;
                case 17:
                    hhwVar.iv(jSONObject.optBoolean(next));
                    break;
                case 18:
                    hhwVar.zmn(jSONObject.optLong(next));
                    break;
                case 19:
                    hhwVar.doe(jSONObject.optString(next));
                    break;
                case 20:
                    hhwVar.olo(jSONObject.optInt(next));
                    break;
                case 21:
                    hhwVar.bjh(jSONObject.optInt(next));
                    break;
                case 22:
                    hhwVar.bvs(jSONObject.optBoolean(next));
                    break;
                case 23:
                    hhwVar.cn(jSONObject.optInt(next));
                    break;
                case 24:
                    hhwVar.uqh(jSONObject.optInt(next));
                    break;
                case 25:
                    hhwVar.fs(jSONObject.optDouble(next));
                    break;
                case 26:
                    hhwVar.hhw(jSONObject.optDouble(next));
                    break;
                case 27:
                    hhwVar.kw(jSONObject.optInt(next));
                    break;
                case 28:
                    hhwVar.zg(jSONObject.optBoolean(next));
                    break;
                case 29:
                    hhwVar.rc(jSONObject.optInt(next));
                    break;
                case 30:
                    hhwVar.hhw(jSONObject.optString(next));
                    break;
                case 31:
                    hhwVar.nps(jSONObject.optBoolean(next));
                    break;
                case ' ':
                    hhwVar.rc(jSONObject.optString(next));
                    break;
                case '!':
                    hhwVar.doe(jSONObject.optInt(next));
                    break;
                case '\"':
                    hhwVar.iqz(jSONObject.optString(next));
                    break;
                case '#':
                    hhwVar.iqz(jSONObject.optInt(next));
                    break;
                case '$':
                    hhwVar.zmn(jSONObject.optBoolean(next));
                    break;
                case '%':
                    hhwVar.zg((float) jSONObject.optDouble(next));
                    break;
                case '&':
                    hhwVar.kw(jSONObject.optString(next));
                    break;
                case '\'':
                    hhwVar.btk(jSONObject.optString(next));
                    break;
                case '(':
                    hhwVar.phc(jSONObject.optInt(next));
                    break;
                case ')':
                    hhwVar.fb((float) jSONObject.optDouble(next));
                    break;
                case '*':
                    hhwVar.zn(jSONObject.optDouble(next));
                    break;
                case '+':
                    hhwVar.btk((float) jSONObject.optDouble(next));
                    break;
                case ',':
                    hhwVar.rc(jSONObject.optBoolean(next));
                    break;
                case '-':
                    hhwVar.rt(jSONObject.optBoolean(next));
                    break;
                case '.':
                    hhwVar.bvs((float) jSONObject.optDouble(next));
                    break;
                case '/':
                    hhwVar.kgc(jSONObject.optString(next));
                    break;
                case '0':
                    hhwVar.am(jSONObject.optInt(next));
                    break;
                case '1':
                    hhwVar.nps((float) jSONObject.optDouble(next));
                    break;
                case '2':
                    hhwVar.zg(jSONObject.optString(next));
                    break;
                case '3':
                    hhwVar.bvs(jSONObject.optString(next));
                    break;
                case '4':
                    hhwVar.cyb(jSONObject.optInt(next));
                    break;
                case '5':
                    hhwVar.btk(jSONObject.optBoolean(next));
                    break;
                case '6':
                    hhwVar.mw(jSONObject.optInt(next));
                    break;
                case '7':
                    hhwVar.olo(jSONObject.optString(next));
                    break;
                case '8':
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject == null) {
                        break;
                    } else {
                        hhwVar.nps(optJSONObject.optInt("translateY", 0));
                        hhwVar.zg(optJSONObject.optInt("translateX", 0));
                        hhwVar.fb(optJSONObject.optDouble("scaleX", 0.0d));
                        hhwVar.btk(optJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                case '9':
                    hhwVar.fb(jSONObject.optBoolean(next));
                    break;
                case ':':
                    hhwVar.klz(jSONObject.optString(next));
                    break;
                case ';':
                    hhwVar.rt(jSONObject.optString(next));
                    break;
                case '<':
                    hhwVar.zmn((float) jSONObject.optDouble(next));
                    break;
                case '=':
                    hhwVar.cyb(jSONObject.optString(next));
                    break;
                case '>':
                    hhwVar.iv(jSONObject.optString(next));
                    break;
                case '?':
                    hhwVar.kgc(jSONObject.optInt(next));
                    break;
                case '@':
                    hhwVar.fs((float) jSONObject.optDouble(next));
                    break;
                case 'A':
                    hhwVar.klz(jSONObject.optInt(next));
                    break;
                case 'B':
                    hhwVar.rt(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
