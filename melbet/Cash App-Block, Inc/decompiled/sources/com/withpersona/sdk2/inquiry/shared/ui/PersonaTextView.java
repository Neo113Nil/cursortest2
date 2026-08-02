package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;

/* loaded from: classes9.dex */
public final class PersonaTextView extends TextView {
    public final Paint focusedPaint;

    public PersonaTextView(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setColor(getContext().getColor(R.color.pi2_accessibility_focus_color));
        paint.setStrokeWidth(getContext().getResources().getDimension(R.dimen.pi2_accessibility_border_width_dp));
        paint.setStyle(Paint.Style.STROKE);
        this.focusedPaint = paint;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.getClass();
        super.draw(canvas);
        if (isFocused()) {
            canvas.drawRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, canvas.getWidth(), canvas.getHeight(), this.focusedPaint);
        }
    }

    public PersonaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setColor(getContext().getColor(R.color.pi2_accessibility_focus_color));
        paint.setStrokeWidth(getContext().getResources().getDimension(R.dimen.pi2_accessibility_border_width_dp));
        paint.setStyle(Paint.Style.STROKE);
        this.focusedPaint = paint;
    }

    public PersonaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setColor(getContext().getColor(R.color.pi2_accessibility_focus_color));
        paint.setStrokeWidth(getContext().getResources().getDimension(R.dimen.pi2_accessibility_border_width_dp));
        paint.setStyle(Paint.Style.STROKE);
        this.focusedPaint = paint;
    }

    public PersonaTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = new Paint();
        paint.setColor(getContext().getColor(R.color.pi2_accessibility_focus_color));
        paint.setStrokeWidth(getContext().getResources().getDimension(R.dimen.pi2_accessibility_border_width_dp));
        paint.setStyle(Paint.Style.STROKE);
        this.focusedPaint = paint;
    }
}
