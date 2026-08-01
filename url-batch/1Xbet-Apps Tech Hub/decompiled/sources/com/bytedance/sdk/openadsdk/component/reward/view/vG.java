package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.kj;
import com.bytedance.sdk.openadsdk.core.nativeexpress.yiw;
import com.bytedance.sdk.openadsdk.utils.Pj;
import org.json.JSONObject;

/* compiled from: RewardFullExpressVideoLayout.java */
/* loaded from: classes2.dex */
public class vG {
    private FullRewardExpressView Mxy;
    private final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs Wyp;
    Handler icD;
    com.com.bytedance.overseas.sdk.pvs.vG pvs;
    private boolean qh;
    private final Activity sUS;
    private final String so;
    private final cR yiw;
    boolean vG = false;
    boolean Jd = false;
    boolean NB = false;

    public vG(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.Wyp = pvsVar;
        this.sUS = pvsVar.od;
        this.yiw = pvsVar.icD;
        this.so = pvsVar.NB;
    }

    public void pvs(AdSlot adSlot) {
        if (this.NB) {
            return;
        }
        this.NB = true;
        this.Mxy = new FullRewardExpressView(this.Wyp, adSlot, this.so);
    }

    public FullRewardExpressView pvs() {
        return this.Mxy;
    }

    public FrameLayout icD() {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView == null) {
            return null;
        }
        FrameLayout videoFrameLayout = fullRewardExpressView.getVideoFrameLayout();
        if (this.Mxy.Ju()) {
            kj();
        }
        return videoFrameLayout;
    }

    public boolean vG() {
        return this.vG;
    }

    public void pvs(boolean z) {
        this.vG = z;
    }

    public boolean Jd() {
        return this.Jd;
    }

    public void icD(boolean z) {
        this.Jd = z;
    }

    public void pvs(yiw yiwVar, com.bytedance.sdk.openadsdk.core.nativeexpress.sUS sus) {
        cR cRVar;
        if (this.Mxy == null || (cRVar = this.yiw) == null) {
            return;
        }
        this.pvs = pvs(cRVar);
        yiwVar.pvs(this.Mxy);
        yiwVar.pvs(this.pvs);
        this.Mxy.setClickListener(yiwVar);
        sus.pvs((View) this.Mxy);
        sus.pvs(this.pvs);
        this.Mxy.setClickCreativeListener(sus);
    }

    private com.com.bytedance.overseas.sdk.pvs.vG pvs(cR cRVar) {
        if (cRVar.jhZ() == 4) {
            return com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this.sUS, cRVar, this.so);
        }
        return null;
    }

    public void pvs(kj kjVar) {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressVideoListenerProxy(kjVar);
    }

    public void pvs(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public Handler NB() {
        if (this.icD == null) {
            this.icD = new Handler(Looper.getMainLooper());
        }
        return this.icD;
    }

    public void sUS() {
        if (this.qh) {
            return;
        }
        this.qh = true;
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.qh();
        }
        Handler handler = this.icD;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void yiw() {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.Wyp();
        }
    }

    public boolean so() {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView == null) {
            return false;
        }
        return fullRewardExpressView.Ju();
    }

    public int Mxy() {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.getDynamicShowType();
        }
        return 0;
    }

    public JSONObject pvs(JSONObject jSONObject) {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.pvs(jSONObject, this.Wyp.icD);
        }
        return null;
    }

    public void Wyp() {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.so();
    }

    public void qh() {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.Mxy();
        this.Mxy.Wyp();
    }

    public void kj() {
        if (cR.NB(this.yiw) && this.yiw.Gp() == 3 && this.yiw.ae() == 0) {
            try {
                if (this.yiw.rcB() == 1) {
                    int icD = Pj.icD(mnm.pvs(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.Mxy.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = icD;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void pvs(int i, boolean z) {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.pvs(i, z);
        }
    }

    public void pvs(int i, String str) {
        FullRewardExpressView fullRewardExpressView = this.Mxy;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.icD(i, str);
        }
    }
}
