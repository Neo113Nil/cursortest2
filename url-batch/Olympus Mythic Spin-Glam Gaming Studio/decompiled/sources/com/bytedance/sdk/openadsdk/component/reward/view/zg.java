package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class zg extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    private final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zg(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        super(fsVar.oub);
        this.zmn = fsVar;
        if (fsVar.tdm != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar) {
        RFEndCardBackUpLayout nps;
        fsVar.zmn(this);
        if (this.zmn.zmn != 1 && (nps = fsVar.nps()) != null) {
            addView(nps, new FrameLayout.LayoutParams(-1, -1));
        }
        zmn(fsVar.zg(), this);
        zmn(fsVar.bvs(), this);
    }

    private void zmn(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
