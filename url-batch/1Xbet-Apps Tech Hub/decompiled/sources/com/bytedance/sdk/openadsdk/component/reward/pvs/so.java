package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.R;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.component.reward.pvs.Jd;
import com.bytedance.sdk.openadsdk.core.icD.pvs;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.Wyp;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.model.zM;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullReportManager.java */
/* loaded from: classes2.dex */
public class so {
    private final com.bytedance.sdk.openadsdk.core.icD.icD icD;
    private final pvs pvs;
    private final com.bytedance.sdk.openadsdk.core.icD.NB vG;

    @DungeonFlag
    public so(pvs pvsVar) {
        this.pvs = pvsVar;
        this.vG = pvs(pvsVar, pvsVar.icD);
        this.icD = new com.bytedance.sdk.openadsdk.core.icD.icD(pvsVar.od, pvsVar.icD, pvsVar.NB, pvsVar.Jd ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.so.1
            @Override // com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
            public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
                try {
                    so.this.pvs(view, f, f2, f3, f4, sparseArray, this.ae, this.CvL, this.Gp);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFReportManager", "onClickReport error :" + e.getMessage());
                }
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(so.this.pvs.icD, 9);
                so.this.pvs.ny.dx();
            }
        };
    }

    @DungeonFlag
    public void pvs() {
        if (this.pvs.Ju.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        cR cRVar = this.pvs.icD;
        pvs(jSONObject);
        if (this.pvs.Ju.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, this.pvs.NB, jSONObject);
            this.pvs.OhP.sUS();
            NB.pvs pvsVar = new NB.pvs(-1);
            if (this.pvs.Ayu && this.pvs.elv != null) {
                pvsVar.icD = this.pvs.elv.Mxy;
            }
            com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.pvs.od.findViewById(R.id.content), cRVar, pvsVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(JSONObject jSONObject) {
        cR cRVar = this.pvs.icD;
        if ((cRVar instanceof zM) && ((zM) cRVar).YQ()) {
            try {
                jSONObject.put("choose_one_ad_real_show", true);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFReportManager", "reportShow json error", e);
            }
        }
        if (!this.pvs.Ayu || this.pvs.elv == null) {
            return;
        }
        try {
            jSONObject.put("ad_show_order", this.pvs.elv.Mxy + 1);
        } catch (JSONException unused) {
        }
    }

    @DungeonFlag
    public void icD() {
        boolean z;
        if (this.pvs.Ju.get()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.pvs.icD.pvs() || this.pvs.dX == null) {
                z = false;
            } else {
                jSONObject.put("dynamic_show_type", this.pvs.dX.Mxy());
                this.pvs.dX.pvs(jSONObject);
                z = true;
            }
            cR cRVar = this.pvs.icD;
            pvs(jSONObject);
            View findViewById = this.pvs.od.findViewById(R.id.content);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("width", findViewById.getWidth());
                jSONObject2.put("height", findViewById.getHeight());
                jSONObject2.put("alpha", findViewById.getAlpha());
            } catch (Throwable unused) {
            }
            jSONObject.put("root_view", jSONObject2.toString());
            if (this.pvs.Ju.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, this.pvs.NB, jSONObject);
                this.pvs.OhP.sUS();
                NB.pvs pvsVar = new NB.pvs(z ? this.pvs.dX.Mxy() : -1);
                if (this.pvs.Ayu && this.pvs.elv != null) {
                    pvsVar.icD = this.pvs.elv.Mxy;
                }
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.pvs.od.findViewById(R.id.content), cRVar, pvsVar);
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", e);
        }
    }

    @DungeonFlag
    public void pvs(final Map<String, Object> map) {
        if (this.pvs.Ju.get()) {
            return;
        }
        this.pvs.Ju.set(true);
        final View findViewById = this.pvs.od.findViewById(R.id.content);
        if (findViewById == null) {
            findViewById = this.pvs.od.getWindow().getDecorView();
        }
        findViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.so.2
            @Override // java.lang.Runnable
            public void run() {
                Map map2;
                JSONObject jSONObject;
                boolean z = false;
                if (so.this.pvs.IP.compareAndSet(false, true)) {
                    cR cRVar = so.this.pvs.icD;
                    JSONObject jSONObject2 = null;
                    try {
                        if (map != null) {
                            jSONObject = new JSONObject(map);
                        } else {
                            jSONObject = new JSONObject();
                        }
                        jSONObject2 = jSONObject;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("width", findViewById.getWidth());
                        jSONObject3.put("height", findViewById.getHeight());
                        jSONObject3.put("alpha", findViewById.getAlpha());
                        jSONObject2.put("root_view", jSONObject3.toString());
                        so.this.pvs(jSONObject2);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFReportManager", "run: ", th);
                    }
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, so.this.pvs.NB, jSONObject2);
                    so.this.pvs.OhP.sUS();
                    if (so.this.pvs.dX != null && (map2 = map) != null && map2.containsKey("dynamic_show_type")) {
                        z = true;
                    }
                    NB.pvs pvsVar = new NB.pvs(z ? so.this.pvs.dX.Mxy() : -1);
                    if (so.this.pvs.Ayu && so.this.pvs.elv != null) {
                        pvsVar.icD = so.this.pvs.elv.Mxy;
                    }
                    com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(so.this.pvs.od.findViewById(R.id.content), cRVar, pvsVar);
                }
            }
        });
    }

    public void pvs(boolean z) {
        if (this.pvs.icD == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.Wyp.pvs.Jd NB = com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs(z ? 7 : 8).vG(String.valueOf(this.pvs.icD.yTz())).NB(this.pvs.icD.Yjw());
        NB.icD(this.pvs.dx.uc()).sUS(this.pvs.dx.rCZ());
        NB.yiw(this.pvs.icD.HWd()).Jd(this.pvs.icD.neB());
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs().icD(NB);
    }

    public com.bytedance.sdk.openadsdk.core.icD.NB vG() {
        this.vG.pvs(this.pvs.od.findViewById(R.id.content));
        this.vG.icD(this.pvs.qD.findViewById(520093713));
        if (this.pvs.ZhG.vG() != null) {
            this.vG.pvs(this.pvs.ZhG.vG());
        }
        this.pvs.dyT.pvs(this.vG);
        this.vG.pvs(new pvs.InterfaceC0074pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.so.3
            @Override // com.bytedance.sdk.openadsdk.core.icD.pvs.InterfaceC0074pvs
            public long getVideoProgress() {
                return so.this.pvs.ny.yiw();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.NB nb = this.pvs.gSd;
        com.bytedance.sdk.openadsdk.core.icD.NB nb2 = this.vG;
        nb.pvs(nb2, nb2, this.icD);
        this.pvs.sP.pvs(this.vG);
        return this.vG;
    }

    public com.bytedance.sdk.openadsdk.core.icD.icD Jd() {
        return this.icD;
    }

    public com.bytedance.sdk.openadsdk.core.icD.NB NB() {
        return this.vG;
    }

    @DungeonFlag
    public void icD(boolean z) {
        pvs pvsVar = this.pvs;
        if (pvsVar == null) {
            return;
        }
        if (!z && pvsVar.Ju.get() && this.pvs.neB > 0) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(String.valueOf(SystemClock.elapsedRealtime() - this.pvs.neB), this.pvs.icD, this.pvs.NB, this.pvs.ny.pvs());
            this.pvs.neB = 0L;
        } else {
            this.pvs.neB = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.pvs.icD, z ? 4 : 8);
    }

    public void sUS() {
        JSONObject jSONObject = new JSONObject();
        if (rCZ.qh(this.pvs.icD)) {
            this.pvs.dyT.pvs(jSONObject);
        }
        int i = 1;
        try {
            if (this.pvs.Wyp.get()) {
                if (!this.pvs.dx.vG()) {
                    if (this.pvs.Pj.Jd()) {
                        i = 3;
                    } else {
                        i = this.pvs.dx.Jd() ? 2 : 0;
                    }
                }
                jSONObject.put("endcard_content", i);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(this.pvs.icD, this.pvs.NB, "click_close", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DungeonFlag
    public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, int i, int i2, int i3) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.kj.NB) {
            pvs("click_play_star_level", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.kj.Jd || view.getId() == com.bytedance.sdk.openadsdk.utils.kj.yiw) {
            pvs("click_play_star_nums", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.kj.vG) {
            pvs("click_play_source", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.kj.icD) {
            pvs("click_play_logo", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.kj.kj || view.getId() == com.bytedance.sdk.openadsdk.utils.kj.wjr || view.getId() == com.bytedance.sdk.openadsdk.utils.kj.vA) {
            pvs("click_start_play_bar", Mxy());
        } else if (view.getId() == 520093705) {
            pvs("click_start_play", Mxy());
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.kj.qh) {
            pvs("click_video", Mxy());
        } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.kj.so) {
            pvs("fallback_endcard_click", Mxy());
        }
        icD(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }

    private void icD(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, int i, int i2, int i3) {
        if (!so() || this.pvs.icD == null || view == null) {
            return;
        }
        int id = view.getId();
        if (id == com.bytedance.sdk.openadsdk.utils.kj.NB || id == com.bytedance.sdk.openadsdk.utils.kj.Jd || id == com.bytedance.sdk.openadsdk.utils.kj.vG || id == com.bytedance.sdk.openadsdk.utils.kj.icD || id == com.bytedance.sdk.openadsdk.utils.kj.kj || id == com.bytedance.sdk.openadsdk.utils.kj.wjr || id == com.bytedance.sdk.openadsdk.utils.kj.vA || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.kj.qh || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.kj.yiw) {
            int yiw = Pj.yiw(com.bytedance.sdk.openadsdk.core.mnm.pvs());
            com.bytedance.sdk.openadsdk.core.model.Wyp pvs = new Wyp.pvs().sUS(f).NB(f2).Jd(f3).vG(f4).icD(System.currentTimeMillis()).pvs(0L).icD(Pj.pvs(this.pvs.gSd.qh())).pvs(Pj.pvs((View) null)).vG(Pj.vG(this.pvs.gSd.qh())).Jd(Pj.vG((View) null)).Jd(i2).NB(i3).sUS(i).pvs(sparseArray).icD(com.bytedance.sdk.openadsdk.core.so.icD().pvs() ? 1 : 2).vG(yiw).pvs(Pj.NB(com.bytedance.sdk.openadsdk.core.mnm.pvs())).icD(Pj.sUS(com.bytedance.sdk.openadsdk.core.mnm.pvs())).pvs();
            HashMap hashMap = new HashMap();
            hashMap.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(this.pvs.ny.yiw()));
            com.bytedance.sdk.openadsdk.icD.vG.pvs("click_other", this.pvs.icD, pvs, this.pvs.NB, true, (Map<String, Object>) hashMap, -1);
        }
    }

    private boolean so() {
        return this.pvs.icD != null && this.pvs.icD.qD() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str, JSONObject jSONObject) {
        cR cRVar = this.pvs.icD;
        String str2 = this.pvs.NB;
        if (!this.pvs.Jd) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str2, str, jSONObject);
    }

    private JSONObject Mxy() {
        try {
            long mnm = this.pvs.ny.mnm();
            int vA = this.pvs.ny.vA();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TypedValues.TransitionType.S_DURATION, mnm);
                jSONObject.put("percent", vA);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void vG(boolean z) {
        pvs pvsVar = this.pvs;
        if (pvsVar != null && z && pvsVar.icD.fl() && !this.pvs.icD.wS()) {
            this.pvs.icD.yiw(true);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.pvs.icD, this.pvs.NB, this.pvs.icD.AMP());
        }
    }

    public void yiw() {
        JSONObject jSONObject = new JSONObject();
        pvs(jSONObject);
        com.bytedance.sdk.openadsdk.icD.vG.vG(this.pvs.icD, this.pvs.NB, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.icD.NB pvs(final pvs pvsVar, final cR cRVar) {
        return new com.bytedance.sdk.openadsdk.core.icD.NB(pvsVar.od, cRVar, pvsVar.NB, pvsVar.Jd ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.so.4
            @Override // com.bytedance.sdk.openadsdk.core.icD.NB
            public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, int i, int i2, int i3, boolean z) {
                if (cRVar.SJ() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        pvs((String) tag);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(pvsVar.ny.yiw()));
                if (pvsVar.Wyp.get()) {
                    hashMap.put("click_scence", 2);
                } else if (rCZ.qh(cRVar)) {
                    hashMap.put("click_scence", 3);
                } else {
                    hashMap.put("click_scence", 1);
                }
                pvs(hashMap);
                pvsVar.OhP.c_();
                if (view.getId() == com.bytedance.sdk.openadsdk.utils.kj.sDK && rCZ.qh(cRVar)) {
                    JSONObject jSONObject = new JSONObject();
                    if (cRVar.od() != null) {
                        try {
                            jSONObject.put("playable_url", cRVar.od().kj());
                        } catch (JSONException e) {
                            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFReportManager", "onRewardBarClick json error", e);
                        }
                    }
                    com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, pvsVar.NB, "click_playable_download_button_loading", jSONObject);
                }
                pvsVar.ZhG.pvs(view, f, f2, f3, f4, sparseArray, i, i2, i3, new Jd.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.so.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.pvs.Jd.pvs
                    public void pvs(String str, JSONObject jSONObject2) {
                        so.this.pvs(str, jSONObject2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.pvs.Jd.pvs
                    public void pvs(View view2, float f5, float f6, float f7, float f8, SparseArray<vG.pvs> sparseArray2, int i4, int i5, int i6) {
                        so.this.pvs(view2, f5, f6, f7, f8, sparseArray2, i4, i5, i6);
                    }
                });
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(cRVar, 9);
                pvsVar.ny.dx();
            }
        };
    }
}
