package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.fs;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class nps {
    private boolean fs;

    @NonNull
    private fs zmn;

    public nps(fs fsVar) {
        this.zmn = fsVar;
    }

    public void zmn(float[] fArr) {
        FrameLayout.LayoutParams layoutParams;
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar;
        this.fs = true;
        Arrays.toString(fArr);
        AdSlot build = new AdSlot.Builder().setCodeId(String.valueOf(this.zmn.fs.qvo())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        fs fsVar = this.zmn;
        fsVar.uqh.zmn(build, fsVar.fkt.cyb);
        fs fsVar2 = this.zmn;
        mw mwVar = fsVar2.ev;
        if (mwVar != null && (bvsVar = fsVar2.uqh) != null) {
            mwVar.zmn(bvsVar.zmn());
        }
        this.zmn.uqh.zmn(new com.bytedance.sdk.openadsdk.core.iv.cyb() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.nps.1
            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public void zmn(boolean z, String str) {
                if (nps.this.zmn.dgt != z) {
                    nps.this.zmn.ev.zmn(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public void zmn() {
                nps.this.zmn.ev.fb();
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public void zmn(String str, JSONObject jSONObject) {
                if (nps.this.zmn == null || nps.this.zmn.ww == null) {
                    return;
                }
                nps.this.zmn.ww.zmn(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public boolean zmn(JSONObject jSONObject) {
                if (nps.this.zmn == null || nps.this.zmn.phc == null) {
                    return false;
                }
                return nps.this.zmn.phc.zmn(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public boolean fs(JSONObject jSONObject) {
                return com.bytedance.sdk.openadsdk.component.reward.fs.zmn(nps.this.zmn);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public void fs() {
                if (nps.this.zmn.fkt == null || nps.this.zmn.fkt.iv() == null) {
                    return;
                }
                nps.this.zmn.fkt.iv().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public void zmn(int i) {
                if (i != 1) {
                    if (i == 2) {
                        nps.this.zmn.phc.hgd();
                        return;
                    }
                    if (i == 3) {
                        nps.this.zmn.phc.zmn(nps.this.zmn.ww);
                        return;
                    } else if (i == 4) {
                        nps.this.zmn.phc.kw();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (nps.this.zmn.phc.hhw() || nps.this.zmn.phc.bvs()) {
                    return;
                }
                nps.this.zmn.ww.zmn(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public long zn() {
                return nps.this.zmn.phc.rt();
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public long fb() {
                return nps.this.zmn.phc.zmn();
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public int btk() {
                if (nps.this.zmn.uqh.zn()) {
                    return 4;
                }
                if (nps.this.zmn.uqh.fb()) {
                    return 5;
                }
                if (nps.this.zmn.phc.iv()) {
                    return 1;
                }
                if (nps.this.zmn.phc.hhw()) {
                    return 2;
                }
                nps.this.zmn.phc.bvs();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public void hhw() {
                nps.this.zmn.zak.zmn(nps.this.zmn.f3739io);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public void fs(int i) {
                nps.this.zmn.gn = i;
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public void zmn(int i, String str) {
                nps.this.zmn.phc.zmn(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
            public void zmn(int i, com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
                nps.this.zmn.fkt.zmn(i, rtVar);
            }
        });
        this.zmn.uqh.zmn(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.nps.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (nps.this.zmn == null || nps.this.zmn.fs == null || !nps.this.zmn.fs.xup()) {
                    return;
                }
                nps.this.zmn.ww.tf();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                boolean z = -1024 == i;
                nps.this.zmn.zmn(i, str, z ? 1002 : 1001);
                nps.this.zmn.rp.zmn();
                if (z) {
                    return;
                }
                if (!nps.this.zmn.fs.wir()) {
                    nps.this.zmn.yj.zmn(true);
                    nps.this.zmn.yj.btk();
                }
                nps.this.zmn.uqh.btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.nps.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        nps.this.zmn.f3739io.zmn(false, false, false, 90);
                    }
                });
                nps.this.zmn.fkt.rt();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                iqz iqzVar;
                if (!nps.this.zmn.fs.wir()) {
                    if (nps.this.zmn.uqh.bvs()) {
                        nps.this.zmn.f3739io.zmn(true);
                        nps.this.zmn.phc.fb(false);
                    } else {
                        nps.this.zmn.phc.fb(true);
                    }
                    nps.this.zmn.fkt.zmn(8);
                    nps.this.zmn.yj.zmn(true);
                    nps.this.zmn.yj.btk();
                    if (nps.this.zmn.uqh.bvs()) {
                        nps.this.zmn.uqh.fs().setBackgroundColor(-16777216);
                        nps.this.zmn.f3739io.zmn(nps.this.zmn.fkt.hhw());
                    } else if (nps.this.zmn.fs.mrt() != null && nps.this.zmn.f3739io.zmn()) {
                        nps.this.zmn.uqd = true;
                    }
                }
                nps.this.zmn.f3739io.nqi();
                if (iqz.zn(nps.this.zmn.fs) && (iqzVar = nps.this.zmn.fkt.cyb) != null) {
                    iqzVar.zn();
                }
                nps.this.zmn.fkt.rt();
            }
        });
        fs();
        if (this.zmn.fs.wir()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else if (com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.zmn.fs.skn())) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else if (iqz.zn(this.zmn.fs)) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.gravity = 17;
        this.zmn.fkt.hhw().addView(this.zmn.uqh.zmn(), layoutParams);
        if (!this.zmn.uqh.bvs()) {
            this.zmn.f3739io.zmn(false);
        }
        this.zmn.uqh.rt();
    }

    private void fs() {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        fs fsVar = this.zmn;
        Activity activity = fsVar.nu;
        nqi nqiVar = fsVar.fs;
        String str = fsVar.btk;
        com.bytedance.sdk.openadsdk.core.iv.iv ivVar = new com.bytedance.sdk.openadsdk.core.iv.iv(activity, nqiVar, str, oub.zmn(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.nps.3
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
            public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
                super.zmn(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        ivVar.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.nps.4
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                nps.this.zmn.ww.tf();
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        fs fsVar2 = this.zmn;
        if (fsVar2.rje && (zgVar = fsVar2.tdm) != null) {
            int i = zgVar.rc + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i);
                hashMap.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        ivVar.zmn(hashMap);
        fs fsVar3 = this.zmn;
        Activity activity2 = fsVar3.nu;
        nqi nqiVar2 = fsVar3.fs;
        String str2 = fsVar3.btk;
        com.bytedance.sdk.openadsdk.core.iv.bvs bvsVar = new com.bytedance.sdk.openadsdk.core.iv.bvs(activity2, nqiVar2, str2, oub.zmn(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.nps.5
            @Override // com.bytedance.sdk.openadsdk.core.zn.zmn, com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
            public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(nps.this.zmn.phc.mw()));
                if (nps.this.zmn.tdm != null) {
                    nps.this.zmn.tdm.zmn(hashMap2, f, f2);
                }
                zmn(hashMap2);
                super.zmn(view, f, f2, f3, f4, sparseArray, z);
                nps.this.zmn.phc.yof();
            }
        };
        bvsVar.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.nps.6
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i2) {
                nps.this.zmn.ww.tf();
            }
        });
        HashMap hashMap2 = new HashMap();
        hashMap2.put("click_scence", 1);
        bvsVar.zmn(hashMap2);
        this.zmn.uqh.zmn(ivVar, bvsVar);
    }

    public void zmn(nqi nqiVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.zmn.uqh;
        if (bvsVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.view.zn zmn = bvsVar.zmn();
            ViewParent parent = zmn.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(zmn);
            }
            this.zmn.fkt.hhw().addView(zmn);
            if (!this.zmn.uqh.bvs()) {
                this.zmn.f3739io.zmn(false);
            }
            this.zmn.uqh.zmn(nqiVar);
            fs();
        }
    }

    public boolean zmn() {
        return this.fs;
    }

    public void zmn(@NonNull fs fsVar) {
        this.zmn = fsVar;
    }
}
