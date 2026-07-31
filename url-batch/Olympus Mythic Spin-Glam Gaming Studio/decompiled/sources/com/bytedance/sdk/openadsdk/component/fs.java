package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.iv.bvs;
import com.bytedance.sdk.openadsdk.core.iv.iv;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.fs;
import com.ironsource.X3;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class fs extends zn {
    private boolean cn;
    private final com.bytedance.sdk.openadsdk.component.hhw.fs mw;
    private com.bytedance.sdk.openadsdk.component.bvs.fs rt;

    public fs(Activity activity, nqi nqiVar, FrameLayout frameLayout, zmn zmnVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar2, com.bytedance.sdk.openadsdk.component.hhw.fs fsVar) {
        super(activity, nqiVar, frameLayout, zmnVar, i, z, zmnVar2);
        this.mw = fsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zn
    public void zmn(ViewGroup viewGroup) {
        Pair<Float, Float> zmn = com.bytedance.sdk.openadsdk.core.iv.fs.zmn.zmn(this.zmn.getWindow(), this.nps);
        com.bytedance.sdk.openadsdk.component.bvs.fs fsVar = new com.bytedance.sdk.openadsdk.component.bvs.fs(this.zmn, this.fs, new AdSlot.Builder().setCodeId(String.valueOf(this.fs.qvo())).setExpressViewAcceptedSize(((Float) zmn.first).floatValue(), ((Float) zmn.second).floatValue()).build(), "open_ad", this.btk, this.mw, this.klz);
        this.rt = fsVar;
        fsVar.setTopListener(this.btk);
        this.rt.setExpressVideoListenerProxy(this.btk);
        this.rt.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.fs.1
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
                fs.this.btk.fb();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                if (fs.this.rt.nqi()) {
                    fs.this.cn = true;
                    fs fsVar2 = fs.this;
                    fs.super.zmn((ViewGroup) fsVar2.fb);
                    fs.super.zmn();
                    fs.super.fs();
                    return;
                }
                if (fs.this.fs.yj()) {
                    fs.this.btk.zn();
                    return;
                }
                fs fsVar3 = fs.this;
                if (fsVar3.zn) {
                    if (fsVar3.zmn(fsVar3.rt.getVideoFrameLayout())) {
                        fs.this.rt.setVideoManager(fs.this.nps());
                        fs.this.btk.zn();
                        return;
                    } else {
                        fs.this.btk.fb();
                        return;
                    }
                }
                fsVar3.btk.zn();
            }
        });
        this.fs.iqz(1);
        this.fb.addView(this.rt, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.zn
    public void zmn() {
        iv zmn = com.bytedance.sdk.openadsdk.component.zmn.fs.zmn(this.fs, this.zmn, this.klz, this.rt);
        zmn.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.component.fs.2
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                fs.this.btk.btk();
            }
        });
        this.rt.setClickListener(zmn);
        bvs fs = com.bytedance.sdk.openadsdk.component.zmn.fs.fs(this.fs, this.zmn, this.klz, this.rt);
        this.rt.setClickCreativeListener(fs);
        fs.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.component.fs.3
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                fs.this.btk.btk();
            }
        });
        this.rt.setBackupListener(new com.bytedance.sdk.component.adexpress.fs.zn() { // from class: com.bytedance.sdk.openadsdk.component.fs.4
            @Override // com.bytedance.sdk.component.adexpress.fs.zn
            public boolean zmn(ViewGroup viewGroup, int i) {
                StringBuilder sb = new StringBuilder("isUseBackup() called with: view = [");
                sb.append(viewGroup);
                sb.append("], errCode = [");
                sb.append(i);
                sb.append(X3.j.e);
                try {
                    ((phc) viewGroup).doe();
                    new com.bytedance.sdk.openadsdk.component.bvs.zmn(fs.this.zmn).zmn((phc) fs.this.rt);
                    return true;
                } catch (Exception e) {
                    Log.e("AppOpenAdExpressManager", "", e);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.zn
    public void fs() {
        this.rt.phc();
    }

    @Override // com.bytedance.sdk.openadsdk.component.zn
    public void zmn(int i, boolean z) {
        super.zmn(i, z);
        com.bytedance.sdk.openadsdk.component.bvs.fs fsVar = this.rt;
        if (fsVar != null) {
            fsVar.setTime(String.valueOf(i), (int) (this.klz.zn() / 1000), i, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.zn
    public void zn() {
        super.zn();
        com.bytedance.sdk.openadsdk.component.bvs.fs fsVar = this.rt;
        if (fsVar != null) {
            fsVar.mw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.zn
    public int fb() {
        return this.rt.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.zn
    public JSONObject zmn(JSONObject jSONObject) {
        return this.rt.zmn(jSONObject, this.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.component.zn
    public void btk() {
        com.bytedance.sdk.openadsdk.component.bvs.fs fsVar = this.rt;
        if (fsVar != null) {
            fsVar.kw();
        }
    }

    public void zmn(long j, long j2) {
        com.bytedance.sdk.openadsdk.component.bvs.fs fsVar = this.rt;
        if (fsVar != null) {
            fsVar.zmn(j, j2);
        }
    }
}
