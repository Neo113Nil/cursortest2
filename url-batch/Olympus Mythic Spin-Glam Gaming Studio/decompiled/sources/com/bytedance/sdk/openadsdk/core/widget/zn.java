package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class zn extends com.bytedance.sdk.openadsdk.core.hhw.fb {
    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zn(Context context) {
        super(context);
        zmn();
    }

    private void zmn() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.olo.ba);
    }

    public void zmn(int i, nqi nqiVar) {
        if (nqiVar.ch() || (nqiVar.xup() && nqiVar.nqi())) {
            jy.zmn((View) this, 0);
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn((int) jy.zmn(getContext(), i, true), this, nqiVar);
        }
    }
}
