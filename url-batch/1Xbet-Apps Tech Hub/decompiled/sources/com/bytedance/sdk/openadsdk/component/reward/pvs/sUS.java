package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: RewardFullExpressManager.java */
/* loaded from: classes2.dex */
public class sUS {
    private final pvs pvs;

    public sUS(pvs pvsVar) {
        this.pvs = pvsVar;
    }

    public void pvs(float[] fArr, final com.bytedance.sdk.openadsdk.core.video.vG.icD icd, final com.bytedance.sdk.openadsdk.component.reward.icD.icD icd2) {
        FrameLayout.LayoutParams layoutParams;
        Arrays.toString(fArr);
        this.pvs.dX.pvs(new AdSlot.Builder().setCodeId(String.valueOf(this.pvs.icD.yTz())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build());
        if (this.pvs.cRf != null && this.pvs.dX != null) {
            this.pvs.cRf.pvs(this.pvs.dX.pvs());
        }
        this.pvs.dX.pvs(new com.bytedance.sdk.openadsdk.core.nativeexpress.kj() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.sUS.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.kj
            public void pvs(boolean z) {
                if (sUS.this.pvs.ea != z) {
                    sUS.this.pvs.cRf.NB();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.kj
            public void pvs() {
                sUS.this.pvs.cRf.Jd();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.kj
            public void icD() {
                if (sUS.this.pvs.gSd == null || sUS.this.pvs.gSd.Wyp() == null) {
                    return;
                }
                sUS.this.pvs.gSd.Wyp().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.kj
            public void pvs(int i) {
                if (i != 1) {
                    if (i == 2) {
                        sUS.this.pvs.ny.dX();
                        return;
                    }
                    if (i == 3) {
                        sUS.this.pvs.ny.pvs(icd);
                        return;
                    } else if (i == 4) {
                        sUS.this.pvs.ny.kj();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (sUS.this.pvs.ny.icD() || sUS.this.pvs.ny.Jd()) {
                    return;
                }
                icd.pvs(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.kj
            public long vG() {
                return sUS.this.pvs.ny.so();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.kj
            public int Jd() {
                if (sUS.this.pvs.dX.vG()) {
                    return 4;
                }
                if (sUS.this.pvs.dX.Jd()) {
                    return 5;
                }
                if (sUS.this.pvs.ny.NB()) {
                    return 1;
                }
                if (sUS.this.pvs.ny.icD()) {
                    return 2;
                }
                sUS.this.pvs.ny.Jd();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.kj
            public void NB() {
                sUS.this.pvs.gA.pvs(icd2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.kj
            public void icD(int i) {
                sUS.this.pvs.CjQ = i;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.kj
            public void pvs(int i, String str) {
                sUS.this.pvs.ny.pvs(i, str);
            }
        });
        this.pvs.dX.pvs(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.sUS.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (sUS.this.pvs == null || sUS.this.pvs.icD == null || !sUS.this.pvs.icD.Mnp()) {
                    return;
                }
                icd.c_();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                if (!sUS.this.pvs.icD.OBt()) {
                    sUS.this.pvs.dx.pvs(true);
                    sUS.this.pvs.dx.NB();
                }
                sUS.this.pvs.dX.NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.sUS.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        icd2.pvs(false, false, false, 90);
                    }
                });
                sUS.this.pvs.gSd.Ju();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                if (rCZ.qh(sUS.this.pvs.icD)) {
                    return;
                }
                if (!sUS.this.pvs.icD.OBt()) {
                    if (!sUS.this.pvs.dX.so()) {
                        sUS.this.pvs.ny.Jd(true);
                    } else {
                        icd2.pvs(true);
                        sUS.this.pvs.ny.Jd(false);
                    }
                    sUS.this.pvs.gSd.icD(8);
                    sUS.this.pvs.dx.pvs(true);
                    sUS.this.pvs.dx.NB();
                    if (sUS.this.pvs.dX.so()) {
                        sUS.this.pvs.dX.icD().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        icd2.pvs(sUS.this.pvs.gSd.sUS());
                    } else if (sUS.this.pvs.icD.od() != null && icd2.pvs()) {
                        sUS.this.pvs.BSi = true;
                    }
                }
                icd2.CvL();
                if (icd2 instanceof com.bytedance.sdk.openadsdk.component.reward.icD.NB) {
                    com.bytedance.sdk.openadsdk.component.reward.icD.NB.pvs(sUS.this.pvs.icD, sUS.this.pvs.dX.so(), sUS.this.pvs.NB);
                    if (!sUS.this.pvs.dX.so()) {
                        sUS.this.pvs.OhP.sUS();
                    }
                }
                sUS.this.pvs.gSd.Ju();
            }
        });
        com.bytedance.sdk.openadsdk.core.nativeexpress.yiw yiwVar = new com.bytedance.sdk.openadsdk.core.nativeexpress.yiw(this.pvs.od, this.pvs.icD, this.pvs.NB, jlb.pvs(this.pvs.NB)) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.sUS.3
            @Override // com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
            public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
                super.pvs(view, f, f2, f3, f4, sparseArray, z);
                icd.c_();
            }
        };
        HashMap hashMap = new HashMap();
        if (rCZ.qh(this.pvs.icD)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        if (this.pvs.Ayu && this.pvs.elv != null) {
            hashMap.put("ad_show_order", Integer.valueOf(this.pvs.elv.Mxy + 1));
        }
        yiwVar.pvs(hashMap);
        com.bytedance.sdk.openadsdk.core.nativeexpress.sUS sus = new com.bytedance.sdk.openadsdk.core.nativeexpress.sUS(this.pvs.od, this.pvs.icD, this.pvs.NB, jlb.pvs(this.pvs.NB)) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.sUS.4
            @Override // com.bytedance.sdk.openadsdk.core.icD.pvs, com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
            public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(sUS.this.pvs.ny.yiw()));
                pvs(hashMap2);
                super.pvs(view, f, f2, f3, f4, sparseArray, z);
                if (pvs(view, z)) {
                    icd.c_();
                }
            }
        };
        HashMap hashMap2 = new HashMap();
        if (rCZ.qh(this.pvs.icD)) {
            hashMap2.put("click_scence", 3);
        } else {
            hashMap2.put("click_scence", 1);
        }
        sus.pvs(hashMap2);
        this.pvs.dX.pvs(yiwVar, sus);
        if (this.pvs.icD.OBt()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.gravity = 17;
        this.pvs.gSd.sUS().addView(this.pvs.dX.pvs(), layoutParams);
        if (!this.pvs.dX.so()) {
            icd2.pvs(false);
        }
        this.pvs.dX.qh();
    }
}
