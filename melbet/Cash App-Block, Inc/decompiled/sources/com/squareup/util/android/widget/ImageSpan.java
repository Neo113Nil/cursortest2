package com.squareup.util.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import android.util.Size;
import com.squareup.util.android.Views;
import java.lang.ref.WeakReference;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class ImageSpan extends ReplacementSpan {
    public final Context context;
    public final boolean keepAspectRatio;
    public WeakReference mDrawableRef;
    public final int marginEnd;
    public final int marginStart;
    public final int resourceId;
    public final Size size;
    public final Integer tint;
    public final VerticalAlignment verticalAlignment;
    public final int verticalOffset;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class VerticalAlignment {
        public static final /* synthetic */ VerticalAlignment[] $VALUES;
        public static final VerticalAlignment BASELINE;
        public static final VerticalAlignment CENTER;

        /* JADX INFO: Fake field, exist only in values array */
        VerticalAlignment EF0;

        static {
            VerticalAlignment verticalAlignment = new VerticalAlignment("BOTTOM", 0);
            VerticalAlignment verticalAlignment2 = new VerticalAlignment("BASELINE", 1);
            BASELINE = verticalAlignment2;
            VerticalAlignment verticalAlignment3 = new VerticalAlignment("CENTER", 2);
            CENTER = verticalAlignment3;
            $VALUES = new VerticalAlignment[]{verticalAlignment, verticalAlignment2, verticalAlignment3};
        }

        public static VerticalAlignment valueOf(String str) {
            return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
        }

        public static VerticalAlignment[] values() {
            return (VerticalAlignment[]) $VALUES.clone();
        }
    }

    public ImageSpan(Context context, int i, Integer num, int i2, int i3, int i4, Size size) {
        VerticalAlignment verticalAlignment = VerticalAlignment.CENTER;
        context.getClass();
        this.context = context;
        this.resourceId = i;
        this.tint = num;
        this.verticalAlignment = verticalAlignment;
        this.marginStart = i2;
        this.marginEnd = i3;
        this.verticalOffset = i4;
        this.size = size;
        this.keepAspectRatio = true;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.getClass();
        charSequence.getClass();
        paint.getClass();
        Drawable cachedDrawable = getCachedDrawable();
        canvas.save();
        int i6 = (i5 - cachedDrawable.getBounds().bottom) + this.verticalOffset;
        VerticalAlignment verticalAlignment = VerticalAlignment.BASELINE;
        VerticalAlignment verticalAlignment2 = this.verticalAlignment;
        if (verticalAlignment2 == verticalAlignment) {
            i6 -= paint.getFontMetricsInt().descent;
        } else if (verticalAlignment2 == VerticalAlignment.CENTER) {
            i6 += (cachedDrawable.getBounds().height() - (paint.getFontMetricsInt().bottom - paint.getFontMetricsInt().top)) / 2;
        }
        canvas.translate(f + this.marginStart, i6);
        cachedDrawable.draw(canvas);
        canvas.restore();
    }

    public final Drawable getCachedDrawable() {
        Pair pair;
        WeakReference weakReference = this.mDrawableRef;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable == null) {
            int i = this.resourceId;
            Context context = this.context;
            Drawable drawable2 = context.getDrawable(i);
            drawable2.getClass();
            drawable = drawable2.mutate();
            drawable.getClass();
            Size size = this.size;
            if (size == null) {
                pair = new Pair(Integer.valueOf(drawable.getIntrinsicWidth()), Integer.valueOf(drawable.getIntrinsicHeight()));
            } else {
                int sp = Views.sp(context, size.getWidth());
                int sp2 = Views.sp(context, size.getHeight());
                if (this.keepAspectRatio) {
                    double min = Math.min(sp / drawable.getIntrinsicWidth(), sp2 / drawable.getIntrinsicHeight());
                    pair = new Pair(Integer.valueOf((int) (drawable.getIntrinsicWidth() * min)), Integer.valueOf((int) (drawable.getIntrinsicHeight() * min)));
                } else {
                    pair = new Pair(Integer.valueOf(sp), Integer.valueOf(sp2));
                }
            }
            drawable.setBounds(0, 0, ((Number) pair.first).intValue(), ((Number) pair.second).intValue());
            Integer num = this.tint;
            if (num != null) {
                drawable.setTint(num.intValue());
            }
            this.mDrawableRef = new WeakReference(drawable);
        }
        return drawable;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        charSequence.getClass();
        return this.marginStart + getCachedDrawable().getBounds().right + this.marginEnd;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageSpan(Context context, int i, Integer num, int i2, int i3, int i4, Size size, int i5) {
        this(context, i, num, (i5 & 16) != 0 ? 0 : i2, i3, (i5 & 64) != 0 ? 0 : i4, (i5 & 128) != 0 ? null : size);
        VerticalAlignment verticalAlignment = VerticalAlignment.BASELINE;
    }
}
