package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class ExpressVideoView extends NativeVideoTsView implements View.OnClickListener {
    private boolean mnm;

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    protected void pvs(boolean z) {
    }

    public ExpressVideoView(Context context, cR cRVar, String str, com.bytedance.sdk.openadsdk.icD.yiw yiwVar) {
        super(context, cRVar, false, str, false, false, yiwVar);
        this.mnm = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    protected void icD() {
        if (!this.NB || !vA.icD(this.kj)) {
            this.Jd = false;
        }
        super.icD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    protected void vG() {
        if (this.mnm) {
            super.vG();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.mnm = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        if (this.icD != null) {
            this.icD.NB(z);
        }
    }

    public void Jd() {
        if (this.Wyp != null) {
            Pj.pvs((View) this.Wyp, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        if (this.Mxy != null && this.Mxy.getVisibility() == 0) {
            cR();
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (this.Mxy != null && this.Mxy.getVisibility() == 0) {
            cR();
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    private void vA() {
        Pj.pvs((View) this.yiw, 0);
        Pj.pvs((View) this.so, 0);
        Pj.pvs((View) this.Wyp, 8);
    }

    private void cR() {
        yiw();
        if (this.yiw != null) {
            if (this.yiw.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.pvs.od().Wyp(), this.pvs.od().vG(), this.pvs.od().icD(), this.so, this.pvs);
            }
        }
        vA();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.Mxy != null && this.Mxy.getVisibility() == 0) {
            Pj.NB(this.yiw);
        }
        vG();
    }

    public void setShowAdInteractionView(boolean z) {
        com.bykv.vk.openvk.component.video.api.Jd.icD Ju;
        if (this.icD == null || (Ju = this.icD.Ju()) == null) {
            return;
        }
        Ju.pvs(z);
    }

    protected void NB() {
        yiw();
        Pj.pvs((View) this.yiw, 0);
    }
}
