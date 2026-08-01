package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.pvs;
import com.bytedance.sdk.openadsdk.utils.gA;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MixedMaterialMeta.java */
/* loaded from: classes2.dex */
public class zM extends cR {
    private cR icD;
    private final pvs pvs;
    private boolean vG;

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Mxy(boolean z) {
    }

    public zM(pvs pvsVar) {
        this.pvs = pvsVar;
        this.icD = pvsVar.NB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String sUS() {
        return this.icD.sUS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void NB(String str) {
        this.icD.NB(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String yiw() {
        return this.icD.yiw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void sUS(String str) {
        this.icD.sUS(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean so() {
        return this.icD.so();
    }

    public pvs wgm() {
        return this.pvs;
    }

    public boolean aSt() {
        return this.pvs.sUS();
    }

    public pvs.C0075pvs LmF() {
        return this.pvs.so();
    }

    public List<cR> XY() {
        List<cR> vG = this.pvs.vG();
        return vG != null ? vG : new ArrayList();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public vA Mxy() {
        return this.icD.Mxy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(NB nb) {
        this.icD.pvs(nb);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public NB Wyp() {
        return this.icD.Wyp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(vA vAVar) {
        this.icD.pvs(vAVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public Jd qh() {
        return this.icD.qh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(Jd jd) {
        this.icD.pvs(jd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int kj() {
        return this.icD.kj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Ju() {
        return this.icD.Ju();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public long IP() {
        return this.icD.IP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public rCZ bNS() {
        return this.icD.bNS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(rCZ rcz) {
        this.icD.pvs(rcz);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int mnm() {
        return this.icD.mnm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(int i) {
        this.icD.pvs(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int vA() {
        return this.icD.vA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(int i) {
        this.icD.icD(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(int i, int i2) {
        this.icD.pvs(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int cR() {
        return this.icD.cR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(double d) {
        this.icD.pvs(d);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int zM() {
        return this.icD.zM();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(double d) {
        this.icD.icD(d);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String uc() {
        return this.icD.uc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void yiw(String str) {
        this.icD.yiw(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int rCZ() {
        return this.icD.rCZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(int i) {
        this.icD.vG(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int OT() {
        return this.icD.OT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Jd(int i) {
        this.icD.Jd(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void NB(int i) {
        this.icD.NB(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void so(String str) {
        this.icD.so(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean ny() {
        return this.icD.ny();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int ZhG() {
        return this.icD.ZhG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void sUS(int i) {
        this.icD.sUS(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int dyT() {
        return this.icD.dyT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void yiw(int i) {
        this.icD.yiw(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int dX() {
        return this.icD.dX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void so(int i) {
        this.icD.so(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String CvL() {
        return this.icD.CvL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Mxy(String str) {
        this.icD.Mxy(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Gp() {
        return this.icD.Gp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Mxy(int i) {
        this.icD.Mxy(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Wyp(int i) {
        this.icD.Wyp(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int ae() {
        return this.icD.ae();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void qh(int i) {
        this.icD.qh(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public Mxy gA() {
        return this.icD.gA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(Mxy mxy) {
        this.icD.pvs(mxy);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public AdSlot jlb() {
        return this.icD.jlb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(AdSlot adSlot) {
        this.icD.pvs(adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void kj(int i) {
        this.icD.kj(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int dx() {
        return this.icD.dx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Ju(int i) {
        this.icD.Ju(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void IP(int i) {
        this.icD.IP(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void bNS(int i) {
        this.icD.bNS(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void mnm(int i) {
        this.icD.mnm(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Pj() {
        return this.icD.Pj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Wyp(String str) {
        this.icD.Wyp(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean cRf() {
        return this.icD.cRf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int sP() {
        return this.icD.sP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vA(int i) {
        this.icD.vA(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public cR.pvs gSd() {
        return this.icD.gSd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(cR.pvs pvsVar) {
        this.icD.pvs(pvsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int qD() {
        return this.icD.qD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bykv.vk.openvk.component.video.api.vG.icD od() {
        return this.icD.od();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(com.bykv.vk.openvk.component.video.api.vG.icD icd) {
        this.icD.pvs(icd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(kj kjVar) {
        this.icD.pvs(kjVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String OhP() {
        return this.icD.OhP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void qh(String str) {
        this.icD.qh(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void kj(String str) {
        this.icD.kj(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int jhZ() {
        return this.icD.jhZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean SE() {
        return this.icD.SE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void cR(int i) {
        this.icD.cR(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void zM(int i) {
        this.icD.zM(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean yWX() {
        return this.icD.yWX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void uc(int i) {
        this.icD.uc(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void rCZ(int i) {
        this.icD.rCZ(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int sq() {
        return this.icD.sq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public bNS ea() {
        return this.icD.ea();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(bNS bns) {
        this.icD.pvs(bns);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public bNS ZsW() {
        return this.icD.ZsW();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(bNS bns) {
        this.icD.icD(bns);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String CjQ() {
        return this.icD.CjQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Ju(String str) {
        this.icD.Ju(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<bNS> BSi() {
        return this.icD.BSi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(bNS bns) {
        this.icD.vG(bns);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String cnN() {
        return this.icD.cnN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void IP(String str) {
        this.icD.IP(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public long cUm() {
        return this.icD.cUm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<String> OyE() {
        return this.icD.OyE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<String> joF() {
        return this.icD.joF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<String> thO() {
        return this.icD.thO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String qd() {
        return this.icD.qd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void bNS(String str) {
        this.icD.bNS(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String rW() {
        return this.icD.rW();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void mnm(String str) {
        this.icD.mnm(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Cwg() {
        return this.icD.Cwg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vA(String str) {
        this.icD.vA(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String neB() {
        return this.icD.neB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void cR(String str) {
        this.icD.cR(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String cGU() {
        return this.icD.cGU();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void zM(String str) {
        this.icD.zM(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public vG Ca() {
        return this.icD.Ca();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(vG vGVar) {
        this.icD.pvs(vGVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public qh Zm() {
        return this.icD.Zm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(qh qhVar) {
        this.icD.pvs(qhVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String HWd() {
        return this.icD.HWd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void uc(String str) {
        this.icD.uc(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Ye() {
        return this.icD.Ye();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void OT(int i) {
        this.icD.OT(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public List<FilterWord> Ayu() {
        return this.icD.Ayu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(FilterWord filterWord) {
        this.icD.pvs(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String tQ() {
        return this.icD.tQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void rCZ(String str) {
        this.icD.rCZ(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public long elv() {
        return this.icD.elv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(long j) {
        this.icD.icD(j);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ny(int i) {
        this.icD.ny(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean tCd() {
        return this.icD.tCd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Jd(boolean z) {
        this.icD.Jd(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public Map<String, Object> Wby() {
        return this.icD.Wby();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(Map<String, Object> map) {
        this.icD.pvs(map);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject MY() {
        return this.icD.MY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(JSONObject jSONObject) {
        this.icD.icD(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void OT(String str) {
        this.icD.OT(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int rcB() {
        return this.icD.rcB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ZhG(int i) {
        this.icD.ZhG(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public float UYh() {
        return this.icD.UYh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(float f) {
        this.icD.pvs(f);
    }

    public boolean equals(Object obj) {
        return this.icD.equals(obj);
    }

    public int hashCode() {
        return this.icD.hashCode();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean FFl() {
        return this.icD.FFl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean yhq() {
        return this.icD.yhq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void dyT(int i) {
        this.icD.dyT(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(JSONObject jSONObject) {
        this.icD.vG(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject wjr() {
        return this.icD.wjr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject pR() {
        return this.icD.pR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int EFw() {
        return this.icD.EFw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void dX(int i) {
        this.icD.dX(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int AEt() {
        return this.icD.AEt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void CvL(int i) {
        this.icD.CvL(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int FN() {
        return this.icD.FN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Gp(int i) {
        this.icD.Gp(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int mRq() {
        return this.icD.mRq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ae(int i) {
        this.icD.ae(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean SJ() {
        return this.icD.SJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bytedance.sdk.openadsdk.core.yiw.pvs ig() {
        return this.icD.ig();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(com.bytedance.sdk.openadsdk.core.yiw.pvs pvsVar) {
        this.icD.pvs(pvsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean Mnp() {
        return this.icD.Mnp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Tdd() {
        return this.icD.Tdd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ny(String str) {
        this.icD.ny(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int ABo() {
        return this.icD.ABo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject RKd() {
        return this.icD.RKd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Jd(JSONObject jSONObject) {
        this.icD.Jd(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean Oa() {
        return this.icD.Oa();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void gA(int i) {
        this.icD.gA(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void RGX() {
        this.icD.RGX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean GcG() {
        return this.icD.GcG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int nS() {
        return this.icD.nS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void jlb(int i) {
        this.icD.jlb(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Lxj() {
        return this.icD.Lxj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void dx(int i) {
        this.icD.dx(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int VVr() {
        return this.icD.VVr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Pj(int i) {
        this.icD.Pj(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String BiC() {
        return this.icD.BiC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String[] Irm() {
        return this.icD.Irm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(String[] strArr) {
        this.icD.pvs(strArr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(Ju ju) {
        this.icD.pvs(ju);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public Ju qVe() {
        return this.icD.qVe();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bytedance.sdk.component.widget.icD.pvs xa() {
        return this.icD.xa();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int LHy() {
        return this.icD.LHy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void sP(int i) {
        this.icD.sP(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int wr() {
        return this.icD.wr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void gSd(int i) {
        this.icD.gSd(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bykv.vk.openvk.component.video.api.vG.icD MA() {
        return this.icD.MA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(com.bykv.vk.openvk.component.video.api.vG.icD icd) {
        this.icD.icD(icd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bykv.vk.openvk.component.video.api.vG.icD mo() {
        return this.icD.mo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(com.bykv.vk.openvk.component.video.api.vG.icD icd) {
        this.icD.vG(icd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String zn() {
        return this.icD.zn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void ZhG(String str) {
        this.icD.ZhG(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int eOd() {
        return this.icD.eOd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void qD(int i) {
        this.icD.qD(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean SLG() {
        return this.icD.SLG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public JSONObject Je() {
        return this.icD.Je();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int VLm() {
        return this.icD.VLm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int LDD() {
        return this.icD.LDD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean CSZ() {
        return this.icD.CSZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean FJ() {
        return this.icD.FJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean RgU() {
        return this.icD.RgU();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean VXe() {
        return this.icD.VXe();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean lHK() {
        return this.icD.lHK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int yTz() {
        return this.icD.yTz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public double sDK() {
        return this.icD.sDK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String dyT(String str) {
        return this.icD.dyT(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Sn() {
        return this.icD.Sn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Yjw() {
        return this.icD.Yjw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean OBt() {
        return this.icD.OBt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int xyK() {
        return this.icD.xyK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void od(int i) {
        this.icD.od(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean VR() {
        return this.icD.VR();
    }

    public void sq(int i) {
        List<cR> vG = this.pvs.vG();
        vG.size();
        if (i >= vG.size()) {
            i = 0;
        } else if (i < 0) {
            return;
        }
        this.icD = vG.get(i);
        this.vG = true;
    }

    public boolean YQ() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean Jd() {
        return this.icD.Jd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(boolean z) {
        this.icD.pvs(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean NB() {
        return this.icD.NB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(boolean z) {
        this.icD.icD(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(boolean z) {
        this.icD.vG(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean bGM() {
        return this.icD.bGM();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean Uv() {
        return this.icD.Uv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean gOj() {
        return this.icD.gOj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void cRf(int i) {
        this.icD.cRf(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int LEC() {
        return this.icD.LEC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean fl() {
        return this.icD.fl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public gA AMP() {
        return this.icD.AMP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public long QnQ() {
        return this.icD.QnQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void vG(long j) {
        this.icD.vG(j);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean pQ() {
        return this.icD.pQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void sUS(boolean z) {
        this.icD.sUS(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean wS() {
        return this.icD.wS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void yiw(boolean z) {
        this.icD.yiw(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void dX(String str) {
        this.icD.dX(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String ekB() {
        return this.icD.ekB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void OhP(int i) {
        this.icD.OhP(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void CvL(String str) {
        this.icD.CvL(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String BHd() {
        return this.icD.BHd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String LGJ() {
        return this.icD.LGJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Es() {
        this.icD.Es();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean XPz() {
        return this.icD.XPz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bytedance.sdk.openadsdk.core.ugen.NB.pvs TN() {
        return this.icD.TN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void pvs(com.bytedance.sdk.openadsdk.core.ugen.NB.pvs pvsVar) {
        this.icD.pvs(pvsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void icD(com.bytedance.sdk.openadsdk.core.ugen.NB.pvs pvsVar) {
        this.icD.icD(pvsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public com.bytedance.sdk.openadsdk.core.ugen.NB.pvs NZI() {
        return this.icD.NZI();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void jhZ(int i) {
        this.icD.jhZ(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int CL() {
        return this.icD.CL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int BHj() {
        return this.icD.BHj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void fhd() {
        this.icD.fhd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean reT() {
        return this.icD.reT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void JO() {
        this.icD.JO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean IL() {
        return this.icD.IL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean Mvw() {
        return this.icD.Mvw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void so(boolean z) {
        this.icD.so(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean EAq() {
        pvs pvsVar = this.pvs;
        return pvsVar != null && pvsVar.qh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void SE(int i) {
        this.icD.SE(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int Eyq() {
        return this.icD.Eyq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String cQ() {
        return this.icD.cQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void Gp(String str) {
        this.icD.Gp(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public String Jpl() {
        return this.icD.Jpl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public int jMV() {
        return this.icD.jMV();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void yWX(int i) {
        this.icD.yWX(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean pY() {
        return this.icD.pY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean OUT() {
        return this.icD.OUT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void udE() {
        this.icD.udE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public void NB(boolean z) {
        this.icD.NB(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.cR
    public boolean sR() {
        return this.icD.sR();
    }
}
