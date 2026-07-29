package com.mopub.mobileads.resource;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Numbers;
import com.mopub.mobileads.resource.DrawableConstants;

/* loaded from: classes2.dex */
public class RadialCountdownDrawable extends BaseWidgetDrawable {
    private final Paint mArcPaint;
    private final Paint mCirclePaint;
    private int mInitialCountdownMilliseconds;
    private int mSecondsRemaining;
    private float mSweepAngle;
    private final Paint mTextPaint;
    private Rect mTextRect;

    public RadialCountdownDrawable(Context context) {
        int dipsToIntPixels = Dips.dipsToIntPixels(3.0f, context);
        float dipsToFloatPixels = Dips.dipsToFloatPixels(18.0f, context);
        this.mCirclePaint = new Paint();
        this.mCirclePaint.setColor(-1);
        this.mCirclePaint.setAlpha(128);
        this.mCirclePaint.setStyle(DrawableConstants.RadialCountdown.BACKGROUND_STYLE);
        float f = dipsToIntPixels;
        this.mCirclePaint.setStrokeWidth(f);
        this.mCirclePaint.setAntiAlias(true);
        this.mArcPaint = new Paint();
        this.mArcPaint.setColor(-1);
        this.mArcPaint.setAlpha(255);
        this.mArcPaint.setStyle(DrawableConstants.RadialCountdown.PROGRESS_STYLE);
        this.mArcPaint.setStrokeWidth(f);
        this.mArcPaint.setAntiAlias(true);
        this.mTextPaint = new Paint();
        this.mTextPaint.setColor(-1);
        this.mTextPaint.setTextAlign(DrawableConstants.RadialCountdown.TEXT_ALIGN);
        this.mTextPaint.setTextSize(dipsToFloatPixels);
        this.mTextPaint.setAntiAlias(true);
        this.mTextRect = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(r0, r1), this.mCirclePaint);
        drawTextWithinBounds(canvas, this.mTextPaint, this.mTextRect, String.valueOf(this.mSecondsRemaining));
        canvas.drawArc(new RectF(getBounds()), -90.0f, this.mSweepAngle, false, this.mArcPaint);
    }

    public void setInitialCountdown(int i) {
        this.mInitialCountdownMilliseconds = i;
    }

    public void updateCountdownProgress(int i) {
        this.mSecondsRemaining = (int) Numbers.convertMillisecondsToSecondsRoundedUp(this.mInitialCountdownMilliseconds - i);
        this.mSweepAngle = (i * 360.0f) / this.mInitialCountdownMilliseconds;
        invalidateSelf();
    }

    @VisibleForTesting
    @Deprecated
    public int getInitialCountdownMilliseconds() {
        return this.mInitialCountdownMilliseconds;
    }
}
