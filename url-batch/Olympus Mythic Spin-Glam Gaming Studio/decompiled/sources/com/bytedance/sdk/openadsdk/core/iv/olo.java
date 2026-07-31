package com.bytedance.sdk.openadsdk.core.iv;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class olo extends com.bytedance.sdk.openadsdk.core.cn.fs.hhw implements View.OnClickListener {
    private boolean olo;

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/olo;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(h.u, view);
        safedk_olo_onClick_3295748a16a8b86c992f592c12046e3a(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw, com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw
    protected void zmn(boolean z) {
    }

    public olo(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str, com.bytedance.sdk.openadsdk.fb.nps npsVar, boolean z) {
        super(context, nqiVar, false, str, false, false, npsVar);
        this.olo = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z);
    }

    public void zmn(int i, int i2) {
        com.bytedance.sdk.openadsdk.core.cn.fs.zn znVar = this.fs;
        if (znVar != null) {
            znVar.fs(i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw
    protected void fs() {
        if (!this.btk || !kjb.fs(this.klz)) {
            this.fb = false;
        }
        super.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw
    protected void zn() {
        if (this.olo) {
            super.zn();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.olo = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        com.bytedance.sdk.openadsdk.core.cn.fs.zn znVar = this.fs;
        if (znVar != null) {
            znVar.btk(z);
        }
    }

    public void fb() {
        ImageView imageView = this.iv;
        if (imageView != null) {
            jy.zmn((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        ImageView imageView = this.bvs;
        if (imageView != null && imageView.getVisibility() == 0) {
            kw();
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw, android.view.View
    public void onWindowFocusChanged(boolean z) {
        ImageView imageView = this.bvs;
        if (imageView != null && imageView.getVisibility() == 0) {
            kw();
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    private void kgc() {
        jy.zmn((View) this.nps, 0);
        jy.zmn((View) this.zg, 0);
        jy.zmn((View) this.iv, 8);
    }

    private void kw() {
        nps();
        RelativeLayout relativeLayout = this.nps;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.zmn.mrt().iv(), this.zmn.mrt().zn(), this.zmn.mrt().fs(), this.zg, this.zmn);
            }
        }
        kgc();
    }

    public void safedk_olo_onClick_3295748a16a8b86c992f592c12046e3a(View p0) {
        View p02 = this.bvs;
        if (p02 != null && p02.getVisibility() == 0) {
            View p03 = this.nps;
            jy.btk(p03);
        }
        zn();
    }

    public void setShowAdInteractionView(boolean z) {
        com.bytedance.sdk.openadsdk.core.cn.fs.btk klz;
        com.bytedance.sdk.openadsdk.core.cn.fs.zn znVar = this.fs;
        if (znVar == null || (klz = znVar.klz()) == null) {
            return;
        }
        klz.zmn(z);
    }

    protected void btk() {
        nps();
        jy.zmn((View) this.nps, 0);
    }
}
