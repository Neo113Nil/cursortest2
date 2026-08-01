package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.gA;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MaterialMeta.java */
/* loaded from: classes2.dex */
public abstract class cR {
    private long pvs = 0;

    public abstract int ABo();

    public abstract int AEt();

    public abstract gA AMP();

    public abstract List<FilterWord> Ayu();

    public abstract String BHd();

    public abstract int BHj();

    public abstract List<bNS> BSi();

    public abstract String BiC();

    public abstract int CL();

    public abstract boolean CSZ();

    public abstract vG Ca();

    public abstract String CjQ();

    public abstract String CvL();

    public abstract void CvL(int i);

    public abstract void CvL(String str);

    public abstract String Cwg();

    public abstract boolean EAq();

    public abstract int EFw();

    public abstract void Es();

    public abstract int Eyq();

    public abstract boolean FFl();

    public abstract boolean FJ();

    public abstract int FN();

    public abstract boolean GcG();

    public abstract int Gp();

    public abstract void Gp(int i);

    public abstract void Gp(String str);

    public abstract String HWd();

    public abstract boolean IL();

    public abstract long IP();

    public abstract void IP(int i);

    public abstract void IP(String str);

    public abstract String[] Irm();

    public abstract void JO();

    public abstract void Jd(int i);

    public abstract void Jd(JSONObject jSONObject);

    public abstract void Jd(boolean z);

    public abstract boolean Jd();

    public abstract JSONObject Je();

    public abstract String Jpl();

    public abstract int Ju();

    public abstract void Ju(int i);

    public abstract void Ju(String str);

    public abstract int LDD();

    public abstract int LEC();

    public abstract String LGJ();

    public abstract int LHy();

    public abstract int Lxj();

    public abstract com.bykv.vk.openvk.component.video.api.vG.icD MA();

    public abstract JSONObject MY();

    public abstract boolean Mnp();

    public abstract boolean Mvw();

    public abstract vA Mxy();

    public abstract void Mxy(int i);

    public abstract void Mxy(String str);

    public abstract void Mxy(boolean z);

    public abstract void NB(int i);

    public abstract void NB(String str);

    public abstract void NB(boolean z);

    public abstract boolean NB();

    public abstract com.bytedance.sdk.openadsdk.core.ugen.NB.pvs NZI();

    public abstract boolean OBt();

    public abstract int OT();

    public abstract void OT(int i);

    public abstract void OT(String str);

    public abstract boolean OUT();

    public abstract boolean Oa();

    public abstract String OhP();

    public abstract void OhP(int i);

    public abstract List<String> OyE();

    public abstract String Pj();

    public abstract void Pj(int i);

    public abstract long QnQ();

    public abstract void RGX();

    public abstract JSONObject RKd();

    public abstract boolean RgU();

    public abstract void SE(int i);

    public abstract boolean SE();

    public abstract boolean SJ();

    public abstract boolean SLG();

    public abstract String Sn();

    public abstract com.bytedance.sdk.openadsdk.core.ugen.NB.pvs TN();

    public abstract String Tdd();

    public abstract float UYh();

    public abstract boolean Uv();

    public abstract int VLm();

    public abstract boolean VR();

    public abstract int VVr();

    public abstract boolean VXe();

    public abstract Map<String, Object> Wby();

    public abstract NB Wyp();

    public abstract void Wyp(int i);

    public abstract void Wyp(String str);

    public abstract boolean XPz();

    public abstract int Ye();

    public abstract String Yjw();

    public abstract int ZhG();

    public abstract void ZhG(int i);

    public abstract void ZhG(String str);

    public abstract qh Zm();

    public abstract bNS ZsW();

    public abstract int ae();

    public abstract void ae(int i);

    public abstract boolean bGM();

    public abstract rCZ bNS();

    public abstract void bNS(int i);

    public abstract void bNS(String str);

    public abstract String cGU();

    public abstract String cQ();

    public abstract int cR();

    public abstract void cR(int i);

    public abstract void cR(String str);

    public abstract void cRf(int i);

    public abstract boolean cRf();

    public abstract long cUm();

    public abstract String cnN();

    public abstract int dX();

    public abstract void dX(int i);

    public abstract void dX(String str);

    public abstract int dx();

    public abstract void dx(int i);

    public abstract int dyT();

    public abstract String dyT(String str);

    public abstract void dyT(int i);

    public abstract int eOd();

    public abstract bNS ea();

    public abstract String ekB();

    public abstract long elv();

    public abstract void fhd();

    public abstract boolean fl();

    public abstract Mxy gA();

    public abstract void gA(int i);

    public abstract boolean gOj();

    public abstract pvs gSd();

    public abstract void gSd(int i);

    public abstract void icD(double d);

    public abstract void icD(int i);

    public abstract void icD(long j);

    public abstract void icD(com.bykv.vk.openvk.component.video.api.vG.icD icd);

    public abstract void icD(bNS bns);

    public abstract void icD(com.bytedance.sdk.openadsdk.core.ugen.NB.pvs pvsVar);

    public abstract void icD(JSONObject jSONObject);

    public abstract void icD(boolean z);

    public abstract com.bytedance.sdk.openadsdk.core.yiw.pvs ig();

    public abstract int jMV();

    public abstract int jhZ();

    public abstract void jhZ(int i);

    public abstract AdSlot jlb();

    public abstract void jlb(int i);

    public abstract List<String> joF();

    public abstract int kj();

    public abstract void kj(int i);

    public abstract void kj(String str);

    public abstract boolean lHK();

    public abstract int mRq();

    public abstract int mnm();

    public abstract void mnm(int i);

    public abstract void mnm(String str);

    public abstract com.bykv.vk.openvk.component.video.api.vG.icD mo();

    public abstract int nS();

    public abstract String neB();

    public abstract void ny(int i);

    public abstract void ny(String str);

    public abstract boolean ny();

    public abstract com.bykv.vk.openvk.component.video.api.vG.icD od();

    public abstract void od(int i);

    public abstract boolean pQ();

    public abstract JSONObject pR();

    public abstract boolean pY();

    public abstract void pvs(double d);

    public abstract void pvs(float f);

    public abstract void pvs(int i);

    public abstract void pvs(int i, int i2);

    public abstract void pvs(com.bykv.vk.openvk.component.video.api.vG.icD icd);

    public abstract void pvs(AdSlot adSlot);

    public abstract void pvs(FilterWord filterWord);

    public abstract void pvs(Jd jd);

    public abstract void pvs(Ju ju);

    public abstract void pvs(Mxy mxy);

    public abstract void pvs(NB nb);

    public abstract void pvs(bNS bns);

    public abstract void pvs(pvs pvsVar);

    public abstract void pvs(kj kjVar);

    public abstract void pvs(qh qhVar);

    public abstract void pvs(rCZ rcz);

    public abstract void pvs(vA vAVar);

    public abstract void pvs(vG vGVar);

    public abstract void pvs(com.bytedance.sdk.openadsdk.core.ugen.NB.pvs pvsVar);

    public abstract void pvs(com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar);

    public abstract void pvs(Map<String, Object> map);

    public abstract void pvs(boolean z);

    public abstract void pvs(String[] strArr);

    public abstract int qD();

    public abstract void qD(int i);

    public abstract Ju qVe();

    public abstract String qd();

    public abstract Jd qh();

    public abstract void qh(int i);

    public abstract void qh(String str);

    public abstract int rCZ();

    public abstract void rCZ(int i);

    public abstract void rCZ(String str);

    public abstract String rW();

    public abstract int rcB();

    public abstract boolean reT();

    public abstract double sDK();

    public abstract int sP();

    public abstract void sP(int i);

    public abstract boolean sR();

    public abstract String sUS();

    public abstract void sUS(int i);

    public abstract void sUS(String str);

    public abstract void sUS(boolean z);

    public abstract void so(int i);

    public abstract void so(String str);

    public abstract void so(boolean z);

    public abstract int sq();

    public abstract boolean tCd();

    public abstract String tQ();

    public abstract List<String> thO();

    public abstract String uc();

    public abstract void uc(int i);

    public abstract void uc(String str);

    public abstract void udE();

    public abstract int vA();

    public abstract void vA(int i);

    public abstract void vA(String str);

    public abstract void vG(int i);

    public abstract void vG(long j);

    public abstract void vG(com.bykv.vk.openvk.component.video.api.vG.icD icd);

    public abstract void vG(bNS bns);

    public abstract void vG(JSONObject jSONObject);

    public abstract void vG(boolean z);

    public abstract boolean wS();

    public abstract JSONObject wjr();

    public abstract int wr();

    public abstract com.bytedance.sdk.component.widget.icD.pvs xa();

    public abstract int xyK();

    public abstract int yTz();

    public abstract void yWX(int i);

    public abstract boolean yWX();

    public abstract boolean yhq();

    public abstract String yiw();

    public abstract void yiw(int i);

    public abstract void yiw(String str);

    public abstract void yiw(boolean z);

    public abstract int zM();

    public abstract void zM(int i);

    public abstract void zM(String str);

    public abstract String zn();

    public boolean pvs() {
        int mnm = mnm();
        return (OT() != 2 || mnm == 5 || mnm == 6 || mnm == 19 || mnm == 12) ? false : true;
    }

    public long icD() {
        return this.pvs;
    }

    public void pvs(long j) {
        this.pvs = j;
    }

    public static boolean pvs(cR cRVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (pvs(cRVar) || z4 || cRVar == null || cRVar.od() == null || TextUtils.isEmpty(cRVar.od().kj())) {
            return false;
        }
        return vG(cRVar) ? z3 : (cRVar.od() == null || cRVar.od().pvs() != 1) ? z : z2;
    }

    public static boolean pvs(cR cRVar) {
        return (cRVar == null || cRVar.od() == null || cRVar.od().Jd() != 1) ? false : true;
    }

    public static boolean icD(cR cRVar) {
        return (pvs(cRVar) || vG(cRVar)) ? false : true;
    }

    public static boolean vG(cR cRVar) {
        return (cRVar == null || cRVar.od() == null || cRVar.od().Jd() != 7 || rCZ.icD(cRVar)) ? false : true;
    }

    public static boolean Jd(cR cRVar) {
        return (cRVar == null || cRVar.od() == null || cRVar.od().pvs() != 1) ? false : true;
    }

    public static boolean NB(cR cRVar) {
        if (cRVar == null) {
            return false;
        }
        int Ye = cRVar.Ye();
        return cRVar.SJ() || Ye == 5 || Ye == 15 || Ye == 50;
    }

    public static com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs(String str, cR cRVar) {
        cRVar.sP(0);
        int VLm = cRVar.VLm();
        int i = 3;
        if (VLm == 3) {
            i = 4;
        } else if (VLm == 7) {
            i = 1;
        } else if (VLm == 8) {
            i = 2;
        }
        return new com.bytedance.sdk.openadsdk.core.video.pvs.icD(str, cRVar.MA(), cRVar.mo(), cRVar.LHy(), cRVar.wr(), i);
    }

    public static long pvs(String str) {
        return NB(vG(str));
    }

    private static long NB(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static double icD(String str) {
        return sUS(vG(str));
    }

    private static double sUS(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject.optDouble("pack_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public static JSONObject vG(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("MaterialMeta", e.getMessage());
            }
        }
        return null;
    }

    public static int Jd(String str) {
        return pvs(vG(str));
    }

    public static int pvs(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static cR vG() {
        return new OT();
    }

    public boolean so() {
        return (TextUtils.isEmpty(sUS()) || TextUtils.isEmpty(yiw())) ? false : true;
    }

    public static String pvs(Context context, cR cRVar) {
        if (context == null || cRVar == null || !((cRVar.VLm() == 8 || cRVar.VLm() == 7) && cRVar.cRf())) {
            return null;
        }
        String icD = icD(context, cRVar);
        if (TextUtils.isEmpty(icD) || com.bytedance.sdk.openadsdk.core.act.pvs.pvs() != 1) {
            return null;
        }
        return icD;
    }

    public static String icD(Context context, cR cRVar) {
        if (context != null && cRVar != null) {
            try {
                if (cRVar.jhZ() == 8) {
                    String pvs2 = com.bytedance.sdk.openadsdk.core.act.pvs.pvs(context);
                    if (TextUtils.isEmpty(pvs2)) {
                        return null;
                    }
                    return pvs2;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    /* compiled from: MaterialMeta.java */
    public static class pvs {
        private String Jd;
        private String Ju;
        private String Mxy;
        private String NB;
        private String Wyp;
        private String icD;
        private String kj;
        private String pvs;
        private String qh;
        private String sUS;
        private List<Integer> so;
        private String vG;
        private String yiw;

        public static com.bytedance.sdk.component.adexpress.pvs.vG.Jd pvs(pvs pvsVar, String str) {
            return com.bytedance.sdk.component.adexpress.pvs.vG.Jd.pvs().pvs(pvsVar.NB()).icD(pvsVar.sUS()).vG(pvsVar.yiw()).Jd(pvsVar.so()).NB(pvsVar.Jd()).sUS(str);
        }

        public static com.bytedance.sdk.openadsdk.core.ugen.NB.pvs icD(pvs pvsVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.ugen.NB.pvs().pvs(pvsVar.NB()).icD(pvsVar.bNS()).vG(pvsVar.IP()).Jd(pvsVar.mnm()).NB(str);
        }

        public List<Integer> vG() {
            return this.so;
        }

        public void pvs(List<Integer> list) {
            this.so = list;
        }

        public String Jd() {
            return this.sUS;
        }

        public void pvs(String str) {
            this.sUS = str;
        }

        public String NB() {
            return this.pvs;
        }

        public void icD(String str) {
            this.pvs = str;
        }

        public String sUS() {
            return this.icD;
        }

        public void vG(String str) {
            this.icD = str;
        }

        public String yiw() {
            return this.vG;
        }

        public void Jd(String str) {
            this.vG = str;
        }

        public String so() {
            return this.Jd;
        }

        public void NB(String str) {
            this.Jd = str;
        }

        public String Mxy() {
            return this.NB;
        }

        public void sUS(String str) {
            this.NB = str;
        }

        public String Wyp() {
            return this.yiw;
        }

        public void yiw(String str) {
            this.yiw = str;
        }

        public String qh() {
            return this.Wyp;
        }

        public void so(String str) {
            this.Wyp = str;
        }

        public String kj() {
            return this.Mxy;
        }

        public void Mxy(String str) {
            this.Mxy = str;
        }

        public boolean Ju() {
            return !TextUtils.isEmpty(this.Mxy) && this.Mxy.equals("v3");
        }

        public String IP() {
            return this.qh;
        }

        public void Wyp(String str) {
            this.qh = str;
        }

        public String bNS() {
            return this.kj;
        }

        public void qh(String str) {
            this.kj = str;
        }

        public String mnm() {
            return this.Ju;
        }

        public void kj(String str) {
            this.Ju = str;
        }
    }
}
