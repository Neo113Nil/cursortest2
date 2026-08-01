package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.view.OpenScreenAdBackupView;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView;
import com.bytedance.sdk.openadsdk.core.icD.icD;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import org.json.JSONObject;

/* compiled from: AppOpenAdExpressManager.java */
/* loaded from: classes2.dex */
public class icD extends vG {
    private PAGAppOpenAdExpressView Wyp;
    private boolean qh;

    public icD(Activity activity, cR cRVar, FrameLayout frameLayout, pvs pvsVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.so.pvs pvsVar2) {
        super(activity, cRVar, frameLayout, pvsVar, i, z, pvsVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.vG
    public void pvs(ViewGroup viewGroup) {
        cR.pvs gSd;
        Pair<Float, Float> pvs = com.bytedance.sdk.openadsdk.core.nativeexpress.pvs.pvs.pvs(this.pvs.getWindow(), this.yiw);
        AdSlot build = new AdSlot.Builder().setCodeId(String.valueOf(this.icD.yTz())).setExpressViewAcceptedSize(((Float) pvs.first).floatValue(), ((Float) pvs.second).floatValue()).build();
        if (Ju.Jd() && (gSd = this.icD.gSd()) != null) {
            Object[] objArr = new Object[2];
            String str = "tryDynamicNative: id is " + gSd.NB();
        }
        PAGAppOpenAdExpressView pAGAppOpenAdExpressView = new PAGAppOpenAdExpressView(this.pvs, this.icD, build, "open_ad");
        this.Wyp = pAGAppOpenAdExpressView;
        pAGAppOpenAdExpressView.setTopListener(this.NB);
        this.Wyp.setExpressVideoListenerProxy(this.NB);
        this.Wyp.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.icD.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str2, int i) {
                icD.this.NB.Jd();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                if (icD.this.Wyp.Ju()) {
                    icD.this.qh = true;
                    icD icd = icD.this;
                    icD.super.pvs((ViewGroup) icd.Jd);
                    icD.super.pvs();
                    icD.super.icD();
                    return;
                }
                if (icD.this.icD.OUT()) {
                    icD.this.NB.vG();
                    return;
                }
                if (icD.this.vG) {
                    icD icd2 = icD.this;
                    if (icd2.pvs(icd2.Wyp.getVideoFrameLayout())) {
                        icD.this.NB.vG();
                        return;
                    } else {
                        icD.this.NB.Jd();
                        return;
                    }
                }
                icD.this.NB.vG();
            }
        });
        this.icD.so(1);
        this.Jd.addView(this.Wyp, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.vG
    public void pvs() {
        this.Wyp.setClickListener(com.bytedance.sdk.openadsdk.component.pvs.icD.pvs(this.icD, this.pvs, this.Mxy, this.Wyp));
        com.bytedance.sdk.openadsdk.core.nativeexpress.sUS icD = com.bytedance.sdk.openadsdk.component.pvs.icD.icD(this.icD, this.pvs, this.Mxy, this.Wyp);
        this.Wyp.setClickCreativeListener(icD);
        icD.pvs(new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.component.icD.2
            @Override // com.bytedance.sdk.openadsdk.core.icD.icD.pvs
            public void pvs(View view, int i) {
                icD.this.NB.NB();
            }
        });
        this.Wyp.setBackupListener(new com.bytedance.sdk.component.adexpress.icD.vG() { // from class: com.bytedance.sdk.openadsdk.component.icD.3
            @Override // com.bytedance.sdk.component.adexpress.icD.vG
            public boolean pvs(ViewGroup viewGroup, int i) {
                Object[] objArr = new Object[2];
                String str = "isUseBackup() called with: view = [" + viewGroup + "], errCode = [" + i + "]";
                try {
                    ((NativeExpressView) viewGroup).kj();
                    new OpenScreenAdBackupView(icD.this.pvs).pvs((NativeExpressView) icD.this.Wyp);
                    return true;
                } catch (Exception e) {
                    Log.e("AppOpenAdExpressManager", "", e);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.vG
    public void icD() {
        this.Wyp.Mxy();
    }

    @Override // com.bytedance.sdk.openadsdk.component.vG
    public void pvs(int i, int i2, boolean z) {
        if (this.qh) {
            super.pvs(i, i2, z);
        } else {
            this.Wyp.pvs(String.valueOf(i), i2, 0, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.vG
    public void vG() {
        super.vG();
        PAGAppOpenAdExpressView pAGAppOpenAdExpressView = this.Wyp;
        if (pAGAppOpenAdExpressView != null) {
            pAGAppOpenAdExpressView.qh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.vG
    public int Jd() {
        return this.Wyp.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.vG
    public JSONObject pvs(JSONObject jSONObject) {
        return this.Wyp.pvs(jSONObject, this.icD);
    }
}
