package com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.R$styleable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.FormBody;

/* loaded from: classes9.dex */
public final class Pi2DotsTabIndicator extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ArgbEvaluator argbEvaluator;
    public float contentWidth;
    public final ArrayList dots;
    public int dotsColor;
    public final float dotsCornerRadius;
    public final float dotsSize;
    public FormBody.Builder pager;
    public final Paint paint;
    public int selectedDotColor;
    public final float selectedDotWidth;
    public final float spaceBetweenDots;

    public final class Dot {
        public int color;
        public int width;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dot)) {
                return false;
            }
            Dot dot = (Dot) obj;
            return this.width == dot.width && this.color == dot.color;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.color, Integer.hashCode(this.width) * 31, 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.width, this.color, "Dot(width=", ", color=", ", isSelected=false)");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2DotsTabIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.dots = new ArrayList();
        this.dotsColor = getContext().getColor(R.color.pi2_dots_tab_indicator);
        this.selectedDotColor = getContext().getColor(R.color.pi2_dots_tab_indicator_fog_700);
        float dpToPx = (float) ExtensionsKt.getDpToPx(9.0d);
        this.dotsSize = dpToPx;
        this.dotsCornerRadius = dpToPx / 2.0f;
        this.spaceBetweenDots = (float) ExtensionsKt.getDpToPx(3.0d);
        this.selectedDotWidth = (float) ExtensionsKt.getDpToPx(23.0d);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.paint = paint;
        this.argbEvaluator = new ArgbEvaluator();
        setWillNotDraw(false);
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Pi2DotsTabIndicator);
        obtainStyledAttributes.getClass();
        try {
            if (obtainStyledAttributes.getBoolean(1, false)) {
                this.selectedDotWidth = dpToPx;
            }
            this.spaceBetweenDots = (float) ExtensionsKt.getDpToPx(obtainStyledAttributes.getFloat(3, 3.0f));
            setDotsColor(obtainStyledAttributes.getColor(0, this.dotsColor));
            setSelectedDotColor(obtainStyledAttributes.getColor(2, this.selectedDotColor));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Pi2DotsTabIndicator$$ExternalSyntheticLambda1(this, 1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float measuredWidth = this.contentWidth >= ((float) getMeasuredWidth()) ? RecyclerView.DECELERATION_RATE : (getMeasuredWidth() - this.contentWidth) / 2.0f;
        Iterator it = this.dots.iterator();
        it.getClass();
        float f = measuredWidth;
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            int i = ((Dot) next).color;
            Paint paint = this.paint;
            paint.setColor(i);
            float f2 = this.dotsSize;
            float f3 = this.dotsCornerRadius;
            Canvas canvas2 = canvas;
            canvas2.drawRoundRect(f, RecyclerView.DECELERATION_RATE, f + r0.width, f2, f3, f3, paint);
            f += r0.width + this.spaceBetweenDots;
            canvas = canvas2;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLayoutDirection() == 1) {
            setRotation(180.0f);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        boolean isEmpty = this.dots.isEmpty();
        float f2 = this.dotsSize;
        if (isEmpty) {
            f = paddingEnd;
        } else {
            f = paddingEnd + ((r6.size() - 1) * f2) + this.selectedDotWidth + (this.spaceBetweenDots * (r6.size() - 1));
        }
        this.contentWidth = f;
        setMeasuredDimension(Math.min((int) f, size), (int) f2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        post(new Pi2DotsTabIndicator$$ExternalSyntheticLambda1(this, 0));
    }

    public final void refreshDots() {
        if (this.pager == null) {
            return;
        }
        post(new Pi2DotsTabIndicator$$ExternalSyntheticLambda1(this, 3));
    }

    public final void refreshDotsColors() {
        ArrayList arrayList = this.dots;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            FormBody.Builder builder = this.pager;
            if (builder != null) {
                ((Dot) arrayList.get(i)).color = i == ((ViewPager2) builder.names).mCurrentItem ? this.selectedDotColor : this.dotsColor;
                invalidate();
            }
            i++;
        }
    }

    public final void setDotsColor(int i) {
        this.dotsColor = i;
        refreshDotsColors();
    }

    public final void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
        refreshDotsColors();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2DotsTabIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2DotsTabIndicator(Context context) {
        this(context, null);
        context.getClass();
    }
}
