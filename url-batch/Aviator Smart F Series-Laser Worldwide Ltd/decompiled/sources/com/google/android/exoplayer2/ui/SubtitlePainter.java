package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@Deprecated
/* loaded from: classes3.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final Paint bitmapPaint;
    private Rect bitmapRect;
    private float bottomPaddingFraction;

    @Nullable
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;

    @Nullable
    private CharSequence cueText;

    @Nullable
    private Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final Paint windowPaint;

    public SubtitlePainter(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = round;
        this.shadowRadius = round;
        this.shadowOffset = round;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean areCharSequencesEqual(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private void drawLayout(Canvas canvas, boolean z7) {
        if (z7) {
            drawTextLayout(canvas);
            return;
        }
        Assertions.checkNotNull(this.bitmapRect);
        Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        }
        int i8 = this.edgeType;
        if (i8 == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i8 == 2) {
            TextPaint textPaint = this.textPaint;
            float f8 = this.shadowRadius;
            float f9 = this.shadowOffset;
            textPaint.setShadowLayer(f8, f9, f9, this.edgeColor);
        } else if (i8 == 3 || i8 == 4) {
            boolean z7 = i8 == 3;
            int i9 = z7 ? -1 : this.edgeColor;
            int i10 = z7 ? this.edgeColor : -1;
            float f10 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f11 = -f10;
            this.textPaint.setShadowLayer(this.shadowRadius, f11, f11, i9);
            staticLayout2.draw(canvas);
            this.textPaint.setShadowLayer(this.shadowRadius, f10, f10, i10);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    @RequiresNonNull({"cueBitmap"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setupBitmapLayout() {
        float f8;
        int i8;
        float f9;
        Bitmap bitmap = this.cueBitmap;
        int i9 = this.parentRight;
        int i10 = this.parentLeft;
        int i11 = this.parentBottom;
        int i12 = this.parentTop;
        float f10 = i9 - i10;
        float f11 = i10 + (this.cuePosition * f10);
        float f12 = i11 - i12;
        float f13 = i12 + (this.cueLine * f12);
        int round = Math.round(f10 * this.cueSize);
        float f14 = this.cueBitmapHeight;
        int round2 = f14 != -3.4028235E38f ? Math.round(f12 * f14) : Math.round(round * (bitmap.getHeight() / bitmap.getWidth()));
        int i13 = this.cuePositionAnchor;
        if (i13 != 2) {
            if (i13 == 1) {
                f8 = round / 2;
            }
            int round3 = Math.round(f11);
            i8 = this.cueLineAnchor;
            if (i8 == 2) {
                if (i8 == 1) {
                    f9 = round2 / 2;
                }
                int round4 = Math.round(f13);
                this.bitmapRect = new Rect(round3, round4, round + round3, round2 + round4);
            }
            f9 = round2;
            f13 -= f9;
            int round42 = Math.round(f13);
            this.bitmapRect = new Rect(round3, round42, round + round3, round2 + round42);
        }
        f8 = round;
        f11 -= f8;
        int round32 = Math.round(f11);
        i8 = this.cueLineAnchor;
        if (i8 == 2) {
        }
        f13 -= f9;
        int round422 = Math.round(f13);
        this.bitmapRect = new Rect(round32, round422, round + round32, round2 + round422);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    @RequiresNonNull({"cueText"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setupTextLayout() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        CharSequence charSequence = this.cueText;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.cueText);
        int i16 = this.parentRight - this.parentLeft;
        int i17 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i18 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i19 = i18 * 2;
        int i20 = i16 - i19;
        float f8 = this.cueSize;
        if (f8 != -3.4028235E38f) {
            i20 = (int) (i20 * f8);
        }
        int i21 = i20;
        if (i21 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.backgroundColor) > 0) {
            int i22 = this.edgeType;
            if (i22 == 0 || i22 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i21, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int i23 = 0;
        for (int i24 = 0; i24 < lineCount; i24++) {
            i23 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i24)), i23);
        }
        if (this.cueSize == -3.4028235E38f || i23 >= i21) {
            i21 = i23;
        }
        int i25 = i21 + i19;
        float f9 = this.cuePosition;
        if (f9 != -3.4028235E38f) {
            int round = Math.round(i16 * f9);
            int i26 = this.parentLeft;
            int i27 = round + i26;
            int i28 = this.cuePositionAnchor;
            i8 = 1;
            if (i28 != 1) {
                i9 = 2;
                if (i28 == 2) {
                    i27 -= i25;
                }
            } else {
                i9 = 2;
                i27 = ((i27 * 2) - i25) / 2;
            }
            i10 = Math.max(i27, i26);
            i11 = Math.min(i25 + i10, this.parentRight);
        } else {
            i8 = 1;
            i9 = 2;
            i10 = ((i16 - i25) / 2) + this.parentLeft;
            i11 = i10 + i25;
        }
        int i29 = i11 - i10;
        if (i29 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f10 = this.cueLine;
        if (f10 == -3.4028235E38f) {
            i12 = (this.parentBottom - height) - ((int) (i17 * this.bottomPaddingFraction));
        } else if (this.cueLineType == 0) {
            i12 = Math.round(i17 * f10) + this.parentTop;
            int i30 = this.cueLineAnchor;
            if (i30 != i9) {
                if (i30 == i8) {
                    i12 = ((i12 * 2) - height) / i9;
                }
                i14 = i12 + height;
                i15 = this.parentBottom;
                if (i14 <= i15) {
                    i12 = i15 - height;
                } else {
                    int i31 = this.parentTop;
                    if (i12 < i31) {
                        i13 = i31;
                        this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i29, alignment2, this.spacingMult, this.spacingAdd, true);
                        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i29, alignment2, this.spacingMult, this.spacingAdd, true);
                        this.textLeft = i10;
                        this.textTop = i13;
                        this.textPaddingX = i18;
                    }
                }
            }
            i12 -= height;
            i14 = i12 + height;
            i15 = this.parentBottom;
            if (i14 <= i15) {
            }
        } else {
            int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
            float f11 = this.cueLine;
            if (f11 >= 0.0f) {
                i12 = Math.round(f11 * lineBottom) + this.parentTop;
                i14 = i12 + height;
                i15 = this.parentBottom;
                if (i14 <= i15) {
                }
            } else {
                i12 = Math.round((f11 + 1.0f) * lineBottom) + this.parentBottom;
                i12 -= height;
                i14 = i12 + height;
                i15 = this.parentBottom;
                if (i14 <= i15) {
                }
            }
        }
        i13 = i12;
        this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i29, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i29, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = i10;
        this.textTop = i13;
        this.textPaddingX = i18;
    }

    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f8, float f9, float f10, Canvas canvas, int i8, int i9, int i10, int i11) {
        int i12;
        boolean z7 = cue.bitmap == null;
        if (!z7) {
            i12 = -16777216;
        } else if (TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i12 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i12 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f8 && this.cueTextSizePx == f9 && this.bottomPaddingFraction == f10 && this.parentLeft == i8 && this.parentTop == i9 && this.parentRight == i10 && this.parentBottom == i11) {
            drawLayout(canvas, z7);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i12;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f8;
        this.cueTextSizePx = f9;
        this.bottomPaddingFraction = f10;
        this.parentLeft = i8;
        this.parentTop = i9;
        this.parentRight = i10;
        this.parentBottom = i11;
        if (z7) {
            Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z7);
    }
}
