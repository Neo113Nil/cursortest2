package com.bytedance.sdk.openadsdk.core.yiw;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.yiw.icD.icD;
import com.bytedance.sdk.openadsdk.core.yiw.icD.pvs;
import com.bytedance.sdk.openadsdk.core.yiw.icD.vG;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoTrackers.java */
/* loaded from: classes2.dex */
public class Jd {
    private final pvs Ju;
    private boolean cR;
    private long mnm;
    private String rCZ;
    private boolean uc;
    private cR vA;
    private boolean zM;
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> pvs = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> icD = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> vG = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> Jd = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> NB = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> sUS = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> yiw = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> so = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> Mxy = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> Wyp = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.icD> qh = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.pvs> kj = new ArrayList();
    private final AtomicBoolean IP = new AtomicBoolean(false);
    private final AtomicBoolean bNS = new AtomicBoolean(false);

    public Jd(pvs pvsVar) {
        this.Ju = pvsVar;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs pvsVar) {
        pvs(-1L, this.pvs, pvsVar);
    }

    public void pvs(long j) {
        if (this.IP.compareAndSet(false, true)) {
            pvs(j, this.icD, null, new vG.icD("show_impression", this.vA));
        }
    }

    public void icD(long j) {
        pvs(j, this.vG, (com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs) null);
    }

    public void vG(long j) {
        pvs(j, this.Jd, (com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs) null);
    }

    public void Jd(long j) {
        pvs(j, this.NB, null, new vG.icD("video_progress", this.vA, 1.0f));
    }

    public void NB(long j) {
        if (this.bNS.compareAndSet(false, true)) {
            pvs(j, this.sUS, (com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs) null);
        }
    }

    public void sUS(long j) {
        pvs(j, this.yiw, (com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs) null);
    }

    public void yiw(long j) {
        pvs(j, this.so, null, new vG.icD("click", this.vA));
    }

    public void so(long j) {
        pvs(j, this.Mxy, (com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs) null);
    }

    public void Mxy(long j) {
        pvs(j, this.Wyp, (com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(long j, long j2, sUS sus) {
        if (System.currentTimeMillis() - this.mnm >= 1000 && j >= 0 && j2 > 0) {
            this.mnm = System.currentTimeMillis();
            float f = j / j2;
            List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> pvs = pvs(j, f);
            float f2 = 0.25f;
            if (f >= 0.25f && !this.cR) {
                icD("firstQuartile");
                this.cR = true;
                if (sus != null) {
                    pvs(sus, 6);
                }
            } else {
                f2 = 0.5f;
                if (f >= 0.5f && !this.zM) {
                    icD("midpoint");
                    this.zM = true;
                    if (sus != null) {
                        pvs(sus, 7);
                    }
                } else {
                    f2 = 0.75f;
                    if (f >= 0.75f && !this.uc) {
                        icD("thirdQuartile");
                        this.uc = true;
                        if (sus != null) {
                            pvs(sus, 8);
                        }
                    }
                    if (f < 0.03f) {
                        f = 0.0f;
                    }
                    pvs(j, pvs, null, new vG.icD("video_progress", this.vA, f));
                }
            }
            f = f2;
            if (f < 0.03f) {
            }
            pvs(j, pvs, null, new vG.icD("video_progress", this.vA, f));
        }
    }

    private void pvs(final sUS sus, final int i) {
        com.bytedance.sdk.component.utils.so.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.Jd.1
            @Override // java.lang.Runnable
            public void run() {
                sUS sus2 = sus;
                if (sus2 != null) {
                    sus2.pvs(i);
                }
            }
        });
    }

    private void icD(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
            com.bytedance.sdk.openadsdk.icD.vG.icD(this.vA, this.rCZ, "vast_play_track", jSONObject);
        } catch (Throwable unused) {
        }
    }

    private void pvs(long j, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list, com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs pvsVar, vG.icD icd) {
        pvs pvsVar2 = this.Ju;
        com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(list, pvsVar, j, pvsVar2 != null ? pvsVar2.yiw() : null, icd);
    }

    private void pvs(long j, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list, com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs pvsVar) {
        pvs(j, list, pvsVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> pvs(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.qh.size(); i++) {
            com.bytedance.sdk.openadsdk.core.yiw.icD.icD icd = this.qh.get(i);
            if (icd.pvs(f)) {
                arrayList.add(icd);
            }
        }
        for (int i2 = 0; i2 < this.kj.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.yiw.icD.pvs pvsVar = this.kj.get(i2);
            if (pvsVar.pvs(j)) {
                arrayList.add(pvsVar);
            }
        }
        return arrayList;
    }

    public void pvs(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.icD.addAll(list);
    }

    public void icD(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.vG.addAll(list);
    }

    public void vG(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.Jd.addAll(list);
    }

    public void Jd(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.NB.addAll(list);
    }

    public void NB(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.sUS.addAll(list);
    }

    public void sUS(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.yiw.addAll(list);
    }

    public void yiw(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.so.addAll(list);
    }

    public void so(List<com.bytedance.sdk.openadsdk.core.yiw.icD.icD> list) {
        this.qh.addAll(list);
        Collections.sort(this.qh);
    }

    public void Mxy(List<com.bytedance.sdk.openadsdk.core.yiw.icD.pvs> list) {
        this.kj.addAll(list);
        Collections.sort(this.kj);
    }

    public void Wyp(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.pvs.addAll(list);
    }

    public void qh(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.Mxy.addAll(list);
    }

    public void kj(List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list) {
        this.Wyp.addAll(list);
    }

    public JSONObject pvs() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.pvs));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.icD));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.vG));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.Jd));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.NB));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.sUS));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.yiw));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.so));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.Mxy));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.Wyp));
        jSONObject.put("fractionalTrackers", icD());
        jSONObject.put("absoluteTrackers", vG());
        return jSONObject;
    }

    private JSONArray icD() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.yiw.icD.icD> it = this.qh.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().icD());
        }
        return jSONArray;
    }

    private JSONArray vG() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.yiw.icD.pvs> it = this.kj.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().pvs());
        }
        return jSONArray;
    }

    public void pvs(JSONObject jSONObject) {
        Wyp(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("errorTrackers")));
        pvs(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("impressionTrackers")));
        icD(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("pauseTrackers"), true));
        vG(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("resumeTrackers"), true));
        Jd(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("completeTrackers")));
        NB(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("closeTrackers")));
        sUS(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("skipTrackers")));
        yiw(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("clickTrackers")));
        qh(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("muteTrackers"), true));
        kj(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(jSONObject.optJSONArray("unMuteTrackers"), true));
        so(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.icD(jSONObject.optJSONArray("fractionalTrackers")));
        Mxy(com.bytedance.sdk.openadsdk.core.yiw.icD.vG.vG(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void pvs(cR cRVar) {
        this.vA = cRVar;
    }

    public void pvs(String str) {
        this.rCZ = str;
    }

    public void pvs(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        Mxy(Collections.singletonList(new pvs.C0087pvs(str, j).pvs()));
    }

    public void pvs(String str, float f) {
        if (TextUtils.isEmpty(str) || f < 0.0f) {
            return;
        }
        so(Collections.singletonList(new icD.pvs(str, f).pvs()));
    }

    public void pvs(Jd jd) {
        Wyp(jd.pvs);
        pvs(jd.icD);
        icD(jd.vG);
        vG(jd.Jd);
        Jd(jd.NB);
        NB(jd.sUS);
        sUS(jd.yiw);
        yiw(jd.so);
        qh(jd.Mxy);
        kj(jd.Wyp);
        so(jd.qh);
        Mxy(jd.kj);
    }
}
