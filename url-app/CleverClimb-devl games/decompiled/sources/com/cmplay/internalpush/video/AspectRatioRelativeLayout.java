package com.cmplay.internalpush.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CrashUtils;

/* loaded from: classes.dex */
public class AspectRatioRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private static float f4320a = 1.7777778f;

    public AspectRatioRelativeLayout(Context context) {
        super(context);
    }

    public AspectRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setAspectRatio(float f) {
        if (f4320a != f) {
            f4320a = f;
            requestLayout();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (f4320a == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = measuredWidth;
        float f2 = measuredHeight;
        float f3 = (f4320a / (f / f2)) - 1.0f;
        if (Math.abs(f3) <= 0.01f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if ((mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) || (mode == 1073741824 && mode2 == 1073741824)) {
            if (f3 > 0.0f) {
                measuredHeight = (int) (f / f4320a);
            } else {
                measuredWidth = (int) (f2 * f4320a);
            }
        } else if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
            measuredHeight = (int) (f / f4320a);
        } else if (mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || mode != 0)) {
            return;
        } else {
            measuredWidth = (int) (f2 * f4320a);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CrashUtils.ErrorDialogData.SUPPRESSED), View.MeasureSpec.makeMeasureSpec(measuredHeight, CrashUtils.ErrorDialogData.SUPPRESSED));
    }
}
