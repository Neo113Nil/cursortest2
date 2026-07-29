package com.mopub.mobileads.resource;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.util.Dips;
import com.mopub.mobileads.resource.DrawableConstants;

/* loaded from: classes2.dex */
public class CtaButtonDrawable extends BaseWidgetDrawable {
    private final Paint mBackgroundPaint;
    private final int mButtonCornerRadius;
    private final RectF mButtonRect;
    private String mCtaText;
    private final Paint mOutlinePaint;
    private final Paint mTextPaint;
    private final Rect mTextRect;

    public CtaButtonDrawable(Context context) {
        int dipsToIntPixels = Dips.dipsToIntPixels(2.0f, context);
        float dipsToFloatPixels = Dips.dipsToFloatPixels(15.0f, context);
        this.mBackgroundPaint = new Paint();
        this.mBackgroundPaint.setColor(-16777216);
        this.mBackgroundPaint.setAlpha(51);
        this.mBackgroundPaint.setStyle(DrawableConstants.CtaButton.BACKGROUND_STYLE);
        this.mBackgroundPaint.setAntiAlias(true);
        this.mOutlinePaint = new Paint();
        this.mOutlinePaint.setColor(-1);
        this.mOutlinePaint.setAlpha(51);
        this.mOutlinePaint.setStyle(DrawableConstants.CtaButton.OUTLINE_STYLE);
        this.mOutlinePaint.setStrokeWidth(dipsToIntPixels);
        this.mOutlinePaint.setAntiAlias(true);
        this.mTextPaint = new Paint();
        this.mTextPaint.setColor(-1);
        this.mTextPaint.setTextAlign(DrawableConstants.CtaButton.TEXT_ALIGN);
        this.mTextPaint.setTypeface(DrawableConstants.CtaButton.TEXT_TYPEFACE);
        this.mTextPaint.setTextSize(dipsToFloatPixels);
        this.mTextPaint.setAntiAlias(true);
        this.mTextRect = new Rect();
        this.mCtaText = DrawableConstants.CtaButton.DEFAULT_CTA_TEXT;
        this.mButtonRect = new RectF();
        this.mButtonCornerRadius = Dips.dipsToIntPixels(6.0f, context);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.mButtonRect.set(getBounds());
        canvas.drawRoundRect(this.mButtonRect, this.mButtonCornerRadius, this.mButtonCornerRadius, this.mBackgroundPaint);
        canvas.drawRoundRect(this.mButtonRect, this.mButtonCornerRadius, this.mButtonCornerRadius, this.mOutlinePaint);
        drawTextWithinBounds(canvas, this.mTextPaint, this.mTextRect, this.mCtaText);
    }

    public void setCtaText(String str) {
        this.mCtaText = str;
        invalidateSelf();
    }

    @VisibleForTesting
    @Deprecated
    public String getCtaText() {
        return this.mCtaText;
    }
}
