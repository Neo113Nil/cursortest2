package com.mopub.mobileads.resource;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.mopub.mobileads.resource.DrawableConstants;

/* loaded from: classes2.dex */
public class CloseButtonDrawable extends BaseWidgetDrawable {
    private final Paint closeButtonPaint;
    private final float halfStrokeWidth;

    public CloseButtonDrawable() {
        this(8.0f);
    }

    public CloseButtonDrawable(float f) {
        this.halfStrokeWidth = f / 2.0f;
        this.closeButtonPaint = new Paint();
        this.closeButtonPaint.setColor(-1);
        this.closeButtonPaint.setStrokeWidth(f);
        this.closeButtonPaint.setStrokeCap(DrawableConstants.CloseButton.STROKE_CAP);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int width = getBounds().width();
        float height = getBounds().height();
        float f = width;
        canvas.drawLine(this.halfStrokeWidth + 0.0f, height - this.halfStrokeWidth, f - this.halfStrokeWidth, this.halfStrokeWidth + 0.0f, this.closeButtonPaint);
        canvas.drawLine(this.halfStrokeWidth + 0.0f, this.halfStrokeWidth + 0.0f, f - this.halfStrokeWidth, height - this.halfStrokeWidth, this.closeButtonPaint);
    }
}
