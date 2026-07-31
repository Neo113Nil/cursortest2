package com.bytedance.sdk.openadsdk.zn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class zmn extends com.bytedance.sdk.openadsdk.core.hhw.zg {
    private int fb;
    private float fs;
    private Paint zmn;
    private boolean zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zg, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public zmn(Context context) {
        super(context);
        zmn();
    }

    private void zmn() {
        this.fs = jy.zmn(getContext(), 8.0f);
        this.zmn = new Paint();
    }

    public void setMinTextSize(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.fs = f;
    }

    private void zmn(String str, int i) {
        if (!this.zn && i > 0) {
            float textSize = getTextSize();
            this.zmn.set(getPaint());
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float zmn = zmn(textSize, str);
            while (zmn > paddingLeft) {
                textSize -= 1.0f;
                this.zmn.setTextSize(textSize);
                if (textSize <= this.fs) {
                    break;
                } else {
                    zmn = zmn(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.zn = true;
        }
    }

    private float zmn(float f, String str) {
        this.zmn.setTextSize(f);
        return this.zmn.measureText(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zg, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.fb = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.fb);
        } else {
            layoutParams.height = this.fb;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zg, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i = this.fb;
        if (i == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zmn(getText().toString(), getWidth());
    }
}
