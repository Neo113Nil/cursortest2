package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.component.pvs;
import com.bytedance.adsdk.ugeno.core.sUS;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: UGenEngine.java */
/* loaded from: classes.dex */
public class Wyp {
    private yiw Jd;
    private Mxy Mxy;
    private Ju NB;
    private JSONObject Wyp;
    private JSONObject icD;
    private Context pvs;
    private mnm sUS;
    private sUS so;
    private com.bytedance.adsdk.ugeno.component.icD<View> vG;
    private IP yiw;
    private boolean qh = true;
    private boolean kj = false;

    public Wyp(Context context) {
        this.pvs = context;
    }

    public com.bytedance.adsdk.ugeno.component.icD<View> pvs(JSONObject jSONObject) {
        mnm mnmVar = this.sUS;
        if (mnmVar != null) {
            mnmVar.pvs();
        }
        sUS sus = new sUS(jSONObject, this.icD);
        this.so = sus;
        Ju ju = this.NB;
        if (ju instanceof com.bytedance.adsdk.ugeno.core.pvs.pvs) {
            ((com.bytedance.adsdk.ugeno.core.pvs.pvs) ju).pvs(sus.icD());
        }
        this.vG = pvs(this.so.pvs(), (com.bytedance.adsdk.ugeno.component.icD<View>) null);
        mnm mnmVar2 = this.sUS;
        if (mnmVar2 != null) {
            mnmVar2.icD();
            this.vG.pvs(this.sUS);
        }
        return this.vG;
    }

    public com.bytedance.adsdk.ugeno.component.icD<View> pvs(sUS.pvs pvsVar, com.bytedance.adsdk.ugeno.component.icD<View> icd) {
        List<sUS.pvs> vG;
        pvs.C0033pvs c0033pvs = null;
        if (!sUS.pvs(pvsVar)) {
            return null;
        }
        String vG2 = pvsVar.vG();
        icD pvs = Jd.pvs(vG2);
        if (pvs == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(vG2)));
            return null;
        }
        com.bytedance.adsdk.ugeno.component.icD pvs2 = pvs.pvs(this.pvs);
        if (pvs2 == null) {
            return null;
        }
        pvs2.vG(com.bytedance.adsdk.ugeno.pvs.vG.pvs(pvsVar.pvs(), this.icD));
        pvs2.Jd(vG2);
        pvs2.icD(pvsVar.Jd());
        pvs2.pvs(pvsVar);
        pvs2.pvs(this.Mxy);
        if (icd instanceof com.bytedance.adsdk.ugeno.component.pvs) {
            com.bytedance.adsdk.ugeno.component.pvs pvsVar2 = (com.bytedance.adsdk.ugeno.component.pvs) icd;
            pvs2.pvs(pvsVar2);
            c0033pvs = pvsVar2.so();
        }
        Iterator<String> keys = pvsVar.Jd().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String pvs3 = com.bytedance.adsdk.ugeno.pvs.vG.pvs(pvsVar.Jd().optString(next), this.icD);
            pvs2.pvs(next, pvs3);
            if (c0033pvs != null) {
                c0033pvs.pvs(this.pvs, next, pvs3);
            }
        }
        if (pvs2 instanceof com.bytedance.adsdk.ugeno.component.pvs) {
            List<sUS.pvs> NB = pvsVar.NB();
            if (NB == null || NB.size() <= 0) {
                if (TextUtils.equals(pvs2.IP(), "RecyclerLayout") && (vG = this.so.vG()) != null && vG.size() > 0) {
                    Iterator<sUS.pvs> it = vG.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.component.icD<View> pvs4 = pvs(it.next(), (com.bytedance.adsdk.ugeno.component.icD<View>) pvs2);
                        if (pvs4 != null && pvs4.vA()) {
                            ((com.bytedance.adsdk.ugeno.component.pvs) pvs2).pvs(pvs4);
                        }
                    }
                }
                return pvs2;
            }
            if (TextUtils.equals(pvs2.IP(), "Swiper") && NB.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<sUS.pvs> it2 = NB.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.component.icD<View> pvs5 = pvs(it2.next(), (com.bytedance.adsdk.ugeno.component.icD<View>) pvs2);
                if (pvs5 != null && pvs5.vA()) {
                    ((com.bytedance.adsdk.ugeno.component.pvs) pvs2).pvs(pvs5);
                }
            }
        }
        if (c0033pvs != null) {
            pvs2.pvs(c0033pvs.pvs());
        }
        this.vG = pvs2;
        return pvs2;
    }

    public void icD(JSONObject jSONObject) {
        mnm mnmVar = this.sUS;
        if (mnmVar != null) {
            mnmVar.vG();
        }
        this.icD = jSONObject;
        pvs(this.vG, jSONObject);
        pvs(this.vG);
        if (this.sUS != null) {
            bNS bns = new bNS();
            bns.pvs(0);
            bns.pvs(this.vG);
            this.sUS.pvs(bns);
        }
    }

    public void pvs(com.bytedance.adsdk.ugeno.component.icD icd, JSONObject jSONObject) {
        if (icd == null) {
            return;
        }
        if (icd instanceof com.bytedance.adsdk.ugeno.component.pvs) {
            icd.pvs(jSONObject);
            List<com.bytedance.adsdk.ugeno.component.icD<View>> pvs = ((com.bytedance.adsdk.ugeno.component.pvs) icd).pvs();
            if (pvs == null || pvs.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.component.icD<View>> it = pvs.iterator();
            while (it.hasNext()) {
                pvs(it.next(), jSONObject);
            }
            return;
        }
        icd.pvs(jSONObject);
    }

    private void pvs(com.bytedance.adsdk.ugeno.component.icD<View> icd) {
        List<com.bytedance.adsdk.ugeno.component.icD<View>> pvs;
        if (icd == null) {
            return;
        }
        JSONObject qh = icd.qh();
        Iterator<String> keys = qh.keys();
        com.bytedance.adsdk.ugeno.component.pvs kj = icd.kj();
        pvs.C0033pvs so = kj != null ? kj.so() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String pvs2 = com.bytedance.adsdk.ugeno.pvs.vG.pvs(qh.optString(next), this.icD);
            icd.pvs(next, pvs2);
            icd.pvs(this.Jd);
            icd.pvs(this.NB);
            icd.pvs(this.yiw);
            if (so != null) {
                so.pvs(this.pvs, next, pvs2);
            }
        }
        if ((icd instanceof com.bytedance.adsdk.ugeno.component.pvs) && (pvs = ((com.bytedance.adsdk.ugeno.component.pvs) icd).pvs()) != null && pvs.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.component.icD<View>> it = pvs.iterator();
            while (it.hasNext()) {
                pvs(it.next());
            }
        }
        if (so != null) {
            icd.pvs(so.pvs());
        }
        icd.icD();
    }

    public void pvs(Ju ju) {
        com.bytedance.adsdk.ugeno.core.pvs.pvs pvsVar = new com.bytedance.adsdk.ugeno.core.pvs.pvs(ju);
        pvsVar.pvs(this.Wyp);
        pvsVar.pvs(this.qh);
        pvsVar.icD(this.kj);
        sUS sus = this.so;
        if (sus != null) {
            pvsVar.pvs(sus.icD());
        }
        this.NB = pvsVar;
    }

    public void pvs(IP ip) {
        this.yiw = ip;
    }
}
