package com.bytedance.sdk.component.sUS.pvs;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LogInternalManager.java */
/* loaded from: classes.dex */
public class so {
    private static so Ju;
    private static volatile com.bytedance.sdk.component.sUS.pvs.NB.pvs Wyp;
    private final AtomicBoolean IP = new AtomicBoolean(false);
    private volatile com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Jd;
    private volatile NB Mxy;
    private volatile com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs NB;
    private long bNS;
    private volatile com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs icD;
    private volatile Map<Integer, com.bytedance.sdk.component.sUS.pvs.icD.vG> kj;
    private volatile Context pvs;
    private volatile com.bytedance.sdk.component.sUS.pvs.icD.vG qh;
    private volatile com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs sUS;
    private volatile boolean so;
    private volatile com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs vG;
    private volatile com.bytedance.sdk.component.sUS.pvs.pvs.NB yiw;

    public boolean pvs() {
        return this.IP.get();
    }

    public void pvs(boolean z) {
        this.IP.set(z);
    }

    public boolean icD() {
        return this.so;
    }

    public void icD(boolean z) {
        this.so = z;
    }

    public Map<Integer, com.bytedance.sdk.component.sUS.pvs.icD.vG> vG() {
        return this.kj;
    }

    public com.bytedance.sdk.component.sUS.pvs.pvs.NB Jd() {
        return this.yiw;
    }

    public static com.bytedance.sdk.component.sUS.pvs.NB.pvs NB() {
        if (Wyp == null) {
            synchronized (so.class) {
                if (Wyp == null) {
                    Wyp = new com.bytedance.sdk.component.sUS.pvs.NB.icD();
                }
            }
        }
        return Wyp;
    }

    public void pvs(com.bytedance.sdk.component.sUS.pvs.pvs.NB nb) {
        this.yiw = nb;
    }

    public Context sUS() {
        return this.pvs;
    }

    public void pvs(Context context) {
        this.pvs = context;
    }

    private so() {
    }

    public static synchronized so yiw() {
        so soVar;
        synchronized (so.class) {
            if (Ju == null) {
                Ju = new so();
            }
            soVar = Ju;
        }
        return soVar;
    }

    public void pvs(com.bytedance.sdk.component.sUS.pvs.icD.vG vGVar) {
        this.qh = vGVar;
    }

    public com.bytedance.sdk.component.sUS.pvs.icD.vG so() {
        return this.qh;
    }

    public void Mxy() {
        com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD();
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Wyp() {
        return this.sUS;
    }

    public void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
        this.sUS = pvsVar;
    }

    public void qh() {
        com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG();
    }

    public void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        if (pvsVar == null) {
            return;
        }
        pvsVar.pvs(System.currentTimeMillis());
        com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.pvs(pvsVar, pvsVar.Jd());
    }

    public void pvs(String str, boolean z) {
        com.bytedance.sdk.component.sUS.pvs.sUS.pvs.pvs().pvs(str, z);
    }

    public void pvs(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.sUS.pvs.sUS.pvs.pvs().pvs(str, list, z, map, i, str2);
    }

    public void icD(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
        this.icD = pvsVar;
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs kj() {
        return this.icD;
    }

    public void vG(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
        this.vG = pvsVar;
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Ju() {
        return this.vG;
    }

    public void Jd(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
        this.Jd = pvsVar;
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs IP() {
        return this.Jd;
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs bNS() {
        return this.NB;
    }

    public void NB(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
        this.NB = pvsVar;
    }

    public void pvs(NB nb) {
        this.Mxy = nb;
    }

    public NB mnm() {
        return this.Mxy;
    }

    public void pvs(long j) {
        this.bNS = j;
    }

    public long vA() {
        return this.bNS * 24 * 60 * 60 * 1000;
    }
}
