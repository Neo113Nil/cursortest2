package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: RitInfo.java */
/* loaded from: classes2.dex */
public class rCZ {
    public static ConcurrentHashMap<Integer, rCZ> pvs = new ConcurrentHashMap<>();
    private int Jd;
    private int NB;
    private String sUS;
    private String icD = "";
    private String vG = "";

    public String pvs() {
        return this.sUS;
    }

    public String icD() {
        return this.icD;
    }

    public String vG() {
        return this.vG;
    }

    public int Jd() {
        return this.Jd;
    }

    public void pvs(int i) {
        this.Jd = i;
    }

    public int NB() {
        return this.NB;
    }

    public void icD(int i) {
        this.NB = i;
    }

    private void sUS() {
        this.icD = "";
        this.vG = "";
        this.Jd = 0;
        this.NB = 0;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (cRVar != null) {
            String Yjw = cRVar.Yjw();
            if (!TextUtils.isEmpty(Yjw)) {
                this.sUS = Yjw;
            }
            String CjQ = cRVar.CjQ();
            if (TextUtils.isEmpty(CjQ) && cRVar.SJ()) {
                CjQ = cRVar.ig().Mxy();
            }
            if (!TextUtils.isEmpty(CjQ)) {
                String[] split = CjQ.split("/");
                if (split.length >= 3) {
                    this.icD = split[2];
                }
            }
            if (cRVar.Ca() == null || TextUtils.isEmpty(cRVar.Ca().vG())) {
                return;
            }
            this.vG = cRVar.Ca().vG();
        }
    }

    public static void icD(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (cRVar == null || TextUtils.isEmpty(cRVar.HWd())) {
            return;
        }
        Integer valueOf = Integer.valueOf(cRVar.yTz());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (pvs == null) {
            pvs = new ConcurrentHashMap<>();
        }
        rCZ rcz = pvs.containsKey(valueOf) ? pvs.get(valueOf) : null;
        if (rcz == null) {
            rcz = new rCZ();
        }
        String Yjw = cRVar.Yjw();
        if (TextUtils.isEmpty(Yjw) || !Yjw.equals(rcz.pvs())) {
            rcz.sUS();
            rcz.pvs(cRVar);
            pvs.put(valueOf, rcz);
        }
    }

    public static void vG(int i) {
        rCZ rcz;
        if (i == 0) {
            return;
        }
        if (pvs == null) {
            pvs = new ConcurrentHashMap<>();
        }
        if (!pvs.containsKey(Integer.valueOf(i)) || (rcz = pvs.get(Integer.valueOf(i))) == null) {
            return;
        }
        rcz.icD(1);
    }

    public static void vG(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        rCZ rcz;
        if (cRVar == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(cRVar.yTz());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (pvs == null) {
            pvs = new ConcurrentHashMap<>();
        }
        if (!pvs.containsKey(valueOf) || (rcz = pvs.get(valueOf)) == null) {
            return;
        }
        rcz.pvs(1);
    }
}
