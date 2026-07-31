package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.R;
import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.component.reward.zmn.btk;
import com.bytedance.sdk.openadsdk.core.model.klz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.zmn;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rc {
    private final com.bytedance.sdk.openadsdk.core.zn.fs fs;
    private final fs zmn;
    private final com.bytedance.sdk.openadsdk.core.zn.btk zn;

    public rc(fs fsVar) {
        this.zmn = fsVar;
        this.zn = zmn(fsVar, fsVar.fs);
        this.fs = new com.bytedance.sdk.openadsdk.core.zn.fs(fsVar.nu, fsVar.fs, fsVar.btk, fsVar.fb ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.rc.1
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
            public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
                try {
                    rc.this.zmn(view, f, f2, f3, f4, sparseArray, this.zak, this.rp, this.kjb);
                } catch (Exception e) {
                    iqz.zn("TTAD.RFReportManager", "onClickReport error :" + e.getMessage());
                }
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(rc.this.zmn.fs, 9);
                rc.this.zmn.phc.yof();
            }
        };
    }

    public void zmn() {
        nqi nqiVar;
        if (nps() || (nqiVar = this.zmn.fs) == null || nqiVar.yof()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject zg = zg();
        boolean z = false;
        int i = -1;
        try {
            if (this.zmn.zn()) {
                if (zg == null) {
                    zg = new JSONObject();
                }
                int zmn = this.zmn.zmn();
                if (1001 == zmn) {
                    jSONObject.put("dynamic_show_type", zmn + this.zmn.fs());
                } else {
                    jSONObject.put("dynamic_show_type", zmn);
                }
            } else if (this.zmn.fs.hhw()) {
                fs fsVar = this.zmn;
                if (fsVar.uqh != null && fsVar.fs.nkt() == 2) {
                    jSONObject.put("dynamic_show_type", this.zmn.uqh.rc());
                    this.zmn.uqh.zmn(jSONObject);
                    i = this.zmn.uqh.rc();
                    z = true;
                }
            }
        } catch (JSONException e) {
            Log.e("TTAD.RFReportManager", "Inject render fail info to pagJsonData failed", e);
        }
        zmn(jSONObject, zg, z, i, true);
    }

    private boolean nps() {
        fs fsVar = this.zmn;
        if (fsVar == null) {
            return true;
        }
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
        boolean z = zgVar != null && zgVar.jy().rp();
        fs fsVar2 = this.zmn;
        boolean z2 = fsVar2.cud;
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar2 = fsVar2.tdm;
        return z && !z2 && (zgVar2 != null && !zgVar2.bxw());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject zg() {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        fs fsVar = this.zmn;
        if (!fsVar.rje || (zgVar = fsVar.tdm) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.fb.zn.zmn(zgVar.rc + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i, boolean z2) {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        int i2;
        fs fsVar = this.zmn;
        nqi nqiVar = fsVar.fs;
        if (fsVar.ve && (i2 = fsVar.cd) == 5) {
            nqiVar.mw(i2);
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, this.zmn.btk, jSONObject, jSONObject2);
        this.zmn.ww.iv();
        if (!z) {
            i = -1;
        }
        btk.zmn zmnVar = new btk.zmn(i);
        zmn(zmnVar);
        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.zmn.nu.findViewById(R.id.content), nqiVar, zmnVar);
        com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(nqiVar);
        if (!z2 || (exj = nqiVar.exj()) == null) {
            return;
        }
        exj.zmn().zmn(0L);
    }

    public void fs() {
        if (nps()) {
            return;
        }
        nqi nqiVar = this.zmn.fs;
        if (nqiVar == null || !nqiVar.yof()) {
            JSONObject jSONObject = new JSONObject();
            boolean z = false;
            int i = -1;
            try {
                if (this.zmn.fs.hhw()) {
                    fs fsVar = this.zmn;
                    if (fsVar.uqh != null && fsVar.fs.nkt() == 2) {
                        jSONObject.put("dynamic_show_type", this.zmn.uqh.rc());
                        this.zmn.uqh.zmn(jSONObject);
                        i = this.zmn.uqh.rc();
                        z = true;
                    }
                }
                View findViewById = this.zmn.nu.findViewById(R.id.content);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", findViewById.getWidth());
                jSONObject2.put("height", findViewById.getHeight());
                jSONObject2.put("alpha", findViewById.getAlpha());
                jSONObject.put("root_view", jSONObject2.toString());
            } catch (Throwable th) {
                iqz.zmn("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", th);
            }
            zmn(jSONObject, zg(), z, i, false);
        }
    }

    public void zmn(final Map<String, Object> map) {
        if (nps()) {
            return;
        }
        nqi nqiVar = this.zmn.fs;
        if (nqiVar == null || !nqiVar.yof()) {
            final View findViewById = this.zmn.nu.findViewById(R.id.content);
            if (findViewById == null) {
                findViewById = this.zmn.nu.getWindow().getDecorView();
            }
            int width = findViewById.getWidth();
            int height = findViewById.getHeight();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.rc.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    int i;
                    Map map2;
                    JSONObject jSONObject;
                    fs unused = rc.this.zmn;
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
                    } catch (Throwable th) {
                        iqz.zmn("TTAD.RFReportManager", "run: ", th);
                    }
                    JSONObject jSONObject4 = jSONObject2;
                    if (rc.this.zmn.uqh == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                        z = false;
                        i = -1;
                    } else {
                        i = rc.this.zmn.uqh.rc();
                        z = true;
                    }
                    rc rcVar = rc.this;
                    rcVar.zmn(jSONObject4, rcVar.zg(), z, i, false);
                }
            };
            Thread.currentThread().getName();
            if (width > 0 && height > 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                    return;
                } else {
                    findViewById.post(runnable);
                    return;
                }
            }
            findViewById.post(runnable);
        }
    }

    private void zmn(btk.zmn zmnVar) {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        fs fsVar = this.zmn;
        if (!fsVar.rje || (zgVar = fsVar.tdm) == null) {
            return;
        }
        zmnVar.fs = zgVar.rc;
    }

    public void zmn(boolean z) {
        nqi nqiVar = this.zmn.fs;
        if (nqiVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cyb.zmn.fb btk = com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn(z ? 7 : 8).zn(String.valueOf(nqiVar.qvo())).btk(this.zmn.fs.wbj());
        btk.fs(this.zmn.yj.kgc()).hhw(this.zmn.yj.kw());
        btk.nps(this.zmn.fs.ze()).fb(this.zmn.fs.ji());
        com.bytedance.sdk.openadsdk.cyb.fb.zmn().fs(btk);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public com.bytedance.sdk.openadsdk.core.zn.btk zn() {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        this.zn.fs(this.zmn.nu.findViewById(R.id.content));
        if (this.zmn.doe.zn() != null) {
            this.zn.zmn(this.zmn.doe.zn());
        }
        this.zmn.nqi.zmn(this.zn);
        this.zn.zmn(new zmn.InterfaceC0185zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.rc.3
            @Override // com.bytedance.sdk.openadsdk.core.zn.zmn.InterfaceC0185zmn
            public long getVideoProgress() {
                return rc.this.zmn.phc.mw();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.rc rcVar = this.zmn.fkt;
        com.bytedance.sdk.openadsdk.core.zn.btk btkVar = this.zn;
        rcVar.zmn(btkVar, btkVar, this.fs);
        this.zmn.tf.zmn(this.zn);
        if (com.bytedance.sdk.openadsdk.core.model.iqz.mw(this.zmn.fs) && (znVar = this.zmn.ev.zmn) != null && znVar.getITopLayout() != null) {
            jy.zmn(this.zmn.ev.zmn.getITopLayout(), (View.OnClickListener) this.fs, "LandPage#TopLayoutEmptyClick");
        }
        return this.zn;
    }

    public com.bytedance.sdk.openadsdk.core.zn.fs fb() {
        return this.fs;
    }

    public com.bytedance.sdk.openadsdk.core.zn.btk btk() {
        return this.zn;
    }

    public void fs(boolean z) {
        nqi nqiVar;
        fs fsVar = this.zmn;
        if (fsVar == null) {
            return;
        }
        if (!z && fsVar.xrr > 0 && (nqiVar = fsVar.fs) != null && nqiVar.yof()) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.zmn.xrr);
            fs fsVar2 = this.zmn;
            com.bytedance.sdk.openadsdk.fb.zn.zmn(valueOf, fsVar2.fs, fsVar2.btk, fsVar2.phc.btk());
            this.zmn.xrr = 0L;
        } else {
            this.zmn.xrr = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.zmn.fs, z ? 4 : 8);
        com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(this.zmn.fs, z ? 4 : 8);
    }

    public void hhw() {
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        try {
            if (this.zmn.bvs.get()) {
                if (!this.zmn.yj.zn()) {
                    if (this.zmn.so.fb()) {
                        i = 3;
                    } else {
                        i = this.zmn.yj.fb() ? 2 : 0;
                    }
                }
                jSONObject.put("endcard_content", i);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        fs fsVar = this.zmn;
        com.bytedance.sdk.openadsdk.fb.zn.fs(fsVar.fs, fsVar.btk, "click_close", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, int i, int i2, int i3) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.olo.nps) {
            zmn("click_play_star_level", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.olo.hhw || view.getId() == com.bytedance.sdk.openadsdk.utils.olo.bvs) {
            zmn("click_play_star_nums", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.olo.btk) {
            zmn("click_play_source", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.olo.fb) {
            zmn("click_play_logo", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.olo.rt || view.getId() == com.bytedance.sdk.openadsdk.utils.olo.hip || view.getId() == com.bytedance.sdk.openadsdk.utils.olo.kgc) {
            zmn("click_start_play_bar", iv());
        } else if (view.getId() == 520093705) {
            zmn("click_start_play", iv());
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.olo.mw) {
            zmn("click_video", iv());
        } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.olo.iv) {
            zmn("fallback_endcard_click", iv());
        }
        fs(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }

    private void fs(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, int i, int i2, int i3) {
        nqi nqiVar;
        if (!bvs() || (nqiVar = this.zmn.fs) == null || view == null) {
            return;
        }
        boolean z = com.bytedance.sdk.openadsdk.core.model.iqz.mw(nqiVar) && (view instanceof TopLayoutDislike2) && this.zmn.ev.zmn.getITopLayout() == view;
        int id = view.getId();
        if (z || id == com.bytedance.sdk.openadsdk.utils.olo.nps || id == com.bytedance.sdk.openadsdk.utils.olo.hhw || id == com.bytedance.sdk.openadsdk.utils.olo.btk || id == com.bytedance.sdk.openadsdk.utils.olo.fb || id == com.bytedance.sdk.openadsdk.utils.olo.rt || id == com.bytedance.sdk.openadsdk.utils.olo.hip || id == com.bytedance.sdk.openadsdk.utils.olo.kgc || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.olo.mw || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.olo.bvs) {
            int iv = jy.iv(com.bytedance.sdk.openadsdk.core.kgc.zmn());
            com.bytedance.sdk.openadsdk.core.model.klz zmn = new klz.zmn().hhw(f).btk(f2).fb(f3).zn(f4).fs(System.currentTimeMillis()).zmn(0L).zmn(jy.zmn(this.zmn.fkt.klz())).fs(jy.zn(this.zmn.fkt.klz())).fb(i2).btk(i3).hhw(i).zmn(sparseArray).fs(com.bytedance.sdk.openadsdk.core.iv.fs().zmn() ? 1 : 2).zn(iv).zmn(jy.zg(com.bytedance.sdk.openadsdk.core.kgc.zmn())).fs(jy.bvs(com.bytedance.sdk.openadsdk.core.kgc.zmn())).zmn();
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.zmn.phc.mw()));
            fs fsVar = this.zmn;
            String str = fsVar.btk;
            if (z) {
                str = "landingpage_endcard";
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn("click_other", fsVar.fs, zmn, str, true, (Map<String, Object>) hashMap, -1);
        }
    }

    private boolean bvs() {
        nqi nqiVar = this.zmn.fs;
        return nqiVar != null && nqiVar.eug() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str, JSONObject jSONObject) {
        fs fsVar = this.zmn;
        nqi nqiVar = fsVar.fs;
        String str2 = fsVar.btk;
        if (!fsVar.fb) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str2, str, jSONObject);
    }

    private JSONObject iv() {
        try {
            long nqi = this.zmn.phc.nqi();
            int uqh = this.zmn.phc.uqh();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, nqi);
                jSONObject.put("percent", uqh);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void zn(boolean z) {
        fs fsVar = this.zmn;
        if (fsVar != null && z && fsVar.fs.dv() && !this.zmn.fs.kjb()) {
            this.zmn.fs.nps(true);
            fs fsVar2 = this.zmn;
            nqi nqiVar = fsVar2.fs;
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, fsVar2.btk, nqiVar.rfd());
        }
    }

    public com.bytedance.sdk.openadsdk.core.zn.btk zmn(final fs fsVar, final nqi nqiVar) {
        return new com.bytedance.sdk.openadsdk.core.zn.btk(fsVar.nu, nqiVar, fsVar.btk, fsVar.fb ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.rc.4
            @Override // com.bytedance.sdk.openadsdk.core.zn.btk
            public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, int i, int i2, int i3, boolean z) {
                if (nqiVar.ch() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        zmn((String) tag);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(fsVar.phc.mw()));
                if (fsVar.bvs.get()) {
                    hashMap.put("click_scence", 2);
                } else {
                    hashMap.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
                if (zgVar != null) {
                    zgVar.zmn(hashMap, f, f2);
                }
                zmn(hashMap);
                fsVar.ww.tf();
                fsVar.doe.zmn(view, f, f2, f3, f4, sparseArray, i, i2, i3, new btk.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.rc.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.btk.zmn
                    public void zmn(String str, JSONObject jSONObject) {
                        rc.this.zmn(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.btk.zmn
                    public void zmn(View view2, float f5, float f6, float f7, float f8, SparseArray<zn.zmn> sparseArray2, int i4, int i5, int i6) {
                        rc.this.zmn(view2, f5, f6, f7, f8, sparseArray2, i4, i5, i6);
                    }
                });
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(nqiVar, 9);
                fsVar.phc.yof();
            }
        };
    }
}
