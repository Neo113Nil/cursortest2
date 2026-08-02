package com.squareup.cash.timeline.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.util.android.Views;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public final class TimelineDrawing {
    public final Drawable canceledDrawable;
    public float centerX;
    public final Paint circleFillPaint;
    public final Paint circleOutlinePaint;
    public final float circleRadius;
    public final Drawable completeDrawable;
    public List elements;
    public final float halfLineWidth;
    public final Paint linePaint;
    public final Drawable missedDrawable;
    public final Drawable pendingDrawable;
    public final Drawable refundAltDrawable;
    public final Drawable refundDrawable;
    public final Drawable skippedDrawable;
    public Float tailEnd;
    public final Paint tailLinePaint;

    public final class Element {
        public final float centerY;
        public final Integer fillColor;
        public final Drawable icon;
        public final int lineColorToNext;
        public final Integer outlineColor;

        public Element(float f, int i, Integer num, Integer num2, Drawable drawable) {
            this.centerY = f;
            this.lineColorToNext = i;
            this.fillColor = num;
            this.outlineColor = num2;
            this.icon = drawable;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Paint.Style.FILL_AND_STROKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TimelineDrawing(Context context, ColorPalette colorPalette) {
        context.getClass();
        colorPalette.getClass();
        int i = colorPalette.background;
        this.completeDrawable = loadDrawable(context, R.drawable.timeline_completed, Integer.valueOf(i));
        this.missedDrawable = loadDrawable(context, R.drawable.timeline_missed, Integer.valueOf(i));
        this.skippedDrawable = loadDrawable(context, R.drawable.timeline_skipped, Integer.valueOf(i));
        this.refundDrawable = loadDrawable(context, R.drawable.timeline_refund, Integer.valueOf(i));
        this.refundAltDrawable = loadDrawable(context, R.drawable.timeline_refund_alt, Integer.valueOf(i));
        this.canceledDrawable = loadDrawable(context, R.drawable.timeline_canceled, Integer.valueOf(i));
        Drawable loadDrawable = loadDrawable(context, R.drawable.timeline_pending, null);
        loadDrawable.setColorFilter(new PorterDuffColorFilter(colorPalette.label, PorterDuff.Mode.SRC_ATOP));
        this.pendingDrawable = loadDrawable;
        this.circleRadius = Views.dip(context, 12.0f);
        float dip = Views.dip(context, 4.0f);
        this.halfLineWidth = dip / 2.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dip);
        this.linePaint = paint;
        Paint paint2 = new Paint(paint);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.tailLinePaint = paint2;
        Paint paint3 = new Paint(paint);
        this.circleOutlinePaint = paint3;
        Paint paint4 = new Paint(paint3);
        paint4.setStyle(Paint.Style.FILL_AND_STROKE);
        this.circleFillPaint = paint4;
        this.elements = EmptyList.INSTANCE;
    }

    public static void drawOvalStrokeInside(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        Paint.Style style = paint.getStyle();
        int i = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        float strokeWidth = (i == 1 || i == 2) ? paint.getStrokeWidth() / 2.0f : RecyclerView.DECELERATION_RATE;
        canvas.drawOval(f + strokeWidth, f2 + strokeWidth, f3 - strokeWidth, f4 - strokeWidth, paint);
    }

    public static Drawable loadDrawable(Context context, int i, Integer num) {
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, i, num);
        drawableCompat.getClass();
        drawableCompat.setBounds(0, 0, drawableCompat.getIntrinsicHeight(), drawableCompat.getIntrinsicHeight());
        return drawableCompat;
    }

    public final void draw(Canvas canvas) {
        float f;
        canvas.getClass();
        int size = this.elements.size();
        int i = 0;
        while (true) {
            f = this.circleRadius;
            if (i >= size) {
                break;
            }
            float f2 = ((Element) this.elements.get(i)).centerY + f;
            float f3 = this.halfLineWidth;
            float f4 = f2 - f3;
            if (i < this.elements.size() - 1) {
                float f5 = (((Element) this.elements.get(i + 1)).centerY - f) + f3;
                int i2 = ((Element) this.elements.get(i)).lineColorToNext;
                Paint paint = this.linePaint;
                paint.setColor(i2);
                float f6 = this.centerX;
                canvas.drawLine(f6, f4, f6, f5, paint);
            } else {
                Float f7 = this.tailEnd;
                if (f7 != null) {
                    int i3 = ((Element) this.elements.get(i)).lineColorToNext;
                    Paint paint2 = this.tailLinePaint;
                    paint2.setColor(i3);
                    float f8 = this.centerX;
                    canvas.drawLine(f8, f4, f8, f7.floatValue(), paint2);
                }
            }
            i++;
        }
        float f9 = this.centerX;
        float f10 = f9 - f;
        float f11 = f9 + f;
        for (Element element : this.elements) {
            float f12 = element.centerY;
            Drawable drawable = element.icon;
            float f13 = f12 - f;
            float f14 = f12 + f;
            Integer num = element.fillColor;
            if (num != null) {
                int intValue = num.intValue();
                Paint paint3 = this.circleFillPaint;
                paint3.setColor(intValue);
                drawOvalStrokeInside(canvas, f10, f13, f11, f14, paint3);
            }
            Integer num2 = element.outlineColor;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                Paint paint4 = this.circleOutlinePaint;
                paint4.setColor(intValue2);
                drawOvalStrokeInside(canvas, f10, f13, f11, f14, paint4);
            }
            if (drawable != null) {
                int save = canvas.save();
                canvas.translate(this.centerX - (drawable.getIntrinsicWidth() / 2.0f), f12 - (drawable.getIntrinsicHeight() / 2.0f));
                try {
                    drawable.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
