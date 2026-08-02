package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class PersonaMaterialButton extends MaterialButton {
    public final Paint focusedPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonaMaterialButton(Context context) {
        super(context);
        context.getClass();
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
            canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            canvas.drawRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, canvas.getWidth(), canvas.getHeight(), this.focusedPaint);
            canvas.restore();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonaMaterialButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Paint paint = new Paint();
        paint.setColor(getContext().getColor(R.color.pi2_accessibility_focus_color));
        paint.setStrokeWidth(getContext().getResources().getDimension(R.dimen.pi2_accessibility_border_width_dp));
        paint.setStyle(Paint.Style.STROKE);
        this.focusedPaint = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonaMaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Paint paint = new Paint();
        paint.setColor(getContext().getColor(R.color.pi2_accessibility_focus_color));
        paint.setStrokeWidth(getContext().getResources().getDimension(R.dimen.pi2_accessibility_border_width_dp));
        paint.setStyle(Paint.Style.STROKE);
        this.focusedPaint = paint;
    }
}
