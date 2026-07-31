package com.bytedance.sdk.openadsdk.component.bvs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.model.cyb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class zmn extends com.bytedance.sdk.openadsdk.core.iv.zmn {
    private phc zmn;

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn, com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zmn(@NonNull Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn
    protected void zmn(View view, int i, cyb cybVar) {
        phc phcVar = this.zmn;
        if (phcVar != null) {
            phcVar.zmn(view, i, cybVar);
        }
    }

    public void zmn(phc phcVar) {
        this.zmn = phcVar;
        phcVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
