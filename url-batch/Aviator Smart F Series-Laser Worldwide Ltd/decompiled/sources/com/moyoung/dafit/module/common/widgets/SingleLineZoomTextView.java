package com.moyoung.dafit.module.common.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class SingleLineZoomTextView extends AppCompatTextView {
    private Paint mPaint;

    public SingleLineZoomTextView(Context context) {
        super(context);
    }

    private float getTextLength(float f8, String str) {
        this.mPaint.setTextSize(f8);
        return this.mPaint.measureText(str);
    }

    private void refitText(String str, int i8) {
        if (i8 > 0) {
            float textSize = getTextSize();
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.set(getPaint());
            int i9 = 0;
            for (Drawable drawable : getCompoundDrawables()) {
                if (drawable != null) {
                    i9 += drawable.getBounds().width();
                }
            }
            int paddingLeft = (((i8 - getPaddingLeft()) - getPaddingRight()) - getCompoundDrawablePadding()) - i9;
            float textLength = getTextLength(textSize, str);
            while (textLength > paddingLeft) {
                textSize -= 1.0f;
                this.mPaint.setTextSize(textSize);
                textLength = getTextLength(textSize, str);
            }
            setTextSize(0, textSize);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        refitText(getText().toString(), getWidth());
    }

    public SingleLineZoomTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SingleLineZoomTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
