package com.bytedance.sdk.openadsdk.component.reward.zn.fs;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.zmn.cn;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class zn implements com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn {
    private ViewGroup btk;
    private PAGLogoView bvs;
    private ViewGroup fb;
    private com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs fs;
    private AtomicBoolean hhw = new AtomicBoolean(false);
    private AtomicBoolean iv = new AtomicBoolean(false);
    private cn nps;
    private com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zmn zg;
    private Activity zmn;
    private nqi zn;

    public zn(Activity activity, nqi nqiVar, ViewGroup viewGroup, ViewGroup viewGroup2, com.bytedance.sdk.openadsdk.core.iv.zmn.zmn zmnVar) {
        this.zmn = activity;
        this.zn = nqiVar;
        this.btk = viewGroup2;
        this.fb = viewGroup;
        this.fs = new com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs(this.zmn, this.zn);
        this.nps = (cn) zmnVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn
    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fb fbVar) {
        if (fbVar == null || this.fs == null) {
            return;
        }
        System.currentTimeMillis();
        this.hhw.set(true);
        this.fs.zmn(fbVar);
        if (fbVar.fs() == 1) {
            fs(fbVar);
            return;
        }
        if (fbVar.fs() == 2) {
            this.iv.set(true);
            if (this.fs.fb()) {
                this.fs.btk();
                if (this.fs.hhw()) {
                    zmn();
                }
            } else {
                fs(fbVar);
                this.fs.btk();
            }
            if (this.fs.getParent() != null) {
                ((ViewGroup) this.fs.getParent()).removeView(this.fs);
            }
            this.fb.addView(this.fs, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    private void fs(com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fb fbVar) {
        fs(fbVar.bvs());
        this.fs.zn();
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zmn zmnVar = new com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zmn(fbVar);
        this.zg = zmnVar;
        this.nps.zmn(zmnVar);
    }

    private void fs(final String str) {
        this.bvs = PAGLogoView.createPAGLogoViewByMaterial(this.zmn, this.zn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        layoutParams.leftMargin = jy.fs(this.zmn, 16.0f);
        layoutParams.bottomMargin = jy.fs(this.zmn, 21.0f);
        if (this.bvs.getParent() != null) {
            ((ViewGroup) this.bvs.getParent()).removeView(this.bvs);
        }
        this.btk.addView(this.bvs, layoutParams);
        this.bvs.bringToFront();
        this.bvs.setVisibility(8);
        this.bvs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.zn.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zn/fs/zn$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_zn$1_onClick_852843d3e7541ca4b07afeafa4e4842f(view);
            }

            public void safedk_zn$1_onClick_852843d3e7541ca4b07afeafa4e4842f(View p0) {
                try {
                    TTWebsiteActivity.zmn(zn.this.zmn, zn.this.zn, str);
                } catch (Throwable th) {
                    iqz.zn("UnifyLandingPage", th.getMessage());
                }
            }
        });
    }

    public void zmn() {
        if (this.bvs == null || !this.iv.get()) {
            return;
        }
        this.bvs.setVisibility(0);
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.zmn.btk btkVar) {
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs fsVar = this.fs;
        if (fsVar != null) {
            fsVar.setLoadStatusListener(btkVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn
    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs fsVar = this.fs;
        if (fsVar != null) {
            fsVar.nps();
            this.hhw.set(false);
        }
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zmn zmnVar = this.zg;
        if (zmnVar != null) {
            zmnVar.zmn(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn
    public void zmn(String str, boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zmn zmnVar = this.zg;
        if (zmnVar != null) {
            zmnVar.zmn(z);
        }
    }

    public void fs() {
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs fsVar = this.fs;
        if (fsVar != null) {
            fsVar.zg();
        }
    }

    public void zn() {
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs fsVar = this.fs;
        if (fsVar != null) {
            fsVar.bvs();
        }
    }
}
