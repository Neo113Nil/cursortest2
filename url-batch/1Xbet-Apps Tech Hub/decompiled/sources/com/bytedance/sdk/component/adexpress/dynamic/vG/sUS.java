package com.bytedance.sdk.component.adexpress.dynamic.vG;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: DynamicLayoutBrickValue.java */
/* loaded from: classes.dex */
public class sUS {
    private String ABo;
    private boolean AEt;
    private int Ayu;
    private String BSi;
    private String BiC;
    private int Ca;
    private int CjQ;
    private int CvL;
    private int Cwg;
    private boolean EFw;
    private int FFl;
    private int FN;
    private int GcG;
    private double Gp;
    private int HWd;
    private String IP;
    private int Irm;
    private float Jd;
    private String Je;
    private String Ju;
    private String LEC;
    private int LHy;
    private int Lxj;
    private int MA;
    private int MY;
    private JSONObject Mnp;
    private float Mxy;
    private boolean NB;
    private String OT;
    private JSONObject Oa;
    private int OhP;
    private boolean OyE;
    private String Pj;
    private int RGX;
    private boolean RKd;
    private double SE;
    private double SJ;
    private String SLG;
    private int Tdd;
    private List<pvs> UYh;
    private int VVr;
    private int Wby;
    private float Wyp;
    private int Ye;
    private String ZhG;
    private int Zm;
    private boolean ZsW;
    private double ae;
    private String bNS;
    private int cGU;
    private String cR;
    private String cRf;
    private boolean cnN;
    private int dX;
    private String dx;
    private boolean dyT;
    private long eOd = -1;
    private int ea;
    private String elv;
    private String gA;
    private int gSd;
    private float icD;
    private JSONObject ig;
    private int jhZ;
    private String jlb;
    private boolean joF;
    private double kj;
    private boolean mRq;
    private String mnm;
    private String mo;
    private int nS;
    private boolean neB;
    private String ny;
    private int od;
    private int pR;
    private float pvs;
    private int qD;
    private boolean qVe;
    private String qd;
    private double qh;
    private String rCZ;
    private JSONObject rW;
    private int rcB;
    private boolean sP;
    private boolean sR;
    private float sUS;
    private float so;
    private boolean sq;
    private boolean tCd;
    private String tQ;
    private boolean thO;
    private String uc;
    private String vA;
    private float vG;
    private int wjr;
    private int wr;
    private boolean xa;
    private int yWX;
    private int yhq;
    private float yiw;
    private String zM;
    private String zn;

    public static sUS pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        sUS sus = new sUS();
        sus.icD(jSONObject.optString("adType", "embeded"));
        sus.bNS(jSONObject.optString("clickArea", "creative"));
        sus.mnm(jSONObject.optString("clickTigger", "click"));
        sus.vG(jSONObject.optString("fontFamily", "PingFangSC"));
        sus.Jd(jSONObject.optString("textAlign", "left"));
        sus.NB(jSONObject.optString(TypedValues.Custom.S_COLOR, "#999999"));
        sus.sUS(jSONObject.optString("bgColor", "transparent"));
        sus.yiw(jSONObject.optString("bgImgUrl", ""));
        sus.CvL(jSONObject.optString("bgImgData", ""));
        sus.so(jSONObject.optString("borderColor", "#000000"));
        sus.Mxy(jSONObject.optString("borderStyle", "solid"));
        sus.Wyp(jSONObject.optString("heightMode", DebugKt.DEBUG_PROPERTY_VALUE_AUTO));
        sus.qh(jSONObject.optString("widthMode", "fixed"));
        sus.kj(jSONObject.optString("interactText", ""));
        sus.vG(jSONObject.optBoolean("isShowBgControl", false));
        sus.Ju(jSONObject.optString("interactBgColor", ""));
        JSONObject optJSONObject = jSONObject.optJSONObject("interactPosition");
        if (optJSONObject != null) {
            sus.yiw(optJSONObject.optInt("translateY", 0));
            sus.so(optJSONObject.optInt("translateX", 0));
            sus.Jd(optJSONObject.optDouble("scaleX", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
            sus.NB(optJSONObject.optDouble("scaleY", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        }
        sus.IP(jSONObject.optString("interactType", ""));
        sus.NB(jSONObject.optInt("interactSlideDirection", -1));
        sus.vA(jSONObject.optString("justifyHorizontal", "space-around"));
        sus.cR(jSONObject.optString("justifyVertical", "flex-start"));
        sus.icD(jSONObject.optDouble("timingStart"));
        sus.vG(jSONObject.optDouble("timingEnd"));
        sus.Jd((float) jSONObject.optDouble("width", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.vG((float) jSONObject.optDouble("height", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.pvs((float) jSONObject.optDouble("borderRadius", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.icD((float) jSONObject.optDouble("borderSize", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.icD(jSONObject.optBoolean("interactValidate", false));
        sus.Mxy((float) jSONObject.optDouble("fontSize", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.NB((float) jSONObject.optDouble("paddingBottom", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.sUS((float) jSONObject.optDouble("paddingLeft", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.yiw((float) jSONObject.optDouble("paddingRight", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.so((float) jSONObject.optDouble("paddingTop", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.Jd(jSONObject.optBoolean("lineFeed", false));
        sus.Mxy(jSONObject.optInt("lineCount", 0));
        sus.sUS(jSONObject.optDouble("lineHeight", 1.2d));
        sus.IP(jSONObject.optInt("letterSpacing", 0));
        sus.NB(jSONObject.optBoolean("isDataFixed", false));
        sus.bNS(jSONObject.optInt("fontWeight"));
        sus.sUS(jSONObject.optBoolean("lineLimit"));
        sus.mnm(jSONObject.optInt("position"));
        sus.zM(jSONObject.optString("align"));
        sus.yiw(jSONObject.optBoolean("useLeft"));
        sus.so(jSONObject.optBoolean("useRight"));
        sus.Mxy(jSONObject.optBoolean("useTop"));
        sus.Wyp(jSONObject.optBoolean("useBottom"));
        sus.uc(jSONObject.optString("data"));
        sus.icD(jSONObject.optJSONObject("i18n"));
        sus.kj(jSONObject.optInt("marginLeft"));
        sus.Ju(jSONObject.optInt("marginRight"));
        sus.Wyp(jSONObject.optInt("marginTop"));
        sus.qh(jSONObject.optInt("marginBottom"));
        sus.vA(jSONObject.optInt("tagMaxCount"));
        sus.qh(jSONObject.optBoolean("allowTextFlow"));
        sus.cR(jSONObject.optInt("textFlowType"));
        sus.zM(jSONObject.optInt("textFlowDuration"));
        sus.uc(jSONObject.optInt("left"));
        sus.rCZ(jSONObject.optInt("right"));
        sus.OT(jSONObject.optInt("top"));
        sus.ny(jSONObject.optInt("bottom"));
        sus.rCZ(jSONObject.optString("alignItems", "flex-start"));
        sus.OT(jSONObject.optString("direction", ""));
        sus.pvs(jSONObject.optBoolean("loop", false));
        sus.ZhG(jSONObject.optInt("zIndex"));
        sus.ae(jSONObject.optInt("interactVisibleTime"));
        sus.dyT(jSONObject.optInt("interactHiddenTime"));
        sus.Ju(jSONObject.optBoolean("interactEnableMask"));
        sus.IP(jSONObject.optBoolean("interactWontHide"));
        sus.pvs(jSONObject.optString("bgGradient"));
        sus.jlb(jSONObject.optInt("areaType"));
        sus.dx(jSONObject.optInt("interactSlideThreshold", 0));
        sus.sP(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.Jd.icD() ? 0 : 120));
        sus.cR(jSONObject.optBoolean("openPlayableLandingPage", false));
        sus.vG(jSONObject.optJSONObject("video"));
        sus.Jd(jSONObject.optJSONObject("image"));
        sus.Pj(jSONObject.optInt("borderShadowExtent"));
        sus.bNS(jSONObject.optBoolean("bgGauseBlur"));
        sus.cRf(jSONObject.optInt("bgGauseBlurRadius"));
        sus.mnm(jSONObject.optBoolean("showTimeProgress", false));
        sus.vA(jSONObject.optBoolean("showPlayButton", false));
        sus.pvs(jSONObject.optDouble("bgColorCg", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        sus.sUS(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        sus.icD(jSONObject.optInt("borderTopLeftRadius", 0));
        sus.pvs(jSONObject.optInt("borderTopRightRadius", 0));
        sus.Jd(jSONObject.optInt("borderBottomLeftRadius", 0));
        sus.vG(jSONObject.optInt("borderBottomRightRadius", 0));
        sus.NB(jSONObject.optJSONObject("interactI18n"));
        sus.ZhG(jSONObject.optString("imageObjectFit"));
        sus.dyT(jSONObject.optString("interactTitle"));
        sus.gA(jSONObject.optInt("interactTextPositionTop"));
        sus.ny(jSONObject.optString("imageLottieTosPath"));
        sus.kj(jSONObject.optBoolean("animationsLoop"));
        sus.dX(jSONObject.optInt("lottieAppNameMaxLength"));
        sus.Gp(jSONObject.optInt("lottieAdDescMaxLength"));
        sus.CvL(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("animations");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    pvs pvsVar = new pvs();
                    pvsVar.vG(jSONObject2.optString("animationType"));
                    pvsVar.pvs(jSONObject2.optDouble("animationDuration"));
                    pvsVar.icD(jSONObject2.optDouble("animationScaleX"));
                    pvsVar.vG(jSONObject2.optDouble("animationScaleY"));
                    pvsVar.Jd(jSONObject2.optString("animationTimeFunction"));
                    pvsVar.Jd(jSONObject2.optDouble("animationDelay"));
                    pvsVar.sUS(jSONObject2.optInt("animationIterationCount"));
                    pvsVar.NB(jSONObject2.optString("animationDirection"));
                    pvsVar.NB(jSONObject2.optDouble("animationInterval"));
                    pvsVar.pvs(jSONObject2.optInt("animationBorderWidth"));
                    pvsVar.pvs(jSONObject2.optLong("key"));
                    pvsVar.icD(jSONObject2.optInt("animationEffectWidth"));
                    pvsVar.vG(jSONObject2.optInt("animationSwing", 1));
                    pvsVar.Jd(jSONObject2.optInt("animationTranslateX"));
                    pvsVar.NB(jSONObject2.optInt("animationTranslateY"));
                    pvsVar.icD(jSONObject2.optString("animationRippleBackgroundColor"));
                    pvsVar.pvs(jSONObject2.optString("animationScaleDirection"));
                    pvsVar.yiw(jSONObject2.optInt("animationFadeStart"));
                    pvsVar.so(jSONObject2.optInt("animationFadeEnd"));
                    pvsVar.sUS(jSONObject2.optString("animationFillMode"));
                    pvsVar.Mxy(jSONObject2.optInt("animationBounceHeight"));
                    if (sus.zM() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        pvsVar.Jd(pvsVar.IP() + sus.zM());
                    }
                    arrayList.add(pvsVar);
                }
                sus.pvs(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                sus.dX(jSONObject.optString("triggerSlideDirection", "0"));
                sus.pvs(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return sus;
    }

    public boolean pvs() {
        return this.tCd;
    }

    public void pvs(boolean z) {
        this.tCd = z;
    }

    public int icD() {
        return this.GcG;
    }

    public void pvs(int i) {
        this.GcG = i;
    }

    public int vG() {
        return this.nS;
    }

    public void icD(int i) {
        this.nS = i;
    }

    public int Jd() {
        return this.Lxj;
    }

    public void vG(int i) {
        this.Lxj = i;
    }

    public int NB() {
        return this.VVr;
    }

    public void Jd(int i) {
        this.VVr = i;
    }

    public JSONObject sUS() {
        return this.Oa;
    }

    public int yiw() {
        return this.Tdd;
    }

    public void NB(int i) {
        this.Tdd = i;
    }

    public double so() {
        return this.SJ;
    }

    public void pvs(double d) {
        this.SJ = d;
    }

    public int Mxy() {
        return this.RGX;
    }

    public void sUS(int i) {
        this.RGX = i;
    }

    public String Wyp() {
        return this.Je;
    }

    public void pvs(String str) {
        this.Je = str;
    }

    public float qh() {
        return this.pvs;
    }

    public void pvs(float f) {
        this.pvs = f;
    }

    public float kj() {
        return this.icD;
    }

    public void icD(float f) {
        this.icD = f;
    }

    public void vG(float f) {
        this.vG = f;
    }

    public void Jd(float f) {
        this.Jd = f;
    }

    public boolean Ju() {
        return this.NB;
    }

    public void icD(boolean z) {
        this.NB = z;
    }

    public float IP() {
        return this.sUS;
    }

    public void NB(float f) {
        this.sUS = f;
    }

    public float bNS() {
        return this.yiw;
    }

    public void sUS(float f) {
        this.yiw = f;
    }

    public float mnm() {
        return this.so;
    }

    public void yiw(float f) {
        this.so = f;
    }

    public float vA() {
        return this.Mxy;
    }

    public void so(float f) {
        this.Mxy = f;
    }

    public float cR() {
        return this.Wyp;
    }

    public void Mxy(float f) {
        this.Wyp = f;
    }

    public double zM() {
        return this.qh;
    }

    public void icD(double d) {
        this.qh = d;
    }

    public double uc() {
        return this.kj;
    }

    public void vG(double d) {
        this.kj = d;
    }

    public void icD(String str) {
        this.Ju = str;
    }

    public void vG(String str) {
        this.IP = str;
    }

    public String rCZ() {
        return this.bNS;
    }

    public void Jd(String str) {
        this.bNS = str;
    }

    public String OT() {
        return this.mnm;
    }

    public void NB(String str) {
        this.mnm = str;
    }

    public String ny() {
        return this.vA;
    }

    public void sUS(String str) {
        this.vA = str;
    }

    public void yiw(String str) {
        this.cR = str;
    }

    public String ZhG() {
        return this.cR;
    }

    private void CvL(String str) {
        this.SLG = str;
    }

    public String dyT() {
        return this.SLG;
    }

    public String dX() {
        return this.zM;
    }

    public void so(String str) {
        this.zM = str;
    }

    public void Mxy(String str) {
        this.uc = str;
    }

    public String CvL() {
        return this.rCZ;
    }

    public void Wyp(String str) {
        this.rCZ = str;
    }

    public String Gp() {
        return this.OT;
    }

    public void qh(String str) {
        this.OT = str;
    }

    public String ae() {
        return this.ny;
    }

    public void kj(String str) {
        this.ny = str;
    }

    public String gA() {
        return this.ZhG;
    }

    public void Ju(String str) {
        this.ZhG = str;
    }

    public boolean jlb() {
        return this.dyT;
    }

    public void vG(boolean z) {
        this.dyT = z;
    }

    public int dx() {
        return this.dX;
    }

    public void yiw(int i) {
        this.dX = i;
    }

    public int Pj() {
        return this.CvL;
    }

    public void so(int i) {
        this.CvL = i;
    }

    public double cRf() {
        return this.Gp;
    }

    public void Jd(double d) {
        this.Gp = d;
    }

    public double sP() {
        return this.ae;
    }

    public void NB(double d) {
        this.ae = d;
    }

    public String gSd() {
        return this.gA;
    }

    public void IP(String str) {
        this.gA = str;
    }

    public String qD() {
        return this.jlb;
    }

    public void bNS(String str) {
        this.jlb = str;
    }

    public String od() {
        return this.dx;
    }

    public void mnm(String str) {
        this.dx = str;
    }

    public String OhP() {
        return this.Pj;
    }

    public void vA(String str) {
        this.Pj = str;
    }

    public String jhZ() {
        return this.cRf;
    }

    public void cR(String str) {
        this.cRf = str;
    }

    public boolean SE() {
        return this.sP;
    }

    public void Jd(boolean z) {
        this.sP = z;
    }

    public void Mxy(int i) {
        this.gSd = i;
    }

    public int yWX() {
        return this.gSd;
    }

    public int sq() {
        return this.qD;
    }

    public void Wyp(int i) {
        this.qD = i;
    }

    public int ea() {
        return this.od;
    }

    public void qh(int i) {
        this.od = i;
    }

    public int ZsW() {
        return this.OhP;
    }

    public void kj(int i) {
        this.OhP = i;
    }

    public int CjQ() {
        return this.jhZ;
    }

    public void Ju(int i) {
        this.jhZ = i;
    }

    public double BSi() {
        return this.SE;
    }

    public void sUS(double d) {
        this.SE = d;
    }

    public int cnN() {
        return this.yWX;
    }

    public void IP(int i) {
        this.yWX = i;
    }

    public boolean OyE() {
        return this.sq;
    }

    public void NB(boolean z) {
        this.sq = z;
    }

    public int joF() {
        return this.ea;
    }

    public void bNS(int i) {
        this.ea = i;
    }

    public boolean thO() {
        return this.ZsW;
    }

    public void sUS(boolean z) {
        this.ZsW = z;
    }

    public int qd() {
        return this.CjQ;
    }

    public void mnm(int i) {
        this.CjQ = i;
    }

    public String rW() {
        return this.BSi;
    }

    public void zM(String str) {
        this.BSi = str;
    }

    public boolean Cwg() {
        return this.cnN;
    }

    public void yiw(boolean z) {
        this.cnN = z;
    }

    public boolean neB() {
        return this.OyE;
    }

    public void so(boolean z) {
        this.OyE = z;
    }

    public boolean cGU() {
        return this.joF;
    }

    public void Mxy(boolean z) {
        this.joF = z;
    }

    public boolean Ca() {
        return this.thO;
    }

    public void Wyp(boolean z) {
        this.thO = z;
    }

    public String Zm() {
        return this.qd;
    }

    public void uc(String str) {
        this.qd = str;
    }

    public void icD(JSONObject jSONObject) {
        this.rW = jSONObject;
    }

    public JSONObject HWd() {
        return this.rW;
    }

    public int Ye() {
        return this.Cwg;
    }

    public void vA(int i) {
        this.Cwg = i;
    }

    public boolean Ayu() {
        return this.neB;
    }

    public void qh(boolean z) {
        this.neB = z;
    }

    public int tQ() {
        return this.cGU;
    }

    public void cR(int i) {
        this.cGU = i;
    }

    public int elv() {
        return this.Ca;
    }

    public void zM(int i) {
        this.Ca = i;
    }

    public int tCd() {
        return this.Zm;
    }

    public void uc(int i) {
        this.Zm = i;
    }

    public int Wby() {
        return this.HWd;
    }

    public void rCZ(int i) {
        this.HWd = i;
    }

    public int MY() {
        return this.Ye;
    }

    public void OT(int i) {
        this.Ye = i;
    }

    public int rcB() {
        return this.Ayu;
    }

    public void ny(int i) {
        this.Ayu = i;
    }

    public String UYh() {
        return this.tQ;
    }

    public void rCZ(String str) {
        this.tQ = str;
    }

    public String FFl() {
        return this.elv;
    }

    public void OT(String str) {
        this.elv = str;
    }

    public int yhq() {
        return this.Wby;
    }

    public void ZhG(int i) {
        this.Wby = i;
    }

    public int wjr() {
        return this.MY;
    }

    public void dyT(int i) {
        this.MY = i;
    }

    public String pR() {
        return this.LEC;
    }

    public void ny(String str) {
        this.LEC = str;
    }

    public boolean EFw() {
        return this.xa;
    }

    public void kj(boolean z) {
        this.xa = z;
    }

    public int sR() {
        return this.LHy;
    }

    public void dX(int i) {
        this.LHy = i;
    }

    public int AEt() {
        return this.wr;
    }

    public void CvL(int i) {
        this.wr = i;
    }

    public int FN() {
        return this.MA;
    }

    public void Gp(int i) {
        this.MA = i;
    }

    public boolean mRq() {
        return this.qVe;
    }

    public void Ju(boolean z) {
        this.qVe = z;
    }

    public int SJ() {
        return this.rcB;
    }

    public void ae(int i) {
        this.rcB = i;
    }

    public void IP(boolean z) {
        this.RKd = z;
    }

    public boolean ig() {
        return this.RKd;
    }

    public void ZhG(String str) {
        this.BiC = str;
    }

    public String Mnp() {
        return this.BiC;
    }

    public void gA(int i) {
        this.Irm = i;
    }

    public int Tdd() {
        return this.Irm;
    }

    public List<pvs> ABo() {
        return this.UYh;
    }

    public int RKd() {
        List<pvs> list = this.UYh;
        if (list == null) {
            return 0;
        }
        for (pvs pvsVar : list) {
            if ("translate".equals(pvsVar.Mxy()) && pvsVar.yiw() < 0) {
                return -pvsVar.yiw();
            }
        }
        return 0;
    }

    public void pvs(List<pvs> list) {
        this.UYh = list;
    }

    public int Oa() {
        return this.FFl;
    }

    public void jlb(int i) {
        this.FFl = i;
    }

    public int RGX() {
        return this.yhq;
    }

    public void dx(int i) {
        this.yhq = i;
    }

    public int GcG() {
        return this.wjr;
    }

    public void Pj(int i) {
        this.wjr = i;
    }

    public boolean nS() {
        return this.EFw;
    }

    public void bNS(boolean z) {
        this.EFw = z;
    }

    public int Lxj() {
        return this.pR;
    }

    public void cRf(int i) {
        this.pR = i;
    }

    public boolean VVr() {
        return this.sR;
    }

    public void mnm(boolean z) {
        this.sR = z;
    }

    public boolean BiC() {
        return this.AEt;
    }

    public void vA(boolean z) {
        this.AEt = z;
    }

    public int Irm() {
        return this.FN;
    }

    public void sP(int i) {
        this.FN = i;
    }

    public String qVe() {
        return this.ABo;
    }

    public boolean LEC() {
        return this.mRq;
    }

    public void cR(boolean z) {
        this.mRq = z;
    }

    public void vG(JSONObject jSONObject) {
        this.ig = jSONObject;
    }

    public JSONObject xa() {
        return this.Mnp;
    }

    public void Jd(JSONObject jSONObject) {
        this.Mnp = jSONObject;
    }

    public void NB(JSONObject jSONObject) {
        this.Oa = jSONObject;
    }

    public String LHy() {
        return this.mo;
    }

    public void dyT(String str) {
        this.mo = str;
    }

    public void wr() {
        pvs(this, this.ig);
    }

    public void MA() {
        pvs(this, this.Mnp);
    }

    public String mo() {
        return this.zn;
    }

    public void dX(String str) {
        this.zn = str;
    }

    public long zn() {
        return this.eOd;
    }

    public void pvs(long j) {
        this.eOd = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void pvs(sUS sus, JSONObject jSONObject) {
        if (sus == null || jSONObject == null) {
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
                    if (next.equals("top")) {
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
                        c = Typography.dollar;
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
                        c = Typography.amp;
                        break;
                    }
                    break;
                case 94842723:
                    if (next.equals(TypedValues.Custom.S_COLOR)) {
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
                        c = GMTDateParser.ANY;
                        break;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        c = SignatureVisitor.EXTENDS;
                        break;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        c = AbstractJsonLexerKt.COMMA;
                        break;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        c = SignatureVisitor.SUPER;
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
                    if (next.equals("position")) {
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
                        c = AbstractJsonLexerKt.COLON;
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
                        c = Typography.less;
                        break;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        c = SignatureVisitor.INSTANCEOF;
                        break;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        c = Typography.greater;
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
                    sus.vG(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    sus.bNS(jSONObject.optString(next));
                    break;
                case 2:
                    sus.dX(jSONObject.optString(next));
                    break;
                case 3:
                    sus.yiw(jSONObject.optString(next));
                    break;
                case 4:
                    sus.Mxy(jSONObject.optInt(next));
                    break;
                case 5:
                    sus.cR(jSONObject.optBoolean(next));
                    break;
                case 6:
                    sus.sUS(jSONObject.optBoolean(next));
                    break;
                case 7:
                    sus.Ju(jSONObject.optString(next));
                    break;
                case '\b':
                    sus.sUS((float) jSONObject.optDouble(next));
                    break;
                case '\t':
                    sus.icD(jSONObject.optString(next));
                    break;
                case '\n':
                    sus.ny(jSONObject.optInt(next));
                    break;
                case 11:
                    sus.vG(jSONObject.optString(next));
                    break;
                case '\f':
                    sus.vG((float) jSONObject.optDouble(next));
                    break;
                case '\r':
                    sus.Jd(jSONObject.optString(next));
                    break;
                case 14:
                    sus.rCZ(jSONObject.optString(next));
                    break;
                case 15:
                    sus.icD(jSONObject.optBoolean(next));
                    break;
                case 16:
                    sus.Wyp(jSONObject.optInt(next));
                    break;
                case 17:
                    sus.Wyp(jSONObject.optBoolean(next));
                    break;
                case 18:
                    sus.pvs(jSONObject.optLong(next));
                    break;
                case 19:
                    sus.OT(jSONObject.optString(next));
                    break;
                case 20:
                    sus.vA(jSONObject.optInt(next));
                    break;
                case 21:
                    sus.dyT(jSONObject.optInt(next));
                    break;
                case 22:
                    sus.Mxy(jSONObject.optBoolean(next));
                    break;
                case 23:
                    sus.bNS(jSONObject.optInt(next));
                    break;
                case 24:
                    sus.ZhG(jSONObject.optInt(next));
                    break;
                case 25:
                    sus.icD(jSONObject.optDouble(next));
                    break;
                case 26:
                    sus.sUS(jSONObject.optDouble(next));
                    break;
                case 27:
                    sus.zM(jSONObject.optInt(next));
                    break;
                case 28:
                    sus.so(jSONObject.optBoolean(next));
                    break;
                case 29:
                    sus.qh(jSONObject.optInt(next));
                    break;
                case 30:
                    sus.sUS(jSONObject.optString(next));
                    break;
                case 31:
                    sus.yiw(jSONObject.optBoolean(next));
                    break;
                case ' ':
                    sus.qh(jSONObject.optString(next));
                    break;
                case '!':
                    sus.OT(jSONObject.optInt(next));
                    break;
                case '\"':
                    sus.uc(jSONObject.optString(next));
                    break;
                case '#':
                    sus.uc(jSONObject.optInt(next));
                    break;
                case '$':
                    sus.pvs(jSONObject.optBoolean(next));
                    break;
                case '%':
                    sus.so((float) jSONObject.optDouble(next));
                    break;
                case '&':
                    sus.zM(jSONObject.optString(next));
                    break;
                case '\'':
                    sus.NB(jSONObject.optString(next));
                    break;
                case '(':
                    sus.rCZ(jSONObject.optInt(next));
                    break;
                case ')':
                    sus.Jd((float) jSONObject.optDouble(next));
                    break;
                case '*':
                    sus.vG(jSONObject.optDouble(next));
                    break;
                case '+':
                    sus.NB((float) jSONObject.optDouble(next));
                    break;
                case ',':
                    sus.qh(jSONObject.optBoolean(next));
                    break;
                case '-':
                    sus.IP(jSONObject.optBoolean(next));
                    break;
                case '.':
                    sus.Mxy((float) jSONObject.optDouble(next));
                    break;
                case '/':
                    sus.cR(jSONObject.optString(next));
                    break;
                case '0':
                    sus.ae(jSONObject.optInt(next));
                    break;
                case '1':
                    sus.yiw((float) jSONObject.optDouble(next));
                    break;
                case '2':
                    sus.so(jSONObject.optString(next));
                    break;
                case '3':
                    sus.Mxy(jSONObject.optString(next));
                    break;
                case '4':
                    sus.mnm(jSONObject.optInt(next));
                    break;
                case '5':
                    sus.NB(jSONObject.optBoolean(next));
                    break;
                case '6':
                    sus.Ju(jSONObject.optInt(next));
                    break;
                case '7':
                    sus.vA(jSONObject.optString(next));
                    break;
                case '8':
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject == null) {
                        break;
                    } else {
                        sus.yiw(optJSONObject.optInt("translateY", 0));
                        sus.so(optJSONObject.optInt("translateX", 0));
                        sus.Jd(optJSONObject.optDouble("scaleX", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                        sus.NB(optJSONObject.optDouble("scaleY", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                        break;
                    }
                case '9':
                    sus.Jd(jSONObject.optBoolean(next));
                    break;
                case ':':
                    sus.kj(jSONObject.optString(next));
                    break;
                case ';':
                    sus.IP(jSONObject.optString(next));
                    break;
                case '<':
                    sus.pvs((float) jSONObject.optDouble(next));
                    break;
                case '=':
                    sus.mnm(jSONObject.optString(next));
                    break;
                case '>':
                    sus.Wyp(jSONObject.optString(next));
                    break;
                case '?':
                    sus.cR(jSONObject.optInt(next));
                    break;
                case '@':
                    sus.icD((float) jSONObject.optDouble(next));
                    break;
                case 'A':
                    sus.kj(jSONObject.optInt(next));
                    break;
                case 'B':
                    sus.IP(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
