package com.mopub.mobileads.resource;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Dips;
import com.mopub.mobileads.resource.DrawableConstants;

/* loaded from: classes2.dex */
public class ProgressBarDrawable extends BaseWidgetDrawable {
    private final Paint mBackgroundPaint = new Paint();
    private int mCurrentProgress;
    private int mDuration;
    private int mLastProgress;
    private final int mNuggetWidth;
    private final Paint mProgressPaint;
    private int mSkipOffset;
    private float mSkipRatio;

    public ProgressBarDrawable(Context context) {
        this.mBackgroundPaint.setColor(-1);
        this.mBackgroundPaint.setAlpha(128);
        this.mBackgroundPaint.setStyle(DrawableConstants.ProgressBar.BACKGROUND_STYLE);
        this.mBackgroundPaint.setAntiAlias(true);
        this.mProgressPaint = new Paint();
        this.mProgressPaint.setColor(DrawableConstants.ProgressBar.PROGRESS_COLOR);
        this.mProgressPaint.setAlpha(255);
        this.mProgressPaint.setStyle(DrawableConstants.ProgressBar.PROGRESS_STYLE);
        this.mProgressPaint.setAntiAlias(true);
        this.mNuggetWidth = Dips.dipsToIntPixels(4.0f, context);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), this.mBackgroundPaint);
        canvas.drawRect(getBounds().left, getBounds().top, getBounds().right * (this.mCurrentProgress / this.mDuration), getBounds().bottom, this.mProgressPaint);
        if (this.mSkipOffset <= 0 || this.mSkipOffset >= this.mDuration) {
            return;
        }
        float f = getBounds().right * this.mSkipRatio;
        canvas.drawRect(f, getBounds().top, f + this.mNuggetWidth, getBounds().bottom, this.mProgressPaint);
    }

    public void reset() {
        this.mLastProgress = 0;
    }

    public void setDurationAndSkipOffset(int i, int i2) {
        this.mDuration = i;
        this.mSkipOffset = i2;
        this.mSkipRatio = this.mSkipOffset / this.mDuration;
    }

    public void setProgress(int i) {
        if (i >= this.mLastProgress) {
            this.mCurrentProgress = i;
            this.mLastProgress = i;
        } else if (i != 0) {
            MoPubLog.d(String.format("Progress not monotonically increasing: last = %d, current = %d", Integer.valueOf(this.mLastProgress), Integer.valueOf(i)));
            forceCompletion();
        }
        invalidateSelf();
    }

    @VisibleForTesting
    public void forceCompletion() {
        this.mCurrentProgress = this.mDuration;
    }

    @VisibleForTesting
    @Deprecated
    public float getSkipRatio() {
        return this.mSkipRatio;
    }

    @VisibleForTesting
    @Deprecated
    public int getCurrentProgress() {
        return this.mCurrentProgress;
    }
}
