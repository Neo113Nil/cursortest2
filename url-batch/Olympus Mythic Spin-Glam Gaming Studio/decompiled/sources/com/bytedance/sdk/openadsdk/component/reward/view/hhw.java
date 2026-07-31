package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes14.dex */
public class hhw extends com.bytedance.sdk.openadsdk.core.hhw.fb {
    private float zmn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public hhw(Context context) {
        this(context, null);
    }

    public hhw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = getLayoutParams().width;
        int i4 = getLayoutParams().height;
        float f = this.zmn;
        if (f > 0.0f) {
            if (i3 == -2) {
                size = (int) (size2 * f);
                mode = 1073741824;
            } else if (i4 == -2) {
                size2 = (int) (size / f);
                mode2 = 1073741824;
            }
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f) {
        this.zmn = f;
    }
}
