package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.iv.cyb;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class bvs {
    private zn bvs;
    Handler fs;
    private final Activity hhw;

    @NonNull
    private com.bytedance.sdk.openadsdk.component.reward.zmn.fs iv;
    private final nqi nps;
    private boolean rc;
    private final String zg;
    com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn zmn;
    boolean zn = false;
    boolean fb = false;
    boolean btk = false;

    public bvs(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.iv = fsVar;
        this.hhw = fsVar.nu;
        this.nps = fsVar.fs;
        this.zg = fsVar.btk;
    }

    public void zmn(AdSlot adSlot, iqz iqzVar) {
        if (this.btk) {
            return;
        }
        this.btk = true;
        zn znVar = new zn(this.iv, adSlot, this.zg);
        this.bvs = znVar;
        if (iqzVar != null) {
            iqzVar.zmn(znVar, znVar.getVideoFrameLayout());
        }
    }

    public zn zmn() {
        return this.bvs;
    }

    public FrameLayout fs() {
        zn znVar = this.bvs;
        if (znVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = znVar.getVideoFrameLayout();
        if (this.bvs.nqi()) {
            cn();
        }
        return videoFrameLayout;
    }

    public boolean zn() {
        return this.zn;
    }

    public void zmn(boolean z) {
        this.zn = z;
    }

    public boolean fb() {
        return this.fb;
    }

    public void fs(boolean z) {
        this.fb = z;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.iv.iv ivVar, com.bytedance.sdk.openadsdk.core.iv.bvs bvsVar) {
        nqi nqiVar;
        if (this.bvs == null || (nqiVar = this.nps) == null) {
            return;
        }
        this.zmn = fs(nqiVar);
        ivVar.fs(this.bvs);
        ivVar.zmn(this.zmn);
        this.bvs.setClickListener(ivVar);
        bvsVar.fs(this.bvs);
        bvsVar.zmn(this.zmn);
        this.bvs.setClickCreativeListener(bvsVar);
    }

    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn fs(nqi nqiVar) {
        if (nqiVar.va() == 4) {
            return com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.hhw, this.zg);
        }
        return null;
    }

    public void zmn(cyb cybVar) {
        zn znVar = this.bvs;
        if (znVar == null) {
            return;
        }
        znVar.setExpressVideoListenerProxy(cybVar);
    }

    public void zmn(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        if (this.bvs == null) {
            return;
        }
        this.bvs.setExpressInteractionListener(new PAGRewardFullExpressAdListenerProxy(pAGExpressAdWrapperListener));
    }

    public Handler btk() {
        if (this.fs == null) {
            this.fs = new Handler(Looper.getMainLooper());
        }
        return this.fs;
    }

    public void hhw() {
        if (this.rc) {
            return;
        }
        this.rc = true;
        zn znVar = this.bvs;
        if (znVar != null) {
            znVar.mw();
        }
        Handler handler = this.fs;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void nps() {
        zn znVar = this.bvs;
        if (znVar != null) {
            znVar.rc();
        }
    }

    public void zg() {
        zn znVar = this.bvs;
        if (znVar != null) {
            znVar.klz();
        }
    }

    public boolean bvs() {
        zn znVar = this.bvs;
        if (znVar == null) {
            return false;
        }
        return znVar.nqi();
    }

    public boolean iv() {
        zn znVar = this.bvs;
        return znVar != null && znVar.bjh();
    }

    public int rc() {
        zn znVar = this.bvs;
        if (znVar != null) {
            return znVar.getDynamicShowType();
        }
        return 0;
    }

    public boolean klz() {
        zn znVar = this.bvs;
        if (znVar != null) {
            return znVar.am instanceof com.bytedance.sdk.component.adexpress.btk.zmn;
        }
        return false;
    }

    public JSONObject zmn(JSONObject jSONObject) {
        zn znVar = this.bvs;
        if (znVar != null) {
            return znVar.zmn(jSONObject, this.iv.fs);
        }
        return null;
    }

    public void mw() {
        zn znVar = this.bvs;
        if (znVar == null) {
            return;
        }
        znVar.kw();
    }

    public void rt() {
        zn znVar = this.bvs;
        if (znVar == null) {
            return;
        }
        znVar.phc();
        this.bvs.rc();
    }

    public void cn() {
        if (nqi.btk(this.nps) && this.nps.nlz() == 3 && this.nps.es() == 0) {
            try {
                if (this.nps.ol() == 1) {
                    int fs = jy.fs(kgc.zmn(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.bvs.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = fs;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void zmn(int i, boolean z) {
        zn znVar = this.bvs;
        if (znVar != null) {
            znVar.zmn(i, z, false);
        }
    }

    public void zmn(int i, String str) {
        zn znVar = this.bvs;
        if (znVar != null) {
            znVar.fs(i, str);
        }
    }

    public void zmn(nqi nqiVar) {
        zn znVar = this.bvs;
        if (znVar != null) {
            znVar.zmn(nqiVar, nqiVar.utx(), nqiVar.btk(), this.iv.dgt, !r1.rje);
        }
    }

    public void zmn(@NonNull com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.iv = fsVar;
    }
}
