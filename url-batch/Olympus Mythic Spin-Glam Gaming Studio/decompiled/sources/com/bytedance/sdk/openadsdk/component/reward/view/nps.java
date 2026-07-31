package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.component.reward.zmn.kw;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class nps {
    private boolean btk;
    private kw fb;

    @Nullable
    private RFEndCardBackUpLayout fs;
    private final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn;
    private boolean zn;

    public nps(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.zmn = fsVar;
    }

    public void zmn() {
        if (this.zn) {
            return;
        }
        this.zn = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.zmn.hgd.findViewById(olo.tev);
        this.fs = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.zmn);
        }
        if (this.zmn.fs.ch()) {
            this.fb = new kw(this.zmn);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.zn.btk btkVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.fs;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        jy.zmn(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.nps.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/nps$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_nps$1_onClick_442ad4e6dec60724d2d2a280f34525d3(view);
            }

            public void safedk_nps$1_onClick_442ad4e6dec60724d2d2a280f34525d3(View p0) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        kw kwVar = this.fb;
        if (kwVar != null) {
            kwVar.zmn(btkVar);
        }
    }

    public void fs() {
        this.btk = true;
        jy.zmn((View) this.fs, 0);
    }

    public boolean zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.olo oloVar) {
        this.btk = true;
        kw kwVar = this.fb;
        if (kwVar == null || !kwVar.zmn(oloVar)) {
            return false;
        }
        jy.zmn((View) this.fs, 0);
        return true;
    }

    public void zn() {
        kw kwVar = this.fb;
        if (kwVar != null) {
            kwVar.zmn();
        }
    }

    public void fb() {
        kw kwVar = this.fb;
        if (kwVar != null) {
            kwVar.fs();
        }
    }

    public void zmn(int i) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.fs;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i);
    }

    public boolean btk() {
        return this.btk;
    }
}
