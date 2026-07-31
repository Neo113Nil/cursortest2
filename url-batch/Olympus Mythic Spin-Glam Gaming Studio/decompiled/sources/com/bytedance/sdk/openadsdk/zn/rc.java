package com.bytedance.sdk.openadsdk.zn;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes12.dex */
public class rc extends View {
    private final int zmn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public rc(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    public rc(Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.zmn = jy.fs(getContext(), 0.66f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.zmn);
    }
}
