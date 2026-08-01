package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.gA;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SingleMaterialMeta.java */
/* loaded from: classes2.dex */
public class OT extends cR {
    private JSONObject ABo;
    private JSONObject Ayu;
    private String BSi;
    private String Ca;
    private cR.pvs CjQ;
    private String CvL;
    private AdSlot Cwg;
    private int EFw;
    private String FFl;
    private boolean FJ;
    private String Gp;
    private String[] Irm;
    private boolean Je;
    private String Ju;
    private com.bytedance.sdk.openadsdk.core.ugen.NB.pvs LDD;
    private String LEC;
    private Jd LHy;
    private int Lxj;
    private String MA;
    private kj MY;
    private com.bytedance.sdk.openadsdk.core.yiw.pvs Mnp;
    private int Mxy;
    private int OBt;
    private volatile boolean Oa;
    private boolean OhP;
    private long Pj;
    private int RKd;
    private boolean RgU;
    private boolean SE;
    private vA SJ;
    private String SLG;
    private String Sn;
    private String Tdd;
    private NB Uv;
    private com.bytedance.sdk.openadsdk.core.ugen.NB.pvs VLm;
    private int VR;
    private int VVr;
    private boolean VXe;
    private String Wby;
    private bNS Wyp;
    private qh ZhG;
    private Map<String, Object> ZsW;
    private int bGM;
    private String cR;
    private int cRf;
    private JSONObject cnN;
    private String dX;
    private int dyT;
    private String eOd;
    private int ea;
    private int elv;
    private com.bykv.vk.openvk.component.video.api.vG.icD gSd;
    public long icD;
    private rCZ ig;
    private boolean jhZ;
    private String kj;
    private boolean lHK;
    private int mRq;
    private String mnm;
    private String nS;
    private int neB;
    private vG ny;
    private com.bykv.vk.openvk.component.video.api.vG.icD od;
    private int pR;
    private com.bykv.vk.openvk.component.video.api.vG.icD qD;
    private Ju qVe;
    private bNS qh;
    private int rCZ;
    private String sDK;
    private int sP;
    private int so;
    private boolean sq;
    private String tCd;
    private String uc;
    private String vA;
    private int wjr;
    private boolean wr;
    private String xa;
    private int xyK;
    private int yWX;
    private int yhq;
    private int yiw;
    private String zM;
    private int zn;
    private final List<bNS> vG = new ArrayList();
    private final List<String> Jd = new ArrayList();
    private final List<FilterWord> NB = new ArrayList();
    private final gA sUS = gA.icD();
    public boolean pvs = false;
    private List<String> IP = new ArrayList();
    private List<String> bNS = new ArrayList();
    private String OT = "0";
    private String ae = "";
    private int gA = 0;
    private int jlb = 2;
    private int dx = 0;
    private int OyE = 0;
    private int joF = 1;
    private Mxy thO = new Mxy();
    private int qd = -200;
    private int rW = 0;
    private int cGU = 1;
    private int Zm = 0;
    private int HWd = 0;
    private int Ye = 0;
    private int tQ = 1;
    private int rcB = 1;
    private float UYh = 100.0f;
    private int sR = 2;
    private int AEt = 1;
    private int FN = 0;
    private int RGX = -1;
    private long GcG = -1;
    private int BiC = 0;
    private int mo = 0;
    private boolean cUm = false;
    private int CSZ = 0;
    private int yTz = 50;
    private int Yjw = -1;

    public static boolean sUS(cR cRVar) {
        if (cRVar == null) {
            return false;
        }
        int Ye = cRVar.Ye();
        return cRVar.SJ() || Ye == 5 || Ye == 15 || Ye == 50;
    }

    private static double NB(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject.optDouble("pack_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cR cRVar = (cR) obj;
            if (this.OT.equals(cRVar.neB()) && this.Gp.equals(cRVar.HWd())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean Jd() {
        return this.OhP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(boolean z) {
        this.OhP = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean NB() {
        return this.jhZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(boolean z) {
        this.jhZ = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(boolean z) {
        this.SE = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String sUS() {
        return this.LEC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void NB(String str) {
        this.LEC = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String yiw() {
        return this.xa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void sUS(String str) {
        this.xa = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean so() {
        return (TextUtils.isEmpty(sUS()) || TextUtils.isEmpty(yiw())) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public vA Mxy() {
        return this.SJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(NB nb) {
        this.Uv = nb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public NB Wyp() {
        return this.Uv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(vA vAVar) {
        this.SJ = vAVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean wS() {
        return this.wr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void yiw(boolean z) {
        this.wr = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void dX(String str) {
        this.MA = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String ekB() {
        return this.MA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void OhP(int i) {
        this.zn = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void CvL(String str) {
        this.eOd = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String BHd() {
        return this.eOd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean OUT() {
        List<Integer> vG;
        return (gSd() == null || (vG = gSd().vG()) == null || !vG.contains(57)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String LGJ() {
        return this.SLG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean XPz() {
        return this.Je;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bytedance.sdk.openadsdk.core.ugen.NB.pvs TN() {
        return this.VLm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(com.bytedance.sdk.openadsdk.core.ugen.NB.pvs pvsVar) {
        this.VLm = pvsVar;
        com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs().pvs(pvsVar, "endcard");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(com.bytedance.sdk.openadsdk.core.ugen.NB.pvs pvsVar) {
        this.LDD = pvsVar;
        com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs().pvs(pvsVar, "endcard");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bytedance.sdk.openadsdk.core.ugen.NB.pvs NZI() {
        return this.LDD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void jhZ(int i) {
        this.CSZ = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int CL() {
        return this.CSZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void fhd() {
        this.FJ = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean reT() {
        return this.FJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void JO() {
        this.RgU = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean IL() {
        return this.RgU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int BHj() {
        try {
            JSONObject Je = Je();
            if (Je != null) {
                return Je.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean Mvw() {
        return this.VXe;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void so(boolean z) {
        this.VXe = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean EAq() {
        return this.lHK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Mxy(boolean z) {
        this.lHK = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void SE(int i) {
        this.yTz = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Eyq() {
        return this.yTz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String cQ() {
        JSONObject Je;
        if (this.sDK == null && (Je = Je()) != null) {
            this.sDK = Je.optString("cid", "");
        }
        return this.sDK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Gp(String str) {
        this.Sn = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Jpl() {
        return this.Sn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int jMV() {
        if (this.Yjw < 0) {
            try {
                JSONObject Je = Je();
                if (Je != null) {
                    this.Yjw = Je.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.Yjw = 0;
                }
            } catch (Throwable unused) {
                this.Yjw = 0;
            }
        }
        return this.Yjw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void yWX(int i) {
        this.OBt = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean pY() {
        if (this.RGX <= 0) {
            this.RGX = VLm();
        }
        int i = this.RGX;
        return (i == 7 || i == 8) && !sUS(this) && vA() != 21 && this.OBt == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Es() {
        com.bykv.vk.openvk.component.video.api.vG.icD icd = this.gSd;
        if (icd == null || TextUtils.isEmpty(icd.kj())) {
            return;
        }
        try {
            if (this.gSd.kj().contains("style_id")) {
                this.Je = true;
                this.SLG = Uri.parse(this.gSd.kj()).getQueryParameters("style_id").get(0);
            } else {
                this.Je = false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public Jd qh() {
        return this.LHy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(Jd jd) {
        this.LHy = jd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int kj() {
        Jd jd = this.LHy;
        if (jd == null) {
            return 2;
        }
        return jd.pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Ju() {
        if (OUT()) {
            return 5;
        }
        if (SJ()) {
            return 2;
        }
        if (Mnp()) {
            return 4;
        }
        Jd jd = this.LHy;
        if (jd == null) {
            return 1;
        }
        return jd.icD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public long IP() {
        Jd jd = this.LHy;
        if (jd == null) {
            return 0L;
        }
        return jd.vG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public rCZ bNS() {
        return this.ig;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(rCZ rcz) {
        this.ig = rcz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int mnm() {
        return this.so;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(int i) {
        pvs(i, -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int vA() {
        return this.Mxy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(int i) {
        this.so = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(int i, int i2) {
        this.Mxy = i;
        this.so = i;
        if (this.Cwg == null) {
            this.so = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = VLm();
        }
        if (this.Cwg.getNativeAdType() == 3 || this.Cwg.getDurationSlotType() == 3 || i2 == 3) {
            this.so = 14;
            return;
        }
        if (this.Cwg.getNativeAdType() == 7 || this.Cwg.getNativeAdType() == 8 || this.Cwg.getDurationSlotType() == 7 || this.Cwg.getDurationSlotType() == 8 || i2 == 7 || i2 == 8) {
            if (rCZ.qh(this)) {
                this.so = 12;
                return;
            }
            if (rCZ.icD(this)) {
                this.so = 9;
                return;
            }
            if (this.Mxy == 5 && !mnm.vG(this)) {
                this.so = 7;
            }
            if (this.Mxy == 6 && !mnm.icD(this)) {
                this.so = 7;
            }
            if (this.Mxy == 8 && XM() != 100) {
                this.so = 7;
            }
            if (this.Mxy == 19 && TextUtils.isEmpty(this.kj)) {
                this.so = 7;
            }
            if (this.Mxy == 20 && TextUtils.isEmpty(this.kj)) {
                this.so = 7;
            }
            if (i < 5) {
                this.so = 7;
                return;
            }
            return;
        }
        if (rCZ.icD(this)) {
            this.so = 4;
            return;
        }
        if (this.Mxy == 4 && !rCZ.icD(this)) {
            this.so = 0;
        }
        if (i >= 5) {
            this.so = 0;
            return;
        }
        if (this.Mxy == 2 && jhZ() != 3) {
            this.so = 0;
        } else if (i == 0 || (i == 1 && jhZ() != 3)) {
            this.so = 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int cR() {
        return this.AEt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.AEt = 1;
        } else {
            this.AEt = (int) d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int zM() {
        return this.sR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.sR = 2;
        } else {
            this.sR = (int) d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String uc() {
        return this.ae;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void yiw(String str) {
        this.ae = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int rCZ() {
        return this.gA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(int i) {
        this.gA = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int OT() {
        int i = this.so;
        if (i == 5 || i == 6 || i == 33) {
            return 1;
        }
        if (OBt()) {
            return 2;
        }
        return this.jlb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Jd(int i) {
        this.jlb = i;
    }

    public int wgm() {
        return this.Zm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void NB(int i) {
        this.Zm = i;
    }

    public String aSt() {
        return this.FFl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void so(String str) {
        this.FFl = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean ny() {
        return this.Zm == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int ZhG() {
        return this.Ye;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void sUS(int i) {
        this.Ye = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int dyT() {
        return this.OyE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void yiw(int i) {
        this.OyE = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int dX() {
        return this.joF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void so(int i) {
        this.joF = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String CvL() {
        return this.tCd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Mxy(String str) {
        this.tCd = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Gp() {
        return this.HWd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Mxy(int i) {
        this.HWd = i;
    }

    public int LmF() {
        return this.cGU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Wyp(int i) {
        this.cGU = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int ae() {
        if (SJ()) {
            return 5;
        }
        if (UYh() != 100.0f || OT() == 2) {
            return 0;
        }
        return this.rW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void qh(int i) {
        this.rW = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public Mxy gA() {
        return this.thO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(Mxy mxy) {
        this.thO = mxy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public AdSlot jlb() {
        return this.Cwg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(AdSlot adSlot) {
        this.Cwg = adSlot;
    }

    public int XY() {
        return this.neB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void kj(int i) {
        this.neB = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int dx() {
        return this.qd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Ju(int i) {
        this.qd = i;
    }

    public int YQ() {
        return this.tQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void IP(int i) {
        this.tQ = i;
    }

    public int Utp() {
        return this.elv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void bNS(int i) {
        this.elv = i;
    }

    public int XM() {
        return this.sP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void mnm(int i) {
        this.sP = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Pj() {
        return this.BSi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Wyp(String str) {
        this.BSi = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean cRf() {
        return XM() == 100 || this.so == 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int sP() {
        return this.ea;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vA(int i) {
        this.ea = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public cR.pvs gSd() {
        return this.CjQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(cR.pvs pvsVar) {
        this.CjQ = pvsVar;
        com.bytedance.sdk.component.adexpress.pvs.vG.Jd cb = cb();
        if (cb != null && !this.CjQ.Ju()) {
            com.bytedance.sdk.component.adexpress.pvs.icD.icD.pvs(cb);
        }
        if (pvsVar == null || TextUtils.isEmpty(pvsVar.IP())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs().pvs(KLl(), "ad");
    }

    private com.bytedance.sdk.openadsdk.core.ugen.NB.pvs KLl() {
        cR.pvs gSd = gSd();
        if (gSd == null) {
            return null;
        }
        return cR.pvs.icD(gSd, String.valueOf(yTz()));
    }

    public com.bytedance.sdk.component.adexpress.pvs.vG.Jd cb() {
        cR.pvs gSd = gSd();
        if (gSd == null) {
            return null;
        }
        return cR.pvs.pvs(gSd, String.valueOf(yTz()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int qD() {
        kj kjVar = this.MY;
        if (kjVar == null) {
            return 0;
        }
        return kjVar.pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bykv.vk.openvk.component.video.api.vG.icD od() {
        return this.gSd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(com.bykv.vk.openvk.component.video.api.vG.icD icd) {
        this.gSd = icd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(kj kjVar) {
        this.MY = kjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String OhP() {
        return this.dX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void qh(String str) {
        this.dX = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void kj(String str) {
        this.uc = str;
    }

    public String Sqz() {
        return this.uc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int jhZ() {
        return this.yiw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean SE() {
        return this.xyK == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void cR(int i) {
        this.xyK = i;
    }

    public int gjh() {
        return this.xyK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void zM(int i) {
        this.yiw = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean yWX() {
        return this.VR == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void uc(int i) {
        this.VR = i;
    }

    public int nmT() {
        return this.VR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void rCZ(int i) {
        this.bGM = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int sq() {
        return this.bGM;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public bNS ea() {
        return this.Wyp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(bNS bns) {
        this.Wyp = bns;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public bNS ZsW() {
        return this.qh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(bNS bns) {
        this.qh = bns;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String CjQ() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Ju(String str) {
        this.kj = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<bNS> BSi() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(bNS bns) {
        this.vG.add(bns);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String cnN() {
        return this.Ju;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void IP(String str) {
        this.Ju = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<String> OyE() {
        return this.IP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<String> joF() {
        return this.bNS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<String> thO() {
        return this.Jd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String qd() {
        return this.mnm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void bNS(String str) {
        this.mnm = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String rW() {
        return this.vA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void mnm(String str) {
        this.vA = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Cwg() {
        if (!TextUtils.isEmpty(this.cR)) {
            return this.cR;
        }
        Context pvs = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        int jhZ = jhZ();
        if (jhZ != 2 && jhZ != 3) {
            if (jhZ == 4) {
                if (pvs != null) {
                    return com.bytedance.sdk.component.utils.uc.pvs(pvs, "tt_video_download_apk");
                }
                return this.cR;
            }
            if (jhZ != 8) {
                return this.cR;
            }
        }
        if (pvs != null) {
            return com.bytedance.sdk.component.utils.uc.pvs(pvs, "tt_video_mobile_go_detail");
        }
        return this.cR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vA(String str) {
        this.cR = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String neB() {
        return this.OT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void cR(String str) {
        this.OT = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String cGU() {
        return this.CvL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void zM(String str) {
        this.CvL = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public vG Ca() {
        return this.ny;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(vG vGVar) {
        this.ny = vGVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public qh Zm() {
        return this.ZhG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(qh qhVar) {
        this.ZhG = qhVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String HWd() {
        return this.Gp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void uc(String str) {
        this.Gp = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Ye() {
        return this.dyT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void OT(int i) {
        this.dyT = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<FilterWord> Ayu() {
        return this.NB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(FilterWord filterWord) {
        this.NB.add(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String tQ() {
        return this.Wby;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void rCZ(String str) {
        this.Wby = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public long elv() {
        return this.Pj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(long j) {
        this.Pj = j;
    }

    public int QoS() {
        return this.cRf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ny(int i) {
        this.cRf = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean tCd() {
        return this.sq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Jd(boolean z) {
        this.sq = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public Map<String, Object> Wby() {
        return this.ZsW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(Map<String, Object> map) {
        this.ZsW = map;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject MY() {
        return this.Ayu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(JSONObject jSONObject) {
        this.Ayu = jSONObject;
    }

    public String hrr() {
        return this.Ca;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void OT(String str) {
        this.Ca = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int rcB() {
        if (this.rcB != 2) {
            this.rcB = 1;
        }
        return this.rcB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ZhG(int i) {
        this.rcB = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public float UYh() {
        if (this.UYh <= 0.0f) {
            this.UYh = 100.0f;
        }
        return (this.UYh * 1000.0f) / 1000.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(float f) {
        this.UYh = f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean FFl() {
        if (this.vG.isEmpty()) {
            return false;
        }
        if (this.dyT == 4 && this.vG.size() < 3) {
            return false;
        }
        Iterator<bNS> it = this.vG.iterator();
        while (it.hasNext()) {
            if (!it.next().NB()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean yhq() {
        return !SJ() && hoz() == 1;
    }

    public int hoz() {
        return this.dx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void dyT(int i) {
        this.dx = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.yiw = 4;
        this.OT = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        this.dX = jSONObject.optString(FirebaseAnalytics.Param.SOURCE);
        vG vGVar = new vG();
        this.ny = vGVar;
        vGVar.vG(jSONObject.optString("pkg_name"));
        this.ny.icD(jSONObject.optString("name"));
        this.ny.pvs(jSONObject.optString("download_url"));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject wjr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", jhZ());
            jSONObject.put("is_arbitrage_sample", gjh());
            jSONObject.put("interaction_method", vA());
            jSONObject.put("is_arbitrage", nmT());
            jSONObject.put("arbitrage_strategy", sq());
            jSONObject.put("target_url", CjQ());
            jSONObject.put("app_log_url", cGU());
            jSONObject.put("gecko_id", tQ());
            jSONObject.put("extension", RKd());
            jSONObject.put("ad_id", neB());
            jSONObject.put(FirebaseAnalytics.Param.SOURCE, OhP());
            jSONObject.put("app_name", Sqz());
            jSONObject.put("screenshot", tCd());
            jSONObject.put("dislike_control", hoz());
            jSONObject.put("play_bar_show_time", dx());
            jSONObject.put("play_bar_style", ae());
            jSONObject.put("if_block_lp", wgm());
            jSONObject.put("cache_sort", YQ());
            jSONObject.put("if_sp_cache", Utp());
            jSONObject.put("render_control", OT());
            jSONObject.put("mrc_report", this.RKd);
            jSONObject.put("isMrcReportFinish", this.Oa);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cta", zM());
            jSONObject2.put("other", cR());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reward_name", uc());
            jSONObject3.put("reward_amount", rCZ());
            jSONObject.put("reward_data", jSONObject3);
            if (!TextUtils.isEmpty(sUS()) && !TextUtils.isEmpty(yiw())) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("adchoices_icon", sUS());
                jSONObject4.put("adchoices_url", yiw());
                jSONObject.put("dsp_adchoices", jSONObject4);
            }
            bNS ea = ea();
            if (ea != null && !TextUtils.isEmpty(ea.pvs())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(ImagesContract.URL, ea.pvs());
                jSONObject5.put("height", ea.vG());
                jSONObject5.put("width", ea.icD());
                jSONObject.put("icon", jSONObject5);
            }
            bNS ZsW = ZsW();
            if (ZsW != null && !TextUtils.isEmpty(ZsW.pvs())) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(ImagesContract.URL, ZsW.pvs());
                jSONObject6.put("height", ZsW.vG());
                jSONObject6.put("width", ZsW.icD());
                jSONObject.put("cover_image", jSONObject6);
            }
            Object MY = MY();
            if (MY != null) {
                jSONObject.put("session_params", MY);
            }
            Mxy gA = gA();
            if (gA != null) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("click_upper_content_area", gA.pvs);
                jSONObject7.put("click_upper_non_content_area", gA.icD);
                jSONObject7.put("click_lower_content_area", gA.vG);
                jSONObject7.put("click_lower_non_content_area", gA.Jd);
                jSONObject7.put("click_button_area", gA.NB);
                jSONObject7.put("click_video_area", gA.sUS);
                jSONObject.put("click_area", jSONObject7);
            }
            NB Wyp = Wyp();
            if (Wyp != null) {
                jSONObject.put("arbitrage_interceptor_params", Wyp.sUS());
            }
            AdSlot jlb = jlb();
            if (jlb != null) {
                jSONObject.put("adslot", jlb.toJsonObj());
            }
            List<bNS> BSi = BSi();
            if (BSi != null) {
                JSONArray jSONArray = new JSONArray();
                for (bNS bns : BSi) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put(ImagesContract.URL, bns.pvs());
                    jSONObject8.put("height", bns.vG());
                    jSONObject8.put("width", bns.icD());
                    jSONObject8.put("image_preview", bns.sUS());
                    jSONObject8.put("image_key", bns.yiw());
                    jSONArray.put(jSONObject8);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> OyE = OyE();
            if (OyE != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it = OyE.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next());
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> joF = joF();
            if (joF != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<String> it2 = joF.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONObject.put("click_url", jSONArray3);
            }
            List<String> thO = thO();
            if (thO != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator<String> it3 = thO.iterator();
                while (it3.hasNext()) {
                    jSONArray4.put(it3.next());
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", cnN());
            jSONObject.put(LinkHeader.Parameters.Title, qd());
            jSONObject.put("description", rW());
            jSONObject.put("ext", HWd());
            jSONObject.put("image_mode", Ye());
            jSONObject.put("cover_click_area", XM());
            jSONObject.put("intercept_flag", XY());
            jSONObject.put("button_text", Cwg());
            jSONObject.put("ad_logo", LmF());
            jSONObject.put("video_adaptation", Gp());
            jSONObject.put("feed_video_opentype", ZhG());
            jSONObject.put("orientation", rcB());
            jSONObject.put("aspect_ratio", UYh());
            vG Ca = Ca();
            if (Ca != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("app_name", Ca.icD());
                jSONObject9.put("package_name", Ca.vG());
                jSONObject9.put("download_url", Ca.pvs());
                jSONObject9.put(FirebaseAnalytics.Param.SCORE, Ca.Jd());
                jSONObject9.put("comment_num", Ca.NB());
                jSONObject9.put("app_size", Ca.sUS());
                jSONObject9.put("app_category", Ca.yiw());
                jSONObject.put("app", jSONObject9);
            }
            qh Zm = Zm();
            if (Zm != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("deeplink_url", Zm.pvs());
                jSONObject10.put("fallback_url", Zm.icD());
                jSONObject10.put("fallback_type", Zm.vG());
                jSONObject.put("deep_link", jSONObject10);
            }
            List<FilterWord> Ayu = Ayu();
            if (Ayu != null) {
                JSONArray jSONArray5 = new JSONArray();
                Iterator<FilterWord> it4 = Ayu.iterator();
                while (it4.hasNext()) {
                    JSONObject icD = icD(it4.next());
                    if (icD != null) {
                        jSONArray5.put(icD);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            bNS().pvs(jSONObject);
            jSONObject.put("count_down", QoS());
            jSONObject.put("expiration_time", elv());
            com.bykv.vk.openvk.component.video.api.vG.icD MA = MA();
            if (MA != null) {
                jSONObject.put("video", MA.cR());
            }
            com.bykv.vk.openvk.component.video.api.vG.icD mo = mo();
            if (mo != null) {
                jSONObject.put("h265_video", mo.cR());
            }
            jSONObject.put("video_encode_type", wr());
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("if_send_click", qD());
            jSONObject.put("download_conf", jSONObject11);
            if (Wby() != null) {
                JSONObject jSONObject12 = new JSONObject();
                Set<Map.Entry<String, Object>> entrySet = Wby().entrySet();
                if (!entrySet.isEmpty()) {
                    for (Map.Entry<String, Object> entry : entrySet) {
                        jSONObject12.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject12);
            }
            cR.pvs gSd = gSd();
            if (gSd != null) {
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put(FacebookMediationAdapter.KEY_ID, gSd.NB());
                jSONObject13.put("md5", gSd.sUS());
                jSONObject13.put(ImagesContract.URL, gSd.yiw());
                jSONObject13.put("data", gSd.so());
                jSONObject13.put("diff_data", gSd.Mxy());
                jSONObject13.put("version", gSd.Jd());
                jSONObject13.put("dynamic_creative", gSd.Wyp());
                jSONObject13.put("engine_version", gSd.kj());
                jSONObject13.put("ugen_data", gSd.mnm());
                jSONObject13.put("ugen_md5", gSd.bNS());
                jSONObject13.put("ugen_url", gSd.IP());
                jSONObject.put("tpl_info", jSONObject13);
            }
            jSONObject.put("creative_extra", Pj());
            jSONObject.put("market_url", hrr());
            jSONObject.put("auction_price", CvL());
            jSONObject.put("ad_info", aSt());
            jSONObject.put("is_package_open", EFw());
            jSONObject.put("playable_duration_time", AEt());
            jSONObject.put("playable_endcard_close_time", FN());
            jSONObject.put("endcard_close_time", mRq());
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("render_sequence", dyT());
            jSONObject14.put("backup_render_control", dX());
            jSONObject14.put("reserve_time", nS());
            jSONObject14.put("render_thread", Lxj());
            jSONObject.put("render", jSONObject14);
            if (this.SJ == null) {
                vA vAVar = new vA();
                this.SJ = vAVar;
                vAVar.pvs("");
                this.SJ.pvs(10L);
                this.SJ.icD(20L);
                this.SJ.vG(10L);
                this.SJ.Jd(20L);
            }
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("onlylp_loading_maxtime", this.SJ.pvs());
            jSONObject15.put("straight_lp_showtime", this.SJ.icD());
            jSONObject15.put("onlyagg_loading_maxtime", this.SJ.vG());
            jSONObject15.put("straight_agg_showtime", this.SJ.Jd());
            jSONObject15.put("loading_text", this.SJ.NB());
            jSONObject.put("interaction_method_params", jSONObject15);
            JSONObject jSONObject16 = new JSONObject();
            jSONObject16.put("splash_clickarea", kj());
            jSONObject16.put("splash_layout_id", Ju());
            jSONObject16.put("load_wait_time", IP());
            jSONObject.put("splash_control", jSONObject16);
            if (Mnp()) {
                jSONObject.put("dsp_html", this.Tdd);
            }
            if (SJ()) {
                jSONObject.put("vast_json", this.Mnp.Wyp());
            }
            jSONObject.put("dsp_material_type", xyK());
            JSONObject jSONObject17 = new JSONObject();
            jSONObject17.put("loading_landingpage_type", VVr());
            String[] strArr = this.Irm;
            if (strArr != null && strArr.length > 0) {
                JSONArray jSONArray6 = new JSONArray();
                for (String str : this.Irm) {
                    jSONArray6.put(str);
                }
                jSONObject17.put("landingpage_text", jSONArray6);
            }
            jSONObject.put("loading_page", jSONObject17);
            jSONObject.put("deep_link_appname", this.zM);
            jSONObject.put("landing_page_download_clicktype", this.rCZ);
            Ju ju = this.qVe;
            if (ju != null) {
                jSONObject.put("dsp_style", ju.NB());
            }
            jSONObject.put("jump_probability", this.zn);
            jSONObject.put("identificationOverlayContent", this.eOd);
            if (this.VLm != null) {
                JSONObject jSONObject18 = new JSONObject();
                jSONObject18.put("endcard", this.VLm.pvs(this.LDD));
                jSONObject.put("ugen", jSONObject18);
            }
            jSONObject.put("preload_h5_type", CL());
            jSONObject.put("hasReportShow", this.VXe);
            jSONObject.put("endcard_creative", this.Sn);
            jSONObject.put("image_stay", this.OBt);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject pR() {
        JSONObject wjr = wjr();
        JSONObject cR = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().cR(String.valueOf(yTz()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(wjr);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
            jSONObject.put("core_settings", cR);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("MaterialMeta", "toJsonObjPlus", e.getMessage());
        }
        return jSONObject;
    }

    private JSONObject icD(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FacebookMediationAdapter.KEY_ID, filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(icD(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int EFw() {
        return this.yhq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void dX(int i) {
        this.yhq = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int AEt() {
        int i = this.wjr;
        if (i > 0) {
            return i;
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void CvL(int i) {
        this.wjr = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int FN() {
        return this.pR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Gp(int i) {
        this.pR = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int mRq() {
        return this.EFw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ae(int i) {
        this.EFw = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean SJ() {
        int i = this.mo;
        return (i == 1 || i == 3) && ig() != null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bytedance.sdk.openadsdk.core.yiw.pvs ig() {
        return this.Mnp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar) {
        this.Mnp = pvsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean Mnp() {
        return this.mo == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Tdd() {
        return this.Tdd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ny(String str) {
        this.Tdd = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int ABo() {
        JSONObject jSONObject = this.ABo;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject RKd() {
        return this.ABo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Jd(JSONObject jSONObject) {
        this.ABo = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean Oa() {
        return this.RKd == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void gA(int i) {
        this.RKd = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void RGX() {
        this.Oa = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean GcG() {
        return this.Oa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int nS() {
        return this.Lxj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void jlb(int i) {
        this.Lxj = Math.max(0, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Lxj() {
        return this.VVr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void dx(int i) {
        this.VVr = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int VVr() {
        return this.BiC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Pj(int i) {
        this.BiC = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String BiC() {
        String qd = qd();
        return (Ca() == null || TextUtils.isEmpty(Ca().icD())) ? qd : Ca().icD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String[] Irm() {
        String[] strArr = this.Irm;
        return ((strArr == null || strArr.length <= 0) && !TextUtils.isEmpty(qd())) ? new String[]{qd()} : this.Irm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(String[] strArr) {
        this.Irm = strArr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(Ju ju) {
        this.qVe = ju;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public Ju qVe() {
        return this.qVe;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void cRf(int i) {
        this.yWX = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int LEC() {
        return this.yWX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bytedance.sdk.component.widget.icD.pvs xa() {
        com.bytedance.sdk.component.widget.icD.pvs pvsVar = new com.bytedance.sdk.component.widget.icD.pvs();
        pvsVar.pvs(this.ea);
        pvsVar.icD(this.OT);
        pvsVar.pvs(HWd());
        return pvsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int LHy() {
        return this.FN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void sP(int i) {
        this.FN = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int wr() {
        return this.mRq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void gSd(int i) {
        this.mRq = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bykv.vk.openvk.component.video.api.vG.icD MA() {
        return this.od;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(com.bykv.vk.openvk.component.video.api.vG.icD icd) {
        this.od = icd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bykv.vk.openvk.component.video.api.vG.icD mo() {
        return this.qD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(com.bykv.vk.openvk.component.video.api.vG.icD icd) {
        this.qD = icd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String zn() {
        return this.zM;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ZhG(String str) {
        this.zM = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int eOd() {
        return this.rCZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void qD(int i) {
        this.rCZ = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean SLG() {
        com.bykv.vk.openvk.component.video.api.vG.icD icd = this.gSd;
        return icd == null || icd.zM() != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject Je() {
        if (this.cnN == null) {
            try {
                if (!TextUtils.isEmpty(this.Gp)) {
                    this.cnN = new JSONObject(this.Gp);
                }
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("MaterialMeta", e.getMessage());
            }
        }
        return this.cnN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int VLm() {
        if (this.RGX < 0) {
            JSONObject Je = Je();
            if (Je != null) {
                this.RGX = Je.optInt("ad_slot_type", 0);
            } else {
                this.RGX = 0;
            }
        }
        return this.RGX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int LDD() {
        return this.RGX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public long cUm() {
        if (this.GcG < 0) {
            JSONObject Je = Je();
            if (Je != null) {
                this.GcG = Je.optLong("ad_id", 0L);
            } else {
                this.GcG = 0L;
            }
        }
        return this.GcG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean CSZ() {
        return VLm() == 3 || VLm() == 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean FJ() {
        return VLm() == 7;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean RgU() {
        return VLm() == 8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean VXe() {
        return VLm() == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean lHK() {
        return VLm() == 5;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int yTz() {
        JSONObject Je = Je();
        if (Je != null) {
            return Je.optInt("rit", 0);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public double sDK() {
        return NB(Je());
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String dyT(String str) {
        JSONObject Je = Je();
        return Je != null ? Je.optString("rit", str) : str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Sn() {
        vG Ca = Ca();
        if (Ca == null || TextUtils.isEmpty(Ca.pvs())) {
            return null;
        }
        return Ca.pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Yjw() {
        JSONObject Je;
        String str = this.nS;
        if (TextUtils.isEmpty(str) && (Je = Je()) != null) {
            str = Je.optString("req_id", "");
            ae(str);
        }
        return str == null ? "" : str;
    }

    public void ae(String str) {
        this.nS = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean OBt() {
        return jlb() != null && jlb().getDurationSlotType() == 8 && Mnp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int xyK() {
        return this.mo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void od(int i) {
        this.mo = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean VR() {
        int i = this.so;
        return (i == 2 || i == 1) && 3 == this.yiw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean bGM() {
        Ju ju;
        return SJ() && !fl() && (ju = this.qVe) != null && ju.pvs() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[RETURN] */
    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean Uv() {
        int i;
        if (!fl()) {
            int nextInt = new Random().nextInt(100);
            if (SJ()) {
                Ju ju = this.qVe;
                if (ju != null) {
                    i = ju.icD();
                    if (nextInt >= i) {
                        return true;
                    }
                }
                i = 0;
                if (nextInt >= i) {
                }
            } else {
                if (!rCZ.icD(this)) {
                    i = this.zn;
                    if (nextInt >= i) {
                    }
                }
                i = 0;
                if (nextInt >= i) {
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean gOj() {
        if (SJ() && !fl()) {
            int nextInt = new Random().nextInt(100);
            Ju ju = this.qVe;
            if (ju != null && nextInt < ju.vG()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean fl() {
        return this.sUS.pvs > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public gA AMP() {
        return this.sUS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void udE() {
        this.sUS.Jd();
        yiw(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public long QnQ() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(long j) {
        this.icD = j;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean pQ() {
        return this.pvs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void sUS(boolean z) {
        this.pvs = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void NB(boolean z) {
        this.cUm = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean sR() {
        return this.cUm;
    }
}
