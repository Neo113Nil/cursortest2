package com.bytedance.sdk.openadsdk.zmn.fs.zmn;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.iv.iqz;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw.btk;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.zmn.fs.zg;

/* loaded from: classes3.dex */
public class zn extends zg {
    protected AdSlot bvs;
    protected phc iv;
    private boolean klz;
    protected String rc;
    protected final Context zg;

    public zn(@NonNull Context context, nqi nqiVar, AdSlot adSlot) {
        super(context, nqiVar, 5, true);
        this.rc = "embeded_ad";
        this.klz = false;
        this.fs.iqz(1);
        this.fb.zmn(this);
        this.zg = context;
        this.bvs = adSlot;
        zmn();
        fs();
    }

    protected void zmn() {
        this.iv = new phc(this.zg, this.fs, this.bvs, this.rc);
        zn();
    }

    private void fs() {
        phc phcVar = this.iv;
        if (phcVar != null) {
            phcVar.setBackupListener(new com.bytedance.sdk.component.adexpress.fs.zn() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn.1
                @Override // com.bytedance.sdk.component.adexpress.fs.zn
                public boolean zmn(ViewGroup viewGroup, int i) {
                    zmn zmnVar = new zmn(zn.this.iv.getContext());
                    zmnVar.setExtraFuncationHelper(((zg) zn.this).fb);
                    zmnVar.zmn(zn.this.iv);
                    return true;
                }
            });
        }
    }

    protected void zn() {
        phc phcVar = this.iv;
        if (phcVar != null) {
            phcVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn.2
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
                public void onRenderFail(View view, String str, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (zn.this.iv.nqi()) {
                        zn znVar = zn.this;
                        Context context = znVar.zg;
                        nqi nqiVar = ((zg) znVar).fs;
                        zn znVar2 = zn.this;
                        com.bytedance.sdk.openadsdk.zmn.fs.fs fsVar = new com.bytedance.sdk.openadsdk.zmn.fs.fs(context, nqiVar, 5, znVar2.bvs, ((zg) znVar2).fb, ((zg) zn.this).zmn);
                        zn znVar3 = zn.this;
                        if (znVar3 instanceof fs) {
                            fsVar.zmn(((iqz) znVar3.fb()).getVideoAdListener());
                        }
                        ((zg) zn.this).fb.zmn((com.bytedance.sdk.openadsdk.core.zn.zmn) zn.this.iv.getClickCreativeListener());
                        PAGMediaView bvs = ((zg) zn.this).fb.bvs();
                        if (bvs == null) {
                            bvs = new PAGMediaView(zn.this.zg);
                        }
                        zn.this.iv.addView(bvs);
                        return;
                    }
                    zn.this.zmn(f, f2);
                    if (zn.this.klz) {
                        zn.this.iv.kw();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(float f, float f2) {
        phc phcVar = this.iv;
        if (phcVar != null && btk.zmn(phcVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.iv.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.iv.setLayoutParams(layoutParams);
            return;
        }
        int fs = jy.fs(this.zg, f);
        int fs2 = jy.fs(this.zg, f2);
        ViewGroup.LayoutParams layoutParams2 = this.iv.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(fs, fs2);
        } else {
            layoutParams2.width = fs;
            layoutParams2.height = fs2;
        }
        this.iv.setLayoutParams(layoutParams2);
    }

    public phc fb() {
        return this.iv;
    }

    public void zmn(boolean z) {
        this.klz = z;
    }

    public void btk() {
        phc phcVar = this.iv;
        if (phcVar != null) {
            phcVar.phc();
        }
    }
}
