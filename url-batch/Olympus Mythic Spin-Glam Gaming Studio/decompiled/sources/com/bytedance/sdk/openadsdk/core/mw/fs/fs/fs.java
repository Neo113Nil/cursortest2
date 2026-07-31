package com.bytedance.sdk.openadsdk.core.mw.fs.fs;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.fs.hhw;
import com.bytedance.adsdk.ugeno.fb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes14.dex */
public class fs extends hhw {
    private fb zmn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public fs(Context context) {
        super(context);
    }

    public void zmn(fb fbVar) {
        this.zmn = fbVar;
    }

    @Override // com.bytedance.adsdk.fs.hhw, android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.nps();
        }
    }

    @Override // com.bytedance.adsdk.fs.hhw, android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.zg();
        }
    }
}
